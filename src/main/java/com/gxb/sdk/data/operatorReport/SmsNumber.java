package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/19.
 */
public class SmsNumber implements Serializable {
    private String number;
    private String mark;
    private String type;
    private String location;
    private Integer totalCnt;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

}
