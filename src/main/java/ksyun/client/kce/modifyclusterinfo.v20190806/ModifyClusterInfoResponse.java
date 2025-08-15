package ksyun.client.kce.modifyclusterinfo.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyClusterInfoResponse @Description ModifyClusterInfo 返回体
 */
@Data
@ToString
public class ModifyClusterInfoResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
