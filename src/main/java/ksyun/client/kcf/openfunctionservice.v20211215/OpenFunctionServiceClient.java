package ksyun.client.kcf.openfunctionservice.v20211215;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.RpcRequestContentModel;
import common.utils.RequestHelpUtils;
import common.utils.RpcRequestClient;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Classname OpenFunctionServiceClient
 * @Description 开通函数服务
 */
@Slf4j
public class OpenFunctionServiceClient extends BaseClient {
    private final static String service = "kcf";
    private final static String version = "2021-12-15";
    private final static String action = "OpenFunctionService";


    /**
     * 证书
     */
    private Credential credential;


    public OpenFunctionServiceClient(Credential credential) {
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
    public OpenFunctionServiceResponse doPost(String path, OpenFunctionServiceRequest requestObj) throws Exception {
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
    public OpenFunctionServiceResponse doPost(String path, OpenFunctionServiceRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, OpenFunctionServiceResponse.class);
    }

    /**
     * post 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public OpenFunctionServiceResponse doPostRaw(String path, OpenFunctionServiceRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/x-www-form-urlencoded");
        return doPostRaw(path, requestObj, head);
    }

    /**
     * post 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public OpenFunctionServiceResponse doPostRaw(String path, OpenFunctionServiceRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, OpenFunctionServiceResponse.class);
    }

    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public OpenFunctionServiceResponse doGet(String path, OpenFunctionServiceRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        return doGet(path, requestObj, head);
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
    public OpenFunctionServiceResponse doGet(String path, OpenFunctionServiceRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "get");
        return JSON.parseObject(response, OpenFunctionServiceResponse.class);
    }

    /**
     * doDelete 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public OpenFunctionServiceResponse doDelete(String path, OpenFunctionServiceRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/x-www-form-urlencoded");
        return doDelete(path, requestObj, head);
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
    public OpenFunctionServiceResponse doDelete(String path, OpenFunctionServiceRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "delete");
        return JSON.parseObject(response, OpenFunctionServiceResponse.class);
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public OpenFunctionServiceResponse doPut(String path, OpenFunctionServiceRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        return doPut(path, requestObj, head);
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
    public OpenFunctionServiceResponse doPut(String path, OpenFunctionServiceRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "put");
        return JSON.parseObject(response, OpenFunctionServiceResponse.class);
    }

    /**
     * rpc
     *
     * @param path
     * @param requestObj
     * @param head
     * @return
     * @throws Exception
     */
    private String doRpc(String path, OpenFunctionServiceRequest requestObj, Map<String, String> head, String requestMethod) throws Exception {
        //断言
        Objects.requireNonNull(path, "path cannot be null");
        Objects.requireNonNull(requestObj, "requestObj cannot be null");
        Objects.requireNonNull(requestMethod, "requestMethod cannot be null");
        Objects.requireNonNull(head, "head cannot be null");

        //请求上下文
        RpcRequestContentModel requestContentModel = RpcRequestContentModel.builder()
                .action(action)
                .version(version)
                .service(service)
                .region(credential.getRegion())
                .accessKeyId(credential.getSecretKey())
                .secretAccessKey(credential.getSignStr())
                .build();

        // 根据内容类型设置请求体
        String contentType = head.getOrDefault("Content-Type", "application/x-www-form-urlencoded");
        JSONObject requestParam = getRequestParam(requestObj, contentType);

        //uri
        path = path + "?Action=" + action + "&Version=" + version;

        //发起请求
        String response = new RpcRequestClient(requestContentModel).beginRpcRequest(path, requestMethod, requestParam, head);
        log.info("doRpc end,path:{},params:{},head:{}", path, JSONObject.toJSON(requestParam), head);
        return response;

    }


    private JSONObject getRequestParam(OpenFunctionServiceRequest requestObj, String contentType) throws Exception {
        //请求参数
        if (contentType.equalsIgnoreCase("application/json")) {
            return getPostRawRequestParams(requestObj);
        }
        return getSimpleRequestParams(requestObj);
    }


    private JSONObject getSimpleRequestParams(OpenFunctionServiceRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();

        //设置请求体请求参数
        setRequestField(requestObj, requestParams);
        return requestParams;
    }

    private JSONObject getPostRawRequestParams(OpenFunctionServiceRequest requestObj) throws Exception {
        JSONObject requestParams = new JSONObject();

        //设置请求体请求参数
        setRequestFieldForPostRaw(requestObj, requestParams);
        return requestParams;
    }
}
