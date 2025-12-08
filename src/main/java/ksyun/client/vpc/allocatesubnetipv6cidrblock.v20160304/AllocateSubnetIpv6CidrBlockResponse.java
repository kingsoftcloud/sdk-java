package ksyun.client.vpc.allocatesubnetipv6cidrblock.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AllocateSubnetIpv6CidrBlockResponse
* @Description AllocateSubnetIpv6CidrBlock 返回体
*/
@Data
@ToString
public class AllocateSubnetIpv6CidrBlockResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**子网信息*/
    @JsonProperty("Subnet")
    private SubnetDto Subnet;

    @Data
    @ToString
    public static class SubnetDto {
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
        private List<Ipv6CidrBlockAssociationSetDto> Ipv6CidrBlockAssociationSet;

        @Data
        @ToString
        public static class Ipv6CidrBlockAssociationSetDto {
            /**子网 Ipv6的网络范围*/
            @JsonProperty("Ipv6CidrBlock")
            private String Ipv6CidrBlock;

        }

    }

}
