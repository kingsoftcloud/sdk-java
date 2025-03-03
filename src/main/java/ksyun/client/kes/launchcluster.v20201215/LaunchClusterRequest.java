package ksyun.client.kes.launchcluster.v20201215;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname LaunchClusterRequest
 * @Description 请求参数
 */
@Data
public class LaunchClusterRequest {
    /**
     * 集群名称（1-25个字符，支持数字、大小写字母、减号、下划线）
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * ES版本
     * 有效值：
     * <p>
     * 7.10.0
     * 7.4.2
     * 6.8.4
     * 5.6.16
     */
    @KsYunField(name = "MainVersion")
    private String MainVersion;

    /**
     * 场景化配置模板
     * 有效值:
     * General
     * Analysis
     * Log
     * Search
     */
    @KsYunField(name = "Scenario")
    private String Scenario;

    /**
     * 集群数据中心及可用区
     * 有效值：
     * cn-beijing-6a: 华北1（北京）,
     * cn-beijing-6b: 华北1（北京）,
     * cn-beijing-6c: 华北1（北京）,
     * cn-beijing-6d: 华北1（北京）,
     * cn-beijing-6e: 华北1（北京）,
     * cn-shanghai-2a: 华东1（上海）,
     * cn-shanghai-2b: 华东1（上海）,
     * cn-shanghai-3a: 华东2（上海),
     * cn-shanghai-3b: 华东2（上海),
     * cn-qingyangtest-1a: 华南1（广州）,
     * cn-qingyangtest-1b: 华南1（广州）,
     * ap-singapore-1a: 新加坡,
     * ap-singapore-1b: 新加坡,
     * eu-east-1a: 俄罗斯（莫斯科）,
     * eu-east-1b: 俄罗斯（莫斯科）,
     * cn-taipei-1a: 台北,
     * cn-beijing-fin-a: 华北金融1（北京）,
     * cn-northwest-1a: 西北1区（庆阳）,
     * cn-northwest-4a: 西北4区（海东）,
     * cn-northwest-3a: 西北3区（宁夏）,
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 计费方式
     * 有效值：
     * Monthly：包年包月
     * Minutely：按量付费
     * Daily：按量付费按日月结
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 包年包月购买时长,计费类型为Monthly时必填
     */
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;

    /**
     * 项目ID
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

    /**
     * 账号下同数据中心可用VPC网络ID
     */
    @KsYunField(name = "VpcDomainId")
    private String VpcDomainId;

    /**
     * 账号下同数据中心同可用区可用云服务器子网ID
     * 节点资源有KEC资源则必填
     */
    @KsYunField(name = "VpcSubnetId")
    private String VpcSubnetId;

    /**
     * 账号下同数据中心同可用区可用裸金属服务器子网ID
     * 节点资源有裸金属资源则必填
     */
    @KsYunField(name = "VpcEpcSubnetId")
    private String VpcEpcSubnetId;

    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 节点组信息
     */
    @KsYunField(name = "InstanceGroups", type = 2)
    private List<InstanceGroupsDto> InstanceGroupsList;

    @Data
    @ToString
    public static class InstanceGroupsDto {
        /**
         * 节点组类型：
         * MASTER（专有主节点）
         * DATA（数据节点）
         * COORDINATOR（协调节点）
         * WARM（冷数据节点）
         */
        private String InstanceGroupType;
        /**
         * 节点组ES套餐
         * 示例：
         * ES.S6.2C4G
         * EPC: CAL-ES.epc.32C256G
         * D4: D4.3B-ES.D4.4C4G
         */
        private String InstanceType;
        /**
         * 服务器类型：
         * KEC：云服务器
         * EPC：裸金属服务器
         */
        private String ResourceType;
        /**
         * 节点数量，有效值：1-255
         */
        private Integer InstanceCount;
        /**
         * 单节点实例个数，EPC不填默认1，非EPC无效
         */
        private Integer MultiInstanceCount;
        /**
         * 云物理机raid方式，若资源类型为EPC，需要选择物理机raid方式，KEC不需要
         * 有效值：
         * <p>
         * Raid0
         * Raid1
         * Raid5
         * Raid50
         * Raid10
         * SRaid0
         */
        private String RaidType;
        /**
         * 数据盘类型：
         * SSD3.0：云硬盘3.0(SSD)
         * Local_SSD: 本地SSD
         * ESSD_PL0: 极速云盘ESSD0
         * ESSD_PL1: 极速云盘ESSD1
         * ESSD_PL2: 极速云盘ESSD2
         * ESSD_PL3: 极速云盘ESSD4
         */
        private String VolumeType;
        /**
         * 云盘大小：
         * <p>
         * SSD3.0: 40-65536
         * Local_SSD: 50-65536
         * ESSD_PL0: 50-65536
         * ESSD_PL1: 50-65536
         * ESSD_PL2: 461-65536
         * ESSD_PL3: 1761-65536
         */
        private Integer VolumeSize;
        /**
         * 云盘数量: 1-8
         */
        private Integer VolumeCount;
        /**
         * 系统盘类型：
         * Local_SSD: 本地盘
         * SSD3.0: 云硬盘3.0（SSD）
         * EHDD: 高效云盘
         * ESSD_SYSTEM_PL0: ESSD云硬盘PL0（单盘性能上限IOPS：1.1万 吞吐量：180MB/s）
         * ESSD_SYSTEM_PL1: ESSD云硬盘PL1（单盘性能上限IOPS：5.5万 吞吐量：350MB/s）
         * ESSD_SYSTEM_PL2: ESSD云硬盘PL2（单盘性能上限IOPS：12万 吞吐量：1000MB/s）
         */
        private String SystemDiskType;
        /**
         * 系统盘大小:
         * <p>
         * Local_SSD
         * SSD3.0: 40-500
         * EHDD: 40-500
         * ESSD_SYSTEM_PL0: 50-500
         * ESSD_SYSTEM_PL1: 50-500
         * ESSD_SYSTEM_PL2: 461-500
         */
        private Integer SystemDiskSize;
    }

}