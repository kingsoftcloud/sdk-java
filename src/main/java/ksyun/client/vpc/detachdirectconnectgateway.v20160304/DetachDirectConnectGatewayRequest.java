package ksyun.client.vpc.detachdirectconnectgateway.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DetachDirectConnectGatewayRequest
* @Description 请求参数
*/
@Data
public class DetachDirectConnectGatewayRequest{
    /**边界网关的ID*/
    @KsYunField(name="DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**连接通道的ID*/
    @KsYunField(name="DirectConnectInterfaceId")
    private String DirectConnectInterfaceId;

}
