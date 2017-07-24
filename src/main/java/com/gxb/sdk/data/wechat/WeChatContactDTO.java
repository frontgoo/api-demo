package com.gxb.sdk.data.wechat;


import java.io.Serializable;
import java.util.List;

/**
 * Created by DOmmy on 2017/3/14.
 */
public class WeChatContactDTO implements Serializable{

    private static final long serialVersionUID = -3067799311964189661L;

    
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像图片路径
     */
    private String headImgPath;
    /**
     * 基于id的md5
     */
    private String uuId;
    /**
     * 备注名
     */
    private String remarkName;
    /**
     * 性别，0(未知)、1(男)、2（女）
     */
    private Integer sex;
    /**
     * 个人签名
     */
    private String signature;
    /**
     * 账号类型，0(个人号)、非0公众号(分类待定)
     */
    private Integer verifyFlag;
    /**
     * 星级好友,0(不是)、1(是)
     */
    private Integer starFriend;
    /**
     * 属性状态(用于关联)
     */
    private Long attrStatus;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 别名
     */
    private String alias;
    /**
     * 显示名
     */
    private String displayName;
    /**
     * 是否群组，1是0否
     */
    private Integer isGroup;
    /**
     * 组员人数
     */
    private Integer memberCount;
    /**
     * 是否群主,1是，0否
     */
    private Integer isOwner;
    /**
     * 是否收藏，当isGroup为1时有效，1是，0不是
     */
    private Integer isCollection;
    /**
     * 是否开启消息推送，群组才有效，1开启，0关闭
     */
    private Integer statues;

    /**
     * 是否有朋友圈相册，1是，0不是
     */
    private Integer snsFlag;
    /**
     * 最近联系次数
     */
    private Integer recentContactTimes = 0;
    /**
     * 组员
     */
    private List<WeChatGroupMemberDTO> memberList;

    /**
     * 亲密度，越大表示亲密度最高
     */
    private Integer intimacy = 0;
    /**
     * 是否黑名单，1是，0不是
     */
    private Integer isBlack = 0;
    /**
     * 是否置顶，1是，0不是
     */
    private Integer isTopContact = 0;
    /**
     * 是否屏蔽消息，1是，0不是
     */
    private Integer isMuted = 0;
    /**
     * 是否联系人,1是，0不是
     */
    private Integer isContact = 0;
    /**
     * 是否聊过天
     */
    private Integer hasContacted = 0;
    /**
     * 不看别人,1是，0不是
     */
    private Integer snsNotLookOther = 0;
    /**
     * 不让别人看,1是，0不是
     */
    private Integer snsOtherNotLook = 0;

    

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImgPath() {
        return headImgPath;
    }

    public void setHeadImgPath(String headImgPath) {
        this.headImgPath = headImgPath;
    }

    

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getVerifyFlag() {
        return verifyFlag;
    }

    public void setVerifyFlag(Integer verifyFlag) {
        this.verifyFlag = verifyFlag;
    }

    public Integer getStarFriend() {
        return starFriend;
    }

    public void setStarFriend(Integer starFriend) {
        this.starFriend = starFriend;
    }

    public Long getAttrStatus() {
        return attrStatus;
    }

    public void setAttrStatus(Long attrStatus) {
        this.attrStatus = attrStatus;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Integer isOwner) {
        this.isOwner = isOwner;
    }

    public Integer getIsCollection() {
        return isCollection;
    }

    public void setIsCollection(Integer isCollection) {
        this.isCollection = isCollection;
    }

    public Integer getRecentContactTimes() {
        return recentContactTimes;
    }

    public void setRecentContactTimes(Integer recentContactTimes) {
        this.recentContactTimes = recentContactTimes;
    }

    public List<WeChatGroupMemberDTO> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<WeChatGroupMemberDTO> memberList) {
        this.memberList = memberList;
    }

    public Integer getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(Integer intimacy) {
        this.intimacy = intimacy;
    }

    public Integer getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(Integer isBlack) {
        this.isBlack = isBlack;
    }

    public Integer getIsTopContact() {
        return isTopContact;
    }

    public void setIsTopContact(Integer isTopContact) {
        this.isTopContact = isTopContact;
    }

    public Integer getIsMuted() {
        return isMuted;
    }

    public void setIsMuted(Integer isMuted) {
        this.isMuted = isMuted;
    }

    public Integer getIsContact() {
        return isContact;
    }

    public void setIsContact(Integer isContact) {
        this.isContact = isContact;
    }

    public Integer getHasContacted() {
        return hasContacted;
    }

    public void setHasContacted(Integer hasContacted) {
        this.hasContacted = hasContacted;
    }

    public Integer getSnsNotLookOther() {
        return snsNotLookOther;
    }

    public void setSnsNotLookOther(Integer snsNotLookOther) {
        this.snsNotLookOther = snsNotLookOther;
    }

    public Integer getSnsOtherNotLook() {
        return snsOtherNotLook;
    }

    public void setSnsOtherNotLook(Integer snsOtherNotLook) {
        this.snsOtherNotLook = snsOtherNotLook;
    }

    public Integer getStatues() {
        return statues;
    }

    public void setStatues(Integer statues) {
        this.statues = statues;
    }

    
    public Integer getSnsFlag() {
        return snsFlag;
    }

    public void setSnsFlag(Integer snsFlag) {
        this.snsFlag = snsFlag;
    }

    
}
