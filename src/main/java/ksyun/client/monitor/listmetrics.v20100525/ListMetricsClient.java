package ksyun.client.monitor.listmetrics.v20100525;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.aws.AWS4EncryptionFactory;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;

/**
* @Classname ListMetricsClient
* @Description 查看实例对应的监控指标
*/
@Slf4j
public class ListMetricsClient extends BaseClient {
    private final static String service = "monitor";
    private final static String version = "2010-05-25";
    private final static String action = "ListMetrics";


    /**
     * 证书
     */
    private Credential credential;


    public ListMetricsClient(Credential credential) {
        this.credential = credential;
    }


    /**
     * post请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doPost(String path, ListMetricsRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/x-www-form-urlencoded");
        return doPost(path, requestObj, head);
    }

    /**
     * post请求
     *
     * @param path
     * @param requestObj
     * @param head
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doPost(String path, ListMetricsRequest requestObj, Map<String, String> head) throws Exception {
         if (head == null) {
             head = new HashMap<>();
         }
        //参数配置
        JSONObject requestParams = null;
        if (head.get("Content-Type").equalsIgnoreCase("application/json")){
             requestParams = getPostRawRequestParams(requestObj);
        }else {
             requestParams = getSimpleRequestParams(requestObj);
        }

        //aws4 签名
        enhanceAws4Signature(head, requestParams, credential, "post");

        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, ListMetricsResponse.class);
    }

    /**
    * post 请求
    * @param path
    * @param requestObj
    * @return
    * @throws Exception
    */
    public ListMetricsResponse doPostRaw(String path, ListMetricsRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doPost(path, requestObj, head);
    }

    /**
    * post 请求
    *
    * @param path
    * @param requestObj
    * @return
    * @throws Exception
    */
    public ListMetricsResponse doPostRaw(String path, ListMetricsRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }
        head.put("Content-Type", "application/json");
        return doPost(path, requestObj, head);
    }
    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doGet(String path, ListMetricsRequest requestObj) throws Exception {
        return doGet(path, requestObj, null);
    }

    /**
     * doDelete 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doDelete(String path, ListMetricsRequest requestObj) throws Exception {
        return doDelete(path, requestObj, null);
    }

    /**
     * doDelete 请求
     *
     * @param path
     * @param requestObj
     * @param head
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doDelete(String path, ListMetricsRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        ListMetricsResponse ListMetricsResponse = JSON.parseObject(response, ListMetricsResponse.class);
        return ListMetricsResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doPut(String path, ListMetricsRequest requestObj) throws Exception {
        return doPut(path, requestObj, null);
    }

    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @param head
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doPut(String path, ListMetricsRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        ListMetricsResponse ListMetricsResponse = JSON.parseObject(response, ListMetricsResponse.class);
        return ListMetricsResponse;
    }

    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @param head
     * @return
     * @throws Exception
     */
    public ListMetricsResponse doGet(String path, ListMetricsRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }

        //参数配置
        JSONObject requestParams = getSimpleRequestParams(requestObj);

        //aws4 签名
        enhanceAws4Signature(head, requestParams, credential, "get");

        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, ListMetricsResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(ListMetricsRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置证书
        getCommonParams(credential, requestParams);
        //设置接口属性
        requestParams.put("Service", service);
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestField(requestObj,requestParams);

        //签名
        String signature = SignUtils.signature(requestParams, credential.getSignStr());
        requestParams.put("Signature", signature);
        return requestParams;
    }

    private static void enhanceAws4Signature(Map<String, String> head, Map<String, Object> params, Credential credential, String requestMethod) {
        AWS4EncryptionFactory aws4EncryptionFactory = new AWS4EncryptionFactory(credential.getSecretKey(), credential.getSignStr(), service, credential.getRegion());

        //设置请求参数
        if (params != null) {
            params.entrySet().forEach(entry -> {
                aws4EncryptionFactory.setParamMap(entry.getKey(), entry.getValue());
            });
        }

        //设置请求头
        if (head != null) {
            head.entrySet().forEach(entry -> {
                aws4EncryptionFactory.setHeadMap(entry.getKey(), entry.getValue());
            });
        }

        //aws 加密
        aws4EncryptionFactory.generateSignature(requestMethod);

        //回填aws4 签名
        String authorization = aws4EncryptionFactory.getHead().get(AWS4EncryptionFactory.X_Authorization);
        String xAmzDate = aws4EncryptionFactory.getHead().get(AWS4EncryptionFactory.X_AMZ_DATA);
        head.put(AWS4EncryptionFactory.X_Authorization, authorization);
        head.put(AWS4EncryptionFactory.X_AMZ_DATA, xAmzDate);
    }

    private JSONObject getSimpleRequestParams(ListMetricsRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置接口属性
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestField(requestObj, requestParams);
        return requestParams;
    }

    private JSONObject getPostRawRequestParams(ListMetricsRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置接口属性
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestFieldForPostRaw(requestObj, requestParams);
        return requestParams;
    }
}
