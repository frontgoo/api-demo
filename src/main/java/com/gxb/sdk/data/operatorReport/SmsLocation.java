package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/19.
 */
public class SmsLocation implements Serializable {
    private String location;
    private Integer smsCnt;
    private Integer smsNumberCnt;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getSmsCnt() {
        return smsCnt;
    }

    public void setSmsCnt(Integer smsCnt) {
        this.smsCnt = smsCnt;
    }

    public Integer getSmsNumberCnt() {
        return smsNumberCnt;
    }

    public void setSmsNumberCnt(Integer smsNumberCnt) {
        this.smsNumberCnt = smsNumberCnt;
    }

}
