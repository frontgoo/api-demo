
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/19.
 */
public class TaobaoShopReportDTO implements Serializable {
    private static final long serialVersionUID = 1257573294268475105L;
    /**
     *淘宝店铺名称
     */
    private String shopName;
    /**
     *淘宝店铺昵称
     */
    private String shopNick;
    /**
     *淘宝店铺链接
     */
    private String shopUrl;
    /**
     *购买次数
     */
    private int count;
    /**
     *购买总金额
     */
    private double amount;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNick() {
        return shopNick;
    }

    public void setShopNick(String shopNick) {
        this.shopNick = shopNick;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
