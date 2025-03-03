package ksyun.client.vpc.deletedirectconnectgateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDirectConnectGatewayRequest
 * @Description 请求参数
 */
@Data
public class DeleteDirectConnectGatewayRequest {
    /**
     * 边界网关的ID
     */
    @KsYunField(name = "DirectConnectGatewayId")
    private String DirectConnectGatewayId;

}