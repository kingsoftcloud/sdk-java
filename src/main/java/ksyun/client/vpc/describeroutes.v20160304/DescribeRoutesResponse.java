package ksyun.client.vpc.describeroutes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRoutesResponse
* @Description DescribeRoutes 返回体
*/
@Data
@ToString
public class DescribeRoutesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**路由列表信息*/
    @JsonProperty("RouteSet")
    private List<RouteSetDto> RouteSet;

    @Data
    @ToString
    public static class RouteSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**目标网段*/
        @JsonProperty("DestinationCidrBlock")
        private String DestinationCidrBlock;

        /**路由的ID*/
        @JsonProperty("RouteId")
        private String RouteId;

        /**下一跳类型*/
        @JsonProperty("RouteType")
        private String RouteType;

        /**路由状态*/
        @JsonProperty("Status")
        private String Status;

        /**是否是系统路由*/
        @JsonProperty("System")
        private Boolean System;

        /**路由发布到云企业网状态*/
        @JsonProperty("RoutePublishStatus")
        private String RoutePublishStatus;

        /**路由的描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**路由表ID*/
        @JsonProperty("RouteTableId")
        private String RouteTableId;

        /**类型*/
        @JsonProperty("RouteEntryType")
        private String RouteEntryType;

        /**路由的下一跳*/
        @JsonProperty("NextHopSet")
        private List<RouteSetDtoNextHopSetDto> NextHopSet;

        @Data
        @ToString
        public static class RouteSetDtoNextHopSetDto {
            /**下一跳实例的ID*/
            @JsonProperty("GatewayId")
            private String GatewayId;

            /**下一跳实例的名称*/
            @JsonProperty("GatewayName")
            private String GatewayName;

            /**网卡ID*/
            @JsonProperty("NetworkInterfaceId")
            private String NetworkInterfaceId;

            /**Mac地址*/
            @JsonProperty("Mac")
            private String Mac;

        }

    }

}
