package ksyun.client.kcrs.updateretentiontrigger.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateRetentionTriggerResponse @Description UpdateRetentionTrigger 返回体
 */
@Data
@ToString
public class UpdateRetentionTriggerResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
