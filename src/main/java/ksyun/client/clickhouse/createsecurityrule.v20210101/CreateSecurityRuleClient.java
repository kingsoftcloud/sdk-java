package ksyun.client.clickhouse.createsecurityrule.v20210101;

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
* @Classname CreateSecurityRuleClient
* @Description 创建安全规则(添加自定义IP地址+绑定云主机IP)
*/
@Slf4j
public class CreateSecurityRuleClient extends BaseClient {
    private final static String service = "clickhouse";
    private final static String version = "2021-01-01";
    private final static String action = "CreateSecurityRule";


    /**
     * 证书
     */
    private Credential credential;


    public CreateSecurityRuleClient(Credential credential) {
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
    public CreateSecurityRuleResponse doPost(String path, CreateSecurityRuleRequest requestObj) throws Exception {
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
    public CreateSecurityRuleResponse doPost(String path, CreateSecurityRuleRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, CreateSecurityRuleResponse.class);
    }

    /**
    * post 请求
    * @param path
    * @param requestObj
    * @return
    * @throws Exception
    */
    public CreateSecurityRuleResponse doPostRaw(String path, CreateSecurityRuleRequest requestObj) throws Exception {
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
    public CreateSecurityRuleResponse doPostRaw(String path, CreateSecurityRuleRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, CreateSecurityRuleResponse.class);
    }
    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public CreateSecurityRuleResponse doGet(String path, CreateSecurityRuleRequest requestObj) throws Exception {
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
        public CreateSecurityRuleResponse doGet(String path, CreateSecurityRuleRequest requestObj, Map<String, String> head) throws Exception {
            final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
            requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
            String response = doRpc(path, requestObj, requestHeaders, "get");
            return JSON.parseObject(response, CreateSecurityRuleResponse.class);
        }

    /**
     * doDelete 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public CreateSecurityRuleResponse doDelete(String path, CreateSecurityRuleRequest requestObj) throws Exception {
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
    public CreateSecurityRuleResponse doDelete(String path, CreateSecurityRuleRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "delete");
        return JSON.parseObject(response, CreateSecurityRuleResponse.class);
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public CreateSecurityRuleResponse doPut(String path, CreateSecurityRuleRequest requestObj) throws Exception {
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
    public CreateSecurityRuleResponse doPut(String path, CreateSecurityRuleRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
       requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
        String response = doRpc(path, requestObj, requestHeaders, "put");
        return JSON.parseObject(response, CreateSecurityRuleResponse.class);
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
        private String doRpc(String path, CreateSecurityRuleRequest requestObj, Map<String, String> head, String requestMethod) throws Exception {
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


        private JSONObject getRequestParam(CreateSecurityRuleRequest requestObj, String contentType) throws Exception {
            //请求参数
            if (contentType.equalsIgnoreCase("application/json")) {
                return getPostRawRequestParams(requestObj);
            }
            return getSimpleRequestParams(requestObj);
        }


        private JSONObject getSimpleRequestParams(CreateSecurityRuleRequest requestObj) throws Exception {
            JSONObject requestParams = new JSONObject();

            //设置请求体请求参数
            setRequestField(requestObj, requestParams);
            return requestParams;
        }

        private JSONObject getPostRawRequestParams(CreateSecurityRuleRequest requestObj) throws Exception {
            JSONObject requestParams = new JSONObject();

            //设置请求体请求参数
            setRequestFieldForPostRaw(requestObj, requestParams);
            return requestParams;
        }
}
