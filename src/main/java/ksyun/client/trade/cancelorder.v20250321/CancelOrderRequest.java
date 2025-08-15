package ksyun.client.trade.cancelorder.v20250321;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CancelOrderRequest @Description 请求参数
 */
@Data
public class CancelOrderRequest {
  /** 订单ID */
  @KsYunField(name = "orderId")
  private String OrderId;
}
