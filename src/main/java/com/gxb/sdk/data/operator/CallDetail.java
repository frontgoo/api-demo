package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 通话详单business model
 */
public class CallDetail implements Serializable {

    private String telNum;


    private String businessType;

    private Date callMonth;

    private Date callStartTime;

    private Integer callDuration;

    private Byte callType;

    private String otherTelNum;


    private String otherFullTelNum;

    private String callLocation;

    private String callTypeDetail;

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    private BigDecimal fee;

    private static final long serialVersionUID = 1L;

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }


    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }


    public Date getCallMonth() {
        return callMonth;
    }

    public void setCallMonth(Date callMonth) {
        this.callMonth = callMonth;
    }

    public Date getCallStartTime() {
        return callStartTime;
    }

    public void setCallStartTime(Date callStartTime) {
        this.callStartTime = callStartTime;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public Byte getCallType() {
        return callType;
    }

    public void setCallType(Byte callType) {
        this.callType = callType;
    }

    public String getOtherTelNum() {
        return otherTelNum;
    }

    public void setOtherTelNum(String otherTelNum) {
        this.otherTelNum = otherTelNum == null ? null : otherTelNum.trim();
    }

    public String getOtherFullTelNum() {
        return otherFullTelNum;
    }

    public void setOtherFullTelNum(String otherFullTelNum) {
        this.otherFullTelNum = otherFullTelNum == null ? null : otherFullTelNum.trim();
    }

    public String getCallLocation() {
        return callLocation;
    }

    public void setCallLocation(String callLocation) {
        this.callLocation = callLocation == null ? null : callLocation.trim();
    }

    public String getCallTypeDetail() {
        return callTypeDetail;
    }

    public void setCallTypeDetail(String callTypeDetail) {
        this.callTypeDetail = callTypeDetail == null ? null : callTypeDetail.trim();
    }

}
