package ksyun.client.aicp.listworkspaces.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListWorkspacesResponse @Description ListWorkspaces 返回体
 */
@Data
@ToString
public class ListWorkspacesResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
