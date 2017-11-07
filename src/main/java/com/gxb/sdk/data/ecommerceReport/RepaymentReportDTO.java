
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/19.
 */
public class RepaymentReportDTO implements Serializable {
    private static final long serialVersionUID = 8953425320221760719L;
    /**
     *统计月份，格式：'yyyy-mm'
     */
    private String month;
    /**
     *一个月内信用卡还款且交易成功的金额之和
     */
    private double creditAmount;
    /**
     *一个月内信用卡还款且交易成功的次数
     */
    private int creditCount;
    /**
     *一个月内蚂蚁花呗还款且交易成功的金额之和
     */
    private double huabeiAmount;
    /**
     *一个月内蚂蚁花呗还款且交易成功的次数
     */
    private int huabeiCount;
    /**
     *一个月内蚂蚁借呗还款且交易成功的金额之和
     */
    private double jiebeiAmount;
    /**
     *一个月内蚂蚁借呗还款且交易成功的次数
     */
    private int jiebeiCount;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    public double getHuabeiAmount() {
        return huabeiAmount;
    }

    public void setHuabeiAmount(double huabeiAmount) {
        this.huabeiAmount = huabeiAmount;
    }

    public int getHuabeiCount() {
        return huabeiCount;
    }

    public void setHuabeiCount(int huabeiCount) {
        this.huabeiCount = huabeiCount;
    }

    public double getJiebeiAmount() {
        return jiebeiAmount;
    }

    public void setJiebeiAmount(double jiebeiAmount) {
        this.jiebeiAmount = jiebeiAmount;
    }

    public int getJiebeiCount() {
        return jiebeiCount;
    }

    public void setJiebeiCount(int jiebeiCount) {
        this.jiebeiCount = jiebeiCount;
    }
}
