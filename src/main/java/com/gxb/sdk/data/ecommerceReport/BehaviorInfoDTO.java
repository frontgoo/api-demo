
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/26.
 */
public class BehaviorInfoDTO implements Serializable {
    private static final long serialVersionUID = -59479021433638464L;
    /**
     *疑似诈骗记录数
     */
    private int lieCount;
    /**
     *疑似赌博记录数，交易记录中包含赌资等信息
     */
    private int gambleCount;
    /**
     *疑似吸毒记录数，交易记录中包含毒品等信息
     */
    private int drugCount;
    /**
     *高风险地区消费记录数，发生在高诈骗或赌博等地区的交易
     */
    private int highRiskAreaCount;
    /**
     *敏感字段记录数，例如套现
     */
    private int sensitiveCount;
    /**
     * 其他可疑记录数
     */
    private int otherCount;

    public int getLieCount() {
        return lieCount;
    }

    public void setLieCount(int lieCount) {
        this.lieCount = lieCount;
    }

    public int getGambleCount() {
        return gambleCount;
    }

    public void setGambleCount(int gambleCount) {
        this.gambleCount = gambleCount;
    }

    public int getDrugCount() {
        return drugCount;
    }

    public void setDrugCount(int drugCount) {
        this.drugCount = drugCount;
    }

    public int getHighRiskAreaCount() {
        return highRiskAreaCount;
    }

    public void setHighRiskAreaCount(int highRiskAreaCount) {
        this.highRiskAreaCount = highRiskAreaCount;
    }

    public int getSensitiveCount() {
        return sensitiveCount;
    }

    public void setSensitiveCount(int sensitiveCount) {
        this.sensitiveCount = sensitiveCount;
    }

    public int getOtherCount() {
        return otherCount;
    }

    public void setOtherCount(int otherCount) {
        this.otherCount = otherCount;
    }
}
