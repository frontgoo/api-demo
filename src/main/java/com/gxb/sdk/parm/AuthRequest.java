/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.parm;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月22日 下午9:09:40
 */
public class AuthRequest {
    // 以下为必要参数
    private final String appId;
    private final String sign;
    private final String sequenceNo;
    private final String authItem;
    private final String timestamp;
    private final String name;
    private final String phone;
    private final String idcard;
    // 以下为可选参数
    private final String platform;
    private final String sdkVersion;

    public AuthRequest(AuthRequestBuilder builder) {
        this.appId = builder.appId;
        this.sign = builder.sign;
        this.sequenceNo = builder.sequenceNo;
        this.authItem = builder.authItem;
        this.timestamp = String.valueOf(builder.timestamp);
        this.name = builder.name;
        this.phone = builder.phone;
        this.idcard = builder.idcard;
        this.platform = builder.platform;
        this.sdkVersion = builder.sdkVersion;
    }


    public String getAppId() {
        return appId;
    }

    public String getSign() {
        return sign;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public String getAuthItem() {
        return authItem;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getPlatform() {
        return platform;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public static AuthRequestBuilder builder(String appId, String appSecurity, String sequenceNo, long timestamp, String authItem) {
        return new AuthRequestBuilder(appId, appSecurity, sequenceNo, timestamp, authItem);
    }

    public static class AuthRequestBuilder {
        private final String appId;
        private final String appSecurity;
        private final String sequenceNo;
        private final String authItem;
        private final long timestamp;
        private String sign;
        private String name;
        private String phone;
        private String idcard;
        // 以下为可选参数
        private String platform;
        private String sdkVersion;

        public AuthRequestBuilder(String appId, String appSecurity, String sequenceNo, long timestamp, String authItem) {
            this.appId = appId;
            this.appSecurity = appSecurity;
            this.sequenceNo = sequenceNo;
            this.authItem = authItem;
            this.timestamp = timestamp;
        }

        public AuthRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AuthRequestBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public AuthRequestBuilder idcard(String idcard) {
            this.idcard = idcard;
            return this;
        }

        public AuthRequestBuilder platform(String platform) {
            this.platform = platform;
            return this;
        }

        public AuthRequestBuilder sdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }

        public AuthRequest build() {
            // sign = md5(appId+appSecret+authItem+timestamp+sequenceNo); 顺序不能调换
            this.sign = DigestUtils.md5Hex(String.format("%s%s%s%s%s", appId, appSecurity, authItem, timestamp, sequenceNo));
            return new AuthRequest(this);
        }
    }
}
