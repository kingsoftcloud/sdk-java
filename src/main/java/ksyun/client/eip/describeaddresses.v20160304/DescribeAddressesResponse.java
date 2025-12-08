package ksyun.client.eip.describeaddresses.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAddressesResponse
* @Description DescribeAddresses 返回体
*/
@Data
@ToString
public class DescribeAddressesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**弹性IP的信息*/
    @JsonProperty("AddressesSet")
    private List<AddressesSetDto> AddressesSet;

    @Data
    @ToString
    public static class AddressesSetDto {
        /**线路ID*/
        @JsonProperty("LineId")
        private String LineId;

        /**弹性IP的带宽*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**弹性IP的状态，已绑定(associate)，未绑定(disassociate)*/
        @JsonProperty("State")
        private String State;

        /**弹性IP生效状态*/
        @JsonProperty("IpState")
        private String IpState;

        /**弹性IP的ID*/
        @JsonProperty("AllocationId")
        private String AllocationId;

        /**互联网网关的ID*/
        @JsonProperty("InternetGatewayId")
        private String InternetGatewayId;

        /**IP地址*/
        @JsonProperty("PublicIp")
        private String PublicIp;

        /**绑定类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**绑定实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**网卡ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /**网卡类型*/
        @JsonProperty("NetworkInterfaceType")
        private String NetworkInterfaceType;

        /**私网IP地址*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**共享带宽ID*/
        @JsonProperty("BandWidthShareId")
        private String BandWidthShareId;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**模式*/
        @JsonProperty("Mode")
        private String Mode;

        /**Nat的计费类型*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**网卡类型*/
        @JsonProperty("HostType")
        private String HostType;

        /**资源所绑定的标签信息,仅查询接口且存在标签筛选条件或者IsContainTag为True时才会返回此值(会影响接口速度)*/
        @JsonProperty("TagSet")
        private List<TagSetDto> TagSet;

        @Data
        @ToString
        public static class TagSetDto {
            /**资源ID*/
            @JsonProperty("ResourceUuid")
            private String ResourceUuid;

            /**标签ID*/
            @JsonProperty("TagId")
            private String TagId;

            /**标签建*/
            @JsonProperty("TagKey")
            private String TagKey;

            /**标签值*/
            @JsonProperty("TagValue")
            private String TagValue;

        }

    }

}
