
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by DOmmy on 2017/10/29.
 */
public class HuabeiConsumeDTO implements Serializable{
    private static final long serialVersionUID = 4997526418950575061L;

   
    /**
     * 头像标识
     */
    private String image;
    /**
     * 额度变化金额
     */
    private BigDecimal amount;
    /**
     * 类型
     */
    private String type;
    /**
     * 交易时间
     */
    private Date time;
    /**
     * 交易名称
     */
    private String title;
    /**
     * 交易号
     */
    private String tradeNo;
    private String bizType;
    /**
     * 是否删除，1是0否
     */
    private Integer status;


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

   
}
