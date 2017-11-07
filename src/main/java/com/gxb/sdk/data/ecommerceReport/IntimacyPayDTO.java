
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/9/24.
 */
public class IntimacyPayDTO implements Serializable {
    private static final long serialVersionUID = 346352581732620739L;
    private String intimacyPayAccount;
    private String intimacyPayName;

    public String getIntimacyPayAccount() {
        return intimacyPayAccount;
    }

    public void setIntimacyPayAccount(String intimacyPayAccount) {
        this.intimacyPayAccount = intimacyPayAccount;
    }

    public String getIntimacyPayName() {
        return intimacyPayName;
    }

    public void setIntimacyPayName(String intimacyPayName) {
        this.intimacyPayName = intimacyPayName;
    }
}
