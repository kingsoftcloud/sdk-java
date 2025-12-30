package ksyun.client.vpc.describevpngatewayroutes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeVpnGatewayRoutesResponse
* @Description DescribeVpnGatewayRoutes 返回体
*/
@Data
@ToString
public class DescribeVpnGatewayRoutesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**Vpn网关路由信息*/
    @JsonProperty("VpnGatewayRouteSet")
    private List<VpnGatewayRouteSetDto> VpnGatewayRouteSet;

    @Data
    @ToString
    public static class VpnGatewayRouteSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpn网关路由id*/
        @JsonProperty("VpnGatewayRouteId")
        private String VpnGatewayRouteId;

        /**目标网段*/
        @JsonProperty("DestinationCidrBlock")
        private String DestinationCidrBlock;

        /**路由类型*/
        @JsonProperty("RouteType")
        private String RouteType;

        /**下一跳类型*/
        @JsonProperty("NextHopType")
        private String NextHopType;

        /**下一跳实例名称*/
        @JsonProperty("NextHopInstanceName")
        private String NextHopInstanceName;

        /**VPN网关id*/
        @JsonProperty("VpnGatewayId")
        private String VpnGatewayId;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

    }

}
