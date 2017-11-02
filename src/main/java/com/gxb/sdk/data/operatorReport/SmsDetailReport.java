package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaojun on 2017/7/19.
 */
public class SmsDetailReport implements Serializable {
    private List<SmsLocation> smsLocations;
    private List<SmsNumber> smsNumbers;

    public List<SmsLocation> getSmsLocations() {
        return smsLocations;
    }

    public void setSmsLocations(List<SmsLocation> smsLocations) {
        this.smsLocations = smsLocations;
    }

    public List<SmsNumber> getSmsNumbers() {
        return smsNumbers;
    }

    public void setSmsNumbers(List<SmsNumber> smsNumbers) {
        this.smsNumbers = smsNumbers;
    }

}
