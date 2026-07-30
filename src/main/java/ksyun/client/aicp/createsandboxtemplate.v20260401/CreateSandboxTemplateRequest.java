package ksyun.client.aicp.createsandboxtemplate.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSandboxTemplateRequest
* @Description 请求参数
*/
@Data
public class CreateSandboxTemplateRequest{
    /**模板名称。长度1-40位，允许字母、中文、数字、顿号、-、_、.、\、/、(、)*/
    @KsYunField(name="TemplateName")
    private String TemplateName;

    /**模板描述，0~200位，允许字母、中文、数字、空格及TemplateName所含特殊字符*/
    @KsYunField(name="Description")
    private String Description;

    /**模板类别。可选值：Public， Private*/
    @KsYunField(name="TemplateCategory")
    private String TemplateCategory;

    /**模板类型。可选值：All-in-one、Browser、CodeInterpreter、Custom。使用公共镜像时自动匹配实际类型*/
    @KsYunField(name="TemplateType")
    private String TemplateType;

    /**启动命令，TemplateCategory为Private且ImageConfig.ImageSource不为Public时生效*/
    @KsYunField(name="Command")
    private String Command;

    /**CPU核数，最小1，默认2。TemplateCategory为Private时生效；KecConfig.KecEnable=true时自动覆盖为机型对应核数*/
    @KsYunField(name="Cpu")
    private Integer Cpu;

    /**内存（GB），最小1，默认4。TemplateCategory为Private时生效；KecConfig.KecEnable=true时自动覆盖为机型对应内存*/
    @KsYunField(name="Memory")
    private Integer Memory;

    /**监听端口，TemplateCategory为Private且ImageConfig.ImageSource不为Public时生效，默认[8000]，最多10个，范围1~65535*/
    @KsYunField(name="Ports",type=2)
    private List<Integer> PortsList;

    /**环境变量列表。*/
    @KsYunField(name="Envs",type=2)
    private List<EnvsDto> EnvsList;

    @Data
    @ToString
    public static class EnvsDto {
        /**环境变量键，长度1-63，只能包含字母、数字、下划线*/
        @KsYunField(name="Key")
        private String Key;

        /**环境变量值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**镜像配置，TemplateCategory为Private时必填*/
    @KsYunField(name="ImageConfig")
    private ImageConfigDto ImageConfig;

    @Data
    @ToString
    public static class ImageConfigDto {
        /**镜像源，ImageConfig非null时必填。可选值：Persona,Enterprise,Public*/
        @KsYunField(name="ImageSource")
        private String ImageSource;

        /**镜像仓库端点，非Public镜像时必填。*/
        @KsYunField(name="ImageEndpoint")
        private String ImageEndpoint;

        /**镜像命名空间，非Public镜像时必填*/
        @KsYunField(name="ImageNamespace")
        private String ImageNamespace;

        /**镜像名称，非Public镜像时必填*/
        @KsYunField(name="ImageName")
        private String ImageName;

        /**镜像地址，Public镜像时必填*/
        @KsYunField(name="ImageUrl")
        private String ImageUrl;

        /**镜像版本标签，所有镜像源类型必填*/
        @KsYunField(name="ImageTag")
        private String ImageTag;

        /**镜像凭证用户名，私有命名空间时必填*/
        @KsYunField(name="CredentialUsername")
        private String CredentialUsername;

        /**镜像凭证密码，私有命名空间时必填*/
        @KsYunField(name="CredentialPwd")
        private String CredentialPwd;

        /**镜像仓库实例ID，Enterprise类型必填*/
        @KsYunField(name="RegistryInstanceId")
        private String RegistryInstanceId;

    }

    /**Skills能力配置，TemplateCategory为Public或ImageConfig.ImageSource为Public时生效*/
    @KsYunField(name="SkillConfig")
    private SkillConfigDto SkillConfig;

    @Data
    @ToString
    public static class SkillConfigDto {
        /**是否开启Skills能力，默认false*/
        @KsYunField(name="SkillEnable")
        private Boolean SkillEnable;

        /**Skills空间ID列表，SkillConfig.SkillEnable=true时生效*/
        @KsYunField(name="SkillSpaceIds",type=2)
        private List<String> SkillSpaceIdsList;

        /**是否使用内置Skills空间，SkillConfig.SkillEnable=true时生效*/
        @KsYunField(name="PublicSkillEnable")
        private Boolean PublicSkillEnable;

    }

    /**网络访问配置，TemplateCategory为Private时必填
*/
    @KsYunField(name="NetworkConfig")
    private NetworkConfigDto NetworkConfig;

    @Data
    @ToString
    public static class NetworkConfigDto {
        /**是否开启公网访问，默认true*/
        @KsYunField(name="PublicNetworkEnable")
        private Boolean PublicNetworkEnable;

        /**是否开启私网访问，默认false*/
        @KsYunField(name="PrivateNetworkEnable")
        private Boolean PrivateNetworkEnable;

        /**共享公网访问开关，默认true*/
        @KsYunField(name="SharedInternetAccessEnable")
        private Boolean SharedInternetAccessEnable;

        /**私有网络配置，NetworkConfig.PrivateNetworkEnable=true时必填
*/
        @KsYunField(name="VpcConfiguration")
        private NetworkConfigVpcConfigurationDto VpcConfiguration;

        @Data
        @ToString
        public static class NetworkConfigVpcConfigurationDto {
            /**私有网络ID，NetworkConfig.PrivateNetworkEnable=true时必填*/
            @KsYunField(name="VpcId")
            private String VpcId;

            /**子网ID，NetworkConfig.PrivateNetworkEnable=true时必填*/
            @KsYunField(name="SubnetId")
            private String SubnetId;

        }

    }

    /**日志采集配置，TemplateCategory为Private时生效*/
    @KsYunField(name="KlogConfig")
    private KlogConfigDto KlogConfig;

    @Data
    @ToString
    public static class KlogConfigDto {
        /**是否开启日志采集，默认true*/
        @KsYunField(name="KlogEnable")
        private Boolean KlogEnable;

    }

    /**KPFS存储挂载配置，TemplateCategory为Private时生效*/
    @KsYunField(name="KpfsMountConfig")
    private KpfsMountConfigDto KpfsMountConfig;

    @Data
    @ToString
    public static class KpfsMountConfigDto {
        /**是否启用KPFS挂载，默认false*/
        @KsYunField(name="KpfsEnable")
        private Boolean KpfsEnable;

        /**KPFS挂载点列表，KpfsMountConfig.KpfsEnable=true时必填，最多5个*/
        @KsYunField(name="KpfsMountPoints",type=2)
        private List<KpfsMountConfigKpfsMountPointsDto> KpfsMountPointsList;

        @Data
        @ToString
        public static class KpfsMountConfigKpfsMountPointsDto {
            /**KPFS文件系统名称，KpfsMountConfig.KpfsEnable=true时必填*/
            @KsYunField(name="FileSystemName")
            private String FileSystemName;

            /**文件系统内路径，必须以 / 开头*/
            @KsYunField(name="RemotePath")
            private String RemotePath;

            /**本地挂载目录，必须以 / 开头，不允许使用系统保留路径，不允许与已有路径冲突*/
            @KsYunField(name="LocalMountPath")
            private String LocalMountPath;

            /**只读权限，默认false*/
            @KsYunField(name="ReadOnly")
            private Boolean ReadOnly;

        }

    }

    /**KS3存储挂载配置，TemplateCategory为Private时生效*/
    @KsYunField(name="Ks3MountConfig")
    private Ks3MountConfigDto Ks3MountConfig;

    @Data
    @ToString
    public static class Ks3MountConfigDto {
        /**是否启用KS3挂载，默认false*/
        @KsYunField(name="Ks3Enable")
        private Boolean Ks3Enable;

        /**KS3挂载点列表，Ks3MountConfig.Ks3Enable=true时必填，最多5个*/
        @KsYunField(name="Ks3MountPoints",type=2)
        private List<Ks3MountConfigKs3MountPointsDto> Ks3MountPointsList;

        @Data
        @ToString
        public static class Ks3MountConfigKs3MountPointsDto {
            /**KS3桶名，Ks3MountConfig.Ks3Enable=true时必填*/
            @KsYunField(name="BucketName")
            private String BucketName;

            /**桶内路径，必须以 / 开头*/
            @KsYunField(name="RemotePath")
            private String RemotePath;

            /**本地挂载目录，必须以 / 开头，不允许使用系统保留路径，不允许与已有路径冲突*/
            @KsYunField(name="LocalMountPath")
            private String LocalMountPath;

            /**只读权限，默认false*/
            @KsYunField(name="ReadOnly")
            private Boolean ReadOnly;

        }

    }

    /**Access Key，Ks3MountConfig.Ks3Enable=true或KpfsMountConfig.KpfsEnable=true时必填*/
    @KsYunField(name="AccessKey")
    private String AccessKey;

    /**Secret Access Key，Ks3MountConfig.Ks3Enable=true或KpfsMountConfig.KpfsEnable=true时必填*/
    @KsYunField(name="SecretAccessKey")
    private String SecretAccessKey;

    /**云主机机型配置。TemplateCategory为Private时生效*/
    @KsYunField(name="KecConfig")
    private KecConfigDto KecConfig;

    @Data
    @ToString
    public static class KecConfigDto {
        /**是否开启云主机kec*/
        @KsYunField(name="KecEnable")
        private Boolean KecEnable;

        /**云主机kec机型配置。不支持CPU和GPU机型混选。*/
        @KsYunField(name="InstanceSpecs",type=2)
        private List<KecConfigInstanceSpecsDto> InstanceSpecsList;

        @Data
        @ToString
        public static class KecConfigInstanceSpecsDto {
            /**机型套餐，如 S6.2B、S6.2A。若镜像源为public，且镜像所对应的沙箱类型为AIO，则指定机型的Memory至少为2G。*/
            @KsYunField(name="InstanceType")
            private String InstanceType;

            /**系统盘配置*/
            @KsYunField(name="SystemDisk")
            private KecConfigInstanceSpecsSystemDiskDto SystemDisk;

            @Data
            @ToString
            public static class KecConfigInstanceSpecsSystemDiskDto {
                /**系统盘类型，可选值见’Size’描述中的’类型’。指定的机型需支持本盘类型。*/
                @KsYunField(name="Type")
                private String Type;

                /**系统盘大小（GB）。可选值范围：
|类型|最小(GB)|最大(GB)|
|-|-|-|
|Local_SSD|20|100|
|SSD3.0|20|500|
|EHDD|20|500|
|ESSD_SYSTEM_PL0|20|500|
|ESSD_SYSTEM_PL1|20|500|
|ESSD_SYSTEM_PL2|461|500|

*/
                @KsYunField(name="Size")
                private Integer Size;

            }

            /**数据盘列表，暂支持最多1块*/
            @KsYunField(name="DataDisks",type=2)
            private List<KecConfigInstanceSpecsDataDisksDto> DataDisksList;

            @Data
            @ToString
            public static class KecConfigInstanceSpecsDataDisksDto {
                /**	
数据盘类型，可选值见’Size’描述中的’类型’、ESSD_PL0 等。所选机型需支持本盘类型。*/
                @KsYunField(name="Type")
                private String Type;

                /**数据盘大小（GB）。可选值范围：
|类型|最小(GB)|最大(GB)|
|-|-|-|
|SSD3.0|10|32000|
|EHDD|10|32000|
|ESSD_PL0|20|32000|
|ESSD_PL1|20|32000|
|ESSD_PL2|461|32000|*/
                @KsYunField(name="Size")
                private Integer Size;

                /**是否随实例删除，默认 true。*/
                @KsYunField(name="DeleteWithInstance")
                private Boolean DeleteWithInstance;

            }

        }

    }

    /**预热配置，TemplateCategory为Private时生效*/
    @KsYunField(name="PreheatConfig")
    private PreheatConfigDto PreheatConfig;

    @Data
    @ToString
    public static class PreheatConfigDto {
        /**是否开启预热，默认false*/
        @KsYunField(name="PreheatEnable")
        private Boolean PreheatEnable;

        /**预热实例个数，PreheatConfig.PreheatEnable=true时必填，最小0，不超过InstanceQuota*/
        @KsYunField(name="PreheatNumber")
        private Integer PreheatNumber;

    }

    /**单模板沙箱实例上限，最小0，不传时动态分配，最大10*/
    @KsYunField(name="InstanceQuota")
    private Integer InstanceQuota;

}
