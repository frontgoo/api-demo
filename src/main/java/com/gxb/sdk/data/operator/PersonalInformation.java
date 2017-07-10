package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 个人基本信息business model
 */
public class PersonalInformation implements Serializable {

    private String name;

    private String identityCard;

    private String telNum;

    private String telNumProvince;

    private String telNumCity;

    private String telCustomerLevel;

    private String telNumAttribution;

    private BigDecimal accountBalance;

    private Date netJoinDate;

    private String telNumStatus;

    private String telPackage;

    private Integer realNameStatus;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }

    public String getTelNumProvince() {
        return telNumProvince;
    }

    public void setTelNumProvince(String telNumProvince) {
        this.telNumProvince = telNumProvince == null ? null : telNumProvince.trim();
    }

    public String getTelNumCity() {
        return telNumCity;
    }

    public void setTelNumCity(String telNumCity) {
        this.telNumCity = telNumCity == null ? null : telNumCity.trim();
    }

    public String getTelCustomerLevel() {
        return telCustomerLevel;
    }

    public void setTelCustomerLevel(String telCustomerLevel) {
        this.telCustomerLevel = telCustomerLevel == null ? null : telCustomerLevel.trim();
    }

    public String getTelNumAttribution() {
        return telNumAttribution;
    }

    public void setTelNumAttribution(String telNumAttribution) {
        this.telNumAttribution = telNumAttribution == null ? null : telNumAttribution.trim();
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Date getNetJoinDate() {
        return netJoinDate;
    }

    public void setNetJoinDate(Date netJoinDate) {
        this.netJoinDate = netJoinDate;
    }

    public String getTelNumStatus() {
        return telNumStatus;
    }

    public void setTelNumStatus(String telNumStatus) {
        this.telNumStatus = telNumStatus == null ? null : telNumStatus.trim();
    }

    public String getTelPackage() {
        return telPackage;
    }

    public void setTelPackage(String telPackage) {
        this.telPackage = telPackage == null ? null : telPackage.trim();
    }

    public Integer getRealNameStatus() {
        return realNameStatus;
    }

    public void setRealNameStatus(Integer realNameStatus) {
        this.realNameStatus = realNameStatus;
    }

}
