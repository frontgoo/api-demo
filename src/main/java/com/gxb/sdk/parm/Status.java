package com.gxb.sdk.parm;

import java.io.Serializable;

public class Status implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 2980240602011064012L;

    /**
     * 状态产生时，设置在task内，PREPARE：预准备阶段；LOGINED：登录成功阶段；FINISHED:任务完成阶段
     * 
     * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
     * @version 1.0
     * @since 2017年7月2日 下午11:01:52
     */
    public enum Stage {
        PREPARE, LOGINED, FINISHED
    }

    /**
     * 当前任务阶段状态
     */
    private Stage stage;

    public enum PhaseStatus {
        LOGIN_WAITING, LOGIN_SUCCESS, LOGIN_FAILED,

        REFRESH_IMAGE_SUCCESS, REFRESH_IMAGE_FAILED,

        REFRESH_SMS_SUCCESS, REFRESH_SMS_FAILED,

        REFRESH_QR_CODE_SUCCESS, REFRESH_QR_CODE_FAILED,

        SMS_VERIFY_NEW,

        IMAGE_VERIFY_NEW,

        QR_VERIFY_NEW, QR_VERIFY_CONFIRMED, QR_VERIFY_FAILED, QR_VERIFY_SUCCESS,

        // 默认
        WAITING,

        SUCCESS, FAILED
    }

    /**
     * 当前任务具体子状态。
     * 
     * LOGIN_WAITING：登录进行中；LOGIN_SUCCESS：登录成功；LOGIN_FAILED：登录失败；
     * REFRESH_IMAGE_SUCCESS：刷新登录图片验证码成功；REFRESH_IMAGE_FAILED：刷新登录图片验证码失败；
     * REFRESH_SMS_SUCCESS：刷新登录短信验证码成功；REFRESH_SMS_FAILED：刷新登录短信验证码失败；
     * REFRESH_QR_CODE_SUCCESS：刷新登录二维码成功；REFRESH_SMS_FAILED：刷新登录二维码失败；
     * QR_VERIFY_CONFIRMED：二维码被确认(打钩)；QR_VERIFY_FAILED：二维码认证失败；QR_VERIFY_SUCCESS：二维码认证成功；
     * SMS_VERIFY_NEW：过程中需要短信验证；IMAGE_VERIFY_NEW：过程中需要图片验证；QR_VERIFY_NEW：过程中需要二维码验证；
     * WAITING：任务进行中；SUCCESS：任务成功结束；FAILED：任务失败结束；
     * 
     */
    private PhaseStatus phaseStatus;
    /**
     * 状态的附属信息，比如弹窗的展示信息
     */
    private Extra extra;
    /**
     * 授权token
     */
    private String token;
    /**
     * 状态时间戳
     */
    private long timestamp;

    public Status(String token, Stage stage, PhaseStatus phaseStatus) {
        super();
        this.stage = stage;
        this.phaseStatus = phaseStatus;
        this.token = token;
        this.extra = new Extra();
    }


    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public PhaseStatus getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(PhaseStatus phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public Extra getExtra() {
        return extra;
    }


    public void setExtra(Extra extra) {
        this.extra = extra;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Status [stage=" + stage + ", phaseStatus=" + phaseStatus + ", extra=" + extra + ", token=" + token + "]";
    }

}

