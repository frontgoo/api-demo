package com.gxb.sdk.data.wechat;

import java.io.Serializable;

/**
 * Created by DOmmy on 2017/3/14.
 */
public class WeChatBaseInfoDTO implements Serializable {

    private static final long serialVersionUID = -2125462060330720798L;
    
    /**
     * 微信id
     */
    private Long uin;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 备注名
     */
    private String remarkName;
    /**
     * 头像图片路径
     */
    private String headImgPath;
    /**
     * 性别,0(未知)、1(男)、2（女）
     */
    private Integer sex;
    /**
     * 签名
     */
    private String signature;
    /**
     * 账号类型,0(个人号)、非0公众号(分类待定)
     */
    private Integer verifyFlag;

    

    public Long getUin() {
        return uin;
    }

    public void setUin(Long uin) {
        this.uin = uin;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public String getHeadImgPath() {
        return headImgPath;
    }

    public void setHeadImgPath(String headImgPath) {
        this.headImgPath = headImgPath;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getVerifyFlag() {
        return verifyFlag;
    }

    public void setVerifyFlag(Integer verifyFlag) {
        this.verifyFlag = verifyFlag;
    }

}
