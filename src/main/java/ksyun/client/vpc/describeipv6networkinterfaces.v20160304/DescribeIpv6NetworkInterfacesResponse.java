package ksyun.client.vpc.describeipv6networkinterfaces.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeIpv6NetworkInterfacesResponse
* @Description DescribeIpv6NetworkInterfaces 返回体
*/
@Data
@ToString
public class DescribeIpv6NetworkInterfacesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**网卡的信息*/
    @JsonProperty("NetworkInterfaceSet")
    private List<NetworkInterfaceSetDto> NetworkInterfaceSet;

    @Data
    @ToString
    public static class NetworkInterfaceSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**子网的网络范围*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**安全组的ID*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例私网IP*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**子网的Dns1*/
        @JsonProperty("Dns1")
        private String Dns1;

        /**子网的Dns2*/
        @JsonProperty("Dns2")
        private String Dns2;

        /**网卡类型*/
        @JsonProperty("NetworkInterfaceType")
        private String NetworkInterfaceType;

        /**Mac地址*/
        @JsonProperty("MacAddress")
        private String MacAddress;

        /**网卡ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /**可用区名称*/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /**Ipv6地址列表*/
        @JsonProperty("Ipv6PublicIpAddressSet")
        private List<Ipv6PublicIpAddressSetDto> Ipv6PublicIpAddressSet;

        @Data
        @ToString
        public static class Ipv6PublicIpAddressSetDto {
            /**Ipv6地址*/
            @JsonProperty("Ipv6PublicIpAddress")
            private String Ipv6PublicIpAddress;

            /**Ipv6地址ID*/
            @JsonProperty("Ipv6PublicIpAddressId")
            private String Ipv6PublicIpAddressId;

            /**创建时间*/
            @JsonProperty("Ipv6PublicIpCreateTime")
            private String Ipv6PublicIpCreateTime;

            /**带宽*/
            @JsonProperty("BandWidth")
            private Integer BandWidth;

        }

        /**是否开通Ipv6*/
        @JsonProperty("Ipv6Public")
        private Boolean Ipv6Public;

    }

}
