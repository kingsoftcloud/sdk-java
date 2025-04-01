package ksyun.client.trade.queryorderinfo.v20250321;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryOrderInfoRequest
 * @Description 请求参数
 */
@Data
public class QueryOrderInfoRequest {
    /**
     * 订单ID
     */
    @KsYunField(name = "orderId")
    private String OrderId;

}