package ksyun.client.aicp.describenotebooks.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNotebooksResponse
* @Description DescribeNotebooks 返回体
*/
@Data
@ToString
public class DescribeNotebooksResponse extends BaseResponseModel {

    /**93fb4fcf-5adc-4284-b7c1-a355b971c3af*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**开发任务信息列表*/
    @JsonProperty("Notebooks")
    private List<NotebooksDto> Notebooks;

    @Data
    @ToString
    public static class NotebooksDto {
        /**开发任务ID*/
        @JsonProperty("NotebookId")
        private String NotebookId;

        /**开发任务名称*/
        @JsonProperty("NotebookName")
        private String NotebookName;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("Status")
        private NotebooksStatusDto Status;

        @Data
        @ToString
        public static class NotebooksStatusDto {
            /**状态*/
            @JsonProperty("State")
            private String State;

            /**提交时间*/
            @JsonProperty("SubmitTime")
            private String SubmitTime;

            /**开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**信息*/
            @JsonProperty("Message")
            private String Message;

            /**本次运行时长*/
            @JsonProperty("ExecutionTime")
            private String ExecutionTime;

        }

        /**开启镜像自动保存*/
        @JsonProperty("AutoSave")
        private Boolean AutoSave;

        /**镜像报错状态*/
        @JsonProperty("ImageSaveStatus")
        private String ImageSaveStatus;

        /**镜像ID*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**GPU卡型*/
        @JsonProperty("GPUType")
        private String GPUType;

        /**GPU卡数*/
        @JsonProperty("GPUNumber")
        private String GPUNumber;

        /**创建人ID*/
        @JsonProperty("CreateUser")
        private String CreateUser;

        /**Namespace*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**资源组ID*/
        @JsonProperty("ResourcePoolId")
        private String ResourcePoolId;

        /**队列名称*/
        @JsonProperty("QueueName")
        private String QueueName;

        /**可见范围: • Creator ：仅实例创建者可见 • QueueMember ：队列内成员可见
*/
        @JsonProperty("AccessType")
        private String AccessType;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**修改时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**弹性IP id*/
        @JsonProperty("AllocationId")
        private String AllocationId;

        /**开启SSH访问*/
        @JsonProperty("EnableSSH")
        private Boolean EnableSSH;

        /**SSH开启公网访问*/
        @JsonProperty("EnablePublicNetworkSSH")
        private Boolean EnablePublicNetworkSSH;

        /**SSH端口*/
        @JsonProperty("SSHPort")
        private Integer SSHPort;

        /**SSH公钥*/
        @JsonProperty("SSHAuthorizedKeys")
        private String SSHAuthorizedKeys;

        /**SSH私网IP*/
        @JsonProperty("PodIp")
        private String PodIp;

        /**SSH公网IP*/
        @JsonProperty("ExternalIp")
        private String ExternalIp;

        /**CPU数*/
        @JsonProperty("CPUNum")
        private Integer CPUNum;

        /**内存GI
*/
        @JsonProperty("Memory")
        private Integer Memory;

        /**镜像URL*/
        @JsonProperty("ImageUrl")
        private String ImageUrl;

        /**镜像来源
- 官方镜像 Official
- 个人镜像 Personal 
- 第三方镜像ThirdParty*/
        @JsonProperty("ImageSource")
        private String ImageSource;

        /**第三方镜像链接ID*/
        @JsonProperty("ImageRegistryId")
        private String ImageRegistryId;

        /**第三方镜像仓库ID*/
        @JsonProperty("ImageRepoId")
        private String ImageRepoId;

        /**第三方镜像tagId*/
        @JsonProperty("ImageTagId")
        private String ImageTagId;

        /**第三方镜像链接名称*/
        @JsonProperty("ImageRegistryName")
        private String ImageRegistryName;

        /**第三方镜像仓库名称*/
        @JsonProperty("ImageRepoName")
        private String ImageRepoName;

        /**第三方镜像tag名称*/
        @JsonProperty("ImageTagName")
        private String ImageTagName;

        /**存储配置信息*/
        @JsonProperty("StorageConfigs")
        private List<NotebooksStorageConfigsDto> StorageConfigs;

        @Data
        @ToString
        public static class NotebooksStorageConfigsDto {
            /**存储配置ID*/
            @JsonProperty("StorageConfigId")
            private String StorageConfigId;

            /**存储路径*/
            @JsonProperty("MountPath")
            private String MountPath;

            /**挂载类型： • Code （代码） • DataSet（数据集） • Output（输出）*/
            @JsonProperty("StorageConfigType")
            private String StorageConfigType;

        }

        /***/
        @JsonProperty("ServiceConfigs")
        private List<NotebooksServiceConfigsDto> ServiceConfigs;

        @Data
        @ToString
        public static class NotebooksServiceConfigsDto {
            /***/
            @JsonProperty("Service")
            private String Service;

            /**8001*/
            @JsonProperty("Port")
            private Integer Port;

            /**false*/
            @JsonProperty("EnablePublicNetwork")
            private Boolean EnablePublicNetwork;

        }

        /***/
        @JsonProperty("Label")
        private NotebooksLabelDto Label;

        @Data
        @ToString
        public static class NotebooksLabelDto {
            /***/
            @JsonProperty("TerminatePolicyId")
            private String TerminatePolicyId;

        }

        /**1*/
        @JsonProperty("Version")
        private String Version;

        /**预估镜像大小，单位G*/
        @JsonProperty("EstimatedImageSize")
        private Double EstimatedImageSize;

        /**计算状态
- computing 计算中
- computed 计算完成*/
        @JsonProperty("ComputeStatus")
        private String ComputeStatus;

        /**仅调度CPU*/
        @JsonProperty("RunOnCPU")
        private Boolean RunOnCPU;

        /**所在节点IP*/
        @JsonProperty("NodeIp")
        private String NodeIp;

    }

    /**总数据条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**页大小*/
    @JsonProperty("PageSize")
    private Integer PageSize;

}
