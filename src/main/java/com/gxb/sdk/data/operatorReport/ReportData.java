package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/18.
 */
public class ReportData implements Serializable {
    private ReportSummary reportSummary;
    private CallDetailReport callDetailReport;
    private SmsDetailReport smsDetailReport;

    public ReportSummary getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(ReportSummary reportSummary) {
        this.reportSummary = reportSummary;
    }

    public CallDetailReport getCallDetailReport() {
        return callDetailReport;
    }

    public void setCallDetailReport(CallDetailReport callDetailReport) {
        this.callDetailReport = callDetailReport;
    }

    public SmsDetailReport getSmsDetailReport() {
        return smsDetailReport;
    }

    public void setSmsDetailReport(SmsDetailReport smsDetailReport) {
        this.smsDetailReport = smsDetailReport;
    }

}
