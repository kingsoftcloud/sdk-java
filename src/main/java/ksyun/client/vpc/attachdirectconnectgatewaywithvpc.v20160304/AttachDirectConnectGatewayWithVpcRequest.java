package ksyun.client.vpc.attachdirectconnectgatewaywithvpc.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AttachDirectConnectGatewayWithVpcRequest
 * @Description 请求参数
 */
@Data
public class AttachDirectConnectGatewayWithVpcRequest {
    /**
     * 边界网关的ID
     */
    @KsYunField(name = "DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

}