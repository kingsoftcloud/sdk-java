package ksyun.client.vpc.deletesecondarycidrblock.v20160304;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
* @Classname DeleteSecondaryCidrBlockClient
* @Description 删除VPC附加IPv4网段
*/
@Slf4j
public class DeleteSecondaryCidrBlockClient extends BaseClient {
    private final static String service = "vpc";
    private final static String version = "2016-03-04";
    private final static String action = "DeleteSecondaryCidrBlock";


    /**
     * 证书
     */
    private Credential credential;


    public DeleteSecondaryCidrBlockClient(Credential credential) {
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
    public DeleteSecondaryCidrBlockResponse doPost(String path, DeleteSecondaryCidrBlockRequest requestObj) throws Exception {
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
    public DeleteSecondaryCidrBlockResponse doPost(String path, DeleteSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, DeleteSecondaryCidrBlockResponse.class);
    }


    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public DeleteSecondaryCidrBlockResponse doGet(String path, DeleteSecondaryCidrBlockRequest requestObj) throws Exception {
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
    public DeleteSecondaryCidrBlockResponse doDelete(String path, DeleteSecondaryCidrBlockRequest requestObj) throws Exception {
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
    public DeleteSecondaryCidrBlockResponse doDelete(String path, DeleteSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        DeleteSecondaryCidrBlockResponse DeleteSecondaryCidrBlockResponse = JSON.parseObject(response, DeleteSecondaryCidrBlockResponse.class);
        return DeleteSecondaryCidrBlockResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public DeleteSecondaryCidrBlockResponse doPut(String path, DeleteSecondaryCidrBlockRequest requestObj) throws Exception {
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
    public DeleteSecondaryCidrBlockResponse doPut(String path, DeleteSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        DeleteSecondaryCidrBlockResponse DeleteSecondaryCidrBlockResponse = JSON.parseObject(response, DeleteSecondaryCidrBlockResponse.class);
        return DeleteSecondaryCidrBlockResponse;
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
    public DeleteSecondaryCidrBlockResponse doGet(String path, DeleteSecondaryCidrBlockRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, DeleteSecondaryCidrBlockResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(DeleteSecondaryCidrBlockRequest requestObj) throws Exception {
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
