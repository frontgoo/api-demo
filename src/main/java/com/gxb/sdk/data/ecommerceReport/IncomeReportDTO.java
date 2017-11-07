
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/19.
 */
public class IncomeReportDTO implements Serializable {
    private static final long serialVersionUID = -4785083701708361415L;
    /**
     *统计月份，格式：'yyyy-mm'
     */
    private String month;
    /**
     *一个月内转入类交易的金额之和；转入类交易：指交易来源地非淘宝，收支类型为收入，商品名称包含’转账’，且交易成功的交易；
     */
    private double transferInAmount;
    /**
     *一个月内转入类交易的笔数之和
     */
    private int transferInCount;
    /**
     *一个月内转入类交易中，最大单笔交易金额
     */
    private double maxTransferInAmount;

    private double yuebaoAmount;
    /**
     *一个月内收到的红包且成功的金额之和
     */
    private double redpktAmount;
    /**
     *一个月内收到的红包且成功的数量之和
     */
    private int redpktCount;
    /**
     *一个月内收到的红包且成功的最大红包金额
     */
    private double maxRedpktAmount;
    /**
     *一个月内蚂蚁借呗通过平台向该用户放款且成功的金额之和
     */
    private double jiebeiLoanAmount;
    /**
     *一个月内蚂蚁借呗通过平台向该用户放款且成功的笔数之和
     */
    private int jiebeiLoanCount;
    /**
     *一个月内交易状态为’退款成功’的交易金额之和
     */
    private double refundAmount;
    /**
     *一个月内交易状态为’退款成功’的交易笔数之和
     */
    private int refundCount;
    /**
     *一个月内交易状态为’退款成功’的最大一笔金额
     */
    private double maxRefundAmount;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getTransferInAmount() {
        return transferInAmount;
    }

    public void setTransferInAmount(double transferInAmount) {
        this.transferInAmount = transferInAmount;
    }

    public int getTransferInCount() {
        return transferInCount;
    }

    public void setTransferInCount(int transferInCount) {
        this.transferInCount = transferInCount;
    }

    public double getMaxTransferInAmount() {
        return maxTransferInAmount;
    }

    public void setMaxTransferInAmount(double maxTransferInAmount) {
        this.maxTransferInAmount = maxTransferInAmount;
    }

    public double getYuebaoAmount() {
        return yuebaoAmount;
    }

    public void setYuebaoAmount(double yuebaoAmount) {
        this.yuebaoAmount = yuebaoAmount;
    }

    public double getRedpktAmount() {
        return redpktAmount;
    }

    public void setRedpktAmount(double redpktAmount) {
        this.redpktAmount = redpktAmount;
    }

    public int getRedpktCount() {
        return redpktCount;
    }

    public void setRedpktCount(int redpktCount) {
        this.redpktCount = redpktCount;
    }

    public double getMaxRedpktAmount() {
        return maxRedpktAmount;
    }

    public void setMaxRedpktAmount(double maxRedpktAmount) {
        this.maxRedpktAmount = maxRedpktAmount;
    }

    public double getJiebeiLoanAmount() {
        return jiebeiLoanAmount;
    }

    public void setJiebeiLoanAmount(double jiebeiLoanAmount) {
        this.jiebeiLoanAmount = jiebeiLoanAmount;
    }

    public int getJiebeiLoanCount() {
        return jiebeiLoanCount;
    }

    public void setJiebeiLoanCount(int jiebeiLoanCount) {
        this.jiebeiLoanCount = jiebeiLoanCount;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public int getRefundCount() {
        return refundCount;
    }

    public void setRefundCount(int refundCount) {
        this.refundCount = refundCount;
    }

    public double getMaxRefundAmount() {
        return maxRefundAmount;
    }

    public void setMaxRefundAmount(double maxRefundAmount) {
        this.maxRefundAmount = maxRefundAmount;
    }
    
}
