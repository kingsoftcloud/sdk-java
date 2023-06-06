package ksyun.client.vpc.createdirectconnectinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDirectConnectInterfaceRequest
* @Description 请求参数
*/
@Data
public class CreateDirectConnectInterfaceRequest{
    /**物理端口ID*/
    @KsYunField(name="DirectConnectId")
    private String DirectConnectId;

    /**物理专线vlan id*/
    @KsYunField(name="VlanId")
    private Integer VlanId;

    /**路由模式*/
    @KsYunField(name="RouteType")
    private String RouteType;

    /**连接通道的名称*/
    @KsYunField(name="DirectConnectInterfaceName")
    private String DirectConnectInterfaceName;

    /**连接通道所属的用户ID*/
    @KsYunField(name="DirectConnectInterfaceAccountId")
    private String DirectConnectInterfaceAccountId;

    /**客户侧IPv4互联IP*/
    @KsYunField(name="CustomerPeerIp")
    private String CustomerPeerIp;

    /**金山云侧IPv4互联IP*/
    @KsYunField(name="LocalPeerIp")
    private String LocalPeerIp;

    /**Ha物理专线的ID*/
    @KsYunField(name="HaDirectConnectId")
    private String HaDirectConnectId;

    /**Ha客户侧IPv4互联IP*/
    @KsYunField(name="HaCustomerPeerIp")
    private String HaCustomerPeerIp;

    /**Ha金山云侧IPv4互联IP*/
    @KsYunField(name="HaLocalPeerIp")
    private String HaLocalPeerIp;

    /**用户侧BGP ASN*/
    @KsYunField(name="BgpPeer")
    private String BgpPeer;

    /**可靠性方法*/
    @KsYunField(name="ReliabilityMethod")
    private String ReliabilityMethod;

    /**BFD配置ID*/
    @KsYunField(name="BfdConfigId")
    private String BfdConfigId;

    /**BGP 秘钥*/
    @KsYunField(name="BgpClientToken")
    private String BgpClientToken;


}