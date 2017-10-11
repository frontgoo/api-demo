package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaojun on 2017/7/18.
 */
public class CallSummary implements Serializable {
    private Integer contactCnt;
    private Integer frequentContactCnt;
    private String frequentContactLocation;
    private Byte idCardLocationMatchStatus;
    private Integer validCallCnt;
    private Integer asCalledValidCallCnt;
    private Integer asCallerValidCallCnt;
    private Integer homeValidCallCnt;
    private Integer callCnt;
    private Integer asCalledCallCnt;
    private Integer asCallerCallCnt;
    private Integer midNightCallCnt;
    private Integer midNightContactCnt;
    private Integer asCalledMidNightCallCnt;
    private Integer asCallerMidNightCallCnt;
    private Integer hourFrequentCallCnt;
    private Integer hourFrequentContactCnt;
    private Date hourFrequentCallDate;
    private Byte timeDimensionType;

    public Byte getTimeDimensionType() {
        return timeDimensionType;
    }

    public void setTimeDimensionType(Byte timeDimensionType) {
        this.timeDimensionType = timeDimensionType;
    }

    public Integer getContactCnt() {
        return contactCnt;
    }

    public void setContactCnt(Integer contactCnt) {
        this.contactCnt = contactCnt;
    }

    public Integer getFrequentContactCnt() {
        return frequentContactCnt;
    }

    public void setFrequentContactCnt(Integer frequentContactCnt) {
        this.frequentContactCnt = frequentContactCnt;
    }

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

    public Integer getValidCallCnt() {
        return validCallCnt;
    }

    public void setValidCallCnt(Integer validCallCnt) {
        this.validCallCnt = validCallCnt;
    }

    public Integer getAsCalledValidCallCnt() {
        return asCalledValidCallCnt;
    }

    public void setAsCalledValidCallCnt(Integer asCalledValidCallCnt) {
        this.asCalledValidCallCnt = asCalledValidCallCnt;
    }

    public Integer getAsCallerValidCallCnt() {
        return asCallerValidCallCnt;
    }

    public void setAsCallerValidCallCnt(Integer asCallerValidCallCnt) {
        this.asCallerValidCallCnt = asCallerValidCallCnt;
    }

    public Integer getHomeValidCallCnt() {
        return homeValidCallCnt;
    }

    public void setHomeValidCallCnt(Integer homeValidCallCnt) {
        this.homeValidCallCnt = homeValidCallCnt;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public Integer getAsCalledCallCnt() {
        return asCalledCallCnt;
    }

    public void setAsCalledCallCnt(Integer asCalledCallCnt) {
        this.asCalledCallCnt = asCalledCallCnt;
    }

    public Integer getAsCallerCallCnt() {
        return asCallerCallCnt;
    }

    public void setAsCallerCallCnt(Integer asCallerCallCnt) {
        this.asCallerCallCnt = asCallerCallCnt;
    }

    public Integer getMidNightCallCnt() {
        return midNightCallCnt;
    }

    public void setMidNightCallCnt(Integer midNightCallCnt) {
        this.midNightCallCnt = midNightCallCnt;
    }

    public Integer getMidNightContactCnt() {
        return midNightContactCnt;
    }

    public void setMidNightContactCnt(Integer midNightContactCnt) {
        this.midNightContactCnt = midNightContactCnt;
    }

    public Integer getAsCalledMidNightCallCnt() {
        return asCalledMidNightCallCnt;
    }

    public void setAsCalledMidNightCallCnt(Integer asCalledMidNightCallCnt) {
        this.asCalledMidNightCallCnt = asCalledMidNightCallCnt;
    }

    public Integer getAsCallerMidNightCallCnt() {
        return asCallerMidNightCallCnt;
    }

    public void setAsCallerMidNightCallCnt(Integer asCallerMidNightCallCnt) {
        this.asCallerMidNightCallCnt = asCallerMidNightCallCnt;
    }

    public Integer getHourFrequentCallCnt() {
        return hourFrequentCallCnt;
    }

    public void setHourFrequentCallCnt(Integer hourFrequentCallCnt) {
        this.hourFrequentCallCnt = hourFrequentCallCnt;
    }

    public Integer getHourFrequentContactCnt() {
        return hourFrequentContactCnt;
    }

    public void setHourFrequentContactCnt(Integer hourFrequentContactCnt) {
        this.hourFrequentContactCnt = hourFrequentContactCnt;
    }

    public Date getHourFrequentCallDate() {
        return hourFrequentCallDate;
    }

    public void setHourFrequentCallDate(Date hourFrequentCallDate) {
        this.hourFrequentCallDate = hourFrequentCallDate;
    }

}