package ksyun.client.vpc.describenatratelimit.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNatRateLimitResponse
* @Description DescribeNatRateLimit 返回体
*/
@Data
@ToString
public class DescribeNatRateLimitResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**Nat关联的网卡信息*/
    @JsonProperty("NatNetworkInterfaceSet")
    private List<NatNetworkInterfaceSetDto> NatNetworkInterfaceSet;

    @Data
    @ToString
    public static class NatNetworkInterfaceSetDto {
        /**网卡ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /**出带宽限速*/
        @JsonProperty("BandwidthLimit")
        private Integer BandwidthLimit;

        /**入带宽限速*/
        @JsonProperty("InBandwidthLimit")
        private Integer InBandwidthLimit;

        /**网关限速规则ID*/
        @JsonProperty("NatRateLimitId")
        private String NatRateLimitId;

        /**网卡名称*/
        @JsonProperty("NetworkInterfaceName")
        private String NetworkInterfaceName;

        /**网卡类型*/
        @JsonProperty("NetworkInterfaceType")
        private String NetworkInterfaceType;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例私网IP*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

    }

}
