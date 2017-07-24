package com.gxb.sdk.data.wechat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by DOmmy on 2017/3/14.
 */
public class WeChatSubscribeMsgDTO implements Serializable {
    private static final long serialVersionUID = 8708612424871466275L;

    /**
     * 发布者昵称
     */
    private String nickName;
    /**
     * 公众号id，对于contact表的主键
     */
    private Integer publicId;
    /**
     * 标题
     */
    private String title;
    /**
     * 文摘
     */
    private String digest;
    /**
     * 文章封面图片地址
     */
    private String cover;
    /**
     * 文章链接
     */
    private String url;
    /**
     * 发布时间
     */
    private Date publishTime;



    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getPublicId() {
        return publicId;
    }

    public void setPublicId(Integer publicId) {
        this.publicId = publicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

}
