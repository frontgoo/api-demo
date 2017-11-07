
import java.io.Serializable;
import java.util.List;

/**
 * Created by DOmmy on 2017/9/26.
 */
public class IncomeTotalReport implements Serializable{
    private static final long serialVersionUID = -1927050041332652633L;
    private List<IncomeReportDTO> incomeList;

    public List<IncomeReportDTO> getIncomeList() {
        return incomeList;
    }

    public void setIncomeList(List<IncomeReportDTO> incomeList) {
        this.incomeList = incomeList;
    }
}
