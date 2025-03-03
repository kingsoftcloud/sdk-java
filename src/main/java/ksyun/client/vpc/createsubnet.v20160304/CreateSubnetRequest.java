package ksyun.client.vpc.createsubnet.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateSubnetRequest
 * @Description 请求参数
 */
@Data
public class CreateSubnetRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 子网的名称
     */
    @KsYunField(name = "SubnetName")
    private String SubnetName;

    /**
     * 子网的网络范围，例如：10.0.0.0/24
     */
    @KsYunField(name = "CidrBlock")
    private String CidrBlock;

    /**
     * 是否支持IPv6网段，目前只支持部分机房
     */
    @KsYunField(name = "ProvidedIpv6CidrBlock")
    private Boolean ProvidedIpv6CidrBlock;

    /**
     * 子网的类型，终端子网（Reserve）、云服务器子网（Normal）、裸金属服务器子网（Physical）
     */
    @KsYunField(name = "SubnetType")
    private String SubnetType;

    /**
     * DHCP起始IP
     */
    @KsYunField(name = "DhcpIpFrom")
    private String DhcpIpFrom;

    /**
     * DHCP结束IP
     */
    @KsYunField(name = "DhcpIpTo")
    private String DhcpIpTo;

    /**
     * 子网的Dns1
     */
    @KsYunField(name = "Dns1")
    private String Dns1;

    /**
     * 子网的Dns2
     */
    @KsYunField(name = "Dns2")
    private String Dns2;

    /**
     * 网关的IP，当SubnetType为Normal或Physical不能为空
     */
    @KsYunField(name = "GatewayIp")
    private String GatewayIp;

    /**
     * 当子网的网络范围在附加网段内，需要输入附加网段ID
     */
    @KsYunField(name = "SecondaryCidrId")
    private String SecondaryCidrId;

    /**
     * 可用区的名称，默认在可用区A创建，例如：cn-beijing-6a
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

}