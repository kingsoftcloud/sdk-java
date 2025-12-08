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

    /**下一跳类型*/
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

    /**VPN网关的ID*/
    @KsYunField(name="VpnGatewayId")
    private String VpnGatewayId;

    /**网卡ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**高可用虚拟IP的ID*/
    @KsYunField(name="HaVipId")
    private String HaVipId;

    /**高可用虚拟IP的主网卡ID*/
    @KsYunField(name="HaVipMasterNetworkInterfaceId")
    private String HaVipMasterNetworkInterfaceId;

    /**云企业网的ID*/
    @KsYunField(name="CenId")
    private String CenId;

    /**路由描述(部分机房支持，不支持该参数的机房忽略此传值)*/
    @KsYunField(name="Description")
    private String Description;

    /**路由表ID(部分机房支持，不支持该参数的机房忽略此传值)*/
    @KsYunField(name="RouteTableId")
    private String RouteTableId;

}
