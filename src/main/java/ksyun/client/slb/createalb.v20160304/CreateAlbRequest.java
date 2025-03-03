package ksyun.client.slb.createalb.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAlbRequest
 * @Description 请求参数
 */
@Data
public class CreateAlbRequest {
    /**
     * 应用型负载均衡的名称
     */
    @KsYunField(name = "AlbName")
    private String AlbName;

    /**
     * 应用型负载均衡支持的版本
     */
    @KsYunField(name = "AlbVersion")
    private String AlbVersion;

    /**
     * 应用型负载均衡的类型，public 为公网负载均衡，internal 为内网负载均衡
     */
    @KsYunField(name = "AlbType")
    private String AlbType;

    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 负载均衡的IP版本
     */
    @KsYunField(name = "IpVersion")
    private String IpVersion;

    /**
     * 项目的ID
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 弹性IP的ID
     */
    @KsYunField(name = "AllocationId")
    private String AllocationId;

    /**
     * 计费类型(PrePaidByHourUsage，按小时用量实时付费（小时结))
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 子网id
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 私网ip
     */
    @KsYunField(name = "PrivateIpAddress")
    private String PrivateIpAddress;

    /**
     * 是否开启QUIC功能
     */
    @KsYunField(name = "EnabledQuic")
    private Boolean EnabledQuic;

    /**
     * 是否开启弹性伸缩
     */
    @KsYunField(name = "EnableHpa")
    private Boolean EnableHpa;

    /**
     * 是否开启删除保护
     */
    @KsYunField(name = "DeleteProtection")
    private Boolean DeleteProtection;

    /**
     * 是否开启修改保护
     */
    @KsYunField(name = "ModificationProtection")
    private Boolean ModificationProtection;

}