package com.ctk.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public class JsonUtils {
    private static volatile JsonUtils singleton;

    private JsonUtils() {}

    public static JsonUtils getInstance() {
        if (singleton == null) {
            synchronized (JsonUtils.class) {
                if (singleton == null) {
                    singleton = new JsonUtils();
                }
            }
        }
        return singleton;
    }

    public ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }
}
