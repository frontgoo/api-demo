package com.gxb.sdk.data.ecommerce;


import java.io.Serializable;

/**
 * Created by DOmmy on 2017/7/14.
 */
public class TaobaoSellerDTO implements Serializable{
    

    private String shopId;
    private String shopName;
    private String nick;
    private String url;
    private String pic;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
