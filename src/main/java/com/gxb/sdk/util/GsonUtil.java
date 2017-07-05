/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月23日 下午4:52:31
 */
public class GsonUtil {
    private static final Gson gson;

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm:ss");
        gson = gsonBuilder.create();
    }

    /**
     * convert an object to json string.
     * 
     * @param object object
     * @return string in json format
     */
    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    /**
     * convert a json format to an object
     * 
     * @param json a json string
     * @param type the type to convert
     * @return an object of type
     */
    public static <T> T fromJson(String json, Class<T> type) {
        return gson.fromJson(json, type);
    }

    /**
     * convert a json format to an object
     * 
     * @param json a json string
     * @param type the type to convert
     * @returnan object of type
     */
    public static Object fromJson(String json, Type type) {
        return gson.fromJson(json, type);
    }

}
