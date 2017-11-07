
import java.io.Serializable;
import java.util.List;

/**
 * Created by DOmmy on 2017/9/26.
 */
public class ReportSummary implements Serializable{

    private static final long serialVersionUID = -3715387392230130082L;

    private BaseInfoReportDTO baseInfo;
    private AssetsInfoDTO assetsInfo;
    private BehaviorInfoDTO behaviorInfo;
    private List<TaobaoAddressReportDTO> taobaoAddressList;
    private List<TaobaoShopReportDTO> taobaoShopList;

    public BaseInfoReportDTO getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfoReportDTO baseInfo) {
        this.baseInfo = baseInfo;
    }

    public AssetsInfoDTO getAssetsInfo() {
        return assetsInfo;
    }

    public void setAssetsInfo(AssetsInfoDTO assetsInfo) {
        this.assetsInfo = assetsInfo;
    }

    public BehaviorInfoDTO getBehaviorInfo() {
        return behaviorInfo;
    }

    public void setBehaviorInfo(BehaviorInfoDTO behaviorInfo) {
        this.behaviorInfo = behaviorInfo;
    }

    public List<TaobaoAddressReportDTO> getTaobaoAddressList() {
        return taobaoAddressList;
    }

    public void setTaobaoAddressList(List<TaobaoAddressReportDTO> taobaoAddressList) {
        this.taobaoAddressList = taobaoAddressList;
    }

    public List<TaobaoShopReportDTO> getTaobaoShopList() {
        return taobaoShopList;
    }

    public void setTaobaoShopList(List<TaobaoShopReportDTO> taobaoShopList) {
        this.taobaoShopList = taobaoShopList;
    }
}
