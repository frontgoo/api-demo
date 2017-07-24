package com.gxb.sdk.parm.data.vo;


import com.gxb.sdk.parm.data.base.DataObjectBase;

import java.util.List;

/**
 * 授权配置.
 */
public class AuthArgumentsVo extends DataObjectBase {
    //授权参数控制
    private List<ArgumentVo> argumentList;
    //协议名称
    private String agreementName;
    //授权协议地址
    private String agreementUrl;
    //授权须知
    private String notice;
    //本次返回的授权参数是否是为下一步再次获取授权参数服务
    private String argumentsAgain;//ArgumentsAgainEnum

    public List<ArgumentVo> getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(List<ArgumentVo> argumentList) {
        this.argumentList = argumentList;
    }

    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public String getAgreementUrl() {
        return agreementUrl;
    }

    public void setAgreementUrl(String agreementUrl) {
        this.agreementUrl = agreementUrl;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getArgumentsAgain() {
        return argumentsAgain;
    }

    public void setArgumentsAgain(String argumentsAgain) {
        this.argumentsAgain = argumentsAgain;
    }
}
