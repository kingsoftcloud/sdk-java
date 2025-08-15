package ksyun.client.trade.deletetrialtobuytask.v20250220;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteTrialToBuyTaskResponse @Description DeleteTrialToBuyTask 返回体
 */
@Data
@ToString
public class DeleteTrialToBuyTaskResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
