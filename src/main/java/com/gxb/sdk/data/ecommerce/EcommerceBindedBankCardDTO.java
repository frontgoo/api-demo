package com.gxb.sdk.data.ecommerce;


import java.io.Serializable;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年7月10日 下午2:19:35
 */
public class EcommerceBindedBankCardDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6380839815072726425L;

    private String bankName;

    private String cardNo;

    private Byte cardType;

    private String cardOwnerName;

    private Boolean isExpress;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Byte getCardType() {
        return cardType;
    }

    public void setCardType(Byte cardType) {
        this.cardType = cardType;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName == null ? null : cardOwnerName.trim();
    }

    public Boolean getIsExpress() {
        return isExpress;
    }

    public void setIsExpress(Boolean isExpress) {
        this.isExpress = isExpress;
    }

}
