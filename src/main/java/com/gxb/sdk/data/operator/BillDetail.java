package com.gxb.sdk.data.operator;



import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 账单business model
 */
public class BillDetail implements Serializable {

    private Date billMonth;

    private BigDecimal baseFee;

    private BigDecimal voiceCallFee;

    private BigDecimal networkFee;

    private BigDecimal totalFee;

    private BigDecimal deductionFee;

    private BigDecimal payFee;

    private String telNum;

    private String name;

    private static final long serialVersionUID = 1L;

    public Date getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(Date billMonth) {
        this.billMonth = billMonth;
    }

    public BigDecimal getBaseFee() {
        return baseFee;
    }

    public void setBasefee(BigDecimal baseFee) {
        this.baseFee = baseFee;
    }

    public BigDecimal getVoiceCallFee() {
        return voiceCallFee;
    }

    public void setVoiceCallFee(BigDecimal voiceCallFee) {
        this.voiceCallFee = voiceCallFee;
    }

    public BigDecimal getNetworkFee() {
        return networkFee;
    }

    public void setNetworkFee(BigDecimal networkFee) {
        this.networkFee = networkFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getDeductionFee() {
        return deductionFee;
    }

    public void setDeductionFee(BigDecimal deductionFee) {
        this.deductionFee = deductionFee;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

}