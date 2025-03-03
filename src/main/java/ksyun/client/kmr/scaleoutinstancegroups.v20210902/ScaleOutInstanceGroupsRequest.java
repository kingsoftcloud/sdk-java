package ksyun.client.kmr.scaleoutinstancegroups.v20210902;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ScaleOutInstanceGroupsRequest
 * @Description 请求参数
 */
@Data
public class ScaleOutInstanceGroupsRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 节点组信息
     */
    @KsYunField(name = "InstanceGroups", type = 2)
    private List<InstanceGroupsDto> InstanceGroupsList;
    /**
     * 项目 ID，参考「项目管理」
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

    @Data
    @ToString
    public static class InstanceGroupsDto {
        /**
         * 节点组类型:
         * - Hadoop: MASTER、CORE 、TASK、GATEWAY、COMMON
         * - Kafka: BROKER
         * - Zookeeper: MASTER、CORE
         * - RocketMQ: MASTER、CORE
         */
        private String InstanceGroupType;
        /**
         * 节点组KMR套餐
         * 示例：
         * - KMR.I3.2C4G
         */
        private String InstanceType;
        /**
         * 服务器类型（扩容新节点组时必传）：
         * - KEC：云服务器
         * - EPC：裸金属服务器
         */
        private String ResourceType;
        /**
         * 节点数量，有效值：1-255
         */
        private Integer InstanceCount;
        /**
         * 云物理机raid方式，若资源类型为EPC，需要选择物理机raid方式，KEC不需要
         * 有效值：
         * - Raid0
         * - Raid1
         * - Raid5
         * - Raid50
         * - Raid10
         * - SRaid0
         */
        private String RaidType;
        /**
         * 数据盘类型（扩容新节点组时必传）：
         * - SSD3.0: 本地SSD
         * - Local_SSD: 云硬盘3.0(SSD)
         * - ESSD_PL0: 极速云盘ESSD0
         * - ESSD_PL1: 极速云盘ESSD1
         * - ESSD_PL2: 极速云盘ESSD2
         * - ESSD_PL3: 极速云盘ESSD4
         */
        private String VolumeType;
        /**
         * 云盘大小（扩容新节点组时必传）：
         * - SSD3.0: 40-65536
         * - Local_SSD: 50-65536
         * - ESSD_PL0: 50-65536
         * - ESSD_PL1: 50-65536
         * - ESSD_PL2: 461-65536
         * - ESSD_PL3: 1761-65536
         */
        private Integer VolumeSize;
        /**
         * 云盘数量（扩容新节点组时必传）: 1-8
         */
        private Integer VolumeCount;
        /**
         * 系统盘类型（扩容新节点组时必传）：
         * - Local_SSD: 本地盘
         * - SSD3.0: 云硬盘3.0（SSD）
         * - EHDD: 高效云盘
         * - ESSD_SYSTEM_PL0: ESSD云硬盘PL0（单盘性能上限IOPS：1.1万 吞吐量：180MB/s）
         * - ESSD_SYSTEM_PL1: ESSD云硬盘PL1（单盘性能上限IOPS：5.5万 吞吐量：350MB/s）
         * - ESSD_SYSTEM_PL2: ESSD云硬盘PL2（单盘性能上限IOPS：12万 吞吐量：1000MB/s）
         */
        private String SystemDiskType;
        /**
         * 系统盘大小（扩容新节点组时必传）:
         * - Local_SSD
         * - SSD3.0: 40-500
         * - EHDD: 40-500
         * - ESSD_SYSTEM_PL0: 50-500
         * - ESSD_SYSTEM_PL1: 50-500
         * - ESSD_SYSTEM_PL2: 461-500
         */
        private Integer SystemDiskSize;
        /**
         * 可用区：
         * -  'cn-beijing-6a': '华北1（北京）可用区A',
         * -  'cn-beijing-6b': '华北1（北京）可用区B',
         * -  'cn-beijing-6c': '华北1（北京）可用区C',
         * - 'cn-beijing-6d': '华北1（北京）可用区D',
         * - 'cn-beijing-6e': '华北1（北京）可用区E',
         * - 'cn-shanghai-2a': '华东1（上海）可用区A',
         * - 'cn-shanghai-2b': '华东1（上海）可用区B',
         * - 'cn-guangzhou-1a': '华南1（广州）可用区A',
         * - 'cn-guangzhou-1b': '华南1（广州）可用区B',
         * - 'ap-singapore-1a': '新加坡可用区A',
         * - 'ap-singapore-1b': '新加坡可用区B',
         * - 'eu-east-1a': '俄罗斯（莫斯科）可用区A',
         * - 'eu-east-1b': '俄罗斯（莫斯科）可用区B',
         * - 'cn-beijing-fin-a': '华北金融1（北京）可用区A',
         */
        private String AvailabilityZone;
        /**
         * 当为单可用区时，该值固定为 1；当有两个可用区时，用来区分可用区 1 和 2；
         */
        private Integer AvailabilityZoneIndex;
        /**
         * 节点组编号，对于同一个 InstanceGroupType，如果有多组，则需要用编号进行区分
         */
        private Integer InstanceGroupIndex;
    }


}