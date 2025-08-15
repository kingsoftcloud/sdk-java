package ksyun.client.iam.deletepolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeletePolicyResponse @Description DeletePolicy 返回体
 */
@Data
@ToString
public class DeletePolicyResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
