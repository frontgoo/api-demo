package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaojun on 2017/7/18.
 */
public class ContactSummary implements Serializable {
    private List<CallContact> top3CallContacts;
    private List<CallContact> top3CallValidContacts;
    private List<CallContact> top3CallCloseContacts;
    private List<SmsContact> top3SmsContacts;
    private Byte timeDimensionType;

    public Byte getTimeDimensionType() {
        return timeDimensionType;
    }

    public void setTimeDimensionType(Byte timeDimensionType) {
        this.timeDimensionType = timeDimensionType;
    }

    public List<CallContact> getTop3CallContacts() {
        return top3CallContacts;
    }

    public void setTop3CallContacts(List<CallContact> top3CallContacts) {
        this.top3CallContacts = top3CallContacts;
    }

    public List<CallContact> getTop3CallValidContacts() {
        return top3CallValidContacts;
    }

    public void setTop3CallValidContacts(List<CallContact> top3CallValidContacts) {
        this.top3CallValidContacts = top3CallValidContacts;
    }

    public List<CallContact> getTop3CallCloseContacts() {
        return top3CallCloseContacts;
    }

    public void setTop3CallCloseContacts(List<CallContact> top3CallCloseContacts) {
        this.top3CallCloseContacts = top3CallCloseContacts;
    }

    public List<SmsContact> getTop3SmsContacts() {
        return top3SmsContacts;
    }

    public void setTop3SmsContacts(List<SmsContact> top3SmsContacts) {
        this.top3SmsContacts = top3SmsContacts;
    }

}
