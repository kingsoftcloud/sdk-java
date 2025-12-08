package ksyun.client.vpc.createvpntunnel.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateVpnTunnelRequest
* @Description 请求参数
*/
@Data
public class CreateVpnTunnelRequest{
    /**客户网关的ID*/
    @KsYunField(name="CustomerGatewayId")
    private String CustomerGatewayId;

    /**VPN网关的ID*/
    @KsYunField(name="VpnGatewayId")
    private String VpnGatewayId;

    /**Vpn通道的名称*/
    @KsYunField(name="VpnTunnelName")
    private String VpnTunnelName;

    /**Ipsec认证算法*/
    @KsYunField(name="IpsecAuthenAlgorithm")
    private String IpsecAuthenAlgorithm;

    /**Ipsec加密算法*/
    @KsYunField(name="IpsecEncryAlgorithm")
    private String IpsecEncryAlgorithm;

    /**IKE认证算法(md5|sha)*/
    @KsYunField(name="IkeAuthenAlgorithm")
    private String IkeAuthenAlgorithm;

    /**IKE加密算法*/
    @KsYunField(name="IkeEncryAlgorithm")
    private String IkeEncryAlgorithm;

    /**客户网关的类型(GreOverIpsec|Ipsec|route_ipsec|ipsec)*/
    @KsYunField(name="Type")
    private String Type;

    /**开启健康检查*/
    @KsYunField(name="OpenHealthCheck")
    private Boolean OpenHealthCheck;

    /**预共享密钥。对称加密的KEY，VPN端和客户端统一，用户自行填写*/
    @KsYunField(name="PreSharedKey")
    private String PreSharedKey;

    /**生存周期（S）*/
    @KsYunField(name="IpsecLifetimeSecond")
    private Integer IpsecLifetimeSecond;

    /**生存周期（Kb）*/
    @KsYunField(name="IpsecLifetimeTraffic")
    private Integer IpsecLifetimeTraffic;

    /**密钥加密算法的类型(1|2|5|14|24)*/
    @KsYunField(name="IkeDHGroup")
    private String IkeDHGroup;

    /**是否开启野蛮模式*/
    @KsYunField(name="EnableNatTraversal")
    private Boolean EnableNatTraversal;

    /**GRE模式VPN的IP*/
    @KsYunField(name="VpnGreIp")
    private String VpnGreIp;

    /**GRE模式开启HA模式VPN的IP*/
    @KsYunField(name="HaVpnGreIp")
    private String HaVpnGreIp;

    /**GRE模式客户的IP*/
    @KsYunField(name="CustomerGreIp")
    private String CustomerGreIp;

    /**GRE模式开启HA模式客户的IP*/
    @KsYunField(name="HaCustomerGreIp")
    private String HaCustomerGreIp;

    /**•高可用模式, active_active （负载） 、active_standby（主备）*/
    @KsYunField(name="HaMode")
    private String HaMode;

    /**金山侧互联IP*/
    @KsYunField(name="LocalPeerIp")
    private String LocalPeerIp;

    /**•客户侧互联IP*/
    @KsYunField(name="CustomerPeerIp")
    private String CustomerPeerIp;

    /**••IKE版本*/
    @KsYunField(name="IkeVersion")
    private String IkeVersion;

}
