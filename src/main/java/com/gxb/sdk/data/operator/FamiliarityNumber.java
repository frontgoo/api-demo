package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.util.Date;


/**
 * 亲情号码business model
 */
public class FamiliarityNumber implements Serializable {

    private String memberNum;

    private String memberShortNum;

    private String memberType;

    private Date memeberAddDate;

    private Date memeberExpireDate;

    private static final long serialVersionUID = 1L;

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum == null ? null : memberNum.trim();
    }

    public String getMemberShortNum() {
        return memberShortNum;
    }

    public void setMemberShortNum(String memberShortNum) {
        this.memberShortNum = memberShortNum == null ? null : memberShortNum.trim();
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public Date getMemeberAddDate() {
        return memeberAddDate;
    }

    public void setMemeberAddDate(Date memeberAddDate) {
        this.memeberAddDate = memeberAddDate;
    }

    public Date getMemeberExpireDate() {
        return memeberExpireDate;
    }

    public void setMemeberExpireDate(Date memeberExpireDate) {
        this.memeberExpireDate = memeberExpireDate;
    }

}