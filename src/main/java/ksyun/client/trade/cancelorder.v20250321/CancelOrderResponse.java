package ksyun.client.trade.cancelorder.v20250321;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CancelOrderResponse @Description CancelOrder 返回体
 */
@Data
@ToString
public class CancelOrderResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
