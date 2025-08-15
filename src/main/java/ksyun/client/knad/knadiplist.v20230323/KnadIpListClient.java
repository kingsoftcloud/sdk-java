package ksyun.client.knad.knadiplist.v20230323;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.RpcRequestContentModel;
import common.utils.RpcRequestClient;
import java.util.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname KnadIpListClient @Description 设置防护对象-已选eip列表
 */
@Slf4j
public class KnadIpListClient extends BaseClient {
  private static final String service = "knad";
  private static final String version = "2023-03-23";
  private static final String action = "KnadIpList";

  /** 证书 */
  private Credential credential;

  public KnadIpListClient(Credential credential) {
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
  public KnadIpListResponse doPost(String path, KnadIpListRequest requestObj) throws Exception {
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
  public KnadIpListResponse doPost(
      String path, KnadIpListRequest requestObj, Map<String, String> head) throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "post");
    return JSON.parseObject(response, KnadIpListResponse.class);
  }

  /**
   * post 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public KnadIpListResponse doPostRaw(String path, KnadIpListRequest requestObj) throws Exception {
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
  public KnadIpListResponse doPostRaw(
      String path, KnadIpListRequest requestObj, Map<String, String> head) throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "post");
    return JSON.parseObject(response, KnadIpListResponse.class);
  }

  /**
   * get 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public KnadIpListResponse doGet(String path, KnadIpListRequest requestObj) throws Exception {
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
  public KnadIpListResponse doGet(
      String path, KnadIpListRequest requestObj, Map<String, String> head) throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "get");
    return JSON.parseObject(response, KnadIpListResponse.class);
  }

  /**
   * doDelete 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public KnadIpListResponse doDelete(String path, KnadIpListRequest requestObj) throws Exception {
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
  public KnadIpListResponse doDelete(
      String path, KnadIpListRequest requestObj, Map<String, String> head) throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "delete");
    return JSON.parseObject(response, KnadIpListResponse.class);
  }

  /**
   * doPut 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public KnadIpListResponse doPut(String path, KnadIpListRequest requestObj) throws Exception {
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
  public KnadIpListResponse doPut(
      String path, KnadIpListRequest requestObj, Map<String, String> head) throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "put");
    return JSON.parseObject(response, KnadIpListResponse.class);
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
  private String doRpc(
      String path, KnadIpListRequest requestObj, Map<String, String> head, String requestMethod)
      throws Exception {
    // 断言
    Objects.requireNonNull(path, "path cannot be null");
    Objects.requireNonNull(requestObj, "requestObj cannot be null");
    Objects.requireNonNull(requestMethod, "requestMethod cannot be null");
    Objects.requireNonNull(head, "head cannot be null");

    // 请求上下文
    RpcRequestContentModel requestContentModel =
        RpcRequestContentModel.builder()
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

    // uri
    path = path + "?Action=" + action + "&Version=" + version;

    // 发起请求
    String response =
        new RpcRequestClient(requestContentModel)
            .beginRpcRequest(path, requestMethod, requestParam, head);
    log.info("doRpc end,path:{},params:{},head:{}", path, JSONObject.toJSON(requestParam), head);
    return response;
  }

  private JSONObject getRequestParam(KnadIpListRequest requestObj, String contentType)
      throws Exception {
    // 请求参数
    if (contentType.equalsIgnoreCase("application/json")) {
      return getPostRawRequestParams(requestObj);
    }
    return getSimpleRequestParams(requestObj);
  }

  private JSONObject getSimpleRequestParams(KnadIpListRequest requestObj) throws Exception {
    JSONObject requestParams = new JSONObject();

    // 设置请求体请求参数
    setRequestField(requestObj, requestParams);
    return requestParams;
  }

  private JSONObject getPostRawRequestParams(KnadIpListRequest requestObj) throws Exception {
    JSONObject requestParams = new JSONObject();

    // 设置请求体请求参数
    setRequestFieldForPostRaw(requestObj, requestParams);
    return requestParams;
  }
}
