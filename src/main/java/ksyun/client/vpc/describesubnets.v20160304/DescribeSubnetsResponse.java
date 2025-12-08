package ksyun.client.vpc.describesubnets.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSubnetsResponse
* @Description DescribeSubnets 返回体
*/
@Data
@ToString
public class DescribeSubnetsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**子网的信息*/
    @JsonProperty("SubnetSet")
    private List<SubnetSetDto> SubnetSet;

    @Data
    @ToString
    public static class SubnetSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**子网的名称*/
        @JsonProperty("SubnetName")
        private String SubnetName;

        /**子网的网络范围*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**子网的类型，终端子网（Reserve）、云服务器子网（Normal）、裸金属服务器子网（Physical）*/
        @JsonProperty("SubnetType")
        private String SubnetType;

        /**DHCP起始IP*/
        @JsonProperty("DhcpIpFrom")
        private String DhcpIpFrom;

        /**DHCP结束IP*/
        @JsonProperty("DhcpIpTo")
        private String DhcpIpTo;

        /**子网的Dns1*/
        @JsonProperty("Dns1")
        private String Dns1;

        /**子网的Dns2*/
        @JsonProperty("Dns2")
        private String Dns2;

        /**网关的IP*/
        @JsonProperty("GatewayIp")
        private String GatewayIp;

        /**可用区的名称*/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /**是否支持IPV6网段*/
        @JsonProperty("ProvidedIpv6CidrBlock")
        private Boolean ProvidedIpv6CidrBlock;

        /**附加网段的ID*/
        @JsonProperty("SecondaryCidrId")
        private String SecondaryCidrId;

        /**子网可用IP个数*/
        @JsonProperty("AvailableIpNumber")
        private Integer AvailableIpNumber;

        /**绑定的ACL的ID*/
        @JsonProperty("NetworkAclId")
        private String NetworkAclId;

        /**绑定的NAT的ID*/
        @JsonProperty("NatId")
        private String NatId;

        /**绑定的路由表的ID*/
        @JsonProperty("RouteTableId")
        private String RouteTableId;

        /**子网 Ipv6的网络范围列表*/
        @JsonProperty("Ipv6CidrBlockAssociationSet")
        private List<SubnetSetDtoIpv6CidrBlockAssociationSetDto> Ipv6CidrBlockAssociationSet;

        @Data
        @ToString
        public static class SubnetSetDtoIpv6CidrBlockAssociationSetDto {
            /**子网 Ipv6的网络范围*/
            @JsonProperty("Ipv6CidrBlock")
            private String Ipv6CidrBlock;

        }

        /**裸金属子网是否支持公网访问，false: 禁止公网访问的子网，true:允许公网访问的子网，默认为true*/
        @JsonProperty("VisitInternet")
        private Boolean VisitInternet;

    }

}
