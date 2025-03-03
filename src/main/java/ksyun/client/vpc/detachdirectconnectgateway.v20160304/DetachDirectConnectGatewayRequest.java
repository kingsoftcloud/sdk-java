package ksyun.client.vpc.detachdirectconnectgateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DetachDirectConnectGatewayRequest
 * @Description 请求参数
 */
@Data
public class DetachDirectConnectGatewayRequest {
    /**
     * 边界网关的ID
     */
    @KsYunField(name = "DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**
     * 连接通道的ID
     */
    @KsYunField(name = "DirectConnectInterfaceId")
    private String DirectConnectInterfaceId;

}