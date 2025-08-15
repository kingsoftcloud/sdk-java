package ksyun.client.iam.geteffectivepolicies.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetEffectivePoliciesResponse @Description GetEffectivePolicies 返回体
 */
@Data
@ToString
public class GetEffectivePoliciesResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
