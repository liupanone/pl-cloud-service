package com.pl.pleurekaserver.utils;

import com.alibaba.fastjson.JSON;

public class JsonUtils {

    public static String objToJsonString(Object obj) {
        String jsonStr = JSON.toJSONString(obj);
        return jsonStr;
    }
}
