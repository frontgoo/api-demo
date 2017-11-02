package com.gxb.sdk.data.operatorReport;

import java.io.Serializable;

/**
 * Created by yaojun on 2017/7/18.
 */
public class BasicInfoAnalysis implements Serializable {
    private Byte idCardMatchStatus;
    private Byte nameMatchStatus;
    private Byte familiarityStatus;
    private Byte familiarityHolderStatus;
    private Byte mobileMatchIdCardStatus;

    public Byte getIdCardMatchStatus() {
        return idCardMatchStatus;
    }

    public void setIdCardMatchStatus(Byte idCardMatchStatus) {
        this.idCardMatchStatus = idCardMatchStatus;
    }

    public Byte getNameMatchStatus() {
        return nameMatchStatus;
    }

    public void setNameMatchStatus(Byte nameMatchStatus) {
        this.nameMatchStatus = nameMatchStatus;
    }

    public Byte getFamiliarityStatus() {
        return familiarityStatus;
    }

    public void setFamiliarityStatus(Byte familiarityStatus) {
        this.familiarityStatus = familiarityStatus;
    }

    public Byte getFamiliarityHolderStatus() {
        return familiarityHolderStatus;
    }

    public void setFamiliarityHolderStatus(Byte familiarityHolderStatus) {
        this.familiarityHolderStatus = familiarityHolderStatus;
    }

    public Byte getMobileMatchIdCardStatus() {
        return mobileMatchIdCardStatus;
    }

    public void setMobileMatchIdCardStatus(Byte mobileMatchIdCardStatus) {
        this.mobileMatchIdCardStatus = mobileMatchIdCardStatus;
    }

}
