package ksyun.client.vpc.createroute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateRouteRequest
* @Description 请求参数
*/
@Data
public class CreateRouteRequest{
    /**Vpc的ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**路由的类型*/
    @KsYunField(name="RouteType")
    private String RouteType;

    /**目标网段*/
    @KsYunField(name="DestinationCidrBlock")
    private String DestinationCidrBlock;

    /**云服务器的ID，只有主机路由需要填写此参数*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**对等连接ID*/
    @KsYunField(name="VpcPeeringConnectionId")
    private String VpcPeeringConnectionId;

    /**专线网关的ID*/
    @KsYunField(name="DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**VPN通道的ID*/
    @KsYunField(name="VpnTunnelId")
    private String VpnTunnelId;

    /**网卡ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;


}