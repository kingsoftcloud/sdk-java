package ksyun.client.kls.listhistorypubstreamserrinfo.v20170101;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
* @Classname ListHistoryPubStreamsErrInfoClient
* @Description 查询流历史流错误信息
*/
@Slf4j
public class ListHistoryPubStreamsErrInfoClient extends BaseClient {
    private final static String service = "kls";
    private final static String version = "2017-01-01";
    private final static String action = "ListHistoryPubStreamsErrInfo";


    /**
     * 证书
     */
    private Credential credential;


    public ListHistoryPubStreamsErrInfoClient(Credential credential) {
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
    public ListHistoryPubStreamsErrInfoResponse doPost(String path, ListHistoryPubStreamsErrInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsErrInfoResponse doPost(String path, ListHistoryPubStreamsErrInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, ListHistoryPubStreamsErrInfoResponse.class);
    }


    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListHistoryPubStreamsErrInfoResponse doGet(String path, ListHistoryPubStreamsErrInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsErrInfoResponse doDelete(String path, ListHistoryPubStreamsErrInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsErrInfoResponse doDelete(String path, ListHistoryPubStreamsErrInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        ListHistoryPubStreamsErrInfoResponse ListHistoryPubStreamsErrInfoResponse = JSON.parseObject(response, ListHistoryPubStreamsErrInfoResponse.class);
        return ListHistoryPubStreamsErrInfoResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListHistoryPubStreamsErrInfoResponse doPut(String path, ListHistoryPubStreamsErrInfoRequest requestObj) throws Exception {
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
    public ListHistoryPubStreamsErrInfoResponse doPut(String path, ListHistoryPubStreamsErrInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        ListHistoryPubStreamsErrInfoResponse ListHistoryPubStreamsErrInfoResponse = JSON.parseObject(response, ListHistoryPubStreamsErrInfoResponse.class);
        return ListHistoryPubStreamsErrInfoResponse;
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
    public ListHistoryPubStreamsErrInfoResponse doGet(String path, ListHistoryPubStreamsErrInfoRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, ListHistoryPubStreamsErrInfoResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(ListHistoryPubStreamsErrInfoRequest requestObj) throws Exception {
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
