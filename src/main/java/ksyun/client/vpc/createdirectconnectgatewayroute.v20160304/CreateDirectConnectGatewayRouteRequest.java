package ksyun.client.vpc.createdirectconnectgatewayroute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDirectConnectGatewayRouteRequest
* @Description 请求参数
*/
@Data
public class CreateDirectConnectGatewayRouteRequest{
    /**边界网关的ID*/
    @KsYunField(name="DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**目标网段*/
    @KsYunField(name="DestinationCidrBlock")
    private String DestinationCidrBlock;

    /**下一跳类型*/
    @KsYunField(name="NextHopType")
    private String NextHopType;

    /**优先级*/
    @KsYunField(name="Priority")
    private Integer Priority;

    /**下一跳实例ID*/
    @KsYunField(name="NextHopInstance")
    private String NextHopInstance;

    /**是否开启Ipv6*/
    @KsYunField(name="EnableIpv6")
    private Boolean EnableIpv6;

}
