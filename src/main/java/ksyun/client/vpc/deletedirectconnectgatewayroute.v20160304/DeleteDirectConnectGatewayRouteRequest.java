package ksyun.client.vpc.deletedirectconnectgatewayroute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDirectConnectGatewayRouteRequest
 * @Description 请求参数
 */
@Data
public class DeleteDirectConnectGatewayRouteRequest {
    /**
     * 边界网关路由ID
     */
    @KsYunField(name = "DirectConnectGatewayRouteId")
    private String DirectConnectGatewayRouteId;


}