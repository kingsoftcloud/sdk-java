package ksyun.client.trade.launchpayorder.v20250321;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname LaunchPayOrderRequest
 * @Description 请求参数
 */
@Data
public class LaunchPayOrderRequest {
    /**
     * 订单ID
     */
    @KsYunField(name = "OrderId")
    private String OrderId;

}