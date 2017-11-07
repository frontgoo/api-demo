
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by DOmmy on 2017/7/14.
 */
public class TaobaoBOrderDTO implements Serializable{
    private static final long serialVersionUID = -7699756791083313323L;

   
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
     * 地址
     */
    private String address;
    /**
     * 邮编
     */
    private String post;
    /**
     * 手机
     */
    private String phone;
    /**
     * 收件人
     */
    private String receiveName;
    private String invoiceName;
    private String taxNumber;

    private TaobaoBuyerDTO buyer;

    private TaobaoBLogisticsDTO logistics;

    private List<TaobaoBSubOrderDTO> subOrders;

   

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
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

    public TaobaoBuyerDTO getBuyer() {
        return buyer;
    }

    public void setBuyer(TaobaoBuyerDTO buyer) {
        this.buyer = buyer;
    }

    public TaobaoBLogisticsDTO getLogistics() {
        return logistics;
    }

    public void setLogistics(TaobaoBLogisticsDTO logistics) {
        this.logistics = logistics;
    }

    public List<TaobaoBSubOrderDTO> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<TaobaoBSubOrderDTO> subOrders) {
        this.subOrders = subOrders;
    }

    public String getTradeStatusName() {
        return tradeStatusName;
    }

    public void setTradeStatusName(String tradeStatusName) {
        this.tradeStatusName = tradeStatusName;
    }

    public String getTradeTypeName() {
        return tradeTypeName;
    }

    public void setTradeTypeName(String tradeTypeName) {
        this.tradeTypeName = tradeTypeName;
    }
}
