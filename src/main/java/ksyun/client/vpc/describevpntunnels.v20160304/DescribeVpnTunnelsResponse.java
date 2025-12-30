package ksyun.client.vpc.describevpntunnels.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeVpnTunnelsResponse
* @Description DescribeVpnTunnels 返回体
*/
@Data
@ToString
public class DescribeVpnTunnelsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**Vpn通道的信息*/
    @JsonProperty("VpnTunnelSet")
    private List<VpnTunnelSetDto> VpnTunnelSet;

    @Data
    @ToString
    public static class VpnTunnelSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**开启健康检查,有效值：false（关闭）、true（开启）。仅VPN网关2.0且目的路由模式支持健康检查,缺省默认false*/
        @JsonProperty("OpenHealthCheck")
        private Boolean OpenHealthCheck;

        /**Vpn通道的状态*/
        @JsonProperty("State")
        private String State;

        /**Vpn通道的ID*/
        @JsonProperty("VpnTunnelId")
        private String VpnTunnelId;

        /**GRE模式VPN的IP*/
        @JsonProperty("VpnGreIp")
        private String VpnGreIp;

        /**客户网关的类型*/
        @JsonProperty("Type")
        private String Type;

        /**•高可用模式, active_active （负载） 、active_standby（主备）*/
        @JsonProperty("HaMode")
        private String HaMode;

        /**••IKE版本,v1，v2*/
        @JsonProperty("IkeVersion")
        private String IkeVersion;

        /**金山侧互联IP,路由模式为“目的路由”时必填*/
        @JsonProperty("LocalPeerIp")
        private String LocalPeerIp;

        /**•客户侧互联IP,路由模式为“目的路由”时必填*/
        @JsonProperty("CustomerPeerIp")
        private String CustomerPeerIp;

        /**GRE模式客户的IP*/
        @JsonProperty("CustomerGreIp")
        private String CustomerGreIp;

        /**GRE模式开启HA模式VPN的IP*/
        @JsonProperty("HaVpnGreIp")
        private String HaVpnGreIp;

        /**GRE模式开启HA模式客户的IP*/
        @JsonProperty("HaCustomerGreIp")
        private String HaCustomerGreIp;

        /**VPN网关的ID*/
        @JsonProperty("VpnGatewayId")
        private String VpnGatewayId;

        /**VPN网关的版本*/
        @JsonProperty("VpnGatewayVersion")
        private String VpnGatewayVersion;

        /**客户网关的ID*/
        @JsonProperty("CustomerGatewayId")
        private String CustomerGatewayId;

        /**预共享密钥。对称加密的KEY，VPN端和客户端统一，用户自行填写*/
        @JsonProperty("PreSharedKey")
        private String PreSharedKey;

        /**IKE认证算法*/
        @JsonProperty("IkeAuthenAlgorithm")
        private String IkeAuthenAlgorithm;

        /**密钥加密算法的类型*/
        @JsonProperty("IkeDHGroup")
        private String IkeDHGroup;

        /**IKE加密算法*/
        @JsonProperty("IkeEncryAlgorithm")
        private String IkeEncryAlgorithm;

        /**Ipsec认证算法*/
        @JsonProperty("IpsecAuthenAlgorithm")
        private String IpsecAuthenAlgorithm;

        /**Ipsec加密算法*/
        @JsonProperty("IpsecEncryAlgorithm")
        private String IpsecEncryAlgorithm;

        /**生存周期（S）*/
        @JsonProperty("IpsecLifetimeSecond")
        private Integer IpsecLifetimeSecond;

        /**生存周期（Kb）*/
        @JsonProperty("IpsecLifetimeTraffic")
        private Integer IpsecLifetimeTraffic;

        /**Vpn通道的名称*/
        @JsonProperty("VpnTunnelName")
        private String VpnTunnelName;

        /**vpn网关名*/
        @JsonProperty("VpnGwlName")
        private String VpnGwlName;

        /**额外的网段，用于VPN和对等连接后的VPC互通或者和云IDC互通*/
        @JsonProperty("ExtraCidrSet")
        private List<String> ExtraCidrSet;

        /**Nat的ID*/
        @JsonProperty("NatId")
        private String NatId;

        /**是否开启野蛮模式*/
        @JsonProperty("EnableNatTraversal")
        private Boolean EnableNatTraversal;

    }

}
