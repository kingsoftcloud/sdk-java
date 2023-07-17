package ksyun.client.kls.listhistorypubstreamsinfo.v20170101;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
* @Classname ListHistoryPubStreamsInfoClient
* @Description 查询流历史信息接口
*/
@Slf4j
public class ListHistoryPubStreamsInfoClient extends BaseClient {
    private final static String service = "kls";
    private final static String version = "2017-01-01";
    private final static String action = "ListHistoryPubStreamsInfo";


    /**
     * 证书
     */
    private Credential credential;


    public ListHistoryPubStreamsInfoClient(Credential credential) {
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
    public ListHistoryPubStreamsInfoResponse doPost(String path, ListHistoryPubStreamsInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsInfoResponse doPost(String path, ListHistoryPubStreamsInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, ListHistoryPubStreamsInfoResponse.class);
    }


    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListHistoryPubStreamsInfoResponse doGet(String path, ListHistoryPubStreamsInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsInfoResponse doDelete(String path, ListHistoryPubStreamsInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsInfoResponse doDelete(String path, ListHistoryPubStreamsInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        ListHistoryPubStreamsInfoResponse ListHistoryPubStreamsInfoResponse = JSON.parseObject(response, ListHistoryPubStreamsInfoResponse.class);
        return ListHistoryPubStreamsInfoResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListHistoryPubStreamsInfoResponse doPut(String path, ListHistoryPubStreamsInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsInfoResponse doPut(String path, ListHistoryPubStreamsInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        ListHistoryPubStreamsInfoResponse ListHistoryPubStreamsInfoResponse = JSON.parseObject(response, ListHistoryPubStreamsInfoResponse.class);
        return ListHistoryPubStreamsInfoResponse;
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
    public ListHistoryPubStreamsInfoResponse doGet(String path, ListHistoryPubStreamsInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, ListHistoryPubStreamsInfoResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(ListHistoryPubStreamsInfoRequest requestObj) throws Exception {
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
