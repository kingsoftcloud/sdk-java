package ksyun.client.kcrs.getretentiontrigger.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetRetentionTriggerResponse @Description GetRetentionTrigger 返回体
 */
@Data
@ToString
public class GetRetentionTriggerResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
