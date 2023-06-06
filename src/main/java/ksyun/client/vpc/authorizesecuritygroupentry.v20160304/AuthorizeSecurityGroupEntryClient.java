package ksyun.client.vpc.authorizesecuritygroupentry.v20160304;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
* @Classname AuthorizeSecurityGroupEntryClient
* @Description 创建安全组规则
*/
@Slf4j
public class AuthorizeSecurityGroupEntryClient extends BaseClient {
    private final static String service = "vpc";
    private final static String version = "2016-03-04";
    private final static String action = "AuthorizeSecurityGroupEntry";


    /**
     * 证书
     */
    private Credential credential;


    public AuthorizeSecurityGroupEntryClient(Credential credential) {
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
    public AuthorizeSecurityGroupEntryResponse doPost(String path, AuthorizeSecurityGroupEntryRequest requestObj) throws Exception {
        return doPost(path, requestObj, null);
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
    public AuthorizeSecurityGroupEntryResponse doPost(String path, AuthorizeSecurityGroupEntryRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, AuthorizeSecurityGroupEntryResponse.class);
    }


    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public AuthorizeSecurityGroupEntryResponse doGet(String path, AuthorizeSecurityGroupEntryRequest requestObj) throws Exception {
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
    public AuthorizeSecurityGroupEntryResponse doDelete(String path, AuthorizeSecurityGroupEntryRequest requestObj) throws Exception {
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
    public AuthorizeSecurityGroupEntryResponse doDelete(String path, AuthorizeSecurityGroupEntryRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        AuthorizeSecurityGroupEntryResponse AuthorizeSecurityGroupEntryResponse = JSON.parseObject(response, AuthorizeSecurityGroupEntryResponse.class);
        return AuthorizeSecurityGroupEntryResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public AuthorizeSecurityGroupEntryResponse doPut(String path, AuthorizeSecurityGroupEntryRequest requestObj) throws Exception {
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
    public AuthorizeSecurityGroupEntryResponse doPut(String path, AuthorizeSecurityGroupEntryRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        AuthorizeSecurityGroupEntryResponse AuthorizeSecurityGroupEntryResponse = JSON.parseObject(response, AuthorizeSecurityGroupEntryResponse.class);
        return AuthorizeSecurityGroupEntryResponse;
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
    public AuthorizeSecurityGroupEntryResponse doGet(String path, AuthorizeSecurityGroupEntryRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, AuthorizeSecurityGroupEntryResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(AuthorizeSecurityGroupEntryRequest requestObj) throws Exception {
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
}
