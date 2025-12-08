package ksyun.client.aicp.describetrainjob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTrainJobResponse
* @Description DescribeTrainJob 返回体
*/
@Data
@ToString
public class DescribeTrainJobResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总任务数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**分页参数，从1开始*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**本页返回任务数量*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /***/
    @JsonProperty("TrainJobSet")
    private List<TrainJobSetDto> TrainJobSet;

    @Data
    @ToString
    public static class TrainJobSetDto {
        /**训练任务名称*/
        @JsonProperty("TrainJobName")
        private String TrainJobName;

        /**训练任务id*/
        @JsonProperty("TrainJobId")
        private String TrainJobId;

        /**资源池名称*/
        @JsonProperty("ResourcePoolName")
        private String ResourcePoolName;

        /**资源池id*/
        @JsonProperty("ResourcePoolId")
        private String ResourcePoolId;

        /**资源池类型*/
        @JsonProperty("ResourcePoolType")
        private String ResourcePoolType;

        /**任务pod所在命名空间*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**队列名称*/
        @JsonProperty("QueueName")
        private String QueueName;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**优先级*/
        @JsonProperty("Priority")
        private String Priority;

        /**框架类型*/
        @JsonProperty("Framework")
        private String Framework;

        /**可见范围*/
        @JsonProperty("AccessType")
        private String AccessType;

        /**镜像id*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**镜像类型*/
        @JsonProperty("ImageSource")
        private String ImageSource;

        /**镜像配置id*/
        @JsonProperty("ImageRegistryId")
        private String ImageRegistryId;

        /**镜像仓库id*/
        @JsonProperty("ImageRepoId")
        private String ImageRepoId;

        /**镜像版本id*/
        @JsonProperty("ImageTagId")
        private String ImageTagId;

        /**创建人*/
        @JsonProperty("CreateUserName")
        private String CreateUserName;

        /***/
        @JsonProperty("FrameworkReplicas")
        private FrameworkReplicasDto FrameworkReplicas;

        @Data
        @ToString
        public static class FrameworkReplicasDto {
            /**1*/
            @JsonProperty("Master")
            private Integer Master;

            /**1*/
            @JsonProperty("Worker")
            private Integer Worker;

            /**1*/
            @JsonProperty("Chief")
            private Integer Chief;

            /**1*/
            @JsonProperty("Evaluator")
            private Integer Evaluator;

            /**1*/
            @JsonProperty("PS")
            private Integer PS;

        }

        /**gpu卡型*/
        @JsonProperty("GPUType")
        private String GPUType;

        /**1*/
        @JsonProperty("GPUNumber")
        private Integer GPUNumber;

        /**2*/
        @JsonProperty("CPUNum")
        private Integer CPUNum;

        /**2*/
        @JsonProperty("Memory")
        private Integer Memory;

        /**Never*/
        @JsonProperty("RestartPolicy")
        private String RestartPolicy;

        /***/
        @JsonProperty("Status")
        private StatusDto Status;

        @Data
        @ToString
        public static class StatusDto {
            /**pending*/
            @JsonProperty("State")
            private String State;

            /***/
            @JsonProperty("PodSucceedNum")
            private Integer PodSucceedNum;

            /***/
            @JsonProperty("PodFailedNum")
            private Integer PodFailedNum;

            /**2025-11-17 11:32:22.112*/
            @JsonProperty("SubmitTime")
            private String SubmitTime;

            /**2025-11-17 11:32:22.161*/
            @JsonProperty("StartTime")
            private String StartTime;

            /***/
            @JsonProperty("QueueTime")
            private Integer QueueTime;

            /***/
            @JsonProperty("EndTime")
            private String EndTime;

            /***/
            @JsonProperty("Message")
            private String Message;

        }

        /**73398439*/
        @JsonProperty("CreateUserId")
        private String CreateUserId;

        /**true*/
        @JsonProperty("SelfHealing")
        private Boolean SelfHealing;

        /**环境变量*/
        @JsonProperty("Envs")
        private List<EnvsDto> Envs;

        @Data
        @ToString
        public static class EnvsDto {
            /**ENV_TENSORBOARD_DIR*/
            @JsonProperty("Name")
            private String Name;

            @JsonProperty("Value")
            private String Value;

        }

        /**运行命令*/
        @JsonProperty("Command")
        private String Command;

        /**最大运行时长*/
        @JsonProperty("MaxRuntime")
        private Integer MaxRuntime;

        /**是否开启HostNetwork*/
        @JsonProperty("EnableHostNetwork")
        private Boolean EnableHostNetwork;

        /**是否仅运行在cpu节点上*/
        @JsonProperty("RunOnCPU")
        private Boolean RunOnCPU;

        /**是否支持Tensorboard*/
        @JsonProperty("SupportTensorboard")
        private Boolean SupportTensorboard;

        /***/
        @JsonProperty("StorageConfigs")
        private List<StorageConfigsDto> StorageConfigs;

        @Data
        @ToString
        public static class StorageConfigsDto {
            /***/
            @JsonProperty("StorageConfigId")
            private String StorageConfigId;

            /***/
            @JsonProperty("StorageConfigType")
            private String StorageConfigType;

            /***/
            @JsonProperty("MountPath")
            private String MountPath;

        }

    }

}
