
import java.io.Serializable;
import java.util.List;

/**
 * Created by DOmmy on 2017/9/26.
 */
public class ExpenditureReport implements Serializable{

    private static final long serialVersionUID = 3816361040374448169L;
    private List<RepaymentReportDTO> repaymentList;
    private List<ConsumptionReportDTO> consumptionList;

    public List<RepaymentReportDTO> getRepaymentList() {
        return repaymentList;
    }

    public void setRepaymentList(List<RepaymentReportDTO> repaymentList) {
        this.repaymentList = repaymentList;
    }

    public List<ConsumptionReportDTO> getConsumptionList() {
        return consumptionList;
    }

    public void setConsumptionList(List<ConsumptionReportDTO> consumptionList) {
        this.consumptionList = consumptionList;
    }
}
