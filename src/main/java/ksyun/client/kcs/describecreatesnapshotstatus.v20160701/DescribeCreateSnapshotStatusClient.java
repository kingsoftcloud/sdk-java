package ksyun.client.kcs.describecreatesnapshotstatus.v20160701;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.BaseClient;
import common.Credential;
import common.RpcRequestContentModel;
import common.utils.RpcRequestClient;
import java.util.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname DescribeCreateSnapshotStatusClient @Description 创建备份前的备份状态和大key分析状态查询
 */
@Slf4j
public class DescribeCreateSnapshotStatusClient extends BaseClient {
  private static final String service = "kcs";
  private static final String version = "2016-07-01";
  private static final String action = "DescribeCreateSnapshotStatus";

  /** 证书 */
  private Credential credential;

  public DescribeCreateSnapshotStatusClient(Credential credential) {
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
  public DescribeCreateSnapshotStatusResponse doPost(
      String path, DescribeCreateSnapshotStatusRequest requestObj) throws Exception {
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
  public DescribeCreateSnapshotStatusResponse doPost(
      String path, DescribeCreateSnapshotStatusRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "post");
    return JSON.parseObject(response, DescribeCreateSnapshotStatusResponse.class);
  }

  /**
   * post 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public DescribeCreateSnapshotStatusResponse doPostRaw(
      String path, DescribeCreateSnapshotStatusRequest requestObj) throws Exception {
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
  public DescribeCreateSnapshotStatusResponse doPostRaw(
      String path, DescribeCreateSnapshotStatusRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "post");
    return JSON.parseObject(response, DescribeCreateSnapshotStatusResponse.class);
  }

  /**
   * get 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public DescribeCreateSnapshotStatusResponse doGet(
      String path, DescribeCreateSnapshotStatusRequest requestObj) throws Exception {
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
  public DescribeCreateSnapshotStatusResponse doGet(
      String path, DescribeCreateSnapshotStatusRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "get");
    return JSON.parseObject(response, DescribeCreateSnapshotStatusResponse.class);
  }

  /**
   * doDelete 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public DescribeCreateSnapshotStatusResponse doDelete(
      String path, DescribeCreateSnapshotStatusRequest requestObj) throws Exception {
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
  public DescribeCreateSnapshotStatusResponse doDelete(
      String path, DescribeCreateSnapshotStatusRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "delete");
    return JSON.parseObject(response, DescribeCreateSnapshotStatusResponse.class);
  }

  /**
   * doPut 请求
   *
   * @param path
   * @param requestObj
   * @return
   * @throws Exception
   */
  public DescribeCreateSnapshotStatusResponse doPut(
      String path, DescribeCreateSnapshotStatusRequest requestObj) throws Exception {
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
  public DescribeCreateSnapshotStatusResponse doPut(
      String path, DescribeCreateSnapshotStatusRequest requestObj, Map<String, String> head)
      throws Exception {
    final Map<String, String> requestHeaders = head != null ? new HashMap<>(head) : new HashMap<>();
    requestHeaders.putIfAbsent("Content-Type", "application/json");
    String response = doRpc(path, requestObj, requestHeaders, "put");
    return JSON.parseObject(response, DescribeCreateSnapshotStatusResponse.class);
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
      DescribeCreateSnapshotStatusRequest requestObj,
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

  private JSONObject getRequestParam(
      DescribeCreateSnapshotStatusRequest requestObj, String contentType) throws Exception {
    // 请求参数
    if (contentType.equalsIgnoreCase("application/json")) {
      return getPostRawRequestParams(requestObj);
    }
    return getSimpleRequestParams(requestObj);
  }

  private JSONObject getSimpleRequestParams(DescribeCreateSnapshotStatusRequest requestObj)
      throws Exception {
    JSONObject requestParams = new JSONObject();

    // 设置请求体请求参数
    setRequestField(requestObj, requestParams);
    return requestParams;
  }

  private JSONObject getPostRawRequestParams(DescribeCreateSnapshotStatusRequest requestObj)
      throws Exception {
    JSONObject requestParams = new JSONObject();

    // 设置请求体请求参数
    setRequestFieldForPostRaw(requestObj, requestParams);
    return requestParams;
  }
}
