package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yaojun on 2017/7/18.
 */
public class NetSummary implements Serializable {
    private String frequentContactLocation;
    private Byte idCardLocationMatchStatus;
    private Integer netUseCnt;
    private BigDecimal netUseTotalFlow;
    private Byte timeDimensionType;

    public String getFrequentContactLocation() {
        return frequentContactLocation;
    }

    public void setFrequentContactLocation(String frequentContactLocation) {
        this.frequentContactLocation = frequentContactLocation;
    }

    public Byte getIdCardLocationMatchStatus() {
        return idCardLocationMatchStatus;
    }

    public void setIdCardLocationMatchStatus(Byte idCardLocationMatchStatus) {
        this.idCardLocationMatchStatus = idCardLocationMatchStatus;
    }

    public Integer getNetUseCnt() {
        return netUseCnt;
    }

    public void setNetUseCnt(Integer netUseCnt) {
        this.netUseCnt = netUseCnt;
    }

    public BigDecimal getNetUseTotalFlow() {
        return netUseTotalFlow;
    }

    public void setNetUseTotalFlow(BigDecimal netUseTotalFlow) {
        this.netUseTotalFlow = netUseTotalFlow;
    }

    public Byte getTimeDimensionType() {
        return timeDimensionType;
    }

    public void setTimeDimensionType(Byte timeDimensionType) {
        this.timeDimensionType = timeDimensionType;
    }

}
