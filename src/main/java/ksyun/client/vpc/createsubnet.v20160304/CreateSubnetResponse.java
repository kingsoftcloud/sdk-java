package ksyun.client.vpc.createsubnet.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSubnetResponse
* @Description CreateSubnet 返回体
*/
@Data
@ToString
public class CreateSubnetResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**子网信息*/
    @JsonProperty("Subnet")
    private SubnetDto Subnet;

    @Data
    @ToString
    public static class SubnetDto {
        /**绑定的路由表的ID*/
        @JsonProperty("RouteTableId")
        private String RouteTableId;

        /**绑定的ACL的ID*/
        @JsonProperty("NetworkAclId")
        private String NetworkAclId;

        /**绑定的NAT的ID*/
        @JsonProperty("NatId")
        private String NatId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**DHCP结束IP*/
        @JsonProperty("DhcpIpTo")
        private String DhcpIpTo;

        /**子网的Dns1*/
        @JsonProperty("Dns1")
        private String Dns1;

        /**子网的网络范围*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**子网的Dns2*/
        @JsonProperty("Dns2")
        private String Dns2;

        /**是否支持IPV6网段*/
        @JsonProperty("ProvidedIpv6CidrBlock")
        private Boolean ProvidedIpv6CidrBlock;

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**子网的类型，终端子网（Reserve）、云服务器子网（Normal）、裸金属服务器子网（Physical）*/
        @JsonProperty("SubnetType")
        private String SubnetType;

        /**子网的名称*/
        @JsonProperty("SubnetName")
        private String SubnetName;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**裸金属子网是否支持公网访问，false：禁止公网访问的子网，true：允许公网访问的子网，默认为true*/
        @JsonProperty("VisitInternet")
        private Boolean VisitInternet;

        /**网关的IP*/
        @JsonProperty("GatewayIp")
        private String GatewayIp;

        /**可用区的名称*/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /**DHCP起始IP*/
        @JsonProperty("DhcpIpFrom")
        private String DhcpIpFrom;

        /**子网Ipv6的网络范围列表*/
        @JsonProperty("Ipv6CidrBlockAssociationSet")
        private List<SubnetIpv6CidrBlockAssociationSetDto> Ipv6CidrBlockAssociationSet;

        @Data
        @ToString
        public static class SubnetIpv6CidrBlockAssociationSetDto {
            /**子网Ipv6的网络范围*/
            @JsonProperty("Ipv6CidrBlock")
            private String Ipv6CidrBlock;

        }

        /**附加网段的ID*/
        @JsonProperty("SecondaryCidrId")
        private String SecondaryCidrId;

    }

}
