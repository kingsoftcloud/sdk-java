package ksyun.client.vpc.createdirectconnectgatewayroute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDirectConnectGatewayRouteResponse
* @Description CreateDirectConnectGatewayRoute 返回体
*/
@Data
@ToString
public class CreateDirectConnectGatewayRouteResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**边界网关路由的信息*/
    @JsonProperty("DirectConnectGatewayRoute")
    private DirectConnectGatewayRouteDto DirectConnectGatewayRoute;

    @Data
    @ToString
    public static class DirectConnectGatewayRouteDto {
        /**边界网关路由ID*/
        @JsonProperty("DirectConnectGatewayRouteId")
        private String DirectConnectGatewayRouteId;

        /**目标网段*/
        @JsonProperty("DestinationCidrBlock")
        private String DestinationCidrBlock;

        /**路由下一跳*/
        @JsonProperty("NextHopInstance")
        private String NextHopInstance;

        /**路由下一跳名称*/
        @JsonProperty("NextHopInstanceName")
        private String NextHopInstanceName;

        /**路由下一跳类型*/
        @JsonProperty("NextHopType")
        private String NextHopType;

        /**优先级*/
        @JsonProperty("Priority")
        private Integer Priority;

        /**As-path*/
        @JsonProperty("AsPath")
        private Integer AsPath;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**物理端口ID*/
        @JsonProperty("DirectConnectId")
        private String DirectConnectId;

        /**BGP的状态*/
        @JsonProperty("BgpStatus")
        private String BgpStatus;

        /**路由类型*/
        @JsonProperty("RouteType")
        private String RouteType;

    }

}
