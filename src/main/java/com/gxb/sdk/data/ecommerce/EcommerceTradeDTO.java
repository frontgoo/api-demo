package com.gxb.sdk.data.ecommerce;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author  <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since   2017年7月10日 下午2:20:23 
 */
public class EcommerceTradeDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private String title;

    private BigDecimal amount;

    private String tradeNo;

    private Date tradeTime;

    private String tradeStatusName;


    private String txTypeName;

    private String behaviorLableName;

    private String tradeDetailUrl;

    private String otherSide;

    private String otherSideAccount;

    private String otherSideName;

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public BigDecimal getAmount() {
        return amount;
    }



    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }



    public String getTradeNo() {
        return tradeNo;
    }



    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }



    public Date getTradeTime() {
        return tradeTime;
    }



    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }


    public String getTradeDetailUrl() {
        return tradeDetailUrl;
    }



    public void setTradeDetailUrl(String tradeDetailUrl) {
        this.tradeDetailUrl = tradeDetailUrl;
    }



    public String getOtherSide() {
        return otherSide;
    }



    public void setOtherSide(String otherSide) {
        this.otherSide = otherSide;
    }



    public String getOtherSideAccount() {
        return otherSideAccount;
    }



    public void setOtherSideAccount(String otherSideAccount) {
        this.otherSideAccount = otherSideAccount;
    }



    public String getOtherSideName() {
        return otherSideName;
    }



    public void setOtherSideName(String otherSideName) {
        this.otherSideName = otherSideName;
    }

    public String getTradeStatusName() {
        return tradeStatusName;
    }

    public void setTradeStatusName(String tradeStatusName) {
        this.tradeStatusName = tradeStatusName;
    }

    public String getTxTypeName() {
        return txTypeName;
    }

    public void setTxTypeName(String txTypeName) {
        this.txTypeName = txTypeName;
    }

    public String getBehaviorLableName() {
        return behaviorLableName;
    }

    public void setBehaviorLableName(String behaviorLableName) {
        this.behaviorLableName = behaviorLableName;
    }

}
