package ksyun.client.kcs.uninstallplugins.v20160701;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.HttpResponseWrapper;
import common.RpcRequestContentModel;
import common.UrlPathParams;
import common.utils.RpcRequestClient;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
* @Classname UninstallPluginsClient
* @Description 实例卸载插件*/
@Slf4j
public class UninstallPluginsClient extends BaseClient {
    private final static String service = "kcs";
    private final static String version = "2016-07-01";
    private final static String action = "UninstallPlugins";


    /**
     * 证书
     */
    private Credential credential;


    public UninstallPluginsClient(Credential credential) {
        this.credential = credential;
    }


    /**
     * post 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doPostSend(String path, UninstallPluginsRequest requestObj) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doPostSend(path, requestObj, head);
    }

    /**
     * post 请求 - Send 方法（支持 URL 路径参数和自定义 Header）
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param urlPathParams URL 路径参数（AccountId、UserId、RoleId）
     * @param customHeaders 自定义 HTTP Header
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doPostSend(String path, UninstallPluginsRequest requestObj,
                                         UrlPathParams urlPathParams,
                                         Map<String, String> customHeaders) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        if (customHeaders != null && !customHeaders.isEmpty()) {
            head.putAll(customHeaders);
        }
        return doPostSend(path, requestObj, head, urlPathParams);
    }

    /**
     * post 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doPostSend(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws RuntimeException {
        return executeWithV2("post", path, requestObj, head, null);
    }

    /**
     * post 请求 - Send 方法（完整版，支持 URL 路径参数）
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头（包含自定义 Header）
     * @param urlPathParams URL 路径参数（AccountId、UserId、RoleId）
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doPostSend(String path, UninstallPluginsRequest requestObj, Map<String, String> head,
                                         UrlPathParams urlPathParams) throws RuntimeException {
        return executeWithV2("post", path, requestObj, head, urlPathParams);
    }

    /**
     * get 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doGetSend(String path, UninstallPluginsRequest requestObj) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doGetSend(path, requestObj, head);
    }

    /**
     * get 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doGetSend(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws RuntimeException {
        return executeWithV2("get", path, requestObj, head, null);
    }

    /**
     * get 请求 - Send 方法（支持 URL 路径参数和自定义 Header）
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param urlPathParams URL 路径参数（AccountId、UserId、RoleId）
     * @param customHeaders 自定义 HTTP Header
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doGetSend(String path, UninstallPluginsRequest requestObj,
                                        UrlPathParams urlPathParams,
                                        Map<String, String> customHeaders) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        if (customHeaders != null && !customHeaders.isEmpty()) {
            head.putAll(customHeaders);
        }
        return executeWithV2("get", path, requestObj, head, urlPathParams);
    }

    /**
     * put 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doPutSend(String path, UninstallPluginsRequest requestObj) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doPutSend(path, requestObj, head);
    }

    /**
     * put 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doPutSend(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws RuntimeException {
        return executeWithV2("put", path, requestObj, head, null);
    }

    /**
     * put 请求 - Send 方法（支持 URL 路径参数和自定义 Header）
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param urlPathParams URL 路径参数（AccountId、UserId、RoleId）
     * @param customHeaders 自定义 HTTP Header
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doPutSend(String path, UninstallPluginsRequest requestObj,
                                        UrlPathParams urlPathParams,
                                        Map<String, String> customHeaders) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        if (customHeaders != null && !customHeaders.isEmpty()) {
            head.putAll(customHeaders);
        }
        return executeWithV2("put", path, requestObj, head, urlPathParams);
    }

    /**
     * delete 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doDeleteSend(String path, UninstallPluginsRequest requestObj) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doDeleteSend(path, requestObj, head);
    }

    /**
     * delete 请求 - Send 方法
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doDeleteSend(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws RuntimeException {
        return executeWithV2("delete", path, requestObj, head, null);
    }

    /**
     * delete 请求 - Send 方法（支持 URL 路径参数和自定义 Header）
     * 在底层调用 WithContextV2，自动处理状态码检查和响应解析
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param urlPathParams URL 路径参数（AccountId、UserId、RoleId）
     * @param customHeaders 自定义 HTTP Header
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    public UninstallPluginsResponse doDeleteSend(String path, UninstallPluginsRequest requestObj,
                                           UrlPathParams urlPathParams,
                                           Map<String, String> customHeaders) throws RuntimeException {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        if (customHeaders != null && !customHeaders.isEmpty()) {
            head.putAll(customHeaders);
        }
        return executeWithV2("delete", path, requestObj, head, urlPathParams);
    }

    /**
     * 通用的 V2 执行方法 - 处理状态码检查和响应解析
     * 被所有 Send 方法调用
     *
     * @param method HTTP 方法
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @param urlPathParams URL 路径参数（AccountId、UserId、RoleId）
     * @return UninstallPluginsResponse 响应对象
     * @throws RuntimeException 如果请求失败
     */
    private UninstallPluginsResponse executeWithV2(String method, String path, UninstallPluginsRequest requestObj,
                                             Map<String, String> head, UrlPathParams urlPathParams) throws RuntimeException {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");

        // 调用底层 V2 方法获取完整响应
        HttpResponseWrapper wrapper = doRpcV2(path, requestObj, requestHeaders, method, urlPathParams);

        // 1. 检查是否有异常
        if (wrapper.hasException()) {
            throw new RuntimeException(
                String.format("[KsyunSDKError] [HttpCode:0 Err:%s] Request failed",
                    wrapper.getException().getMessage()),
                wrapper.getException()
            );
        }

        int statusCode = wrapper.getStatusCode();
        String message = wrapper.getMessage();

        // 2. 检查 HTTP 状态码(200-299 为成功)
        if (statusCode < 200 || statusCode > 299) {
            throw new RuntimeException(
                String.format("[KsyunSDKError] [HttpCode:%d Err:Request failed] %s",
                    statusCode, message)
            );
        }

        // 3. 检查响应是否为空
        if (message == null || message.isEmpty()) {
            return null;
        }

        // 4. 解析 JSON 响应
        try {
            return JSON.parseObject(message, UninstallPluginsResponse.class);
        } catch (Exception e) {
            throw new RuntimeException(
                String.format("[KsyunSDKError] [HttpCode:%d Err:%s] %s",
                    statusCode, e.getMessage(), message),
                e
            );
        }
    }

    /**
     * post 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doPostSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doPostWithContextV2(String path, UninstallPluginsRequest requestObj) {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doPostWithContextV2(path, requestObj, head);
    }

    /**
     * post 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doPostSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doPostWithContextV2(String path, UninstallPluginsRequest requestObj, Map<String, String> head) {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        return doRpcV2(path, requestObj, requestHeaders, "post", null);
    }

    /**
     * get 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doGetSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doGetWithContextV2(String path, UninstallPluginsRequest requestObj) {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doGetWithContextV2(path, requestObj, head);
    }

    /**
     * get 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doGetSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doGetWithContextV2(String path, UninstallPluginsRequest requestObj, Map<String, String> head) {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        return doRpcV2(path, requestObj, requestHeaders, "get", null);
    }

    /**
     * put 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doPutSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doPutWithContextV2(String path, UninstallPluginsRequest requestObj) {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doPutWithContextV2(path, requestObj, head);
    }

    /**
     * put 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doPutSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doPutWithContextV2(String path, UninstallPluginsRequest requestObj, Map<String, String> head) {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        return doRpcV2(path, requestObj, requestHeaders, "put", null);
    }

    /**
     * delete 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doDeleteSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doDeleteWithContextV2(String path, UninstallPluginsRequest requestObj) {
        Map<String, String> head = new HashMap<>();
        head.put("Content-Type", "application/json");
        return doDeleteWithContextV2(path, requestObj, head);
    }

    /**
     * delete 请求 - WithContextV2 方法
     * 返回包含 HTTP 状态码的完整响应
     *
     * 注意：大多数情况下应该使用 doDeleteSend() 方法，它会自动处理错误
     * 只有在需要手动处理 HTTP 状态码时才使用此方法
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    public HttpResponseWrapper doDeleteWithContextV2(String path, UninstallPluginsRequest requestObj, Map<String, String> head) {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        return doRpcV2(path, requestObj, requestHeaders, "delete", null);
    }

    /**
     * post请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public UninstallPluginsResponse doPost(String path, UninstallPluginsRequest requestObj) throws Exception {
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
    public UninstallPluginsResponse doPost(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, UninstallPluginsResponse.class);
    }

    /**
    * post 请求
    * @param path
    * @param requestObj
    * @return
    * @throws Exception
    */
    public UninstallPluginsResponse doPostRaw(String path, UninstallPluginsRequest requestObj) throws Exception {
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
    public UninstallPluginsResponse doPostRaw(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "post");
        return JSON.parseObject(response, UninstallPluginsResponse.class);
    }
    /**
     * get 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public UninstallPluginsResponse doGet(String path, UninstallPluginsRequest requestObj) throws Exception {
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
        public UninstallPluginsResponse doGet(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws Exception {
            final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
            requestHeaders.putIfAbsent("Content-Type", "application/json");
            String response = doRpc(path, requestObj, requestHeaders, "get");
            return JSON.parseObject(response, UninstallPluginsResponse.class);
        }

    /**
     * doDelete 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public UninstallPluginsResponse doDelete(String path, UninstallPluginsRequest requestObj) throws Exception {
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
    public UninstallPluginsResponse doDelete(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
        requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "delete");
        return JSON.parseObject(response, UninstallPluginsResponse.class);
    }


    /**
     * doPut 请求
     *
     * @param path
     * @param requestObj
     * @return
     * @throws Exception
     */
    public UninstallPluginsResponse doPut(String path, UninstallPluginsRequest requestObj) throws Exception {
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
    public UninstallPluginsResponse doPut(String path, UninstallPluginsRequest requestObj, Map<String, String> head) throws Exception {
        final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
       requestHeaders.putIfAbsent("Content-Type", "application/json");
        String response = doRpc(path, requestObj, requestHeaders, "put");
        return JSON.parseObject(response, UninstallPluginsResponse.class);
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
        private String doRpc(String path, UninstallPluginsRequest requestObj, Map<String, String> head, String requestMethod) throws Exception {
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


        private JSONObject getRequestParam(UninstallPluginsRequest requestObj, String contentType) throws Exception {
            //请求参数
            if (contentType.equalsIgnoreCase("application/json")) {
                return getPostRawRequestParams(requestObj);
            }
            return getSimpleRequestParams(requestObj);
        }


        private JSONObject getSimpleRequestParams(UninstallPluginsRequest requestObj) throws Exception {
            JSONObject requestParams = new JSONObject();

            //设置请求体请求参数
            setRequestField(requestObj, requestParams);
            return requestParams;
        }

        private JSONObject getPostRawRequestParams(UninstallPluginsRequest requestObj) throws Exception {
            JSONObject requestParams = new JSONObject();

            //设置请求体请求参数
            setRequestFieldForPostRaw(requestObj, requestParams);
            return requestParams;
        }

    /**
     * rpc v2 - 返回包含 HTTP 状态码的完整响应
     *
     * @param path 请求路径
     * @param requestObj 请求对象
     * @param head 请求头
     * @param requestMethod HTTP 方法
     * @param urlPathParams URL 路径参数（AccountId、UserId、RoleId）
     * @return HttpResponseWrapper 包含状态码和原始响应消息
     */
    private HttpResponseWrapper doRpcV2(String path, UninstallPluginsRequest requestObj, Map<String, String> head,
                                        String requestMethod, UrlPathParams urlPathParams) {
        try {
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

            //uri - 基础参数
            path = path + "?Action=" + action + "&Version=" + version;

            // 添加 URL 路径参数（AccountId、UserId、RoleId）到 query string
            if (urlPathParams != null && urlPathParams.hasParams()) {
                if (urlPathParams.getAccountId() != null) {
                    path = path + "&AccountId=" + urlPathParams.getAccountId();
                    log.debug("Added AccountId to URL: {}", urlPathParams.getAccountId());
                }
                if (urlPathParams.getUserId() != null) {
                    path = path + "&UserId=" + urlPathParams.getUserId();
                    log.debug("Added UserId to URL: {}", urlPathParams.getUserId());
                }
                if (urlPathParams.getRoleId() != null) {
                    path = path + "&RoleId=" + urlPathParams.getRoleId();
                    log.debug("Added RoleId to URL: {}", urlPathParams.getRoleId());
                }
            }

            //发起请求
            RpcRequestClient rpcRequestClient = new RpcRequestClient(requestContentModel);
            HttpResponseWrapper response = doRpcV2(rpcRequestClient, path, requestMethod, requestParam, head);
            log.info("doRpcV2 end, statusCode:{}, path:{}, params:{}, head:{}",
                    response.getStatusCode(), path, JSONObject.toJSON(requestParam), head);
            return response;
        } catch (Exception e) {
            log.error("doRpcV2 failed", e);
            return new HttpResponseWrapper(e);
        }
    }
}
