package com.gxb.sdk.data.ecommerce;


import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author  <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since   2017年7月10日 下午2:18:02 
 */
public class EcommerceAddressDTO implements Serializable {
  private static final long serialVersionUID = 1L;


  private String region;

  private String postCode;

  private String address;

  private String receiveName;

  private String telNumber;

  private Date tradeTime;

  private String tradeNo;

  private Byte status;



  public String getRegion() {
    return region;
  }



  public void setRegion(String region) {
    this.region = region;
  }



  public String getPostCode() {
    return postCode;
  }



  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }



  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getReceiveName() {
    return receiveName;
  }

  public void setReceiveName(String receiveName) {
    this.receiveName = receiveName;
  }

  public String getTelNumber() {
    return telNumber;
  }

  public void setTelNumber(String telNumber) {
    this.telNumber = telNumber;
  }

  public Date getTradeTime() {
    return tradeTime;
  }

  public void setTradeTime(Date tradeTime) {
    this.tradeTime = tradeTime;
  }

  public String getTradeNo() {
    return tradeNo;
  }

  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }

  public Byte getStatus() {
    return status;
  }

  public void setStatus(Byte status) {
    this.status = status;
  }

 

}
