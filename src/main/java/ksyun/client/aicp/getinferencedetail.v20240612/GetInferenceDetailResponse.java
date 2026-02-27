package ksyun.client.aicp.getinferencedetail.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetInferenceDetailResponse
* @Description GetInferenceDetail 返回体
*/
@Data
@ToString
public class GetInferenceDetailResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**推理服务详情*/
    @JsonProperty("InferenceDetail")
    private InferenceDetailDto InferenceDetail;

    @Data
    @ToString
    public static class InferenceDetailDto {
        /**推理服务名称*/
        @JsonProperty("InferenceName")
        private String InferenceName;

        /**推理服务ID*/
        @JsonProperty("InferenceId")
        private String InferenceId;

        /**运行状态*/
        @JsonProperty("Status")
        private String Status;

        /**是否Ingress*/
        @JsonProperty("IngressEnabled")
        private Boolean IngressEnabled;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**运行时长*/
        @JsonProperty("Duration")
        private String Duration;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**模型名称*/
        @JsonProperty("ModelName")
        private String ModelName;

        /**基础镜像*/
        @JsonProperty("BaseImage")
        private String BaseImage;

        /**自定义镜像*/
        @JsonProperty("CustomImage")
        private String CustomImage;

        /**启动命令*/
        @JsonProperty("EntryPoint")
        private String EntryPoint;

        /**内网访问地址*/
        @JsonProperty("AccessAddress")
        private String AccessAddress;

        /**服务端口*/
        @JsonProperty("Port")
        private Integer Port;

        /**环境变量列表*/
        @JsonProperty("Env")
        private List<InferenceDetailEnvDto> Env;

        @Data
        @ToString
        public static class InferenceDetailEnvDto {
            /**环境变量名*/
            @JsonProperty("Name")
            private String Name;

            /**环境变量值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**启动参数（模型部署类型参数）*/
        @JsonProperty("CmdOptions")
        private List<InferenceDetailCmdOptionsDto> CmdOptions;
        @Data
        @ToString
        public static class InferenceDetailCmdOptionsDto {
            /**环境变量名*/
            @JsonProperty("Name")
            private String Name;

            /**环境变量值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**资源池ID*/
        @JsonProperty("ResourcePoolId")
        private String ResourcePoolId;

        /**部署类型*/
        @JsonProperty("DeploymentType")
        private String DeploymentType;

        /**推理引擎*/
        @JsonProperty("Engine")
        private String Engine;

        /**访问类型*/
        @JsonProperty("AccessType")
        private String AccessType;

        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**队列名称*/
        @JsonProperty("QueueName")
        private String QueueName;

        /**GPU类型*/
        @JsonProperty("GPUType")
        private String GPUType;

        /**GPU数量*/
        @JsonProperty("GPUNum")
        private String GPUNum;

        /**CPU数量*/
        @JsonProperty("CPUNum")
        private Integer CPUNum;

        /**内存大小(Gi)*/
        @JsonProperty("Memory")
        private Integer Memory;

        /**是否开启多机部署（模型部署参数）*/
        @JsonProperty("Distributed")
        private Boolean Distributed;

        /**多机部署的节点数*/
        @JsonProperty("NodeNum")
        private Integer NodeNum;

        /**服务配置副本数*/
        @JsonProperty("Replicas")
        private Integer Replicas;

        /**当前副本数（paused和starting状态是0，其它时候和Replicas保持一致）*/
        @JsonProperty("CurrentReplicas")
        private Integer CurrentReplicas;

        /**VPC ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**存储配置列表*/
        @JsonProperty("StorageConfigs")
        private List<InferenceDetailStorageConfigsDto> StorageConfigs;

        @Data
        @ToString
        public static class InferenceDetailStorageConfigsDto {
            /**存储配置ID*/
            @JsonProperty("StorageConfigId")
            private String StorageConfigId;

            /**存储配置名称*/
            @JsonProperty("StorageConfigName")
            private String StorageConfigName;

            /**存储配置类型（）*/
            @JsonProperty("StorageConfigType")
            private String StorageConfigType;

            /**存储类型*/
            @JsonProperty("StorageType")
            private String StorageType;

            /**挂载路径*/
            @JsonProperty("MountPath")
            private String MountPath;

        }

        /**是否自动扩缩容*/
        @JsonProperty("AutoScaleEnable")
        private Boolean AutoScaleEnable;

        /**模型预加载（模型部署参数）*/
        @JsonProperty("ModelStorageEnabled")
        private Boolean ModelStorageEnabled;

        /**模型预加载路径*/
        @JsonProperty("ModelStoragePath")
        private String ModelStoragePath;

        /**镜像地址(自定义部署时，第三方镜像参数)*/
        @JsonProperty("ImageUrl")
        private String ImageUrl;

        /**镜像ID（自定义部署时，官方镜像、自定义镜像参数）*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**镜像来源（自定义部署时，镜像来源类型）*/
        @JsonProperty("ImageSource")
        private String ImageSource;

        /**镜像仓库ID（自定义部署时，第三方镜像参数）*/
        @JsonProperty("ImageRegistryId")
        private String ImageRegistryId;

        /**镜像仓库ID（自定义部署时，第三方镜像参数）*/
        @JsonProperty("ImageRepoId")
        private String ImageRepoId;

        /**镜像标签ID（自定义部署时，第三方镜像参数）*/
        @JsonProperty("ImageTagId")
        private String ImageTagId;

        /**镜像Registry名称（自定义部署时，第三方镜像参数）*/
        @JsonProperty("ImageRegistryName")
        private String ImageRegistryName;

        /**镜像Repo名称（自定义部署时，第三方镜像参数）*/
        @JsonProperty("ImageRepoName")
        private String ImageRepoName;

        /**镜像标签名称（自定义部署时，第三方镜像参数）*/
        @JsonProperty("ImageTagName")
        private String ImageTagName;

        /**是否在CPU上运行*/
        @JsonProperty("RunOnCPU")
        private Boolean RunOnCPU;

        /**是否启用主机网络*/
        @JsonProperty("HostNetworkEnabled")
        private Boolean HostNetworkEnabled;

        /**是否启用一致性哈希*/
        @JsonProperty("ConsistentHashEnable")
        private Boolean ConsistentHashEnable;

        /**一致性哈希Header头Key*/
        @JsonProperty("ConsistentHashHeader")
        private String ConsistentHashHeader;

    }

}
