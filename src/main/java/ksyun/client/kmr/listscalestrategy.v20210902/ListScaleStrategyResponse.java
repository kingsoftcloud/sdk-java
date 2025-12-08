package ksyun.client.kmr.listscalestrategy.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListScaleStrategyResponse
* @Description ListScaleStrategy 返回体
*/
@Data
@ToString
public class ListScaleStrategyResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**集群ID*/
    @JsonProperty("Id")
    private String Id;

    /**集群名称*/
    @JsonProperty("Name")
    private String Name;

    /**策略类型：

- Time-Based：时间弹性
- Load-Based：负载弹性*/
    @JsonProperty("StrategyModule")
    private String StrategyModule;

    /**基于时间的弹性伸缩策略*/
    @JsonProperty("Strategies")
    private List<StrategiesDto> Strategies;

    @Data
    @ToString
    public static class StrategiesDto {
        /**基于时间的弹性策略ID*/
        @JsonProperty("Id")
        private String Id;

        /**基于时间的弹性策略名称*/
        @JsonProperty("Name")
        private String Name;

        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**弹性策略的扩缩类型*/
        @JsonProperty("Type")
        private String Type;

        /**弹性策略开启状态*/
        @JsonProperty("Enabled")
        private Boolean Enabled;

        /**弹性策略的优先级*/
        @JsonProperty("Priority")
        private Integer Priority;

        /**Task节点组的最大数量*/
        @JsonProperty("MaxInstance")
        private Integer MaxInstance;

        /**Task节点组的最小数量*/
        @JsonProperty("MinInstance")
        private Integer MinInstance;

        /**计费方式，其中 Daily 是按量付费（按日月结），Minutely 是按量付费

*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**重复执行周期类型(天，周，月)*/
        @JsonProperty("PeriodType")
        private String PeriodType;

        /**策略执行的日期*/
        @JsonProperty("PeriodParam")
        private String PeriodParam;

        /**策略执行的时刻*/
        @JsonProperty("PeriodTime")
        private String PeriodTime;

        /**单次操作的台数*/
        @JsonProperty("Step")
        private Integer Step;

        /**执行节点组是否是新建Task节点组或者已有的Task节点组

*/
        @JsonProperty("NewTaskGroup")
        private Boolean NewTaskGroup;

        /**Task节点组ID*/
        @JsonProperty("InstanceGroupId")
        private String InstanceGroupId;

        /**Task节点组别名*/
        @JsonProperty("InstanceGroupAlias")
        private String InstanceGroupAlias;

        /**Task节点组资源信息*/
        @JsonProperty("InstanceGroupTypes")
        private StrategiesDtoInstanceGroupTypesDto InstanceGroupTypes;

        @Data
        @ToString
        public static class StrategiesDtoInstanceGroupTypesDto {
            /**Task节点组的VPC 子网ID*/
            @JsonProperty("VpcSubnetId")
            private String VpcSubnetId;

            /**Task节点组的安全组ID*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**Task节点组的套餐*/
            @JsonProperty("ResourceTypes")
            private String ResourceTypes;

        }

        /**弃用，默认false*/
        @JsonProperty("ResourceBackUp")
        private Boolean ResourceBackUp;

        /**弃用，默认false

*/
        @JsonProperty("AutoRestore")
        private String AutoRestore;

        /**策略生效时间

*/
        @JsonProperty("ActivateTime")
        private String ActivateTime;

        /**策略过期时间

*/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

        /**Task节点组系统盘信息

*/
        @JsonProperty("InstanceGroupInfo")
        private StrategiesDtoInstanceGroupInfoDto InstanceGroupInfo;

        @Data
        @ToString
        public static class StrategiesDtoInstanceGroupInfoDto {
            /**系统盘类型

*/
            @JsonProperty("SystemDiskType")
            private String SystemDiskType;

            /**系统盘大小

*/
            @JsonProperty("SystemDiskSize")
            private Integer SystemDiskSize;

        }

        /**是否优雅缩容

*/
        @JsonProperty("GracefulScaleIn")
        private Boolean GracefulScaleIn;

        /**优雅缩容等待时间

*/
        @JsonProperty("GracefulScaleInTimeout")
        private Integer GracefulScaleInTimeout;

        /**已废弃，默认为空字符串

*/
        @JsonProperty("InstancePassword")
        private String InstancePassword;

        /**标签ID

*/
        @JsonProperty("LabelId")
        private String LabelId;

        /**策略创建时间

*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**策略更新时间*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

    }

    /**存在时间冲突的弹性伸缩策略

*/
    @JsonProperty("ConflictStrategies")
    private String ConflictStrategies;

    /**基于负载的弹性伸缩策略

*/
    @JsonProperty("LoadBasedStrategies")
    private List<LoadBasedStrategiesDto> LoadBasedStrategies;

    @Data
    @ToString
    public static class LoadBasedStrategiesDto {
        /**基于时间的弹性策略ID*/
        @JsonProperty("Id")
        private String Id;

        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**策略生效时间*/
        @JsonProperty("ActivateTime")
        private String ActivateTime;

        /**计费方式，其中 Daily 是按量付费（按日月结），Minutely 是按量付费

*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**弹性策略开启状态

*/
        @JsonProperty("Enabled")
        private Boolean Enabled;

        /**策略过期时间

*/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

        /**执行节点组是否是新建Task节点组或者已有的Task节点组

*/
        @JsonProperty("NewTaskGroup")
        private Boolean NewTaskGroup;

        /***/
        @JsonProperty("InstanceGroupId")
        private String InstanceGroupId;

        /***/
        @JsonProperty("InstanceGroupAlias")
        private String InstanceGroupAlias;

        /**Task节点组系统盘信息

*/
        @JsonProperty("InstanceGroupInfo")
        private LoadBasedStrategiesDtoInstanceGroupInfoDto InstanceGroupInfo;

        @Data
        @ToString
        public static class LoadBasedStrategiesDtoInstanceGroupInfoDto {
            /**系统盘类型*/
            @JsonProperty("SystemDiskType")
            private String SystemDiskType;

            /**系统盘大小*/
            @JsonProperty("SystemDiskSize")
            private Integer SystemDiskSize;

        }

        /**Task节点组资源信息

*/
        @JsonProperty("InstanceGroupTypes")
        private LoadBasedStrategiesDtoInstanceGroupTypesDto InstanceGroupTypes;

        @Data
        @ToString
        public static class LoadBasedStrategiesDtoInstanceGroupTypesDto {
            /**子网ID*/
            @JsonProperty("VpcSubnetId")
            private String VpcSubnetId;

            /**安全组ID*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /***/
            @JsonProperty("ResourceTypes")
            private List<LoadBasedStrategiesDtoInstanceGroupTypesDtoResourceTypesDto> ResourceTypes;

            @Data
            @ToString
            public static class LoadBasedStrategiesDtoInstanceGroupTypesDtoResourceTypesDto {
                /**节点组套餐代码

*/
                @JsonProperty("TypeCode")
                private String TypeCode;

                /**数据盘类型

*/
                @JsonProperty("DiskType")
                private String DiskType;

                /**数据盘大小

*/
                @JsonProperty("DiskSize")
                private Integer DiskSize;

                /**数据盘数量

*/
                @JsonProperty("VolumeCount")
                private Integer VolumeCount;

                /**系统盘类型

*/
                @JsonProperty("SystemDiskType")
                private String SystemDiskType;

                /**系统盘大小

*/
                @JsonProperty("SystemDiskSize")
                private Integer SystemDiskSize;

            }

        }

        /**Task节点组最大数量

*/
        @JsonProperty("MaxInstance")
        private Integer MaxInstance;

        /**Task节点组最小数量

*/
        @JsonProperty("MinInstance")
        private Integer MinInstance;

        /**基于负载的弹性策略名称

*/
        @JsonProperty("Name")
        private String Name;

        /**单次操作的台数

*/
        @JsonProperty("Step")
        private Integer Step;

        /**弹性策略的扩缩类型

*/
        @JsonProperty("Type")
        private String Type;

        /**负载的统计指标信息

*/
        @JsonProperty("StatisticsRule")
        private LoadBasedStrategiesDtoStatisticsRuleDto StatisticsRule;

        @Data
        @ToString
        public static class LoadBasedStrategiesDtoStatisticsRuleDto {
            /**负载指标

*/
            @JsonProperty("LoadMetricId")
            private String LoadMetricId;

            /**统计周期

*/
            @JsonProperty("Period")
            private Integer Period;

            /**比较类型：

- gt：大于
- lt：等于
- eq：小于
- ge：大于等于
- le：小于等于*/
            @JsonProperty("CompareType")
            private String CompareType;

            /**阈值*/
            @JsonProperty("Threshold")
            private Integer Threshold;

            /**重复次数

*/
            @JsonProperty("RepeatCount")
            private Integer RepeatCount;

            /**间隔时间

*/
            @JsonProperty("CoolDownPeriod")
            private Integer CoolDownPeriod;

        }

        /**指标达到阈值后，需要的触发次数，达到这个次数后进行扩缩操作

*/
        @JsonProperty("TriggerTimes")
        private Integer TriggerTimes;

        /**是否优雅缩容

*/
        @JsonProperty("GracefulScaleIn")
        private Boolean GracefulScaleIn;

        /**优雅缩容等待时间

*/
        @JsonProperty("GracefulScaleInTimeout")
        private Integer GracefulScaleInTimeout;

        /***/
        @JsonProperty("InstancePassword")
        private String InstancePassword;

        /**策略创建时间

*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**策略更新时间

*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

    }

    /**状态码

*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
