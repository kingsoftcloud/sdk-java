package ksyun.client.vpc.modifydirectconnectgateway.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDirectConnectGatewayRequest
* @Description 请求参数
*/
@Data
public class ModifyDirectConnectGatewayRequest{
    /**边界网关的ID*/
    @KsYunField(name="DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**边界网关的名称*/
    @KsYunField(name="DirectConnectGatewayName")
    private String DirectConnectGatewayName;

}