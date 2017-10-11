package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/18.
 */
public class CallLocation implements Serializable {
    private String location;
    private Integer callCnt;
    private Integer callNumberCnt;
    private Integer callDuration;
    private Integer callerCnt;
    private Integer callerDuration;
    private Integer calledCnt;
    private Integer calledDuration;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public Integer getCallNumberCnt() {
        return callNumberCnt;
    }

    public void setCallNumberCnt(Integer callNumberCnt) {
        this.callNumberCnt = callNumberCnt;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public Integer getCallerCnt() {
        return callerCnt;
    }

    public void setCallerCnt(Integer callerCnt) {
        this.callerCnt = callerCnt;
    }

    public Integer getCallerDuration() {
        return callerDuration;
    }

    public void setCallerDuration(Integer callerDuration) {
        this.callerDuration = callerDuration;
    }

    public Integer getCalledCnt() {
        return calledCnt;
    }

    public void setCalledCnt(Integer calledCnt) {
        this.calledCnt = calledCnt;
    }

    public Integer getCalledDuration() {
        return calledDuration;
    }

    public void setCalledDuration(Integer calledDuration) {
        this.calledDuration = calledDuration;
    }

}
