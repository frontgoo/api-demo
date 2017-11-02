package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yaojun on 2017/9/7.
 */
public class ConsumeSummary implements Serializable {
    private Date billMonth;
    private Integer callCnt;
    private Integer callDuration;
    private Integer callerCnt;
    private Integer callerDuration;
    private Integer calledCnt;
    private Integer calledDuration;
    private Integer smsCnt;
    private BigDecimal payFee;

    public Date getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(Date billMonth) {
        this.billMonth = billMonth;
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

    public Integer getSmsCnt() {
        return smsCnt;
    }

    public void setSmsCnt(Integer smsCnt) {
        this.smsCnt = smsCnt;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

}
