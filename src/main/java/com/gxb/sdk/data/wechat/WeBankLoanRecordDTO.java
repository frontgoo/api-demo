package com.gxb.sdk.data.wechat;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by DOmmy on 2017/3/15.
 */
public class WeBankLoanRecordDTO implements Serializable{
    private static final long serialVersionUID = 937815583084934852L;

    
    /**
     * 借款号
     */
    private String loanReceiptNo;
    /**
     * 借款期数
     */
    private Integer loanInitTerm;
    /**
     * 借款金额
     */
    private BigDecimal loanInitPrin;
    /**
     * 申请日期
     */
    private Date registerDate;
    /**
     * 剩余未还
     */
    private BigDecimal remainUnpayPrin;
    /**
     * 逾期标示，1是0否
     */
    private Integer overDueFlag;
    /**
     * 还清标示,1是0否
     */
    private Integer payOffFlag;
    /**
     * 借款银行
     */
    private String loanBank;
    /**
     * 借款银行卡后四位
     */
    private String debitCardNo;
    /**
     * 借款利率
     */
    private BigDecimal interestRate;
    /**
     * 申请时间
     */
    private Date requestTime;
    /**
     * 到期时间
     */
    private Date expireDate;
    /**
     * 首账单日
     */
    private Date firstBillDate;
    /**
     * 1是，0否
     */
    private Integer hasEquity;
    /**
     *
     */
    private String equityType;
    /**
     *
     */
    private String equityValue;

    

    public String getLoanReceiptNo() {
        return loanReceiptNo;
    }

    public void setLoanReceiptNo(String loanReceiptNo) {
        this.loanReceiptNo = loanReceiptNo;
    }

    public Integer getLoanInitTerm() {
        return loanInitTerm;
    }

    public void setLoanInitTerm(Integer loanInitTerm) {
        this.loanInitTerm = loanInitTerm;
    }

    public BigDecimal getLoanInitPrin() {
        return loanInitPrin;
    }

    public void setLoanInitPrin(BigDecimal loanInitPrin) {
        this.loanInitPrin = loanInitPrin;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public BigDecimal getRemainUnpayPrin() {
        return remainUnpayPrin;
    }

    public void setRemainUnpayPrin(BigDecimal remainUnpayPrin) {
        this.remainUnpayPrin = remainUnpayPrin;
    }

    public Integer getOverDueFlag() {
        return overDueFlag;
    }

    public void setOverDueFlag(Integer overDueFlag) {
        this.overDueFlag = overDueFlag;
    }

    public Integer getPayOffFlag() {
        return payOffFlag;
    }

    public void setPayOffFlag(Integer payOffFlag) {
        this.payOffFlag = payOffFlag;
    }

    public String getLoanBank() {
        return loanBank;
    }

    public void setLoanBank(String loanBank) {
        this.loanBank = loanBank;
    }

    public String getDebitCardNo() {
        return debitCardNo;
    }

    public void setDebitCardNo(String debitCardNo) {
        this.debitCardNo = debitCardNo;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getFirstBillDate() {
        return firstBillDate;
    }

    public void setFirstBillDate(Date firstBillDate) {
        this.firstBillDate = firstBillDate;
    }

    public Integer getHasEquity() {
        return hasEquity;
    }

    public void setHasEquity(Integer hasEquity) {
        this.hasEquity = hasEquity;
    }

    public String getEquityType() {
        return equityType;
    }

    public void setEquityType(String equityType) {
        this.equityType = equityType;
    }

    public String getEquityValue() {
        return equityValue;
    }

    public void setEquityValue(String equityValue) {
        this.equityValue = equityValue;
    }
}
