package com.gxb.sdk.data.ecommerce;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年7月10日 下午2:17:30
 */
public class EcommerceBaseInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private String name;

    private String taobaoAccount;

    private String alipayAccount;

    private String identityCard;

    private String mobile;

    private String email;

    private Date alipayRegistrationDatetime;

    private Boolean isVerified;

    private BigDecimal alipayBalance;

    private BigDecimal yuebaoBalance;

    private Integer huabeiAmount;

    private BigDecimal huabeiBalance;


    private Integer creditLevelAsBuyer;

    private Integer creditLevelAsSeller;

    private Integer jiebeiAmount;

    private BigDecimal jiebeiBalance;

    private Integer status;

    private String alipayAccountType;
    private String alipayUserId;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getTaobaoAccount() {
        return taobaoAccount;
    }



    public void setTaobaoAccount(String taobaoAccount) {
        this.taobaoAccount = taobaoAccount;
    }



    public String getAlipayAccount() {
        return alipayAccount;
    }



    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }



    public String getIdentityCard() {
        return identityCard;
    }



    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }



    public String getMobile() {
        return mobile;
    }



    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public Date getAlipayRegistrationDatetime() {
        return alipayRegistrationDatetime;
    }



    public void setAlipayRegistrationDatetime(Date alipayRegistrationDatetime) {
        this.alipayRegistrationDatetime = alipayRegistrationDatetime;
    }



    public Boolean getIsVerified() {
        return isVerified;
    }



    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }



    public BigDecimal getAlipayBalance() {
        return alipayBalance;
    }



    public void setAlipayBalance(BigDecimal alipayBalance) {
        this.alipayBalance = alipayBalance;
    }



    public BigDecimal getYuebaoBalance() {
        return yuebaoBalance;
    }



    public void setYuebaoBalance(BigDecimal yuebaoBalance) {
        this.yuebaoBalance = yuebaoBalance;
    }



    public Integer getHuabeiAmount() {
        return huabeiAmount;
    }



    public void setHuabeiAmount(Integer huabeiAmount) {
        this.huabeiAmount = huabeiAmount;
    }



    public BigDecimal getHuabeiBalance() {
        return huabeiBalance;
    }



    public void setHuabeiBalance(BigDecimal huabeiBalance) {
        this.huabeiBalance = huabeiBalance;
    }



    public Integer getCreditLevelAsBuyer() {
        return creditLevelAsBuyer;
    }



    public void setCreditLevelAsBuyer(Integer creditLevelAsBuyer) {
        this.creditLevelAsBuyer = creditLevelAsBuyer;
    }



    public Integer getCreditLevelAsSeller() {
        return creditLevelAsSeller;
    }



    public void setCreditLevelAsSeller(Integer creditLevelAsSeller) {
        this.creditLevelAsSeller = creditLevelAsSeller;
    }

    public Integer getJiebeiAmount() {
        return jiebeiAmount;
    }



    public void setJiebeiAmount(Integer jiebeiAmount) {
        this.jiebeiAmount = jiebeiAmount;
    }



    public BigDecimal getJiebeiBalance() {
        return jiebeiBalance;
    }



    public void setJiebeiBalance(BigDecimal jiebeiBalance) {
        this.jiebeiBalance = jiebeiBalance;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAlipayAccountType() {
        return alipayAccountType;
    }

    public void setAlipayAccountType(String alipayAccountType) {
        this.alipayAccountType = alipayAccountType;
    }


    public String getAlipayUserId() {
        return alipayUserId;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

}
