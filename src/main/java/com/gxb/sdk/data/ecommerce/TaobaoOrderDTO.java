package com.gxb.sdk.data.ecommerce;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by DOmmy on 2017/7/14.
 */
public class TaobaoOrderDTO implements Serializable{
    
    /**
     * 支付宝交易号
     */
    private String tradeNumber;
    /**
     * 订单交易号
     */
    private String orderNumber;
    private String tradeStatusName;
    private String tradeTypeName;
    private Date createTime;
    private Date endTime;
    /**
     * 商品总数量
     */
    private Integer totalQuantity;
    /**
     * 邮费
     */
    private BigDecimal postFees;
    /**
     * 实付
     */
    private BigDecimal actualFee;
    /**
     * 收货地址
     */
    private EcommerceAddressDTO address;

    private TaobaoSellerDTO seller;

    private TaobaoLogisticsDTO logistics;

    private List<TaobaoSubOrderDTO> subOrders;

    private String invoiceName;
    private String taxNumber;


    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public BigDecimal getPostFees() {
        return postFees;
    }

    public void setPostFees(BigDecimal postFees) {
        this.postFees = postFees;
    }

    public BigDecimal getActualFee() {
        return actualFee;
    }

    public void setActualFee(BigDecimal actualFee) {
        this.actualFee = actualFee;
    }

    public EcommerceAddressDTO getAddress() {
        return address;
    }

    public void setAddress(EcommerceAddressDTO address) {
        this.address = address;
    }

    public TaobaoSellerDTO getSeller() {
        return seller;
    }

    public void setSeller(TaobaoSellerDTO seller) {
        this.seller = seller;
    }

    public TaobaoLogisticsDTO getLogistics() {
        return logistics;
    }

    public void setLogistics(TaobaoLogisticsDTO logistics) {
        this.logistics = logistics;
    }

    public List<TaobaoSubOrderDTO> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<TaobaoSubOrderDTO> subOrders) {
        this.subOrders = subOrders;
    }

    public String getTradeStatusName() {
        return tradeStatusName;
    }

    public void setTradeStatusName(String tradeStatusName) {
        this.tradeStatusName = tradeStatusName;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getTradeTypeName() {
        return tradeTypeName;
    }

    public void setTradeTypeName(String tradeTypeName) {
        this.tradeTypeName = tradeTypeName;
    }

}
