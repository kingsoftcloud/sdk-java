package ksyun.client.aicp.createtrainjob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateTrainJobRequest
* @Description 请求参数
*/
@Data
public class CreateTrainJobRequest{
    /**训练任务名称，名称规范：1-64个字符，允许字母 中文 数字 - _ . / ( )*/
    @KsYunField(name="TrainJobName")
    private String TrainJobName;

    /**训练任务描述信息 0-200字符*/
    @KsYunField(name="Description")
    private String Description;

    /**资源池id*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**队列名称*/
    @KsYunField(name="QueueName")
    private String QueueName;

    /**优先级
可选项：
• kaic-high 高 
• kaic-normal 中
• kaic-low 低
默认kaic-normal*/
    @KsYunField(name="Priority")
    private String Priority;

    /**启动命令*/
    @KsYunField(name="Command")
    private String Command;

    /**训练框架
可选项：
• pytorch
• tensorflow
默认pytorch
*/
    @KsYunField(name="Framework")
    private String Framework;

    /**镜像类型
可选项：
• Official 官方镜像
• Personal 自定义镜像
• ThirdParty 第三方镜像*/
    @KsYunField(name="ImageSource")
    private String ImageSource;

    /**框架副本配置*/
    @KsYunField(name="FrameworkReplicas")
    private FrameworkReplicasDto1 FrameworkReplicas;

    @Data
    @ToString
    public static class FrameworkReplicasDto1 {
        /**当Framework=tensorflow必填，范围范围0-1000*/
        @KsYunField(name="Chief")
        private Integer Chief;

        /**当Framework=tensorflow时候必填，范围0-1000*/
        @KsYunField(name="Evaluator")
        private Integer Evaluator;

        /**当框架Framework=tensorflow时候必填，范围0-1000*/
        @KsYunField(name="PS")
        private Integer PS;

        /**0-1000*/
        @KsYunField(name="Master")
        private Integer Master;

    }

    /**重启策略，可选值：
· Always
· OnFailure
· Never*/
    @KsYunField(name="RestartPolicy")
    private String RestartPolicy;

    /**环境变量*/
    @KsYunField(name="Envs",type=2)
    private List<EnvsDto2> EnvsList;

    @Data
    @ToString
    public static class EnvsDto2 {
        /***/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value")
        private String Value;

    }

    /**是否开启Tensorboard，默认不开启*/
    @KsYunField(name="SupportTensorboard")
    private Boolean SupportTensorboard;

    /**镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**镜像仓库id*/
    @KsYunField(name="ImageRegistryId")
    private String ImageRegistryId;

    /**镜像RepoId*/
    @KsYunField(name="ImageRepoId")
    private String ImageRepoId;

    /**镜像tagId*/
    @KsYunField(name="ImageTagId")
    private String ImageTagId;

    /**GPU卡型*/
    @KsYunField(name="GPUType")
    private String GPUType;

    /**范围0-10000*/
    @KsYunField(name="GPUNumber")
    private Integer GPUNumber;

    /**范围0-10000*/
    @KsYunField(name="CPUNum")
    private Integer CPUNum;

    /**0-10000*/
    @KsYunField(name="Memory")
    private Integer Memory;

    /**存储配置
*/
    @KsYunField(name="StorageConfigs",type=2)
    private List<StorageConfigsDto3> StorageConfigsList;

    @Data
    @ToString
    public static class StorageConfigsDto3 {
        /**存储配置id*/
        @KsYunField(name="StorageConfigId")
        private String StorageConfigId;

        /**挂载路径*/
        @KsYunField(name="MountPath")
        private String MountPath;

        /**可选值 ：
• Code 代码挂载
• DataSet：数据集挂载
• Output：输出挂载
• Tensorboard Tensorboard挂载
如果SupportTensorboard = true,必须有一个Tensorboard类型的存储配置*/
        @KsYunField(name="StorageConfigType")
        private String StorageConfigType;

    }

    /**任务可见性，可选：Creator|QueueMember 默认：Creator*/
    @KsYunField(name="AccessType")
    private String AccessType;

    /**运行时长0-240000,单位h*/
    @KsYunField(name="MaxRuntime")
    private Integer MaxRuntime;

    /**是否开启自愈，默认true*/
    @KsYunField(name="SelfHealing")
    private Boolean SelfHealing;

    /**任务是否仅运行在cpu节点上，默认false*/
    @KsYunField(name="RunOnCPU")
    private Boolean RunOnCPU;

}
