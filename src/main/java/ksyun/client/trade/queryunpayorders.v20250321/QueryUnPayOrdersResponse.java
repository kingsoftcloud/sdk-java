package ksyun.client.trade.queryunpayorders.v20250321;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname QueryUnPayOrdersResponse @Description QueryUnPayOrders 返回体
 */
@Data
@ToString
public class QueryUnPayOrdersResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
