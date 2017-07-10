package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yaojun on 2017/7/5.
 */
public class NetDetail implements Serializable {
    private static final long serialVersionUID = 5284165439061509721L;
    /**
     * 流量开始使用时间
     */
    private Date netStartTime;
    /**
     * 流量使用时长：数据格式 - ([0-9]*时)?([0-9]*分)?([0-9]*秒)?
     */
    private Integer netDuration;
    /**
     * 流量使用地址
     */
    private String netLocation;
    /**
     * 流量使用量
     */
    private BigDecimal netFlow;
    /**
     * 网络类型
     */
    private String netType;
    /**
     * 流量套餐
     */
    private String netServiceName;
    /**
     * 流量费用
     */
    private BigDecimal fee;

    public Date getNetStartTime() {
        return netStartTime;
    }

    public void setNetStartTime(Date netStartTime) {
        this.netStartTime = netStartTime;
    }

    public Integer getNetDuration() {
        return netDuration;
    }

    public void setNetDuration(Integer netDuration) {
        this.netDuration = netDuration;
    }

    public String getNetLocation() {
        return netLocation;
    }

    public void setNetLocation(String netLocation) {
        this.netLocation = netLocation;
    }

    public String getNetType() {
        return netType;
    }

    public BigDecimal getNetFlow() {
        return netFlow;
    }

    public void setNetFlow(BigDecimal netFlow) {
        this.netFlow = netFlow;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public String getNetServiceName() {
        return netServiceName;
    }

    public void setNetServiceName(String netServiceName) {
        this.netServiceName = netServiceName;
    }

}
