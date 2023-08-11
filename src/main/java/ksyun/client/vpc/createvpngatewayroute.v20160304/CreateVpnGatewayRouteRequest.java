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
    /**VPN网关id*/
    @KsYunField(name="VpnGatewayId")
    private String VpnGatewayId;

    /**目标网段*/
    @KsYunField(name="DestinationCidrBlock")
    private String DestinationCidrBlock;

    /**下一条类型(vpn_tunnel|vpc)*/
    @KsYunField(name="NextHopType")
    private String NextHopType;

    /**下一跳的实例id*/
    @KsYunField(name="NextHopInstanceId")
    private String NextHopInstanceId;


}