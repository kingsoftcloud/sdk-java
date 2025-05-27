package ksyun.client.vpc.detachdirectconnectgatewaywithvpc.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DetachDirectConnectGatewayWithVpcRequest
* @Description 请求参数
*/
@Data
public class DetachDirectConnectGatewayWithVpcRequest{
    /**边界网关的ID*/
    @KsYunField(name="DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**Vpc的ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

}