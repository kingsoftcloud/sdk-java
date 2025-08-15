package ksyun.client.kmr.createautoscalepolicy.v20231231;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.RpcRequestContentModel;
import common.utils.RpcRequestClient;
import java.util.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname CreateAutoScalePolicyClient @Description 新增弹性伸缩策略
 */
@Slf4j
public class CreateAutoScalePolicyClient extends BaseClient {
  private static final String service = "kmr";
  private static final String version = "2023-12-31";
  private static final String action = "CreateAutoScalePolicy";

  /** 证书 */
  private Credential credential;

  public CreateAutoScalePolicyClient(Credential credential) {
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
  public CreateAutoScalePolicyResponse doPost(String path, CreateAutoScalePolicyRequest requestObj)
      throws Exception {
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
  public CreateAutoScalePolicyResponse doPost(
      String path, CreateAutoScalePolicyRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
    String response = doRpc(path, requestObj, requestHeaders, "post");
    return JSON.parseObject(response, CreateAutoScalePolicyResponse.class);
  }

  /**
   * post 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public CreateAutoScalePolicyResponse doPostRaw(
      String path, CreateAutoScalePolicyRequest requestObj) throws Exception {
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
  public CreateAutoScalePolicyResponse doPostRaw(
      String path, CreateAutoScalePolicyRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
    String response = doRpc(path, requestObj, requestHeaders, "post");
    return JSON.parseObject(response, CreateAutoScalePolicyResponse.class);
  }

  /**
   * get 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public CreateAutoScalePolicyResponse doGet(String path, CreateAutoScalePolicyRequest requestObj)
      throws Exception {
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
  public CreateAutoScalePolicyResponse doGet(
      String path, CreateAutoScalePolicyRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
    String response = doRpc(path, requestObj, requestHeaders, "get");
    return JSON.parseObject(response, CreateAutoScalePolicyResponse.class);
  }

  /**
   * doDelete 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public CreateAutoScalePolicyResponse doDelete(
      String path, CreateAutoScalePolicyRequest requestObj) throws Exception {
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
  public CreateAutoScalePolicyResponse doDelete(
      String path, CreateAutoScalePolicyRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
    String response = doRpc(path, requestObj, requestHeaders, "delete");
    return JSON.parseObject(response, CreateAutoScalePolicyResponse.class);
  }

  /**
   * doPut 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public CreateAutoScalePolicyResponse doPut(String path, CreateAutoScalePolicyRequest requestObj)
      throws Exception {
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
  public CreateAutoScalePolicyResponse doPut(
      String path, CreateAutoScalePolicyRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/x-www-form-urlencoded");
    String response = doRpc(path, requestObj, requestHeaders, "put");
    return JSON.parseObject(response, CreateAutoScalePolicyResponse.class);
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
      String path,
      CreateAutoScalePolicyRequest requestObj,
      Map<String, String> head,
      String requestMethod)
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

  private JSONObject getRequestParam(CreateAutoScalePolicyRequest requestObj, String contentType)
      throws Exception {
    // 请求参数
    if (contentType.equalsIgnoreCase("application/json")) {
      return getPostRawRequestParams(requestObj);
    }
    return getSimpleRequestParams(requestObj);
  }

  private JSONObject getSimpleRequestParams(CreateAutoScalePolicyRequest requestObj)
      throws Exception {
    JSONObject requestParams = new JSONObject();

    // 设置请求体请求参数
    setRequestField(requestObj, requestParams);
    return requestParams;
  }

  private JSONObject getPostRawRequestParams(CreateAutoScalePolicyRequest requestObj)
      throws Exception {
    JSONObject requestParams = new JSONObject();

    // 设置请求体请求参数
    setRequestFieldForPostRaw(requestObj, requestParams);
    return requestParams;
  }
}
