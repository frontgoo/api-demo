package com.gxb.sdk.data.wechat;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by DOmmy on 2017/3/15.
 */
public class WeBankRepayRecordDTO implements Serializable{
    private static final long serialVersionUID = 2065380676779206152L;

    /**
     * 还款日期
     */
    private Date repayTime;
    /**
     * 还款金额
     */
    private BigDecimal repayAmount;
    /**
     * 还款银行
     */
    private String payBank;
    /**
     * 还款卡号后四位
     */
    private String debitCardNo;
    /**
     * 是否代扣,1是，0否
     */
    private Integer pmtInd;

   

    public Date getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    public String getPayBank() {
        return payBank;
    }

    public void setPayBank(String payBank) {
        this.payBank = payBank;
    }

    public String getDebitCardNo() {
        return debitCardNo;
    }

    public void setDebitCardNo(String debitCardNo) {
        this.debitCardNo = debitCardNo;
    }

    public Integer getPmtInd() {
        return pmtInd;
    }

    public void setPmtInd(Integer pmtInd) {
        this.pmtInd = pmtInd;
    }
}
