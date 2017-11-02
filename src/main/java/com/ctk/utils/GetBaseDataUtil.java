package com.ctk.utils;

import com.ctk.base.BaseData;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public class GetBaseDataUtil {

    public static <T> BaseData<T> getData(T data, int status, String message) {
        BaseData<T> tBaseData = new BaseData<>(status, message, data);

        return tBaseData;
    }
}
