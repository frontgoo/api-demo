
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/26.
 */
public class AssetsInfoDTO implements Serializable{
    private static final long serialVersionUID = 5771801537450698810L;
    /**
     *支付宝余额
     */
    private double alipayBalance;
    /**
     *余额宝余额
     */
    private double yuebaoBalance;
    /**
     *花呗额度
     */
    private Integer huabeiAmount;
    /**
     *花呗余额
     */
    private double huabeiBalance;
    /**
     *花呗的罚息，如：-60.2
     */
    private double huabeiPenaltyAmount;
    /**
     *花呗的逾期天数，如：20
     */
    private Integer huabeiOverdueDays;
    /**
     *借呗额度
     */
    private Integer jiebeiAmount;
    /**
     *借呗余额
     */
    private double jiebeiBalance;

    public double getAlipayBalance() {
        return alipayBalance;
    }

    public void setAlipayBalance(double alipayBalance) {
        this.alipayBalance = alipayBalance;
    }

    public double getYuebaoBalance() {
        return yuebaoBalance;
    }

    public void setYuebaoBalance(double yuebaoBalance) {
        this.yuebaoBalance = yuebaoBalance;
    }

    public Integer getHuabeiAmount() {
        return huabeiAmount;
    }

    public void setHuabeiAmount(Integer huabeiAmount) {
        this.huabeiAmount = huabeiAmount;
    }

    public double getHuabeiBalance() {
        return huabeiBalance;
    }

    public void setHuabeiBalance(double huabeiBalance) {
        this.huabeiBalance = huabeiBalance;
    }

    public double getHuabeiPenaltyAmount() {
        return huabeiPenaltyAmount;
    }

    public void setHuabeiPenaltyAmount(double huabeiPenaltyAmount) {
        this.huabeiPenaltyAmount = huabeiPenaltyAmount;
    }

    public Integer getHuabeiOverdueDays() {
        return huabeiOverdueDays;
    }

    public void setHuabeiOverdueDays(Integer huabeiOverdueDays) {
        this.huabeiOverdueDays = huabeiOverdueDays;
    }

    public Integer getJiebeiAmount() {
        return jiebeiAmount;
    }

    public void setJiebeiAmount(Integer jiebeiAmount) {
        this.jiebeiAmount = jiebeiAmount;
    }

    public double getJiebeiBalance() {
        return jiebeiBalance;
    }

    public void setJiebeiBalance(double jiebeiBalance) {
        this.jiebeiBalance = jiebeiBalance;
    }
}
