

import java.io.Serializable;
import java.util.Date;

/**
 * Created by DOmmy on 2017/7/14.
 */
public class TaobaoBLogisticsDTO implements Serializable{
    private static final long serialVersionUID = 4917373614231282348L;

    //交易状态
    private String companyCode;
    private String companyName;
    private String mailNo;
    private Date createTime;
    private Date lastTime;
    private String lastMsg;
    private String postManName;
    private String postManPhone;
    private String postManSiteName;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMailNo() {
        return mailNo;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }

    public String getPostManName() {
        return postManName;
    }

    public void setPostManName(String postManName) {
        this.postManName = postManName;
    }

    public String getPostManPhone() {
        return postManPhone;
    }

    public void setPostManPhone(String postManPhone) {
        this.postManPhone = postManPhone;
    }

    public String getPostManSiteName() {
        return postManSiteName;
    }

    public void setPostManSiteName(String postManSiteName) {
        this.postManSiteName = postManSiteName;
    }

}
