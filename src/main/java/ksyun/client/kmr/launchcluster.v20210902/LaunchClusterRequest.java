package ksyun.client.kmr.launchcluster.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname LaunchClusterRequest
* @Description 请求参数
*/
@Data
public class LaunchClusterRequest{
    /**集群名称*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**集群类型
可选值：
- Hadoop
- Kafka
- RocketMQ
- Zookeeper*/
    @KsYunField(name="Distribution")
    private String Distribution;

    /**产品版本，对应于不同的集群类型
可选值：
- Hadoop版本：5.3.0，5.2.1，5.2.0，5.1.0，5.0.0
- Kafka版本：2.8.1，2.2.2
- RocketMQ版本：4.9.2
- Zookeeper版本：3.6.4，3.5.8，3.4.6*/
    @KsYunField(name="MainVersion")
    private String MainVersion;

    /**计费方式
可选值：
- 按日月结：Daily
- 按量付费：HourlyInstantSettlement*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**元数组高可用信息：*/
    @KsYunField(name="DatabaseInfo")

    /**组件列表：
1. Hadoop
 - 必选组件：	zookeeper(3.6.4)、hdfs(3.3.6)、yarn(3.3.6)、mapreduce(3.3.6)、tez(0.10.2)
 - 可选组件：hbase(2.5.5)、hive(3.1.3)、ranger(2.3.0)、spark(3.3.3)、flink(1.17.1)、presto(0.283)、trino(433)、sqoop(1.4.7)、hue(4.10.0)、zeppelin(0.10.0)、kafka(2.8.1)、iceberg(1.3.1)、hudi(0.12.3)、kudu(1.15.0)、impala(3.4.0)、prometheus(2.37.2)、grafana(8.5.15)、dolphinscheduler(3.1.9)、celeborn(0.5.0)
 2. Kafka
 - 必选组件：zookeeper(3.4.6)、kafka(2.8.1)
 3. RocketMQ
 - 必选组件：rocketmq(4.9.2)
 4. Zookeeper
 - 必选组件：zookeeper(3.6.4)*/
    @KsYunField(name="Services",type=2)
    private List<String> ServicesList;

    /**项目 ID，参考「项目管理」，默认为 0*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**VPC 网络的 ID*/
    @KsYunField(name="VpcDomainId")
    private String VpcDomainId;

    /**安全组的 ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**节点组信息*/
    @KsYunField(name="InstanceGroups",type=2)
    private List<InstanceGroupsDto> InstanceGroupsList;

    @Data
    @ToString
    public static class InstanceGroupsDto {
        /**节点组类型:
- Hadoop: MASTER、CORE 、TASK、GATEWAY、COMMON
- Kafka: BROKER
- Zookeeper: MASTER、CORE
- RocketMQ: MASTER、CORE*/
        private String InstanceGroupType;
        /**可用区：
-  cn-beijing-6a: 华北1（北京）可用区A
-  cn-beijing-6b: 华北1（北京）可用区B
-  cn-beijing-6c: 华北1（北京）可用区C
- cn-beijing-6d: 华北1（北京）可用区D,
- cn-beijing-6e: 华北1（北京）可用区E
- cn-shanghai-2a: 华东1（上海）可用区A
- cn-shanghai-2b: 华东1（上海）可用区B
- cn-guangzhou-1a: 华南1（广州）可用区A
- cn-guangzhou-1b: 华南1（广州）可用区B
- ap-singapore-1a: 新加坡可用区A
- ap-singapore-1b: 新加坡可用区B
- eu-east-1a: 俄罗斯（莫斯科）可用区A
- eu-east-1b: 俄罗斯（莫斯科）可用区B
- cn-taipei-1a: 台北可用区A,
- cn-beijing-fin-a: 华北金融1（北京）可用区A
- cn-hongkong-2a: 香港可用区A*/
        private String AvailabilityZone;
        /**节点组KMR套餐
示例：
- KMR.I3.4C8G
- EPC: CAL-KMR.epc.32C256G*/
        private String InstanceType;
        /**服务器类型：
- KEC：云服务器
- EPC：裸金属服务器*/
        private String ResourceType;
        /**节点数量，有效值：1-255*/
        private Integer InstanceCount;
        /**云物理机raid方式，若资源类型为EPC，需要选择物理机raid方式，KEC不需要
有效值：
- Raid0
- Raid1
- Raid5
- Raid50
- Raid10
- SRaid0*/
        private String RaidType;
        /**数据盘类型：
- SSD3.0: 本地SSD
- Local_SSD: 云硬盘3.0(SSD)
- ESSD_PL0: 极速云盘ESSD0
- ESSD_PL1: 极速云盘ESSD1
- ESSD_PL2: 极速云盘ESSD2
- ESSD_PL3: 极速云盘ESSD4*/
        private String VolumeType;
        /**云盘大小：
- SSD3.0: 40-65536
- Local_SSD: 50-65536
- ESSD_PL0: 50-65536
- ESSD_PL1: 50-65536
- ESSD_PL2: 461-65536
- ESSD_PL3: 1761-65536*/
        private Integer VolumeSize;
        /**云盘数量: 1-8*/
        private Integer VolumeCount;
        /**系统盘类型：
- Local_SSD: 本地盘
- SSD3.0: 云硬盘3.0（SSD）
- EHDD: 高效云盘
- ESSD_SYSTEM_PL0: ESSD云硬盘PL0（单盘性能上限IOPS：1.1万 吞吐量：180MB/s）
- ESSD_SYSTEM_PL1: ESSD云硬盘PL1（单盘性能上限IOPS：5.5万 吞吐量：350MB/s）
- ESSD_SYSTEM_PL2: ESSD云硬盘PL2（单盘性能上限IOPS：12万 吞吐量：1000MB/s）*/
        private String SystemDiskType;
        /**系统盘大小:
- Local_SSD
- SSD3.0: 40-500
- EHDD: 40-500
- ESSD_SYSTEM_PL0: 50-500
- ESSD_SYSTEM_PL1: 50-500
- ESSD_SYSTEM_PL2: 461-500*/
        private Integer SystemDiskSize;
        /**VPC 子网ID*/
        private String VpcSubnetId;
        /**当为单可用区时，该值固定为 1；当有两个可用区时，用来区分可用区 1 和 2, openapi创建只支持单可用区*/
        private Integer AvailabilityZoneIndex;
        /**节点组编号，对于同一个 InstanceGroupType，如果有多组，则需要用编号进行区分*/
        private Integer InstanceGroupIndex;
    }


}