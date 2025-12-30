/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 */
package common.utils;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class RequestHelpUtils {
    public static Map<String, String> toParamMap(JSONObject request) {
        if (request == null) {
            return new HashMap<String, String>();
        }
        HashMap<String, String> requestMap = new HashMap<String, String>();
        for (String key : request.keySet()) {
            Object value = request.get((Object)key);
            if (value == null) continue;
            requestMap.put(key, value.toString());
        }
        return requestMap;
    }
}

