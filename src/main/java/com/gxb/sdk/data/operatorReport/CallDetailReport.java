package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaojun on 2017/7/18.
 */
public class CallDetailReport implements Serializable {
    List<CallLocation> callLocations;
    List<CallNumber> callNumbers;

    public List<CallLocation> getCallLocations() {
        return callLocations;
    }

    public void setCallLocations(List<CallLocation> callLocations) {
        this.callLocations = callLocations;
    }

    public List<CallNumber> getCallNumbers() {
        return callNumbers;
    }

    public void setCallNumbers(List<CallNumber> callNumbers) {
        this.callNumbers = callNumbers;
    }

}
