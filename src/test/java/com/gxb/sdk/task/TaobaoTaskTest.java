/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.task;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gxb.sdk.api.EcommerceApi;
import com.gxb.sdk.parm.AuthParm;
import com.gxb.sdk.parm.AuthToken;
import com.gxb.sdk.parm.LoginInfo;
import com.gxb.sdk.parm.Status;
import com.gxb.sdk.parm.Status.PhaseStatus;
import com.gxb.sdk.parm.Status.Stage;
import com.gxb.sdk.parm.config.LoginConfig;
import com.gxb.sdk.parm.config.LoginForm;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月23日 下午2:12:26
 */
public class TaobaoTaskTest extends AbstractGxbTest {
    private static final Logger logger = LoggerFactory.getLogger(TaobaoTaskTest.class);

    EcommerceApi ecommerceApi = gxbApiFactory.newApi(EcommerceApi.class);

    /*
     * 生产每次授权所需要的基本参数实体
     * 
     * @see com.gxb.sdk.task.AbstractGxbTest#getAuthParm()
     */
    @Override
    protected AuthParm getAuthParm() {
        // 商户自定义授权流水标示，最长32位
        String sequenceNo = UUID.randomUUID().toString().replace("-", "");
        return new AuthParm(sequenceNo, "ecommerce", System.currentTimeMillis(), "周海松", "18258171452", "330682199011221410");
    }


    @Test
    public void doTaobaoTask() throws Exception {
        // step1:生成token
        AuthToken authToken = getAuthToken();
        // step2:获取淘宝授权初始化配置，定位地址为杭州
        LoginConfig loginConfig = ecommerceApi.getTaobaoInitConf(authToken.getToken(), "30.2787781", "120.1198557").execute().body().getData();
        // step3：前端页面更加loginConfig动态的渲染页面，理论上本页面配置不会经常变更
        logger.info("已成功获取授权项{}-{}的登录初始化配置，最近更新时间{}", loginConfig.getAuthItem(), loginConfig.getAuthName(), loginConfig.getLastUpdatedAt());
        logger.info("当前网站支持{}种授权登录方式", loginConfig.getLoginForms().size());
        // 此处默认选择第一种方式作为测试用例
        LoginForm testLoginForm = loginConfig.getLoginForms().get(1);
        logger.info("本用例采用{}登录模式作为测试", testLoginForm.getFormName());
        // step4:loginForm 状态监测,验证当前的login模式是否处于正常服务状态
        if (loginFormStatusCheck(testLoginForm)) {
            // step5:testLoginForm 初始化
            if (loginFormInit(testLoginForm, authToken)) {
                // step6:用swing mock提交执行登录
                mockJPaneLogin(testLoginForm, authToken);
                // step7:对登录结果开始发起轮询。登录轮询最多3分钟。每次任务必然会返回终止状态，gxb接口会保证这点，3分钟只是做业务的逻辑退避，理论上不需要设置
                List<PhaseStatus> loginEndPhaseStatus = Arrays.asList(PhaseStatus.LOGIN_SUCCESS, PhaseStatus.LOGIN_FAILED, PhaseStatus.FAILED);
                Status loginResultStatus = processing(new Callable<Status>() {
                    @Override
                    public Status call() throws Exception {
                        Status status = getStatus(authToken.getToken());
                        // step7: 处理登录过程中可能存在的交互，包括短信验证，图片验证，登录失败等。直到达到的登录终止状态或者stage变为LOGINED
                        if (interactiveStatusHandler(status, authToken)
                                && (loginEndPhaseStatus.contains(status.getPhaseStatus()) || Stage.LOGINED.equals(status.getStage()))) {
                            return status;
                        } else {
                            return null;
                        }
                    }
                }, TimeUnit.MINUTES.toMillis(3));

                // 理论上step7&step8做的事情是一样的，只是所处的stage不同，如果对于stage阶段不关心，可合并处理
                if (loginResultStatus != null && (PhaseStatus.LOGIN_SUCCESS.equals(loginResultStatus.getPhaseStatus())
                        || Stage.LOGINED.equals(loginResultStatus.getStage()))) {
                    List<PhaseStatus> taskEndPhaseStatus = Arrays.asList(PhaseStatus.SUCCESS, PhaseStatus.FAILED);
                    // step8:登录成功抓取持续轮训状态，支持终止（SUCCESS/FAIL）。登录轮询最多5分钟。每次任务必然会返回终止状态，gxb接口会保证这点，5分钟只是做业务的逻辑退避，理论上不需要设置
                    Status taskEndStatus = processing(new Callable<Status>() {
                        @Override
                        public Status call() throws Exception {
                            Status status = getStatus(authToken.getToken());
                            // step9: 处理登录过程中可能存在的交互，包括短信验证，图片验证，抓取失败等。直到达到的任务终止
                            if (interactiveStatusHandler(status, authToken) && taskEndPhaseStatus.contains(status.getPhaseStatus())) {
                                return status;
                            } else {
                                return null;
                            }
                        }
                    }, TimeUnit.MINUTES.toMillis(5));
                    if (taskEndStatus != null && PhaseStatus.SUCCESS.equals(taskEndStatus.getPhaseStatus())) {
                        logger.info("抓取任务执行成功，数据已成功推送至您的回调接口");
                        logger.info("接收数据的结构可参考com.gxb.sdk.data目录");
                    } else if (taskEndStatus != null && PhaseStatus.FAILED.equals(taskEndStatus.getPhaseStatus())) {
                        logger.info("抓取任务执行失败，失败原因：{}", taskEndStatus.getExtra().getRemark());
                    } else {
                        logger.warn("任务超时，请重试");
                    }
                } else {
                    logger.warn("登录失败，请重试");
                }
            }
        }
    }


    /*
     * (non-Javadoc)
     * 
     * @see com.gxb.sdk.task.AbstractGxbTest#refreshQrCode()
     */
    @Override
    protected Status refreshLoginQrCode(String token) throws IOException {
        return ecommerceApi.refreshLoginQrCode(token).execute().body().getData();
    }


    /*
     * (non-Javadoc)
     * 
     * @see com.gxb.sdk.task.AbstractGxbTest#refreshPicCode()
     */
    @Override
    protected Status refreshLoginPicCode(String token) throws IOException {
        return ecommerceApi.refreshLoginPicCode(token).execute().body().getData();
    }


    /*
     * (non-Javadoc)
     * 
     * @see com.gxb.sdk.task.AbstractGxbTest#refreshSmsCode()
     */
    @Override
    protected Status refreshLoginSmsCode(String token) throws IOException {
        return ecommerceApi.refreshLoginSmsCode(token).execute().body().getData();
    }


    /*
     * (non-Javadoc)
     * 
     * @see com.gxb.sdk.task.AbstractGxbTest#submitLogin()
     */
    @Override
    protected Status submitLogin(String token, LoginInfo loginInfo) throws IOException {
        return ecommerceApi.submitLogin(token, loginInfo).execute().body().getData();
    }


    /*
     * (non-Javadoc)
     * 
     * @see com.gxb.sdk.task.AbstractGxbTest#getStatus()
     */
    @Override
    protected Status getStatus(String token) throws IOException {
        return ecommerceApi.getStatus(token).execute().body().getData();
    }


    /*
     * (non-Javadoc)
     * 
     * @see com.gxb.sdk.task.AbstractGxbTest#submitVarifyCode(java.lang.String)
     */
    @Override
    protected Status submitVarifyCode(String token, String code) throws IOException {
        return ecommerceApi.submitVarifyCode(token, code).execute().body().getData();
    }

}
