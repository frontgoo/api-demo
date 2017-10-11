package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/18.
 */
public class SmsContact implements Serializable {
    private String smsNumber;
    private String smsLocation;
    private Integer smsCnt;
    private String mark;
    private String type;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSmsNumber() {
        return smsNumber;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    public String getSmsLocation() {
        return smsLocation;
    }

    public void setSmsLocation(String smsLocation) {
        this.smsLocation = smsLocation;
    }

    public Integer getSmsCnt() {
        return smsCnt;
    }

    public void setSmsCnt(Integer smsCnt) {
        this.smsCnt = smsCnt;
    }

}
