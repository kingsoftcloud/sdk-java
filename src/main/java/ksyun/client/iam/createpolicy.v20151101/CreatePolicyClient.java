package ksyun.client.iam.createpolicy.v20151101;

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
 * @Classname CreatePolicyClient
 * @Description 新建策略
 */
@Slf4j
public class CreatePolicyClient extends BaseClient {
    private final static String service = "iam";
    private final static String version = "2015-11-01";
    private final static String action = "CreatePolicy";


    /**
     * 证书
     */
    private Credential credential;


    public CreatePolicyClient(Credential credential) {
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
    public CreatePolicyResponse doPost(String path, CreatePolicyRequest requestObj) throws Exception {
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
    public CreatePolicyResponse doPost(String path, CreatePolicyRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }
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
        return JSON.parseObject(response, CreatePolicyResponse.class);
    }

    /**
     * post 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public CreatePolicyResponse doPostRaw(String path, CreatePolicyRequest requestObj) throws Exception {
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
    public CreatePolicyResponse doPostRaw(String path, CreatePolicyRequest requestObj, Map<String, String> head) throws Exception {
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
    public CreatePolicyResponse doGet(String path, CreatePolicyRequest requestObj) throws Exception {
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
    public CreatePolicyResponse doDelete(String path, CreatePolicyRequest requestObj) throws Exception {
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
    public CreatePolicyResponse doDelete(String path, CreatePolicyRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        CreatePolicyResponse CreatePolicyResponse = JSON.parseObject(response, CreatePolicyResponse.class);
        return CreatePolicyResponse;
    }

    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public CreatePolicyResponse doPut(String path, CreatePolicyRequest requestObj) throws Exception {
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
    public CreatePolicyResponse doPut(String path, CreatePolicyRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        CreatePolicyResponse CreatePolicyResponse = JSON.parseObject(response, CreatePolicyResponse.class);
        return CreatePolicyResponse;
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
    public CreatePolicyResponse doGet(String path, CreatePolicyRequest requestObj, Map<String, String> head) throws Exception {
        if (head == null) {
            head = new HashMap<>();
        }

        //参数配置
        JSONObject requestParams = getSimpleRequestParams(requestObj);

        //aws4 签名
        enhanceAws4Signature(head, requestParams, credential, "get");

        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, CreatePolicyResponse.class);
    }

    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(CreatePolicyRequest requestObj) throws Exception {
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

    private JSONObject getSimpleRequestParams(CreatePolicyRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置接口属性
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestField(requestObj, requestParams);
        return requestParams;
    }

    private JSONObject getPostRawRequestParams(CreatePolicyRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();
        //设置接口属性
        requestParams.put("Action", action);
        requestParams.put("Version", version);

        //设置请求体请求参数
        setRequestFieldForPostRaw(requestObj, requestParams);
        return requestParams;
    }
}
