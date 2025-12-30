package ksyun.client.vpc.assignprivateipaddress.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AssignPrivateIpAddressResponse
* @Description AssignPrivateIpAddress 返回体
*/
@Data
@ToString
public class AssignPrivateIpAddressResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**网卡的信息*/
    @JsonProperty("NetworkInterface")
    private NetworkInterfaceDto NetworkInterface;

    @Data
    @ToString
    public static class NetworkInterfaceDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**Vpc的名称*/
        @JsonProperty("VpcName")
        private String VpcName;

        /**子网的名称*/
        @JsonProperty("SubnetName")
        private String SubnetName;

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**子网的网络范围*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**安全组的名称*/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

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
        @JsonProperty("DNS1")
        private String DNS1;

        /**子网的Dns2*/
        @JsonProperty("DNS2")
        private String DNS2;

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

        /**私网IP列表*/
        @JsonProperty("AssignedPrivateIpAddressSet")
        private List<NetworkInterfaceAssignedPrivateIpAddressSetDto> AssignedPrivateIpAddressSet;

        @Data
        @ToString
        public static class NetworkInterfaceAssignedPrivateIpAddressSetDto {
            /**私网IP地址*/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

        }

        /**安全组列表*/
        @JsonProperty("SecurityGroupSet")
        private List<NetworkInterfaceSecurityGroupSetDto> SecurityGroupSet;

        @Data
        @ToString
        public static class NetworkInterfaceSecurityGroupSetDto {
            /**安全组ID*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**安全组名称*/
            @JsonProperty("SecurityGroupName")
            private String SecurityGroupName;

        }

        /**Ipv6地址列表*/
        @JsonProperty("Ipv6PublicIpAddressSet")
        private List<NetworkInterfaceIpv6PublicIpAddressSetDto> Ipv6PublicIpAddressSet;

        @Data
        @ToString
        public static class NetworkInterfaceIpv6PublicIpAddressSetDto {
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

        /**网卡的名称*/
        @JsonProperty("NetworkInterfaceName")
        private String NetworkInterfaceName;

        /**是否开通Ipv6*/
        @JsonProperty("Ipv6Public")
        private Boolean Ipv6Public;

        /**Ipv6地址*/
        @JsonProperty("Ipv6Address")
        private String Ipv6Address;

        /**状态*/
        @JsonProperty("State")
        private String State;

    }

}
