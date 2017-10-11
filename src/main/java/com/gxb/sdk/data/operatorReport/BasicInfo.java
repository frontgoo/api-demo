package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yaojun on 2017/7/18.
 */
public class BasicInfo implements Serializable {
    private String telNum;
    private String name;
    private String idCard;
    private Integer netJoinDuration;
    private BigDecimal accountBalance;
    private String telNumProvince;
    private String telNumCity;
    private String telCustomerLevel;
    private String telPackage;
    private BigDecimal lastMonthPayFee;
    private Date queryDate;

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getNetJoinDuration() {
        return netJoinDuration;
    }

    public void setNetJoinDuration(Integer netJoinDuration) {
        this.netJoinDuration = netJoinDuration;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getTelNumProvince() {
        return telNumProvince;
    }

    public void setTelNumProvince(String telNumProvince) {
        this.telNumProvince = telNumProvince;
    }

    public String getTelNumCity() {
        return telNumCity;
    }

    public void setTelNumCity(String telNumCity) {
        this.telNumCity = telNumCity;
    }

    public String getTelCustomerLevel() {
        return telCustomerLevel;
    }

    public void setTelCustomerLevel(String telCustomerLevel) {
        this.telCustomerLevel = telCustomerLevel;
    }

    public String getTelPackage() {
        return telPackage;
    }

    public void setTelPackage(String telPackage) {
        this.telPackage = telPackage;
    }

    public BigDecimal getLastMonthPayFee() {
        return lastMonthPayFee;
    }

    public void setLastMonthPayFee(BigDecimal lastMonthPayFee) {
        this.lastMonthPayFee = lastMonthPayFee;
    }

    public Date getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(Date queryDate) {
        this.queryDate = queryDate;
    }

}
