package ksyun.client.vpc.deletevpngatewayroute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteVpnGatewayRouteRequest
 * @Description 请求参数
 */
@Data
public class DeleteVpnGatewayRouteRequest {
    /**
     * VPN网关的ID
     */
    @KsYunField(name = "VpnGatewayRouteId")
    private String VpnGatewayRouteId;

}