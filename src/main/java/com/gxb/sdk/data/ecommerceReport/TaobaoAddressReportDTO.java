
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/19.
 */
public class TaobaoAddressReportDTO implements Serializable {
    private static final long serialVersionUID = 4293712835422066287L;
    private Integer id;
    private Integer reportId;
    private Integer baseInfoId;
    /**
     * 收货人
     */
    private String receiveName;
    /**
     * 省市区
     */
    private String region;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 手机号
     */
    private String telNumber;

    private String postCode;
    /**
     * 交易订单总数
     */
    private int tradeCount;
    /**
     * 近3个月交易订单总数
     */
    private int tradeCountOf3m;

    private Integer addressId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getBaseInfoId() {
        return baseInfoId;
    }

    public void setBaseInfoId(Integer baseInfoId) {
        this.baseInfoId = baseInfoId;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(int tradeCount) {
        this.tradeCount = tradeCount;
    }

    public int getTradeCountOf3m() {
        return tradeCountOf3m;
    }

    public void setTradeCountOf3m(int tradeCountOf3m) {
        this.tradeCountOf3m = tradeCountOf3m;
    }

    public void addTradeCount(int count){
        tradeCount += count;
    }

    public void addTradeCountOf3m(int count){
        tradeCountOf3m += count;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
