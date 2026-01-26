/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.http.Header
 *  org.apache.http.HttpEntity
 *  org.apache.http.client.config.RequestConfig
 *  org.apache.http.client.entity.UrlEncodedFormEntity
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpDelete
 *  org.apache.http.client.methods.HttpEntityEnclosingRequestBase
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpPut
 *  org.apache.http.client.methods.HttpRequestBase
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.ContentType
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 *  org.apache.http.message.BasicNameValuePair
 *  org.apache.http.util.EntityUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package common.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpClientUtils {
    private static final Logger log = LoggerFactory.getLogger(HttpClientUtils.class);
    private static RequestConfig requestConfig = null;
    private static final String DEFAULT_PROTOCOL = "http://";
    public static final String UTF8 = "UTF-8";

    public static String httpPost(String url, Map<String, Object> paramMap) throws Exception {
        return HttpClientUtils.httpPost(url, paramMap, null, UTF8);
    }

    public static String httpPost(String url, Map<String, Object> paramMap, Map<String, String> head) throws Exception {
        return HttpClientUtils.httpPost(url, paramMap, head, UTF8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String httpPost(String url, Map<String, Object> paramMap, Map<String, String> head, String charSet) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        String result = "";
        CloseableHttpResponse response = null;
        try {
            if (head == null) {
                head = new HashMap<String, String>();
            }
            if (StringUtils.isEmpty((CharSequence)head.get("Content-Type"))) {
                head.put("Content-Type", "application/x-www-form-urlencoded");
            }
            if (StringUtils.isEmpty((CharSequence)head.get("Accept"))) {
                head.put("Accept", "application/json");
            }
            url = HttpClientUtils.enhanceUrl(url);
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            for (Map.Entry<String, String> entry : head.entrySet()) {
                httpPost.addHeader(entry.getKey(), entry.getValue());
            }
            String requestParams = "";
            if (paramMap != null) {
                if (head.get("Content-Type") != null && head.get("Content-Type").equalsIgnoreCase("application/x-www-form-urlencoded")) {
                    ArrayList nameValuePairList = new ArrayList();
                    List keyList = paramMap.keySet().stream().sorted().collect(Collectors.toList());
                    keyList.stream().forEach(key -> {
                        BasicNameValuePair basicNameValuePair = new BasicNameValuePair(String.valueOf(key), String.valueOf(paramMap.get(key)));
                        nameValuePairList.add(basicNameValuePair);
                    });
                    UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(nameValuePairList, StandardCharsets.UTF_8);
                    httpPost.setEntity((HttpEntity)urlEncodedFormEntity);
                } else if (head.get("Content-Type") != null && head.get("Content-Type").equalsIgnoreCase("application/json")) {
                    new JSONObject();
                    requestParams = JSONObject.toJSONString(paramMap);
                    StringEntity stringEntity = new StringEntity(requestParams, ContentType.APPLICATION_JSON);
                    httpPost.setEntity((HttpEntity)stringEntity);
                }
            }
            String httpClientToCurl = HttpClientUtils.convertHttpClientToCurl((HttpRequestBase)httpPost);
            log.info("httpClientToCurl:{}", (Object)httpClientToCurl);
            response = client.execute((HttpUriRequest)httpPost);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString((HttpEntity)entity, (String)charSet);
            JSONObject jsonObject = JSONObject.parseObject((String)result);
            jsonObject.put("result", (Object)result);
            result = jsonObject.toJSONString();
            log.info("httpPost end,response:{}", (Object)result);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    log.error("Error closing response", e);
                }
            }
        }
        return result;
    }

    public static String convertHttpClientToCurl(HttpRequestBase httpRequestBase) throws IOException {
        try {
            HttpEntityEnclosingRequestBase httpRequest;
            StringBuilder curlCommand = new StringBuilder("curl ");
            curlCommand.append("'").append(httpRequestBase.getURI()).append("' ");
            curlCommand.append("-X ").append(httpRequestBase.getMethod()).append(" ");
            for (Header header : httpRequestBase.getAllHeaders()) {
                curlCommand.append("-H '").append(header.getName()).append(": ").append(header.getValue()).append("' ");
            }
            if (httpRequestBase instanceof HttpEntityEnclosingRequestBase && (httpRequest = (HttpEntityEnclosingRequestBase)httpRequestBase).getEntity() instanceof StringEntity) {
                StringEntity stringEntity = (StringEntity)httpRequest.getEntity();
                String requestBody = EntityUtils.toString((HttpEntity)stringEntity);
                curlCommand.append("-d '").append(requestBody).append("' ");
            }
            return curlCommand.toString();
        }
        catch (Exception ex) {
            log.error("to curl occur error", (Throwable)ex);
            return "";
        }
    }

    public static String httpGet(String url) throws Exception {
        return HttpClientUtils.httpGet(url, null, UTF8);
    }

    public static String httpGet(String url, Map<String, Object> paramMap) throws Exception {
        return HttpClientUtils.httpGet(url, paramMap, null, UTF8);
    }

    public static String httpGet(String url, Map<String, Object> paramMap, Map<String, String> head) throws Exception {
        return HttpClientUtils.httpGet(url, paramMap, head, UTF8);
    }

    private static String httpGet(String url, Map<String, Object> paramMap, Map<String, String> head, String charSet) throws Exception {
        StringBuilder params = new StringBuilder();
        if (paramMap != null) {
            for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
                params.append("&");
                params.append(entry.getKey());
                params.append("=");
                params.append(URLEncoder.encode(String.valueOf(entry.getValue())));
            }
        }
        if (params.length() > 0) {
            url = url.indexOf("?") > 0 ? url + params.toString() : url + "?" + params.toString().substring(1);
        }
        return HttpClientUtils.httpGet(url, head, charSet);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String httpGet(String url, Map<String, String> head, String charSet) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        url = HttpClientUtils.enhanceUrl(url);
        HttpGet getRequest = new HttpGet(url);
        if (head == null) {
            head = new HashMap<String, String>();
        }
        if (StringUtils.isEmpty((CharSequence)head.get("Accept"))) {
            head.put("Accept", "application/json");
        }
        for (Map.Entry<String, String> entry : head.entrySet()) {
            getRequest.addHeader(entry.getKey(), entry.getValue());
        }
        getRequest.setConfig(requestConfig);
        try {
            log.info("httpGet begin,url:{},head:{}:{}", (Object)url, head);
            CloseableHttpResponse response = client.execute((HttpUriRequest)getRequest);
            log.info("httpGet end,response:{}", (Object)response);
            HttpEntity entity = response.getEntity();
            if (null != entity) {
                String result = EntityUtils.toString((HttpEntity)entity, (String)charSet);
                JSONObject jsonObject = JSONObject.parseObject((String)result);
                jsonObject.put("result", (Object)result);
                result = jsonObject.toJSONString();
                log.info("httpGet end,response:{}", (Object)result);
                String string = result;
                return string;
            }
            String string = "";
            return string;
        }
        finally {
            getRequest.releaseConnection();
        }
    }

    public static String httpDelete(String url) throws Exception {
        return HttpClientUtils.httpDelete(url, null, UTF8);
    }

    public static String httpDelete(String url, Map<String, Object> paramMap) throws Exception {
        return HttpClientUtils.httpGet(url, paramMap, null, UTF8);
    }

    public static String httpDelete(String url, Map<String, Object> paramMap, Map<String, String> head) throws Exception {
        return HttpClientUtils.httpDelete(url, paramMap, head, UTF8);
    }

    private static String httpDelete(String url, Map<String, Object> paramMap, Map<String, String> head, String charSet) throws Exception {
        StringBuilder params = new StringBuilder();
        if (paramMap != null) {
            for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
                params.append("&");
                params.append(entry.getKey());
                params.append("=");
                params.append(URLEncoder.encode(String.valueOf(entry.getValue())));
            }
        }
        if (params.length() > 0) {
            url = url.indexOf("?") > 0 ? url + params.toString() : url + "?" + params.toString().substring(1);
        }
        return HttpClientUtils.httpDelete(url, head, charSet);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String httpDelete(String url, Map<String, String> head, String charSet) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        url = HttpClientUtils.enhanceUrl(url);
        HttpDelete httpDelete = new HttpDelete(url);
        if (head == null) {
            head = new HashMap<String, String>();
        }
        if (StringUtils.isEmpty((CharSequence)head.get("Accept"))) {
            head.put("Accept", "application/json");
        }
        for (Map.Entry<String, String> entry : head.entrySet()) {
            httpDelete.addHeader(entry.getKey(), entry.getValue());
        }
        httpDelete.setConfig(requestConfig);
        try {
            log.info("httpDelete begin,url:{},head:{}:{}", (Object)url, head);
            CloseableHttpResponse response = client.execute((HttpUriRequest)httpDelete);
            log.info("httpDelete end,response:{}", (Object)response);
            HttpEntity entity = response.getEntity();
            if (null != entity) {
                String result = EntityUtils.toString((HttpEntity)entity, (String)charSet);
                JSONObject jsonObject = JSONObject.parseObject((String)result);
                jsonObject.put("result", (Object)result);
                result = jsonObject.toJSONString();
                log.info("httpDelete end,response:{}", (Object)result);
                String string = result;
                return string;
            }
            String string = "";
            return string;
        }
        finally {
            httpDelete.releaseConnection();
        }
    }

    public static String httpPut(String url, Map<String, Object> paramMap) throws Exception {
        return HttpClientUtils.httpPut(url, paramMap, null, UTF8);
    }

    public static String httpPut(String url, Map<String, Object> paramMap, Map<String, String> head) throws Exception {
        return HttpClientUtils.httpPost(url, paramMap, head, UTF8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String httpPut(String url, Map<String, Object> paramMap, Map<String, String> head, String charSet) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        String result = "";
        CloseableHttpResponse response = null;
        try {
            if (head == null) {
                head = new HashMap<String, String>();
            }
            if (StringUtils.isEmpty((CharSequence)head.get("Content-Type"))) {
                head.put("Content-Type", "application/x-www-form-urlencoded");
            }
            if (StringUtils.isEmpty((CharSequence)head.get("Accept"))) {
                head.put("Accept", "application/json");
            }
            url = HttpClientUtils.enhanceUrl(url);
            HttpPut httpPut = new HttpPut(url);
            httpPut.setConfig(requestConfig);
            for (Map.Entry<String, String> entry : head.entrySet()) {
                httpPut.addHeader(entry.getKey(), entry.getValue());
            }
            String requestParams = "";
            if (paramMap != null) {
                if (head.get("Content-Type") != null && head.get("Content-Type").equalsIgnoreCase("application/x-www-form-urlencoded")) {
                    StringBuilder params = new StringBuilder("");
                    for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
                        params.append("&");
                        params.append(entry.getKey());
                        params.append("=");
                        params.append(URLEncoder.encode(String.valueOf(entry.getValue())));
                    }
                    if (params.length() > 0) {
                        requestParams = params.toString().substring(1);
                    }
                } else if (head.get("Content-Type") != null && head.get("Content-Type").equalsIgnoreCase("application/json")) {
                    new JSONObject();
                    requestParams = JSONObject.toJSONString(paramMap);
                }
            }
            StringEntity stringEntity = new StringEntity(requestParams);
            httpPut.setEntity((HttpEntity)stringEntity);
            log.info("httpPut begin,url:{},params:{},head:{}", new Object[]{url, requestParams, head});
            response = client.execute((HttpUriRequest)httpPut);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString((HttpEntity)entity, (String)charSet);
            JSONObject jsonObject = JSONObject.parseObject((String)result);
            jsonObject.put("result", (Object)result);
            result = jsonObject.toJSONString();
            log.info("httpPut end,response:{}", (Object)result);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    log.error("Error closing response", e);
                }
            }
        }
        return result;
    }

    private static String enhanceUrl(String url) {
        if (StringUtils.isEmpty((CharSequence)url)) {
            return url;
        }
        if (!url.contains("http") || !url.contains("https")) {
            return DEFAULT_PROTOCOL + url;
        }
        return url;
    }

    static {
        requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
    }
}

