package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/18.
 */
public class RiskSummary implements Serializable {
    private Integer creditCardCallCnt;
    private Integer creditCardCallDuration;
    private Integer creditCardSmsCnt;
    private Integer loanPlatformCallCnt;
    private Integer loanPlatformCallDuration;
    private Integer loanPlatformSmsCnt;
    private Integer call110Cnt;
    private Integer call110Duration;
    private Integer macaoCallCnt;
    private Integer macaoCallDuration;
    private Integer macaoSmsCnt;
    private Integer debtCallCnt;
    private Integer debtCallDuration;
    private Integer debtSmsCnt;
    private Integer timeDimensionType;

    public Integer getTimeDimensionType() {
        return timeDimensionType;
    }

    public void setTimeDimensionType(Integer timeDimensionType) {
        this.timeDimensionType = timeDimensionType;
    }

    public Integer getCreditCardCallCnt() {
        return creditCardCallCnt;
    }

    public void setCreditCardCallCnt(Integer creditCardCallCnt) {
        this.creditCardCallCnt = creditCardCallCnt;
    }

    public Integer getCreditCardCallDuration() {
        return creditCardCallDuration;
    }

    public void setCreditCardCallDuration(Integer creditCardCallDuration) {
        this.creditCardCallDuration = creditCardCallDuration;
    }

    public Integer getCreditCardSmsCnt() {
        return creditCardSmsCnt;
    }

    public void setCreditCardSmsCnt(Integer creditCardSmsCnt) {
        this.creditCardSmsCnt = creditCardSmsCnt;
    }

    public Integer getLoanPlatformCallCnt() {
        return loanPlatformCallCnt;
    }

    public void setLoanPlatformCallCnt(Integer loanPlatformCallCnt) {
        this.loanPlatformCallCnt = loanPlatformCallCnt;
    }

    public Integer getLoanPlatformCallDuration() {
        return loanPlatformCallDuration;
    }

    public void setLoanPlatformCallDuration(Integer loanPlatformCallDuration) {
        this.loanPlatformCallDuration = loanPlatformCallDuration;
    }

    public Integer getLoanPlatformSmsCnt() {
        return loanPlatformSmsCnt;
    }

    public void setLoanPlatformSmsCnt(Integer loanPlatformSmsCnt) {
        this.loanPlatformSmsCnt = loanPlatformSmsCnt;
    }

    public Integer getCall110Cnt() {
        return call110Cnt;
    }

    public void setCall110Cnt(Integer call110Cnt) {
        this.call110Cnt = call110Cnt;
    }

    public Integer getCall110Duration() {
        return call110Duration;
    }

    public void setCall110Duration(Integer call110Duration) {
        this.call110Duration = call110Duration;
    }

    public Integer getMacaoCallCnt() {
        return macaoCallCnt;
    }

    public void setMacaoCallCnt(Integer macaoCallCnt) {
        this.macaoCallCnt = macaoCallCnt;
    }

    public Integer getMacaoCallDuration() {
        return macaoCallDuration;
    }

    public void setMacaoCallDuration(Integer macaoCallDuration) {
        this.macaoCallDuration = macaoCallDuration;
    }

    public Integer getMacaoSmsCnt() {
        return macaoSmsCnt;
    }

    public void setMacaoSmsCnt(Integer macaoSmsCnt) {
        this.macaoSmsCnt = macaoSmsCnt;
    }

    public Integer getDebtCallCnt() {
        return debtCallCnt;
    }

    public void setDebtCallCnt(Integer debtCallCnt) {
        this.debtCallCnt = debtCallCnt;
    }

    public Integer getDebtCallDuration() {
        return debtCallDuration;
    }

    public void setDebtCallDuration(Integer debtCallDuration) {
        this.debtCallDuration = debtCallDuration;
    }

    public Integer getDebtSmsCnt() {
        return debtSmsCnt;
    }

    public void setDebtSmsCnt(Integer debtSmsCnt) {
        this.debtSmsCnt = debtSmsCnt;
    }

}
