package ksyun.client.cloud_advisor.listinspectionitem.v20250610;

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
* @Classname ListInspectionItemClient
* @Description 查询巡检项列表
*/
@Slf4j
public class ListInspectionItemClient extends BaseClient {
    private final static String service = "cloud-advisor";
    private final static String version = "2025-06-10";
    private final static String action = "ListInspectionItem";


    /**
     * 证书
     */
    private Credential credential;


    public ListInspectionItemClient(Credential credential) {
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
    public ListInspectionItemResponse doPost(String path, ListInspectionItemRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
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
    public ListInspectionItemResponse doPost(String path, ListInspectionItemRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, ListInspectionItemResponse.class);
    }

    /**
    * post 请求
    * @param path
    * @param requestObj
    * @return
    * @throws Exception
    */
    public ListInspectionItemResponse doPostRaw(String path, ListInspectionItemRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
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
    public ListInspectionItemResponse doPostRaw(String path, ListInspectionItemRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, ListInspectionItemResponse.class);
    }
    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListInspectionItemResponse doGet(String path, ListInspectionItemRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.putIfAbsent("Content-Type", "application/json");
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
        public ListInspectionItemResponse doGet(String path, ListInspectionItemRequest requestObj, Map<String, String> head) throws Exception {
            final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
            requestHeaders.putIfAbsent("Content-Type", "application/json");
            String response = doRpc(path, requestObj, requestHeaders, "get");
            return JSON.parseObject(response, ListInspectionItemResponse.class);
        }

    /**
     * doDelete 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListInspectionItemResponse doDelete(String path, ListInspectionItemRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
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
    public ListInspectionItemResponse doDelete(String path, ListInspectionItemRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "delete");
        return JSON.parseObject(response, ListInspectionItemResponse.class);
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public ListInspectionItemResponse doPut(String path, ListInspectionItemRequest requestObj) throws Exception {
        Map<String, String> head = new HashMap<>();
        head.putIfAbsent("Content-Type", "application/json");
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
    public ListInspectionItemResponse doPut(String path, ListInspectionItemRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
       requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "put");
        return JSON.parseObject(response, ListInspectionItemResponse.class);
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
        private String doRpc(String path, ListInspectionItemRequest requestObj, Map<String, String> head, String requestMethod) throws Exception {
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


        private JSONObject getRequestParam(ListInspectionItemRequest requestObj, String contentType) throws Exception {
            //请求参数
            if (contentType.equalsIgnoreCase("application/json")) {
                return getPostRawRequestParams(requestObj);
            }
            return getSimpleRequestParams(requestObj);
        }


        private JSONObject getSimpleRequestParams(ListInspectionItemRequest requestObj) throws Exception {
            JSONObject requestParams = new JSONObject();

            //设置请求体请求参数
            setRequestField(requestObj, requestParams);
            return requestParams;
        }

        private JSONObject getPostRawRequestParams(ListInspectionItemRequest requestObj) throws Exception {
            JSONObject requestParams = new JSONObject();

            //设置请求体请求参数
            setRequestFieldForPostRaw(requestObj, requestParams);
            return requestParams;
        }
}
