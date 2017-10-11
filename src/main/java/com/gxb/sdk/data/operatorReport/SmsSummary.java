package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaojun on 2017/7/18.
 */
public class SmsSummary implements Serializable {
    private Integer contactCnt;
    private Integer frequentContactCnt;
    private String frequentContactLocation;
    private Byte idCardLocationMatchStatus;
    private Integer homeSmsCnt;
    private Integer midNightSmsCnt;
    private Integer midNightContactCnt;
    private Integer hourFrequentSmsCnt;
    private Integer hourFrequentContactCnt;
    private Date hourFrequentSmsDate;
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

    public Integer getHomeSmsCnt() {
        return homeSmsCnt;
    }

    public void setHomeSmsCnt(Integer homeSmsCnt) {
        this.homeSmsCnt = homeSmsCnt;
    }

    public Integer getMidNightSmsCnt() {
        return midNightSmsCnt;
    }

    public void setMidNightSmsCnt(Integer midNightSmsCnt) {
        this.midNightSmsCnt = midNightSmsCnt;
    }

    public Integer getMidNightContactCnt() {
        return midNightContactCnt;
    }

    public void setMidNightContactCnt(Integer midNightContactCnt) {
        this.midNightContactCnt = midNightContactCnt;
    }

    public Integer getHourFrequentSmsCnt() {
        return hourFrequentSmsCnt;
    }

    public void setHourFrequentSmsCnt(Integer hourFrequentSmsCnt) {
        this.hourFrequentSmsCnt = hourFrequentSmsCnt;
    }

    public Integer getHourFrequentContactCnt() {
        return hourFrequentContactCnt;
    }

    public void setHourFrequentContactCnt(Integer hourFrequentContactCnt) {
        this.hourFrequentContactCnt = hourFrequentContactCnt;
    }

    public Date getHourFrequentSmsDate() {
        return hourFrequentSmsDate;
    }

    public void setHourFrequentSmsDate(Date hourFrequentSmsDate) {
        this.hourFrequentSmsDate = hourFrequentSmsDate;
    }

}
