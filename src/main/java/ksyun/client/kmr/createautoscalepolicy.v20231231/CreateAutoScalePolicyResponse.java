package ksyun.client.kmr.createautoscalepolicy.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateAutoScalePolicyResponse @Description CreateAutoScalePolicy 返回体
 */
@Data
@ToString
public class CreateAutoScalePolicyResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
