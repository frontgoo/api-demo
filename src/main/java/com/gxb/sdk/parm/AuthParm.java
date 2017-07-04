/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.parm;

/**
 * 每次授权所需的动态参数实体
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月22日 下午9:09:40
 */
public class AuthParm {
    private final String sequenceNo;
    private final String authItem;
    private final long timestamp;
    private final String name;
    private final String phone;
    private final String idcard;

    public AuthParm(String sequenceNo, String authItem, long timestamp, String name, String phone, String idcard) {
        this.sequenceNo = sequenceNo;
        this.authItem = authItem;
        this.timestamp = timestamp;
        this.name = name;
        this.phone = phone;
        this.idcard = idcard;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public String getAuthItem() {
        return authItem;
    }

    public long getTimestamp() {
        return timestamp;
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

}
