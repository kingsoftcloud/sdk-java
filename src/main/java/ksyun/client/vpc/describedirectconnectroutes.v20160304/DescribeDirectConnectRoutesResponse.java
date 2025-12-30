package ksyun.client.vpc.describedirectconnectroutes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDirectConnectRoutesResponse
* @Description DescribeDirectConnectRoutes 返回体
*/
@Data
@ToString
public class DescribeDirectConnectRoutesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**专线路由的信息*/
    @JsonProperty("DirectConnectRouteSet")
    private List<DirectConnectRouteSetDto> DirectConnectRouteSet;

    @Data
    @ToString
    public static class DirectConnectRouteSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**物理端口ID*/
        @JsonProperty("DirectConnectId")
        private String DirectConnectId;

        /**云企业网发布状态*/
        @JsonProperty("CenStatus")
        private String CenStatus;

        /**BGP的状态*/
        @JsonProperty("BgpStatus")
        private String BgpStatus;

        /**专线路由的ID*/
        @JsonProperty("DirectConnectRouteId")
        private String DirectConnectRouteId;

        /**目标网段*/
        @JsonProperty("DestinationCidrBlock")
        private String DestinationCidrBlock;

        /**路由模式*/
        @JsonProperty("RouteType")
        private String RouteType;

        /**路由的下一跳*/
        @JsonProperty("NextHopSet")
        private List<DirectConnectRouteSetNextHopSetDto> NextHopSet;

        @Data
        @ToString
        public static class DirectConnectRouteSetNextHopSetDto {
            /**下一跳实例的ID*/
            @JsonProperty("GatewayId")
            private String GatewayId;

            /**下一跳实例的名称*/
            @JsonProperty("GatewayName")
            private String GatewayName;

        }

    }

}
