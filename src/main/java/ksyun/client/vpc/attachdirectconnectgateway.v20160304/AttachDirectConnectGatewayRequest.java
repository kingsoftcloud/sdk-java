package ksyun.client.vpc.attachdirectconnectgateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AttachDirectConnectGatewayRequest
 * @Description 请求参数
 */
@Data
public class AttachDirectConnectGatewayRequest {
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