package ksyun.client.kci.createcontainergroup.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateContainerGroupRequest
* @Description 请求参数
*/
@Data
public class CreateContainerGroupRequest{
    /**容器实例名称，不超过128个字符，只能包含小写字母、数字、和分隔符（“-”，“.”)，不能以分隔符开头或结尾*/
    @KsYunField(name="ContainerGroupName")
    private String ContainerGroupName;

    /**子网ID*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**子网ID(多值传参用法)，如果SubnetId为空，则该参数为必填，最多传5个*/
    @KsYunField(name="MultiSubnetId")
    private List<String> MultiSubnetIdList;

    /**安全组ID，最多3个*/
    @KsYunField(name="SecurityGroupId")
    private List<String> SecurityGroupIdList;

    /**容器实例类型，当前固定为RBKCI*/
    @KsYunField(name="KciType")
    private String KciType;

    /**容器实例底层机型套餐，如N3.4B,没有特殊需求可以不填写，系统以最小规格自动适配，有特殊资源要求的请联系产品咨询所在可用区是否售卖*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**指定容器实例底层资源机型列表，如N3，如果有多个以英文逗号分隔，如S6,X7。系统按填写顺序从InstanceFamily指定的机型列表自动适配规格。如果填写了InstanceType，则忽略该字段。*/
    @KsYunField(name="InstanceFamily")
    private String InstanceFamily;

    /**计费方式- HourlyInstantSettlement 按小时实时结算， 所有机型都支持- Spot 竞价实例，有折扣的机型，仅部分机型支持，需要联系产品*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**竞价实例策略，当计费方式为Spot时，该字段有效，当前固定为SpotAsPriceGo*/
    @KsYunField(name="SpotStrategy")
    private String SpotStrategy;

    /**项目ID，不填写默认0*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**容器实例CPU规格，支持三位小数，最大值256，系统会自动以标准规格适配，如指定的Cpu是2.5核，系统最终可能根据机型还要求开出4核，最小规格去适配*/
    @KsYunField(name="Cpu")
    private Double Cpu;

    /**容器实例内存规格，支持最多三位小数，最大512，单位GB。填写3G，最终系统根据机型以最小规格适配可能开出4G标准规格。*/
    @KsYunField(name="Memory")
    private Double Memory;

    /**Gpu颗数，创建Gpu容器实例时，系统根据Gpu指定的颗数创建符合条件的gpu容器实例，非Gpu机型实例该参数无效*/
    @KsYunField(name="Gpu")
    private Double Gpu;

    /**当创建集群模式容器实例时，KubeConfig必须填写*/
    @KsYunField(name="KubeConfig")
    private String KubeConfig;

    /**是否保留ip，当RetainIp为true时，在相同子网下再次创建同名称的实例时，系统会继续使用上一次的ip，但不保证一定成功，ip可能被其它资源抢占。*/
    @KsYunField(name="RetainIp")
    private Boolean RetainIp;

    /**ip保留时间，默认24小时，最大365*24，如果RetainIp为空或者false时，该字段无效*/
    @KsYunField(name="RetainIpHours")
    private Integer RetainIpHours;

    /**EIP实例ID，容器实例成功启动后会自动进行EIP绑定*/
    @KsYunField(name="EipAllocationId")
    private String EipAllocationId;

    /**自动匹配镜像缓存，默认False*/
    @KsYunField(name="AutoMatchImageCache")
    private Boolean AutoMatchImageCache;

    /**镜像缓存ID，指定镜像缓存，则AutoMatchImageCache无效*/
    @KsYunField(name="ImageCacheId")
    private String ImageCacheId;
    /**容器实例底层云主机host配置，如使用场景：当有自建镜像仓库时，可通过此参数配置host，通过域名拉取vpc下自建仓库镜像*/
    @KsYunField(name="MachineHostAliase")
    private List<MachineHostAliaseDto> MachineHostAliaseList;

    @Data
    @ToString
    public static class MachineHostAliaseDto {
        /***/
        @KsYunField(name="Ip")
        private String Ip;
        /***/
        @KsYunField(name="Hostname")
        private List<String> HostnameList;
    }

    /****创建无集群模式实例时该字段才生效**，Pod重启策略，不填写默认 Always

- Always 总是重启
- OnFailure 失败时重启
- Never 从不重启*/
    @KsYunField(name="RestartPolicy")
    private String RestartPolicy;

    /****创建无集群模式实例时该字段才生效**拉取镜像仓库私有镜像凭据，公开镜像无须填写。*/
    @KsYunField(name="ImageRegistryCredential")
    private List<ImageRegistryCredentialDto> ImageRegistryCredentialList;

    @Data
    @ToString
    public static class ImageRegistryCredentialDto {
        /**仓库域名，不能重复填写相同Server配置*/
        @KsYunField(name="Server")
        private String Server;
        /**镜像仓库用户名*/
        @KsYunField(name="Username")
        private String Username;
        /**镜像仓库密码*/
        @KsYunField(name="Password")
        private String Password;
    }

    /****创建无集群模式实例时该字段必填***/
    @KsYunField(name="Volume")
    private List<VolumeDto> VolumeList;

    @Data
    @ToString
    public static class VolumeDto {
        /**Volume类型
- EBSVolume
- NFSVolume
- HostPathVolume
- EmptyDirVolume
- ConfigFileVolume*/
        @KsYunField(name="Type")
        private String Type;
        /**Volume名称，格式需符合`^[a-z0-9]([-a-z0-9]*[a-z0-9])?$`*/
        @KsYunField(name="Name")
        private String Name;
    }

    /****创建无集群模式实例时该字段必填***/
    @KsYunField(name="Container")
    private List<ContainerDto> ContainerList;

    @Data
    @ToString
    public static class ContainerDto {
        /**容器名称必填，格式`^[a-z0-9]([-a-z0-9]*[a-z0-9])?$`，不能超过63个字符*/
        @KsYunField(name="Name")
        private String Name;
        /**运行命令*/
        @KsYunField(name="Command")
        private List<String> CommandList;
        /**命令行参数*/
        @KsYunField(name="Arg")
        private List<String> ArgList;
        /**最多三位小数*/
        @KsYunField(name="Cpu")
        private Double Cpu;
        /**最多三位小数*/
        @KsYunField(name="Memory")
        private String Memory;
        /**最多三位小数*/
        @KsYunField(name="Gpu")
        private Double Gpu;
        /***/
        @KsYunField(name="WorkingDir")
        private String WorkingDir;
        /**容器运行镜像，必填*/
        @KsYunField(name="Image")
        private String Image;
        /**镜像拉取策略- Always- IfNotPresent- Never*/
        @KsYunField(name="ImagePullPolicy")
        private String ImagePullPolicy;
        /**环境变量*/
        @KsYunField(name="EnvironmentVar")
        private List<Object> EnvironmentVarList;
        /***/
        @KsYunField(name="Port")
        private List<Object> PortList;
        /**挂载点信息*/
        @KsYunField(name="VolumeMount")
        private List<Object> VolumeMountList;
    }

    /****创建无集群模式实例时该字段必填**pod host配置*/
    @KsYunField(name="HostAliase")
    private List<HostAliaseDto> HostAliaseList;

    @Data
    @ToString
    public static class HostAliaseDto {
        /***/
        @KsYunField(name="Ip")
        private String Ip;
        /***/
        @KsYunField(name="Hostname")
        private List<String> HostnameList;
    }

    /****非Serverless集群模式容器实例创建时必填**集群DNS*/
    @KsYunField(name="ClusterDns")
    private String ClusterDns;

    /****非Serverless集群模式容器实例创建时必填**集群域名*/
    @KsYunField(name="ClusterDomain")
    private String ClusterDomain;

    /**创建集群模式容器实例时，cluster-id、namespace、pod-name标签必填，通常该标签由virtual-kubelet组件自动传递。*/
    @KsYunField(name="Label")
    private List<LabelDto> LabelList;

    @Data
    @ToString
    public static class LabelDto {
        /**标签Key列表，支持的标签范围为- cluster-id- namespace- pod-name- node-name*/
        @KsYunField(name="Key")
        private String Key;
        /**必须满足`^[a-zA-Z0-9]([-a-zA-Z0-9._]*[a-zA-Z0-9])?$`，不能超过63个字符*/
        @KsYunField(name="Value")
        private String Value;
    }
    /****创建集群模式容器实例该字段才生效**pod日志是否采集到klog，默认false，若开启，则按照kce集群的配置的采集规则将日志输出到klog。*/
    @KsYunField(name="KlogEnabled")
    private Boolean KlogEnabled;

    /****创建集群模式容器实例该字段生效**
实例开机时需要创建的ebs数据盘，主要用于创建集群工作负载中指定了ebs类型的存储卷，最大8块ebs盘，这是底层云服务器的限制。*/
    @KsYunField(name="DataDisk")
    private List<DataDiskDto> DataDiskList;

    @Data
    @ToString
    public static class DataDiskDto {
        /**这个参数非必填，输入值必须满足`^[0-9a-z-A-Z_-]{2,50}$`*/
        @KsYunField(name="VolumeName")
        private String VolumeName;
        /**云盘类型，创建ebs盘时，必填。

- SSD3.0
- EHDD
- ESSD_PL0
- ESSD_PL1
- ESSD_PL2*/
        @KsYunField(name="Type")
        private String Type;
        /**云盘大小(单位GB)，创建ebs盘时，必填。

- SSD3.0 10~32000
- EHDD 10~32000
- ESSD_PL0 40~32000
- ESSD_PL1 40~32000
- ESSD_PL2 461~32000*/
        @KsYunField(name="Size")
        private Integer Size;
        /**云盘是否随实例删除， 默认false*/
        @KsYunField(name="DeleteWithInstance")
        private Boolean DeleteWithInstance;
        /**快照ID，非必填，只支持普通快照(不支持本地盘快照，普通快照)，基于快照创建数据盘*/
        @KsYunField(name="SnapshotId")
        private String SnapshotId;
    }

    /****创建集群模式容器实例该字段生效**

pod内部所有容器申请的资源列表，不填写，开出的容器实例就是默认规格大小。
计算规格时，优先以Limit值进行计算，Limit值为空，再以Request值累加计算。*/
    @KsYunField(name="ContainerSpec")
    private List<ContainerSpecDto> ContainerSpecList;

    @Data
    @ToString
    public static class ContainerSpecDto {
        /**申请的cpu资源，单位核，最多三位小数*/
        @KsYunField(name="RequestCpu")
        private Double RequestCpu;
        /**
申请的Memory资源，单位GB，最多三位小数
*/
        @KsYunField(name="RequestMem")
        private Double RequestMem;
        /**
限定的cpu资源，单位核，最多三位小数
*/
        @KsYunField(name="LimitCpu")
        private Double LimitCpu;
        /**
限定的Memory资源，单位GB，最多三位小数
*/
        @KsYunField(name="LimitMem")
        private Double LimitMem;
    }


}