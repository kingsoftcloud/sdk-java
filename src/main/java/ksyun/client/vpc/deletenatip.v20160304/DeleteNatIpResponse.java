package ksyun.client.vpc.deletenatip.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteNatIpResponse
* @Description DeleteNatIp 返回体
*/
@Data
@ToString
public class DeleteNatIpResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**Vpc的ID*/
    @JsonProperty("VpcId")
    private String VpcId;

    /**Nat的ID*/
    @JsonProperty("NatId")
    private String NatId;

    /**Nat的名称*/
    @JsonProperty("NatName")
    private String NatName;

    /**Nat的作用范围，VPC(Vpc)是指NAT对整个VPC有效，子网(subnet)是指NAT对关联的子网有效*/
    @JsonProperty("NatMode")
    private String NatMode;

    /**Nat的类型*/
    @JsonProperty("NatType")
    private String NatType;

    /**Nat的IP数量*/
    @JsonProperty("NatIpNumber")
    private Integer NatIpNumber;

    /**Nat的带宽*/
    @JsonProperty("BandWidth")
    private Integer BandWidth;

    /**项目的ID*/
    @JsonProperty("ProjectId")
    private String ProjectId;

    /**Nat的计费类型*/
    @JsonProperty("ChargeType")
    private String ChargeType;

    /**服务结束时间*/
    @JsonProperty("ServiceEndTime")
    private String ServiceEndTime;

    /**Nat Ip的信息*/
    @JsonProperty("NatIpSet")
    private List<NatIpSetDto> NatIpSet;

    @Data
    @ToString
    public static class NatIpSetDto {
        /**Nat的Ip地址*/
        @JsonProperty("NatIp")
        private String NatIp;

        /**Nat Ip的ID*/
        @JsonProperty("NatIpId")
        private String NatIpId;

        /**Nat Ip的启用状态*/
        @JsonProperty("Enabled")
        private Boolean Enabled;

    }

    /**关联的专线网关信息*/
    @JsonProperty("AssociateDirectConnectGatewaySet")
    private List<AssociateDirectConnectGatewaySetDto> AssociateDirectConnectGatewaySet;

    @Data
    @ToString
    public static class AssociateDirectConnectGatewaySetDto {
        /**专线网关的ID*/
        @JsonProperty("DirectConnectGatewayId")
        private String DirectConnectGatewayId;

    }

    /**关联的Vpn信息*/
    @JsonProperty("AssociateVpnGatewaySet")
    private List<AssociateVpnGatewaySetDto> AssociateVpnGatewaySet;

    @Data
    @ToString
    public static class AssociateVpnGatewaySetDto {
        /**Vpn的ID*/
        @JsonProperty("VpnGatewayId")
        private String VpnGatewayId;

    }

    /**关联的实例信息*/
    @JsonProperty("AssociateInstanceSet")
    private List<AssociateInstanceSetDto> AssociateInstanceSet;

    @Data
    @ToString
    public static class AssociateInstanceSetDto {
        /**私网Ip地址*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**弹性网卡的ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

    }

    /**关联的子网信息*/
    @JsonProperty("AssociateNatSet")
    private List<AssociateNatSetDto> AssociateNatSet;

    @Data
    @ToString
    public static class AssociateNatSetDto {
        /**子网的ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

    }

    /**Dnat的信息*/
    @JsonProperty("DnatSet")
    private List<DnatSetDto> DnatSet;

    @Data
    @ToString
    public static class DnatSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Dnat的ID*/
        @JsonProperty("DnatId")
        private String DnatId;

        /**Nat的ID*/
        @JsonProperty("NatId")
        private String NatId;

        /**Dnat的名称*/
        @JsonProperty("DnatName")
        private String DnatName;

        /**协议类型*/
        @JsonProperty("IpProtocol")
        private String IpProtocol;

        /**Nat的IP*/
        @JsonProperty("NatIp")
        private String NatIp;

        /**公网端口*/
        @JsonProperty("PublicPort")
        private String PublicPort;

        /**服务器私网IP*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**服务器端口*/
        @JsonProperty("PrivatePort")
        private String PrivatePort;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**生效状态*/
        @JsonProperty("Enabled")
        private Boolean Enabled;

    }

}
