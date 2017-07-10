package com.gxb.sdk.data.ecommerce;


import java.io.Serializable;
import java.util.Date;

public class EcommerceZmCreditDTO implements Serializable {
    

    private Integer creditScore;
    private Date evaluationTime;


    private static final long serialVersionUID = 1L;


    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

   
}
