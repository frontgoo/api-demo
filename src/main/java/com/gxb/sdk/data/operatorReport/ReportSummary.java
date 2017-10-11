package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaojun on 2017/7/19.
 */
public class ReportSummary implements Serializable {
    private BasicInfo basicInfo;
    private BasicInfoAnalysis basicInfoAnalysis;
    private List<CallSummary> callSummary;
    private List<SmsSummary> smsSummary;
    private List<NetSummary> netSummary;
    private RiskSummary riskSummary;
    private List<ActivitySummary> activitySummary;
    private List<ContactSummary> contactSummary;
    private List<ConsumeSummary> consumeSummary;

    public List<ConsumeSummary> getConsumeSummary() {
        return consumeSummary;
    }

    public void setConsumeSummary(List<ConsumeSummary> consumeSummary) {
        this.consumeSummary = consumeSummary;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public BasicInfoAnalysis getBasicInfoAnalysis() {
        return basicInfoAnalysis;
    }

    public void setBasicInfoAnalysis(BasicInfoAnalysis basicInfoAnalysis) {
        this.basicInfoAnalysis = basicInfoAnalysis;
    }

    public RiskSummary getRiskSummary() {
        return riskSummary;
    }

    public void setRiskSummary(RiskSummary riskSummary) {
        this.riskSummary = riskSummary;
    }

    public List<CallSummary> getCallSummary() {
        return callSummary;
    }

    public void setCallSummary(List<CallSummary> callSummary) {
        this.callSummary = callSummary;
    }

    public List<SmsSummary> getSmsSummary() {
        return smsSummary;
    }

    public void setSmsSummary(List<SmsSummary> smsSummary) {
        this.smsSummary = smsSummary;
    }

    public List<NetSummary> getNetSummary() {
        return netSummary;
    }

    public void setNetSummary(List<NetSummary> netSummary) {
        this.netSummary = netSummary;
    }

    public List<ActivitySummary> getActivitySummary() {
        return activitySummary;
    }

    public void setActivitySummary(List<ActivitySummary> activitySummary) {
        this.activitySummary = activitySummary;
    }

    public List<ContactSummary> getContactSummary() {
        return contactSummary;
    }

    public void setContactSummary(List<ContactSummary> contactSummary) {
        this.contactSummary = contactSummary;
    }

}
