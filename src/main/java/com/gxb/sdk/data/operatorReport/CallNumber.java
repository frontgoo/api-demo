package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/19.
 */
public class CallNumber implements Serializable {
    private String number;
    private Integer intimacy;
    private String mark;
    private String type;
    private String location;
    private Integer callCnt;
    private Integer callDuration;
    private Integer validCallCnt;
    private Integer validCallDuration;
    private Integer callerCnt;
    private Integer callerDuration;
    private Integer validCallerCnt;
    private Integer validCallerDuration;
    private Integer calledCnt;
    private Integer calledDuration;
    private Integer validCalledCnt;
    private Integer validCalledDuration;

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

    public Integer getValidCallerCnt() {
        return validCallerCnt;
    }

    public void setValidCallerCnt(Integer validCallerCnt) {
        this.validCallerCnt = validCallerCnt;
    }

    public Integer getValidCallerDuration() {
        return validCallerDuration;
    }

    public void setValidCallerDuration(Integer validCallerDuration) {
        this.validCallerDuration = validCallerDuration;
    }

    public Integer getCalledDuration() {
        return calledDuration;
    }

    public void setCalledDuration(Integer calledDuration) {
        this.calledDuration = calledDuration;
    }

    public Integer getValidCalledCnt() {
        return validCalledCnt;
    }

    public void setValidCalledCnt(Integer validCalledCnt) {
        this.validCalledCnt = validCalledCnt;
    }

    public Integer getValidCalledDuration() {
        return validCalledDuration;
    }

    public void setValidCalledDuration(Integer validCalledDuration) {
        this.validCalledDuration = validCalledDuration;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(Integer intimacy) {
        this.intimacy = intimacy;
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

}
