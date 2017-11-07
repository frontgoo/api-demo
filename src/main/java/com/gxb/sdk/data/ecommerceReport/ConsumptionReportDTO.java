
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/19.
 */
public class ConsumptionReportDTO implements Serializable {
    private static final long serialVersionUID = 3267340472869544648L;
    /**
     *统计月份，格式：'yyyy-mm'
     */
    private String month;
    /**
     *一个月内消费类交易的金额之和；消费类交易：指支出中，支付成功且非还款类的交易；
     */
    private double totalConsumeAmount;
    /**
     *一个月内消费类交易的笔数之和
     */
    private int totalConsumeCount;
    /**
     *一个月内消费类交易里，最大单笔交易金额
     */
    private double maxConsumeAmount;
    /**
     *一个月内转出类交易的金额之和；转出类交易：指交易来源地非淘宝，收支类型为支出，商品名称包含’转账’，且交易成功的交易；
     */
    private double transferOutAmount;
    /**
     *一个月内转出类交易的笔数之和
     */
    private int transferOutCount;
    /**
     *一个月内最大单笔转出金额
     */
    private double maxTransferOutAmount;
    /**
     *一个月内支付网购类交易的金额之和；
     */
    private double onlineShoppingAmount;
    /**
     *一个月内网购类交易的笔数之和
     */
    private int onlineShoppingCount;
    /**
     *一个月内外卖类交易的金额之和
     */
    private double cateringAmount;
    /**
     *一个月内外卖类交易的笔数之和
     */
    private int cateringCount;
    /**
     *一个月内生活缴费类交易的金额之和，例如水电费燃气缴纳
     */
    private double lifepayAmount;
    /**
     *一个月内生活缴费类交易的笔数之和
     */
    private int lifepayCount;
    /**
     *一个月内交通类交易的金额之和；交通类交易：指成功支付汽车／火车／动车／高铁票、机票等的交易；
     */
    private double travelAmount;
    /**
     *一个月内交通类交易的笔数之和
     */
    private int travelCount;
    /**
     *一个月内彩票类交易订单且交易成功的金额之和
     */
    private double lotteryAmount;
    /**
     *彩票金额／总消费金额）*100%
     */
    private int lotteryRate;
    /**
     *一个月内彩票类交易订单且交易成功的笔数之和
     */
    private int lotteryCount;
    /**
     *一个月内游戏类交易订单且交易成功的金额之和
     */
    private double gameAmount;
    /**
     *（游戏金额／总消费金额）*100%
     */
    private int gameRate;
    /**
     *一个月内游戏类交易订单且交易成功的笔数之和
     */
    private int gameCount;
    /**
     *一个月内亲密付支付成功的金额之和
     */
    private double intimacyPayAmount;
    /**
     *一个月内亲密付支付成功的笔数之和
     */
    private int intimacyPayCount;
    /**
     *一个月内发出的红包且成功的金额之和
     */
    private double redpktOutAmount;
    /**
     *一个月内发出的红包且成功的数量之和
     */
    private int redpktOutCount;
    /**
     *一个月内发出的红包且成功的最大红包金额
     */
    private double maxRedpktOutAmount;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getTotalConsumeAmount() {
        return totalConsumeAmount;
    }

    public void setTotalConsumeAmount(double totalConsumeAmount) {
        this.totalConsumeAmount = totalConsumeAmount;
    }

    public int getTotalConsumeCount() {
        return totalConsumeCount;
    }

    public void setTotalConsumeCount(int totalConsumeCount) {
        this.totalConsumeCount = totalConsumeCount;
    }

    public double getMaxConsumeAmount() {
        return maxConsumeAmount;
    }

    public void setMaxConsumeAmount(double maxConsumeAmount) {
        this.maxConsumeAmount = maxConsumeAmount;
    }

    public double getTransferOutAmount() {
        return transferOutAmount;
    }

    public void setTransferOutAmount(double transferOutAmount) {
        this.transferOutAmount = transferOutAmount;
    }

    public int getTransferOutCount() {
        return transferOutCount;
    }

    public void setTransferOutCount(int transferOutCount) {
        this.transferOutCount = transferOutCount;
    }

    public double getMaxTransferOutAmount() {
        return maxTransferOutAmount;
    }

    public void setMaxTransferOutAmount(double maxTransferOutAmount) {
        this.maxTransferOutAmount = maxTransferOutAmount;
    }

    public double getOnlineShoppingAmount() {
        return onlineShoppingAmount;
    }

    public void setOnlineShoppingAmount(double onlineShoppingAmount) {
        this.onlineShoppingAmount = onlineShoppingAmount;
    }

    public int getOnlineShoppingCount() {
        return onlineShoppingCount;
    }

    public void setOnlineShoppingCount(int onlineShoppingCount) {
        this.onlineShoppingCount = onlineShoppingCount;
    }

    public double getCateringAmount() {
        return cateringAmount;
    }

    public void setCateringAmount(double cateringAmount) {
        this.cateringAmount = cateringAmount;
    }

    public int getCateringCount() {
        return cateringCount;
    }

    public void setCateringCount(int cateringCount) {
        this.cateringCount = cateringCount;
    }

    public double getLifepayAmount() {
        return lifepayAmount;
    }

    public void setLifepayAmount(double lifepayAmount) {
        this.lifepayAmount = lifepayAmount;
    }

    public int getLifepayCount() {
        return lifepayCount;
    }

    public void setLifepayCount(int lifepayCount) {
        this.lifepayCount = lifepayCount;
    }

    public double getTravelAmount() {
        return travelAmount;
    }

    public void setTravelAmount(double travelAmount) {
        this.travelAmount = travelAmount;
    }

    public int getTravelCount() {
        return travelCount;
    }

    public void setTravelCount(int travelCount) {
        this.travelCount = travelCount;
    }

    public double getLotteryAmount() {
        return lotteryAmount;
    }

    public void setLotteryAmount(double lotteryAmount) {
        this.lotteryAmount = lotteryAmount;
    }

    public int getLotteryRate() {
        return lotteryRate;
    }

    public void setLotteryRate(int lotteryRate) {
        this.lotteryRate = lotteryRate;
    }

    public int getLotteryCount() {
        return lotteryCount;
    }

    public void setLotteryCount(int lotteryCount) {
        this.lotteryCount = lotteryCount;
    }

    public double getGameAmount() {
        return gameAmount;
    }

    public void setGameAmount(double gameAmount) {
        this.gameAmount = gameAmount;
    }

    public int getGameRate() {
        return gameRate;
    }

    public void setGameRate(int gameRate) {
        this.gameRate = gameRate;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public double getIntimacyPayAmount() {
        return intimacyPayAmount;
    }

    public void setIntimacyPayAmount(double intimacyPayAmount) {
        this.intimacyPayAmount = intimacyPayAmount;
    }

    public int getIntimacyPayCount() {
        return intimacyPayCount;
    }

    public void setIntimacyPayCount(int intimacyPayCount) {
        this.intimacyPayCount = intimacyPayCount;
    }

    public double getRedpktOutAmount() {
        return redpktOutAmount;
    }

    public void setRedpktOutAmount(double redpktOutAmount) {
        this.redpktOutAmount = redpktOutAmount;
    }

    public int getRedpktOutCount() {
        return redpktOutCount;
    }

    public void setRedpktOutCount(int redpktOutCount) {
        this.redpktOutCount = redpktOutCount;
    }

    public double getMaxRedpktOutAmount() {
        return maxRedpktOutAmount;
    }

    public void setMaxRedpktOutAmount(double maxRedpktOutAmount) {
        this.maxRedpktOutAmount = maxRedpktOutAmount;
    }
   
}
