package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yaojun on 2017/7/5.
 */
public class RechargeDetail implements Serializable {
    private static final long serialVersionUID = 4732964665760476011L;
    /**
     * 充值时间
     */
    private Date rechargeTime;
    /**
     * 充值金额
     */
    private BigDecimal rechargeAmount;

    /**
     * 充值方式
     */
    private String rechargeType;

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }
}
