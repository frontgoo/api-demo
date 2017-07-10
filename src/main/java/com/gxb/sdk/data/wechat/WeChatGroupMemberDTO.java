package com.gxb.sdk.data.wechat;


import java.io.Serializable;

/**
 * Created by DOmmy on 2017/3/14.
 */
public class WeChatGroupMemberDTO implements Serializable{

    private static final long serialVersionUID = -8488470036656115073L;
    
    /**
     * 基于id的md5
     */
    private String uuId;
    /**
     * 所在组的id
     */
    private Long groupId;
   
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 显示名
     */
    private String displayName;
    /**
     * 成员状态
     */
    private Integer memberStatus;
    /**
     * 属性状态(用于关联)
     */
    private Long attrStatus;

    

   

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(Integer memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Long getAttrStatus() {
        return attrStatus;
    }

    public void setAttrStatus(Long attrStatus) {
        this.attrStatus = attrStatus;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

}
