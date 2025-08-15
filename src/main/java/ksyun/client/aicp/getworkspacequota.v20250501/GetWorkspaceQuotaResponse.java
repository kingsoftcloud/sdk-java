package ksyun.client.aicp.getworkspacequota.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetWorkspaceQuotaResponse @Description GetWorkspaceQuota 返回体
 */
@Data
@ToString
public class GetWorkspaceQuotaResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
