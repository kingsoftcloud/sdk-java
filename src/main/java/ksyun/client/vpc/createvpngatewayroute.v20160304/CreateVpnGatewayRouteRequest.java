package ksyun.client.vpc.createvpngatewayroute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateVpnGatewayRouteRequest
* @Description 请求参数
*/
@Data
public class CreateVpnGatewayRouteRequest{
    /**VPN网关ID*/
    @KsYunField(name="VpnGatewayId")
    private String VpnGatewayId;

    /**目标网段*/
    @KsYunField(name="DestinationCidrBlock")
    private String DestinationCidrBlock;

    /**下一跳实例id，下一跳类型为VPC-是；下一跳类型为VPN通道-否*/
    @KsYunField(name="NextHopInstanceId")
    private String NextHopInstanceId;

    /**下一跳类型，NextHopType*/
    @KsYunField(name="NextHopType")
    private String NextHopType;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;


}