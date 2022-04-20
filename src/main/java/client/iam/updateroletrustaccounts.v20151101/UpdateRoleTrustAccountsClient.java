package client.iam.updateroletrustaccounts.v20151101;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
* @Classname UpdateRoleTrustAccountsClient
* @Description 重启实例
*/
@Slf4j
public class UpdateRoleTrustAccountsClient extends BaseClient {
    private final static String service = "iam";
    private final static String version = "2015-11-01";
    private final static String action = "UpdateRoleTrustAccounts";


    /**
     * 证书
     */
    private Credential credential;


    public UpdateRoleTrustAccountsClient(Credential credential) {
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
    public UpdateRoleTrustAccountsResponse doPost(String path, UpdateRoleTrustAccountsRequest requestObj) throws Exception {
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
    public UpdateRoleTrustAccountsResponse doPost(String path, UpdateRoleTrustAccountsRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, UpdateRoleTrustAccountsResponse.class);
    }


    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public UpdateRoleTrustAccountsResponse doGet(String path, UpdateRoleTrustAccountsRequest requestObj) throws Exception {
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
    public UpdateRoleTrustAccountsResponse doDelete(String path, UpdateRoleTrustAccountsRequest requestObj) throws Exception {
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
    public UpdateRoleTrustAccountsResponse doDelete(String path, UpdateRoleTrustAccountsRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        UpdateRoleTrustAccountsResponse UpdateRoleTrustAccountsResponse = JSON.parseObject(response, UpdateRoleTrustAccountsResponse.class);
        return UpdateRoleTrustAccountsResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public UpdateRoleTrustAccountsResponse doPut(String path, UpdateRoleTrustAccountsRequest requestObj) throws Exception {
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
    public UpdateRoleTrustAccountsResponse doPut(String path, UpdateRoleTrustAccountsRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        UpdateRoleTrustAccountsResponse UpdateRoleTrustAccountsResponse = JSON.parseObject(response, UpdateRoleTrustAccountsResponse.class);
        return UpdateRoleTrustAccountsResponse;
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
    public UpdateRoleTrustAccountsResponse doGet(String path, UpdateRoleTrustAccountsRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, UpdateRoleTrustAccountsResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(UpdateRoleTrustAccountsRequest requestObj) throws Exception {
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
