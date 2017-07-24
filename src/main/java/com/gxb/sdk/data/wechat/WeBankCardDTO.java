package com.gxb.sdk.data.wechat;


import java.io.Serializable;

/**
 * Created by DOmmy on 2017/3/15.
 */
public class WeBankCardDTO implements Serializable{
    private static final long serialVersionUID = -5040960360721377642L;

    
    /**
     * 银行类型
     */
    private String bankType;
    /**
     * 绑卡序列
     */
    private String bindSerial;
    /**
     * 银行名
     */
    private String bankName;
    /**
     * 卡号后四位
     */
    private String cardTail;
    /**
     * 1借记卡 2信用卡
     */
    private Integer bankaccType;

    

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBindSerial() {
        return bindSerial;
    }

    public void setBindSerial(String bindSerial) {
        this.bindSerial = bindSerial;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardTail() {
        return cardTail;
    }

    public void setCardTail(String cardTail) {
        this.cardTail = cardTail;
    }

    public Integer getBankaccType() {
        return bankaccType;
    }

    public void setBankaccType(Integer bankaccType) {
        this.bankaccType = bankaccType;
    }
}
