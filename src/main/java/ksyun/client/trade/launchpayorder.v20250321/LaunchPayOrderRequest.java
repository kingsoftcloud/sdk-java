package ksyun.client.trade.launchpayorder.v20250321;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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