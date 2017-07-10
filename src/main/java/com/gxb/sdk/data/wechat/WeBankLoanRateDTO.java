package com.gxb.sdk.data.wechat;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by DOmmy on 2017/3/15.
 */
public class WeBankLoanRateDTO implements Serializable{
    private static final long serialVersionUID = -594294087308478479L;

    
    /**
     * 借款期数
     */
    private Integer loanTerm;
    /**
     * 利率
     */
    private BigDecimal interestRate;
    /**
     * 罚息率
     */
    private BigDecimal penaltyRate;

   

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }
}
