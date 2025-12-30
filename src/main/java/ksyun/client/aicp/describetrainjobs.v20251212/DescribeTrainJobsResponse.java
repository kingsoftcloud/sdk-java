package ksyun.client.aicp.describetrainjobs.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTrainJobsResponse
* @Description DescribeTrainJobs 返回体
*/
@Data
@ToString
public class DescribeTrainJobsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**单次调用可返回的最大条目数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**训练任务总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**训练任务的信息*/
    @JsonProperty("TrainJobSet")
    private List<TrainJobSetDto> TrainJobSet;

    @Data
    @ToString
    public static class TrainJobSetDto {
        /**训练任务名称*/
        @JsonProperty("TrainJobName")
        private String TrainJobName;

        /**描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**资源组ID*/
        @JsonProperty("ResourcePoolId")
        private String ResourcePoolId;

        /**训练任务ID*/
        @JsonProperty("TrainJobId")
        private String TrainJobId;

        /**命名空间，自运维资源组下的任务为空*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**队列名称*/
        @JsonProperty("QueueName")
        private String QueueName;

        /**优先级, 有效值：kaic-high(高优先级), kaic-normal(中优先级), kaic-low(低优先级)*/
        @JsonProperty("Priority")
        private String Priority;

        /**训练框架, 有效值：pytorch, tensorflow*/
        @JsonProperty("Framework")
        private String Framework;

        /**权限配置-可见范围, 有效值：Creator(队列管理员可见), QueueMember(队列内成员可见)*/
        @JsonProperty("AccessType")
        private String AccessType;

        /**创建者ID，主账号显示主账号ID，子用户显示子用户ID*/
        @JsonProperty("CreateUserId")
        private String CreateUserId;

        /**GPU故障自愈*/
        @JsonProperty("SelfHealing")
        private Boolean SelfHealing;

        /**最长运行时长(小时)*/
        @JsonProperty("MaxRuntimeHour")
        private Integer MaxRuntimeHour;

        /**节点亲和性-仅调度到CPU节点*/
        @JsonProperty("JobRunOnCPU")
        private Boolean JobRunOnCPU;

        /**开启Tensorboard*/
        @JsonProperty("SupportTensorboard")
        private Boolean SupportTensorboard;

        /**重启次数*/
        @JsonProperty("RebootNumber")
        private Integer RebootNumber;

        /**Pod总数*/
        @JsonProperty("TotalPodNum")
        private Integer TotalPodNum;

        /**训练任务状态信息*/
        @JsonProperty("JobStatus")
        private TrainJobSetJobStatusDto JobStatus;

        @Data
        @ToString
        public static class TrainJobSetJobStatusDto {
            /**任务状态，有效值: submit(创建中), pending(排队中), running(运行中), stopping(停止中), stopped(已停止), failed(失败), succeed(成功), abnormal(异常)*/
            @JsonProperty("Status")
            private String Status;

            /**任务提交时间*/
            @JsonProperty("SubmitTime")
            private String SubmitTime;

            /**任务开始运行时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**排队时间，单位秒*/
            @JsonProperty("QueueTime")
            private Integer QueueTime;

            /**任务结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**错误信息*/
            @JsonProperty("Message")
            private String Message;

            /**本次运行时长*/
            @JsonProperty("ExecutionTime")
            private String ExecutionTime;

        }

        /**存储配置信息*/
        @JsonProperty("StorageConfigs")
        private List<TrainJobSetStorageConfigsDto> StorageConfigs;

        @Data
        @ToString
        public static class TrainJobSetStorageConfigsDto {
            /**存储配置ID*/
            @JsonProperty("StorageConfigId")
            private String StorageConfigId;

            /**挂载类型*/
            @JsonProperty("MountType")
            private String MountType;

            /**挂载路径*/
            @JsonProperty("MountPath")
            private String MountPath;

        }

        /**角色资源配置信息*/
        @JsonProperty("Roles")
        private List<TrainJobSetRolesDto> Roles;

        @Data
        @ToString
        public static class TrainJobSetRolesDto {
            /**角色名称，pytorch框架支持Master和Worker，tensorflow框架支持Chief，PS和Evaluator*/
            @JsonProperty("RoleName")
            private String RoleName;

            /**副本数*/
            @JsonProperty("Replicas")
            private Integer Replicas;

            /**镜像配置信息*/
            @JsonProperty("ImageConfig")
            private TrainJobSetRolesImageConfigDto ImageConfig;

            @Data
            @ToString
            public static class TrainJobSetRolesImageConfigDto {
                /**自定义或官方镜像ID，当ImageSource=Official或Personal有值*/
                @JsonProperty("ImageId")
                private String ImageId;

                /**镜像来源, 有效值：Official(官方镜像), Personal(自定义镜像), ThirdParty(第三方镜像)*/
                @JsonProperty("ImageSource")
                private String ImageSource;

                /**第三方镜像ID，当ImageSource=ThirdParty有值*/
                @JsonProperty("ImageRegistryId")
                private String ImageRegistryId;

                /**第三方镜像仓库ID，当ImageSource=ThirdParty有值*/
                @JsonProperty("ImageRepoId")
                private String ImageRepoId;

                /**第三方镜像版本ID，当ImageSource=ThirdParty有值*/
                @JsonProperty("ImageTagId")
                private String ImageTagId;

                /**第三方镜像名称，当ImageSource=ThirdParty有值*/
                @JsonProperty("ImageRegistryName")
                private String ImageRegistryName;

                /**第三方镜像仓库名称，当ImageSource=ThirdParty有值*/
                @JsonProperty("ImageRepoName")
                private String ImageRepoName;

                /**第三方镜像版本，当ImageSource=ThirdParty有值*/
                @JsonProperty("ImageTagName")
                private String ImageTagName;

            }

            /**资源配置信息*/
            @JsonProperty("ResourceConfig")
            private TrainJobSetRolesResourceConfigDto ResourceConfig;

            @Data
            @ToString
            public static class TrainJobSetRolesResourceConfigDto {
                /**GPU类型*/
                @JsonProperty("GPUType")
                private String GPUType;

                /**GPU卡数，当GPU类型不为空时必传*/
                @JsonProperty("GPUNumber")
                private Integer GPUNumber;

                /**CPU数*/
                @JsonProperty("CPUNum")
                private Integer CPUNum;

                /**内存(GB)*/
                @JsonProperty("Memory")
                private Integer Memory;

            }

            /**启动命令*/
            @JsonProperty("RunCommand")
            private String RunCommand;

            /**重启策略，有效值: Always, OnFailure, Never*/
            @JsonProperty("RestartPolicy")
            private String RestartPolicy;

            /**环境变量列表*/
            @JsonProperty("Envs")
            private List<TrainJobSetRolesEnvsDto> Envs;

            @Data
            @ToString
            public static class TrainJobSetRolesEnvsDto {
                /**环境变量key的名字*/
                @JsonProperty("Name")
                private String Name;

                /**环境变量key对应的value*/
                @JsonProperty("Value")
                private String Value;

            }

        }

    }

}
