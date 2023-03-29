package client.bill_union.describebillsummarybypaymode.v20200101;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.utils.HttpClientUtils;
import common.utils.SignUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
* @Classname DescribeBillSummaryByPayModeClient
* @Description 重启实例
*/
@Slf4j
public class DescribeBillSummaryByPayModeClient extends BaseClient {
    private final static String service = "bill-union";
    private final static String version = "2020-01-01";
    private final static String action = "DescribeBillSummaryByPayMode";


    /**
     * 证书
     */
    private Credential credential;


    public DescribeBillSummaryByPayModeClient(Credential credential) {
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
    public DescribeBillSummaryByPayModeResponse doPost(String path, DescribeBillSummaryByPayModeRequest requestObj) throws Exception {
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
    public DescribeBillSummaryByPayModeResponse doPost(String path, DescribeBillSummaryByPayModeRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPost(path, requestParams, head);
        log.info("doPost end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, DescribeBillSummaryByPayModeResponse.class);
    }


    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public DescribeBillSummaryByPayModeResponse doGet(String path, DescribeBillSummaryByPayModeRequest requestObj) throws Exception {
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
    public DescribeBillSummaryByPayModeResponse doDelete(String path, DescribeBillSummaryByPayModeRequest requestObj) throws Exception {
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
    public DescribeBillSummaryByPayModeResponse doDelete(String path, DescribeBillSummaryByPayModeRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpDelete(path, requestParams, head);
        log.info("doDelete end,path:{},params:{},head:{}", path, requestParams, head);
        DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayModeResponse = JSON.parseObject(response, DescribeBillSummaryByPayModeResponse.class);
        return DescribeBillSummaryByPayModeResponse;
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public DescribeBillSummaryByPayModeResponse doPut(String path, DescribeBillSummaryByPayModeRequest requestObj) throws Exception {
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
    public DescribeBillSummaryByPayModeResponse doPut(String path, DescribeBillSummaryByPayModeRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpPut(path, requestParams, head);
        log.info("httpPut end,path:{},params:{},head:{}", path, requestParams, head);
        DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayModeResponse = JSON.parseObject(response, DescribeBillSummaryByPayModeResponse.class);
        return DescribeBillSummaryByPayModeResponse;
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
    public DescribeBillSummaryByPayModeResponse doGet(String path, DescribeBillSummaryByPayModeRequest requestObj, Map<String, String> head) throws Exception {
        JSONObject requestParams = getRequestParams(requestObj);
        String response = HttpClientUtils.httpGet(path, requestParams, head);
        log.info("doGet end,path:{},params:{},head:{}", path, requestParams, head);
        return JSON.parseObject(response, DescribeBillSummaryByPayModeResponse.class);
    }


    /**
     * 构造请求参数
     *
     * @param requestObj
     * @return
     */
    private JSONObject getRequestParams(DescribeBillSummaryByPayModeRequest requestObj) throws Exception {
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
