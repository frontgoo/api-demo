package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yaojun on 2017/7/5.
 */
public class PackageDetail implements Serializable {
    private static final long serialVersionUID = 8475754328238493336L;
    /**
     * 套餐项
     */
    private String packItem;
    /**
     * 套餐总量
     */
    private BigDecimal packTotal;
    /**
     * 套餐使用量
     */
    private BigDecimal packUsed;
    /**
     * 套餐单位
     */
    private String packUnit;

    public String getPackItem() {
        return packItem;
    }

    public void setPackItem(String packItem) {
        this.packItem = packItem;
    }

    public BigDecimal getPackTotal() {
        return packTotal;
    }

    public void setPackTotal(BigDecimal packTotal) {
        this.packTotal = packTotal;
    }

    public BigDecimal getPackUsed() {
        return packUsed;
    }

    public void setPackUsed(BigDecimal packUsed) {
        this.packUsed = packUsed;
    }

    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }
}
