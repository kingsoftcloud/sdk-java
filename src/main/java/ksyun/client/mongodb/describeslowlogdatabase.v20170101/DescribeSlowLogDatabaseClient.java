package ksyun.client.mongodb.describeslowlogdatabase.v20170101;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
* @Classname DescribeSlowLogDatabaseClient
* @Description DescribeSlowLogDatabase
*/
@Slf4j
public class DescribeSlowLogDatabaseClient extends BaseClient {
    private final static String service = "mongodb";
    private final static String version = "2017-01-01";
    private final static String action = "DescribeSlowLogDatabase";


    /**
     * 证书
     */
    private Credential credential;


    public DescribeSlowLogDatabaseClient(Credential credential) {
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
    public DescribeSlowLogDatabaseResponse doPost(String path, DescribeSlowLogDatabaseRequest requestObj) throws Exception {
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
    public DescribeSlowLogDatabaseResponse doPost(String path, DescribeSlowLogDatabaseRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, DescribeSlowLogDatabaseResponse.class);
    }


    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public DescribeSlowLogDatabaseResponse doGet(String path, DescribeSlowLogDatabaseRequest requestObj) throws Exception {
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
    public DescribeSlowLogDatabaseResponse doDelete(String path, DescribeSlowLogDatabaseRequest requestObj) throws Exception {
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
    public DescribeSlowLogDatabaseResponse doDelete(String path, DescribeSlowLogDatabaseRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        DescribeSlowLogDatabaseResponse DescribeSlowLogDatabaseResponse = JSON.parseObject(response, DescribeSlowLogDatabaseResponse.class);
        return DescribeSlowLogDatabaseResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public DescribeSlowLogDatabaseResponse doPut(String path, DescribeSlowLogDatabaseRequest requestObj) throws Exception {
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
    public DescribeSlowLogDatabaseResponse doPut(String path, DescribeSlowLogDatabaseRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        DescribeSlowLogDatabaseResponse DescribeSlowLogDatabaseResponse = JSON.parseObject(response, DescribeSlowLogDatabaseResponse.class);
        return DescribeSlowLogDatabaseResponse;
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
    public DescribeSlowLogDatabaseResponse doGet(String path, DescribeSlowLogDatabaseRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, DescribeSlowLogDatabaseResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(DescribeSlowLogDatabaseRequest requestObj) throws Exception {
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
