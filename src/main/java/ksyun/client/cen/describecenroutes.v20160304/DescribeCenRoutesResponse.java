package ksyun.client.cen.describecenroutes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCenRoutesResponse
* @Description DescribeCenRoutes 返回体
*/
@Data
@ToString
public class DescribeCenRoutesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**云企业网路由的信息*/
    @JsonProperty("CenRouteSet")
    private List<CenRouteSetDto> CenRouteSet;

    @Data
    @ToString
    public static class CenRouteSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**云企业网路由的ID*/
        @JsonProperty("CenRouteId")
        private String CenRouteId;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**目标网段*/
        @JsonProperty("DestinationCidrBlock")
        private String DestinationCidrBlock;

        /**目的网段所属网络实例ID*/
        @JsonProperty("NetworkInstanceId")
        private String NetworkInstanceId;

        /**目的网段所属网络实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**目的网段所属网络实例的地域*/
        @JsonProperty("InstanceRegion")
        private String InstanceRegion;

        /**网络实例所属账号ID*/
        @JsonProperty("InstanceAccountId")
        private String InstanceAccountId;

        /**网络实例发布的实例网段路由ID*/
        @JsonProperty("NetworkRouteId")
        private String NetworkRouteId;

        /**网络实例发布的自定义网段路由ID*/
        @JsonProperty("SelfRouteId")
        private String SelfRouteId;

        /**网络实例的路由类型*/
        @JsonProperty("InstanceRouteType")
        private String InstanceRouteType;

    }

}
