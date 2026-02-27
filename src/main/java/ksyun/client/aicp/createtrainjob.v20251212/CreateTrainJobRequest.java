package ksyun.client.aicp.createtrainjob.v20251212;

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

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**资源组ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**优先级，有效值：
- kaic-high 高优先级
- kaic-normal 中优先级
- kaic-low 低优先级*/
    @KsYunField(name="Priority")
    private String Priority;

    /**队列名称*/
    @KsYunField(name="QueueName")
    private String QueueName;

    /**训练框架	，有效值：
- pytorch
- tensorflow*/
    @KsYunField(name="Framework")
    private String Framework;

    /**权限配置-可见范围*/
    @KsYunField(name="AccessType")
    private String AccessType;

    /**故障自愈*/
    @KsYunField(name="SelfHealing")
    private Boolean SelfHealing;

    /**最长运行时长(小时)*/
    @KsYunField(name="MaxRuntimeHour")
    private Long MaxRuntimeHour;

    /**仅调度到CPU节点。当GPUNumber为空或值为0时，此值有效*/
    @KsYunField(name="JobRunOnCPU")
    private Boolean JobRunOnCPU;

    /**开启Tensorboard*/
    @KsYunField(name="SupportTensorboard")
    private Boolean SupportTensorboard;

    /**存储配置信息*/
    @KsYunField(name="StorageConfigs",type=2)
    private List<StorageConfigsDto> StorageConfigsList;

    @Data
    @ToString
    public static class StorageConfigsDto {
        /**存储配置ID*/
        @KsYunField(name="StorageConfigId")
        private String StorageConfigId;

        /**挂载类型*/
        @KsYunField(name="MountType")
        private String MountType;

        /**挂载路径，不设置则取存储配置的默认挂载路径*/
        @KsYunField(name="MountPath")
        private String MountPath;

    }

    /**角色资源配置信息*/
    @KsYunField(name="Roles",type=2)
    private List<RolesDto> RolesList;

    @Data
    @ToString
    public static class RolesDto {
        /**角色名称，pytorch框架支持Master和Worker，tensorflow框架支持Worker，Chief，PS和Evaluator*/
        @KsYunField(name="RoleName")
        private String RoleName;

        /**副本数*/
        @KsYunField(name="Replicas")
        private Integer Replicas;

        /**镜像配置信息*/
        @KsYunField(name="ImageConfig")
        private RolesImageConfigDto ImageConfig;

        @Data
        @ToString
        public static class RolesImageConfigDto {
            /**自定义或官方镜像ID，当ImageSource=Official或Personal必传*/
            @KsYunField(name="ImageId")
            private String ImageId;

            /**镜像来源*/
            @KsYunField(name="ImageSource")
            private String ImageSource;

            /**第三方镜像配置ID，当ImageSource=ThirdParty必传*/
            @KsYunField(name="ImageRegistryId")
            private String ImageRegistryId;

            /**第三方镜像仓库ID，当ImageSource=ThirdParty必传*/
            @KsYunField(name="ImageRepoId")
            private String ImageRepoId;

            /**第三方镜像版本ID，当ImageSource=ThirdParty必传*/
            @KsYunField(name="ImageTagId")
            private String ImageTagId;

        }

        /**资源配置信息*/
        @KsYunField(name="ResourceConfig")
        private RolesResourceConfigDto ResourceConfig;

        @Data
        @ToString
        public static class RolesResourceConfigDto {
            /**GPU类型*/
            @KsYunField(name="GPUType")
            private String GPUType;

            /**GPU卡数，当GPU类型不为空时必传*/
            @KsYunField(name="GPUNumber")
            private Integer GPUNumber;

            /**CPU数*/
            @KsYunField(name="CPUNum")
            private Integer CPUNum;

            /**内存(Gi)*/
            @KsYunField(name="Memory")
            private Integer Memory;

        }

        /**启动命令*/
        @KsYunField(name="RunCommand")
        private String RunCommand;

        /**重启策略，有效值：
- Always
- OnFailure
- Never*/
        @KsYunField(name="RestartPolicy")
        private String RestartPolicy;

        /**环境变量列表*/
        @KsYunField(name="Envs",type=2)
        private List<RolesEnvsDto> EnvsList;

        @Data
        @ToString
        public static class RolesEnvsDto {
            /**环境变量key的名字*/
            @KsYunField(name="Name")
            private String Name;

            /**环境变量key对应的value*/
            @KsYunField(name="Value")
            private String Value;

        }

    }

}
