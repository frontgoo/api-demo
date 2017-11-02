package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/18.
 */
public class CallContact implements Serializable {
    private String callNumber;
    private String callLocation;
    private Integer callCnt;
    private Integer callDuration;
    private Integer validCallCnt;
    private Integer validCallDuration;
    private Integer callerCnt;
    private Integer callerDuration;
    private Integer calledCnt;
    private Integer calledDuration;
    private String mark;
    private String type;

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getCallLocation() {
        return callLocation;
    }

    public void setCallLocation(String callLocation) {
        this.callLocation = callLocation;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
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

    public Integer getCalledCnt() {
        return calledCnt;
    }

    public void setCalledCnt(Integer calledCnt) {
        this.calledCnt = calledCnt;
    }

    public Integer getValidCallCnt() {
        return validCallCnt;
    }

    public void setValidCallCnt(Integer validCallCnt) {
        this.validCallCnt = validCallCnt;
    }

    public Integer getValidCallDuration() {
        return validCallDuration;
    }

    public void setValidCallDuration(Integer validCallDuration) {
        this.validCallDuration = validCallDuration;
    }

    public Integer getCallerDuration() {
        return callerDuration;
    }

    public void setCallerDuration(Integer callerDuration) {
        this.callerDuration = callerDuration;
    }

    public Integer getCalledDuration() {
        return calledDuration;
    }

    public void setCalledDuration(Integer calledDuration) {
        this.calledDuration = calledDuration;
    }

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

}
