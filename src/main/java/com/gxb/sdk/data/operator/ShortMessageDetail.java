package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ShortMessageDetail implements Serializable {

    private String businessType;

    private Date smsTime;

    private Byte smsType;

    private String otherTelNum;

    private BigDecimal fee;

    private static final long serialVersionUID = 1L;

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public Date getSMSTime() {
        return smsTime;
    }

    public void setSMSTime(Date smsTime) {
        this.smsTime = smsTime;
    }

    public Byte getSMSType() {
        return smsType;
    }

    public void setSMSType(Byte smsType) {
        this.smsType = smsType;
    }

    public String getOtherTelNum() {
        return otherTelNum;
    }

    public void setOtherTelNum(String otherTelNum) {
        this.otherTelNum = otherTelNum == null ? null : otherTelNum.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

}
