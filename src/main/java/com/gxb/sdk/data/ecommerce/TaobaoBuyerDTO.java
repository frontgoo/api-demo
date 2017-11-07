
import java.io.Serializable;

/**
 * Created by DOmmy on 2017/7/14.
 */
public class TaobaoBuyerDTO implements Serializable{
    private static final long serialVersionUID = 7955009021667314497L;

    private String buyerId;
    private String nick;
    private String phoneNum;
    private String city;
    private String name;

    

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
