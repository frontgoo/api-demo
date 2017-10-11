package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/18.
 */
public class ActivitySummary implements Serializable {
    private Integer callDayCnt;
    private Integer smsDayCnt;
    private Integer netDayCnt;
    private Integer rechargeDayCnt;
    private Byte timeDimensionType;

    public Byte getTimeDimensionType() {
        return timeDimensionType;
    }

    public void setTimeDimensionType(Byte timeDimensionType) {
        this.timeDimensionType = timeDimensionType;
    }

    public Integer getCallDayCnt() {
        return callDayCnt;
    }

    public void setCallDayCnt(Integer callDayCnt) {
        this.callDayCnt = callDayCnt;
    }

    public Integer getSmsDayCnt() {
        return smsDayCnt;
    }

    public void setSmsDayCnt(Integer smsDayCnt) {
        this.smsDayCnt = smsDayCnt;
    }

    public Integer getNetDayCnt() {
        return netDayCnt;
    }

    public void setNetDayCnt(Integer netDayCnt) {
        this.netDayCnt = netDayCnt;
    }

    public Integer getRechargeDayCnt() {
        return rechargeDayCnt;
    }

    public void setRechargeDayCnt(Integer rechargeDayCnt) {
        this.rechargeDayCnt = rechargeDayCnt;
    }

}
