package ksyun.client.aicp.listgputypes.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListGpuTypesResponse @Description ListGpuTypes 返回体
 */
@Data
@ToString
public class ListGpuTypesResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
