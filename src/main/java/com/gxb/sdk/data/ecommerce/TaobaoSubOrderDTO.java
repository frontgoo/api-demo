package com.gxb.sdk.data.ecommerce;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by DOmmy on 2017/7/14.
 */
public class TaobaoSubOrderDTO implements Serializable{
    private static final long serialVersionUID = -1551029054144321295L;
    

    private String itemTitle;
    private String itemId;
    private Integer quantity;
    private BigDecimal original;
    private BigDecimal actual;
    private String itemPic;
    private String itemUrl;


    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getOriginal() {
        return original;
    }

    public void setOriginal(BigDecimal original) {
        this.original = original;
    }

    public BigDecimal getActual() {
        return actual;
    }

    public void setActual(BigDecimal actual) {
        this.actual = actual;
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }
}
