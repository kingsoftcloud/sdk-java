package ksyun.client.vpc.modifydirectconnectinterface.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDirectConnectInterfaceResponse
* @Description ModifyDirectConnectInterface 返回体
*/
@Data
@ToString
public class ModifyDirectConnectInterfaceResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**连接通道的信息*/
    @JsonProperty("DirectConnectInterface")
    private DirectConnectInterfaceDto DirectConnectInterface;

    @Data
    @ToString
    public static class DirectConnectInterfaceDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**连接通道的ID*/
        @JsonProperty("DirectConnectInterfaceId")
        private String DirectConnectInterfaceId;

        /**连接通道的名称*/
        @JsonProperty("DirectConnectInterfaceName")
        private String DirectConnectInterfaceName;

        /**物理端口ID*/
        @JsonProperty("DirectConnectId")
        private String DirectConnectId;

        /**Ha物理专线的ID*/
        @JsonProperty("HaDirectConnectId")
        private String HaDirectConnectId;

        /**Ha连接通道的名称*/
        @JsonProperty("HaDirectConnectInterfaceName")
        private String HaDirectConnectInterfaceName;

        /**Ha连接通道的ID*/
        @JsonProperty("HaDirectConnectInterfaceId")
        private String HaDirectConnectInterfaceId;

        /**物理端口所属的用户ID*/
        @JsonProperty("AccountId")
        private String AccountId;

        /**连接通道所属的用户ID*/
        @JsonProperty("DirectConnectInterfaceAccountId")
        private String DirectConnectInterfaceAccountId;

        /**客户侧IPv4互联IP*/
        @JsonProperty("CustomerPeerIp")
        private String CustomerPeerIp;

        /**金山云侧IPv4互联IP*/
        @JsonProperty("LocalPeerIp")
        private String LocalPeerIp;

        /**Ha客户侧IPv4互联IP*/
        @JsonProperty("HaCustomerPeerIp")
        private String HaCustomerPeerIp;

        /**Ha金山云侧IPv4互联IP*/
        @JsonProperty("HaLocalPeerIp")
        private String HaLocalPeerIp;

        /**物理专线vlan id*/
        @JsonProperty("VlanId")
        private Integer VlanId;

        /**HA连接通道虚拟口的ID*/
        @JsonProperty("HaVlanId")
        private Integer HaVlanId;

        /**连接通道的状态*/
        @JsonProperty("State")
        private String State;

        /**路由模式*/
        @JsonProperty("RouteType")
        private String RouteType;

        /**用户侧BGP ASN*/
        @JsonProperty("BgpPeer")
        private String BgpPeer;

        /**可靠性方法*/
        @JsonProperty("ReliabilityMethod")
        private String ReliabilityMethod;

        /**BFD配置ID*/
        @JsonProperty("BfdConfigId")
        private String BfdConfigId;

        /**优先级*/
        @JsonProperty("Priority")
        private Integer Priority;

        /**BGP 秘钥*/
        @JsonProperty("BgpClientToken")
        private String BgpClientToken;

        /**是否开启Ipv6*/
        @JsonProperty("EnableIpv6")
        private Boolean EnableIpv6;

        /**客户侧ipv6互联IP*/
        @JsonProperty("CustomerPeerIpv6")
        private String CustomerPeerIpv6;

        /**金山云侧ipv6互联IP*/
        @JsonProperty("LocalPeerIpv6")
        private String LocalPeerIpv6;

    }

}
