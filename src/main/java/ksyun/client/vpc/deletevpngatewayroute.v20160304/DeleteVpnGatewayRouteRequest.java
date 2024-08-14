package ksyun.client.vpc.deletevpngatewayroute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteVpnGatewayRouteRequest
* @Description 请求参数
*/
@Data
public class DeleteVpnGatewayRouteRequest{
    /**VPN网关的ID*/
    @KsYunField(name="VpnGatewayRouteId")
    private String VpnGatewayRouteId;


}