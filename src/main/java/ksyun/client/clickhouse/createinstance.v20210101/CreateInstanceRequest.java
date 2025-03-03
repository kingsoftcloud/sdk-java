package ksyun.client.clickhouse.createinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateInstanceRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceRequest {
    /**
     * 商品类型。可选：ClickHouse_Single（单副本）；ClickHouse（高可用）。
     */
    @KsYunField(name = "ProductType")
    private String ProductType;

    /**
     * 实例名称。
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /**
     * 实例套餐code。如：bd_ck_0，single_ck_0等。
     */
    @KsYunField(name = "InstanceType")
    private String InstanceType;

    /**
     * 管理员名称,默认admin。
     */
    @KsYunField(name = "AdminUser")
    private String AdminUser;

    /**
     * 管理员密码。
     */
    @KsYunField(name = "AdminPassword")
    private String AdminPassword;

    /**
     * VPC网络ID。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网ID。
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 实例内核类型，默认：clickhouse。
     */
    @KsYunField(name = "Engine")
    private String Engine;

    /**
     * 实例内核版本号。	可选"21.8"，"22.8"。
     */
    @KsYunField(name = "EngineVersion")
    private String EngineVersion;

    /**
     * 项目ID。
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 计费类型。87 按量计费
     */
    @KsYunField(name = "BillType")
    private Integer BillType;

    /**
     * 计费区间(供包年包月计费方式使用),默认1。
     */
    @KsYunField(name = "Duration")
    private Integer Duration;

    /**
     * 存储大小，单位：GB。
     */
    @KsYunField(name = "EbsSize")
    private Integer EbsSize;

    /**
     * 存储类型。可选：CloudDisk，LocalDisk默认：CloudDisk。
     */
    @KsYunField(name = "EbsType")
    private String EbsType;

    /**
     * 内存大小，单位：GB。需要同实例套餐中一致。
     */
    @KsYunField(name = "Mem")
    private Integer Mem;

    /**
     * cpu核数。需要同实例套餐中一致。
     */
    @KsYunField(name = "Cpu")
    private Integer Cpu;

    /**
     * 实例tcp端口，默认：9000。
     */
    @KsYunField(name = "TcpPort")
    private Integer TcpPort;

    /**
     * 实例http端口，默认：8123。
     */
    @KsYunField(name = "HttpPort")
    private Integer HttpPort;

    /**
     * 可用区。
     */
    @KsYunField(name = "Az")
    private String Az;

    /**
     * 实例节点数量，默认3。
     */
    @KsYunField(name = "NodeNum")
    private Integer NodeNum;

    /**
     * 备份时段选择。格式：HH:mm-HH:mm。
     */
    @KsYunField(name = "PreferredBackupTime")
    private String PreferredBackupTime;

    /**
     * 安全组ID，如果绑定安全组，需要添加。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;


}