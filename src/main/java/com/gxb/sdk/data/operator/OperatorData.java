package com.gxb.sdk.data.operator;

import java.io.Serializable;
import java.util.List;

/**
 * 运营商中单个手机号对应运营商数据business model
 */
public class OperatorData implements Serializable {
    private static final long serialVersionUID = -3376020743505858335L;

    /**
     * 通话详单
     */
    private List<CallDetail> callDetails;

    /**
     * 短信详单
     */
    private List<ShortMessageDetail> shortMessageDetails;

    /**
     * 个人信息
     */
    private PersonalInformation personalInformation;

    /**
     * 账单信息（当月账单可能缺失）
     */
    private List<BillDetail> billDetails;

    /**
     * 亲情号
     */
    private List<FamiliarityNumber> familiarityNumbers;

    /**
     * 上网信息
     */
    private List<NetDetail> netDetails;

    /**
     * 套餐信息
     */
    private List<PackageDetail> packageDetails;

    /**
     * 充值信息
     */
    private List<RechargeDetail> rechargeDetails;

    public List<NetDetail> getNetDetails() {
        return netDetails;
    }

    public void setNetDetails(List<NetDetail> netDetails) {
        this.netDetails = netDetails;
    }

    public List<PackageDetail> getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(List<PackageDetail> packageDetails) {
        this.packageDetails = packageDetails;
    }

    public List<RechargeDetail> getRechargeDetails() {
        return rechargeDetails;
    }

    public void setRechargeDetails(List<RechargeDetail> rechargeDetails) {
        this.rechargeDetails = rechargeDetails;
    }

    public List<CallDetail> getCallDetails() {
        return callDetails;
    }

    public void setCallDetails(List<CallDetail> callDetails) {
        this.callDetails = callDetails;
    }

    public List<ShortMessageDetail> getShortMessageDetails() {
        return shortMessageDetails;
    }

    public void setShortMessageDetails(List<ShortMessageDetail> shortMessageDetails) {
        this.shortMessageDetails = shortMessageDetails;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public List<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }

    public List<FamiliarityNumber> getFamiliarityNumbers() {
        return familiarityNumbers;
    }

    public void setFamiliarityNumbers(List<FamiliarityNumber> familiarityNumbers) {
        this.familiarityNumbers = familiarityNumbers;
    }

}
