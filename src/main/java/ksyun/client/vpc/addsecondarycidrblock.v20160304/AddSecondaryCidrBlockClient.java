package ksyun.client.vpc.addsecondarycidrblock.v20160304;

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
 * @Classname AddSecondaryCidrBlockClient
 * @Description 为VPC添加附加IPv4网段
 */
@Slf4j
public class AddSecondaryCidrBlockClient extends BaseClient {
    private final static String service = "vpc";
    private final static String version = "2016-03-04";
    private final static String action = "AddSecondaryCidrBlock";


    /**
     * 证书
     */
    private final Credential credential;


    public AddSecondaryCidrBlockClient(Credential credential) {
        this.credential = credential;
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

    /**
     * post请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public AddSecondaryCidrBlockResponse doPost(String path, AddSecondaryCidrBlockRequest requestObj) throws Exception {
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
    public AddSecondaryCidrBlockResponse doPost(String path, AddSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        //参数配置
        JSONObject requestParams = null;
        if (head.get("Content-Type").equalsIgnoreCase("application/json")) {
            requestParams = getPostRawRequestParams(requestObj);
        } else {
            requestParams = getSimpleRequestParams(requestObj);
        }

        //aws4 签名
        enhanceAws4Signature(head, requestParams, credential, "post");

        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, AddSecondaryCidrBlockResponse.class);
    }

    /**
     * post 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public AddSecondaryCidrBlockResponse doPostRaw(String path, AddSecondaryCidrBlockRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/x-www-form-urlencoded");
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
    public AddSecondaryCidrBlockResponse doPostRaw(String path, AddSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }
        head.put("Content-Type", "application/x-www-form-urlencoded");
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
    public AddSecondaryCidrBlockResponse doGet(String path, AddSecondaryCidrBlockRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
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
    public AddSecondaryCidrBlockResponse doDelete(String path, AddSecondaryCidrBlockRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/x-www-form-urlencoded");
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
    public AddSecondaryCidrBlockResponse doDelete(String path, AddSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        AddSecondaryCidrBlockResponse AddSecondaryCidrBlockResponse = JSON.parseObject(response, AddSecondaryCidrBlockResponse.class);
        return AddSecondaryCidrBlockResponse;
    }

    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public AddSecondaryCidrBlockResponse doPut(String path, AddSecondaryCidrBlockRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
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
    public AddSecondaryCidrBlockResponse doPut(String path, AddSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        AddSecondaryCidrBlockResponse AddSecondaryCidrBlockResponse = JSON.parseObject(response, AddSecondaryCidrBlockResponse.class);
        return AddSecondaryCidrBlockResponse;
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
    public AddSecondaryCidrBlockResponse doGet(String path, AddSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        //参数配置
        JSONObject requestParams = getSimpleRequestParams(requestObj);

        //aws4 签名
        enhanceAws4Signature(head, requestParams, credential, "get");

        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, AddSecondaryCidrBlockResponse.class);
    }

    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(AddSecondaryCidrBlockRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置证书
        getCommonParams(credential, requestParams);
        //设置接口属性
        requestParams.put("Service", service);
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestField(requestObj, requestParams);

        //签名
        String signature = SignUtils.signature(requestParams, credential.getSignStr());
        requestParams.put("Signature", signature);
        return requestParams;
    }

    private JSONObject getSimpleRequestParams(AddSecondaryCidrBlockRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置接口属性
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestField(requestObj, requestParams);
        return requestParams;
    }

    private JSONObject getPostRawRequestParams(AddSecondaryCidrBlockRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置接口属性
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestFieldForPostRaw(requestObj, requestParams);
        return requestParams;
    }
}
