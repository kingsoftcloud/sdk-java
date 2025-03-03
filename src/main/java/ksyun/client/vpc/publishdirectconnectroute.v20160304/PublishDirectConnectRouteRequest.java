package ksyun.client.vpc.publishdirectconnectroute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname PublishDirectConnectRouteRequest
 * @Description 请求参数
 */
@Data
public class PublishDirectConnectRouteRequest {
    /**
     * 边界网关路由ID
     */
    @KsYunField(name = "DirectConnectGatewayRouteId")
    private String DirectConnectGatewayRouteId;


}