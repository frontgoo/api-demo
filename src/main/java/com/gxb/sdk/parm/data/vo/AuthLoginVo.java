package com.gxb.sdk.parm.data.vo;


import com.gxb.sdk.parm.data.base.DataObjectBase;

/**
 *登陆结果.
 */
public class AuthLoginVo extends DataObjectBase {
    //是否需要二次授权
    private String authAgain;
    //登录过程是否结束
    private String loginProcess;

    public String getAuthAgain() {
        return authAgain;
    }

    public void setAuthAgain(String authAgain) {
        this.authAgain = authAgain;
    }

    public String getLoginProcess() {
        return loginProcess;
    }

    public void setLoginProcess(String loginProcess) {
        this.loginProcess = loginProcess;
    }
}
