
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/26.
 */
public class BaseReportDTO implements Serializable{
    private static final long serialVersionUID = 5333702254198337242L;

    private ReportSummary reportSummary;
    private ExpenditureReport expenditureReport;
    private IncomeTotalReport incomeReport;

    public ReportSummary getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(ReportSummary reportSummary) {
        this.reportSummary = reportSummary;
    }

    public ExpenditureReport getExpenditureReport() {
        return expenditureReport;
    }

    public void setExpenditureReport(ExpenditureReport expenditureReport) {
        this.expenditureReport = expenditureReport;
    }

    public IncomeTotalReport getIncomeReport() {
        return incomeReport;
    }

    public void setIncomeReport(IncomeTotalReport incomeReport) {
        this.incomeReport = incomeReport;
    }

}
