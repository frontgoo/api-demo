
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by DOmmy on 2017/9/13.
 */
public class BaseInfoReportDTO implements Serializable {
    private static final long serialVersionUID = 7182995548443096449L;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 是否实名认证
     */
    private Integer isVarified;
    /**
     *支付宝账户类型
     */
    private String alipayAccountType;
    /**
     *支付宝账号
     */
    private String alipayAccount;
    /**
     *绑定的淘宝账号
     */
    private String taobaoAccount;
    /**
     *支付宝处登记邮箱
     */
    private String alipayEmail;
    /**
     *支付宝注册时间
     */
    private Date registerDate;
    /**
     *买家信用额度
     */
    private Integer creditLevelAsBuyer;
    /**
     *该用户平台最近6个月的交易中，收支类型为支出，且交易成功的非资金转移类交易的金额之和
     */
    private double totalExpenditureOf6m;
    /**
     *该用户平台最近6个月的交易中，收支类型为收入，且交易成功的交易金额之和
     */
    private double totalIncomeOf6m;
    /**
     *该用户最近6个月，通过平台进行还款类交易且成功的金额之和；还款：包括信用卡还款、花呗还款、借呗还款、其他贷款还款
     */
    private double totalRepayOf6m;
    /**
     *最近6个月，通过平台与该用户发生资金往来且成功的人数之和；资金往来包含的交易类型：转账转入、代付、打赏、发红包、收红包；人数按照交易对方名去重；
     */
    private Integer fundTranseOf6m;
    /**
     * 亲密付，json体
     */
    private List<IntimacyPayDTO> intimacyPayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getIsVarified() {
        return isVarified;
    }

    public void setIsVarified(Integer isVarified) {
        this.isVarified = isVarified;
    }

    public String getAlipayAccountType() {
        return alipayAccountType;
    }

    public void setAlipayAccountType(String alipayAccountType) {
        this.alipayAccountType = alipayAccountType;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getTaobaoAccount() {
        return taobaoAccount;
    }

    public void setTaobaoAccount(String taobaoAccount) {
        this.taobaoAccount = taobaoAccount;
    }

    public String getAlipayEmail() {
        return alipayEmail;
    }

    public void setAlipayEmail(String alipayEmail) {
        this.alipayEmail = alipayEmail;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getCreditLevelAsBuyer() {
        return creditLevelAsBuyer;
    }

    public void setCreditLevelAsBuyer(Integer creditLevelAsBuyer) {
        this.creditLevelAsBuyer = creditLevelAsBuyer;
    }

    public double getTotalExpenditureOf6m() {
        return totalExpenditureOf6m;
    }

    public void setTotalExpenditureOf6m(double totalExpenditureOf6m) {
        this.totalExpenditureOf6m = totalExpenditureOf6m;
    }

    public double getTotalIncomeOf6m() {
        return totalIncomeOf6m;
    }

    public void setTotalIncomeOf6m(double totalIncomeOf6m) {
        this.totalIncomeOf6m = totalIncomeOf6m;
    }

    public double getTotalRepayOf6m() {
        return totalRepayOf6m;
    }

    public void setTotalRepayOf6m(double totalRepayOf6m) {
        this.totalRepayOf6m = totalRepayOf6m;
    }

    public Integer getFundTranseOf6m() {
        return fundTranseOf6m;
    }

    public void setFundTranseOf6m(Integer fundTranseOf6m) {
        this.fundTranseOf6m = fundTranseOf6m;
    }

    public List<IntimacyPayDTO> getIntimacyPayList() {
        return intimacyPayList;
    }

    public void setIntimacyPayList(List<IntimacyPayDTO> intimacyPayList) {
        this.intimacyPayList = intimacyPayList;
    }
}
