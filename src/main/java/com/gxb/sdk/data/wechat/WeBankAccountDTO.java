package com.gxb.sdk.data.wechat;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by DOmmy on 2017/3/15.
 */
public class WeBankAccountDTO implements Serializable {

    private static final long serialVersionUID = 1334717090598510673L;

    
    /**
     * 证件类型,1(身份证)
     */
    private Integer idType;
    /**
     * 证件号前四位
     */
    private String idNo;
    /**
     * 待确认姓名
     */
    private String surName;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机后四位
     */
    private String mobileNo;
    /**
     * 是否有效，1是0不是
     */
    private Integer active;
    /**
     * 是否逾期,1是0不是
     */
    private Integer isOverdue;
    /**
     * 首次借贷,1是，0否
     */
    private Integer isFirstLoan;
    /**
     * 微粒贷卡号
     */
    private String cardNo;
    /**
     * 总额度
     */
    private BigDecimal totalAmount;
    /**
     * 有效额度
     */
    private BigDecimal availableAmount;
    /**
     * 当前期最后还款日
     */
    private Date currPmtDueDate;
    /**
     * 当前期需还款额
     */
    private BigDecimal currBal;
    /**
     * 借款状态
     */
    private Integer loanStatus;
    /**
     * 微粒贷用户分群(暂时无用)
     */
    private Integer custType;
    /**
     * 未还清的借款数
     */
    private Integer unpaidLoans;
    /**
     * 是否激活,1是，0否
     */
    private Integer isActivated;
    /**
     * 首次贷款日
     */
    private Date firstPurchaseDate;
    /**
     * 逾期未还金额
     */
    private BigDecimal overdueUnpay;
    /**
     * 逾期未还期数
     */
    private Integer overdueTerms;
    /**
     * 逾期天数
     */
    private Integer overdueDays;
    /**
     * 逾期抵扣天数
     */
    private Integer overdueOffsetDays;
    /**
     * 借款利率列表
     */
    private List<WeBankLoanRateDTO> rateList;
    /**
     * 默认绑卡的序列，关联绑卡列表
     */
    private String defaultBindSerial;

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(Integer isOverdue) {
        this.isOverdue = isOverdue;
    }

    public Integer getIsFirstLoan() {
        return isFirstLoan;
    }

    public void setIsFirstLoan(Integer isFirstLoan) {
        this.isFirstLoan = isFirstLoan;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Date getCurrPmtDueDate() {
        return currPmtDueDate;
    }

    public void setCurrPmtDueDate(Date currPmtDueDate) {
        this.currPmtDueDate = currPmtDueDate;
    }

    public BigDecimal getCurrBal() {
        return currBal;
    }

    public void setCurrBal(BigDecimal currBal) {
        this.currBal = currBal;
    }

    public Integer getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(Integer loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Integer getCustType() {
        return custType;
    }

    public void setCustType(Integer custType) {
        this.custType = custType;
    }

    public Integer getUnpaidLoans() {
        return unpaidLoans;
    }

    public void setUnpaidLoans(Integer unpaidLoans) {
        this.unpaidLoans = unpaidLoans;
    }

    public Integer getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Integer isActivated) {
        this.isActivated = isActivated;
    }

    public Date getFirstPurchaseDate() {
        return firstPurchaseDate;
    }

    public void setFirstPurchaseDate(Date firstPurchaseDate) {
        this.firstPurchaseDate = firstPurchaseDate;
    }

    public BigDecimal getOverdueUnpay() {
        return overdueUnpay;
    }

    public void setOverdueUnpay(BigDecimal overdueUnpay) {
        this.overdueUnpay = overdueUnpay;
    }

    public Integer getOverdueTerms() {
        return overdueTerms;
    }

    public void setOverdueTerms(Integer overdueTerms) {
        this.overdueTerms = overdueTerms;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Integer getOverdueOffsetDays() {
        return overdueOffsetDays;
    }

    public void setOverdueOffsetDays(Integer overdueOffsetDays) {
        this.overdueOffsetDays = overdueOffsetDays;
    }

    public List<WeBankLoanRateDTO> getRateList() {
        return rateList;
    }

    public void setRateList(List<WeBankLoanRateDTO> rateList) {
        this.rateList = rateList;
    }

    public String getDefaultBindSerial() {
        return defaultBindSerial;
    }

    public void setDefaultBindSerial(String defaultBindSerial) {
        this.defaultBindSerial = defaultBindSerial;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
