package ksyun.client.vpc.deletevpngateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteVpnGatewayRequest
 * @Description 请求参数
 */
@Data
public class DeleteVpnGatewayRequest {
    /**
     * VPN网关的ID
     */
    @KsYunField(name = "VpnGatewayId")
    private String VpnGatewayId;

}