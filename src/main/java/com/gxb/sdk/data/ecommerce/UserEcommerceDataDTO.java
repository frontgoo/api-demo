package com.gxb.sdk.data.ecommerce;



import java.io.Serializable;
import java.util.List;

/**
 * Created by junting on 2017/2/23.
 */
public class UserEcommerceDataDTO implements Serializable {
    private static final long serialVersionUID = 8315376004389044098L;
    private EcommerceBaseInfoDTO ecommerceBaseInfo;
    private List<EcommerceAddressDTO> ecommerceConsigneeAddresses;
    private List<EcommerceBindedBankCardDTO> ecommerceBindedBankCards;
    private List<EcommerceFeesAccountDTO> ecommercePaymentAccounts;
    private List<EcommerceTradeDTO> ecommerceTrades;
    private List<EcommerceZmCreditDTO> ecommerceZmCredits;
    private List<TaobaoOrderDTO> taobaoOrders;

    public EcommerceBaseInfoDTO getEcommerceBaseInfo() {
        return ecommerceBaseInfo;
    }

    public void setEcommerceBaseInfo(EcommerceBaseInfoDTO ecommerceBaseInfo) {
        this.ecommerceBaseInfo = ecommerceBaseInfo;
    }

    public List<EcommerceAddressDTO> getEcommerceConsigneeAddresses() {
        return ecommerceConsigneeAddresses;
    }

    public void setEcommerceConsigneeAddresses(List<EcommerceAddressDTO> ecommerceConsigneeAddresses) {
        this.ecommerceConsigneeAddresses = ecommerceConsigneeAddresses;
    }

    public List<EcommerceBindedBankCardDTO> getEcommerceBindedBankCards() {
        return ecommerceBindedBankCards;
    }

    public void setEcommerceBindedBankCards(List<EcommerceBindedBankCardDTO> ecommerceBindedBankCards) {
        this.ecommerceBindedBankCards = ecommerceBindedBankCards;
    }

    public List<EcommerceFeesAccountDTO> getEcommercePaymentAccounts() {
        return ecommercePaymentAccounts;
    }

    public void setEcommercePaymentAccounts(List<EcommerceFeesAccountDTO> ecommercePaymentAccounts) {
        this.ecommercePaymentAccounts = ecommercePaymentAccounts;
    }

    public List<EcommerceTradeDTO> getEcommerceTrades() {
        return ecommerceTrades;
    }

    public void setEcommerceTrades(List<EcommerceTradeDTO> ecommerceTrades) {
        this.ecommerceTrades = ecommerceTrades;
    }

    public List<EcommerceZmCreditDTO> getEcommerceZmCredits() {
        return ecommerceZmCredits;
    }

    public void setEcommerceZmCredits(List<EcommerceZmCreditDTO> ecommerceZmCredits) {
        this.ecommerceZmCredits = ecommerceZmCredits;
    }

    public List<TaobaoOrderDTO> getTaobaoOrders() {
        return taobaoOrders;
    }

    public void setTaobaoOrders(List<TaobaoOrderDTO> taobaoOrders) {
        this.taobaoOrders = taobaoOrders;
    }
}
