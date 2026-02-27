package ksyun.client.aicp.createinference.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateInferenceRequest
* @Description 请求参数
*/
@Data
public class CreateInferenceRequest{
    /**推理服务名称
名称仅支持字母、中文、数字、下划线_、中划线-、小数点.、斜杠/、括号()，长度最大64*/
    @KsYunField(name="InferenceName")
    private String InferenceName;

    /**描述
限制字符数 0-200*/
    @KsYunField(name="Description")
    private String Description;

    /**资源池ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**队列名称*/
    @KsYunField(name="QueueName")
    private String QueueName;

    /**副本数
默认1 ，取值范围1-500*/
    @KsYunField(name="Replicas")
    private Integer Replicas;

    /**任务可见性
-  Creator (创建人)
-  QueueMember （队列成员）*/
    @KsYunField(name="AccessType")
    private String AccessType;

    /**部署类型
> • 自定义部署需要镜像相关参数
• 模型部署需要模型相关参数

• Custom（自定义部署）
• Predefine（模型部署）
*/
    @KsYunField(name="DeploymentType")
    private String DeploymentType;

    /**模型推理引擎

> 部署类型为 模型部署 时，必填
- vLLM
- SGLang*/
    @KsYunField(name="Engine")
    private String Engine;

    /**模型名称 
> 部署类型为 模型部署 时，必填
（通过接口GetInferenceModels获取模型信息）*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**模型部署启动参数
> 仅为模型部署时，此参数才生效*/
    @KsYunField(name="CmdOptions",type=2)
    private List<CmdOptionsDto> CmdOptionsList;

    @Data
    @ToString
    public static class CmdOptionsDto {
        /**变量名*/
        @KsYunField(name="Name")
        private String Name;

        /**变量值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**模型预加载
> 模型部署参数，当开启预加载时，需填入 ModelStoragePath 模型预加载路径*/
    @KsYunField(name="ModelStorageEnabled")
    private Boolean ModelStorageEnabled;

    /**模型预加载路径
> 开启模型预加载时，必填*/
    @KsYunField(name="ModelStoragePath")
    private String ModelStoragePath;

    /**服务启动命令
> 自定义部署时，需传入此参数*/
    @KsYunField(name="EntryPoint")
    private String EntryPoint;

    /**镜像类型
> 自定义部署参数,仅自定义部署时生效且**必填**

• Personal 自定义镜像
• Official 官方镜像
• ThirdParty 第三方镜像*/
    @KsYunField(name="ImageSource")
    private String ImageSource;

    /**镜像Id
> 自定义部署参数，仅自定义部署时生效

当ImageSource（镜像类型）为Personal（自定义镜像）和Official（官方镜像）时必填。*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**仓库连接 Id
> 自定义部署参数，仅自定义部署时有效。

当ImageSource（镜像类型）为ThirdParty（第三方镜像）时，此值有效且必填。*/
    @KsYunField(name="ImageRegistryId")
    private String ImageRegistryId;

    /**第三方镜像仓库Id
> 自定义部署参数，仅自定义部署有效

当ImageSource（镜像类型）为ThirdParty（第三方镜像）时，此值有效且必填。*/
    @KsYunField(name="ImageRepoId")
    private String ImageRepoId;

    /**第三方镜像tagId
> 自定义部署参数，仅自定义部署时有效

当ImageSource（镜像类型）为ThirdParty（第三方镜像）时，此值有效且必填*/
    @KsYunField(name="ImageTagId")
    private String ImageTagId;

    /**子网ID*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**端口*/
    @KsYunField(name="Port")
    private Integer Port;

    /**环境变量*/
    @KsYunField(name="Env",type=2)
    private List<EnvDto> EnvList;

    @Data
    @ToString
    public static class EnvDto {
        /**环境变量名*/
        @KsYunField(name="Name")
        private String Name;

        /**环境变量值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**GPU卡类型
> 不填代表不使用GPU卡*/
    @KsYunField(name="GPUType")
    private String GPUType;

    /**Gpu卡数
> 取值范围： 0-8*/
    @KsYunField(name="GPUNum")
    private String GPUNum;

    /**CPU数
> 取值范围 1- 1000*/
    @KsYunField(name="CPUNum")
    private Integer CPUNum;

    /**内存大小
> 取值范围 ： 1-1000
单位：Gi*/
    @KsYunField(name="Memory")
    private Integer Memory;

    /**开启自动扩缩容*/
    @KsYunField(name="AutoScaleEnable")
    private Boolean AutoScaleEnable;

    /**自动扩缩容配置
> 自动扩缩容开启时，需传入此配置*/
    @KsYunField(name="AutoScaleStrategy")
    private AutoScaleStrategyDto AutoScaleStrategy;

    @Data
    @ToString
    public static class AutoScaleStrategyDto {
        /**扩缩容模式(目前仅支持 metric 指标扩缩容)*/
        @KsYunField(name="Mode")
        private String Mode;

        /**指标扩缩容策略*/
        @KsYunField(name="MetricStrategy")
        private AutoScaleStrategyMetricStrategyDto MetricStrategy;

        @Data
        @ToString
        public static class AutoScaleStrategyMetricStrategyDto {
            /**CPU利用率指标阈值*/
            @KsYunField(name="CpuUtilization")
            private Integer CpuUtilization;

            /**内存利用率指标阈值*/
            @KsYunField(name="MemUtilization")
            private Integer MemUtilization;

            /**最小副本数*/
            @KsYunField(name="MinReplicas")
            private Integer MinReplicas;

            /**最大副本数*/
            @KsYunField(name="MaxReplicas")
            private Integer MaxReplicas;

        }

    }

    /**仅运行在CPU节点*/
    @KsYunField(name="RunOnCPU")
    private Boolean RunOnCPU;

    /**是否支持多机部署*/
    @KsYunField(name="Distributed")
    private Boolean Distributed;

    /**支持多机部署的节点数
> 模型部署参数，仅模型部署时值有效

Distributed（多机部署）为true时，有效且必填*/
    @KsYunField(name="NodeNum")
    private Boolean NodeNum;

    /**存储配置
> 自定义部署时，必须传Model模型存储配置*/
    @KsYunField(name="StorageConfigs",type=2)
    private List<StorageConfigsDto> StorageConfigsList;

    @Data
    @ToString
    public static class StorageConfigsDto {
        /**存储配置ID*/
        @KsYunField(name="StorageConfigId")
        private String StorageConfigId;

        /**存储配置类型*/
        @KsYunField(name="StorageConfigType")
        private String StorageConfigType;

        /**挂载路径,若不传入使用对应存储配置中的默认挂载路径*/
        @KsYunField(name="MountPath")
        private String MountPath;

    }

}
