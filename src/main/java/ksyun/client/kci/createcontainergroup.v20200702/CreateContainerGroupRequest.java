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
    @KsYunField(name="MultiSubnetId",type=2)
    private List<String> MultiSubnetIdList;

    /**安全组ID，最多3个*/
    @KsYunField(name="SecurityGroupId",type=2)
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

    /**EIP实例ID(多值传参用法)，
MultiEipAllocationId 和 EipAllocationId只能同时传一个*/
    @KsYunField(name="MultiEipAllocationId",type=2)
    private List<String> MultiEipAllocationIdList;

    /**自动匹配镜像缓存，默认False*/
    @KsYunField(name="AutoMatchImageCache")
    private Boolean AutoMatchImageCache;

    /**镜像缓存ID，指定镜像缓存，则AutoMatchImageCache无效*/
    @KsYunField(name="ImageCacheId")
    private String ImageCacheId;

    /**容器实例高级属性设置，主要用于控制容器实例底层KVM的启动配置*/
    private AdvanceSettingsDto AdvanceSettingsList;

    @Data
    @ToString
    public static class AdvanceSettingsDto {
        /**容器实例底层云主机启动镜像，该镜像必须是容器实例研发研发提供的镜像，否则无法启动容器实例*/
        @KsYunField(name="ImageId")
        private String ImageId;

        /**本地数据盘，基本已经弃用，仅少量机型支持本地数据盘*/
        @KsYunField(name="DataDiskGb")
        private Integer DataDiskGb;

        /**系统盘配置，有特殊系统盘要求，可填写，系统盘配置会决定可采用的机型*/
        private SystemDiskDto SystemDiskList;

        @Data
        @ToString
        public static class SystemDiskDto {
            /**支持以下几种类型- Local_SSD 本地SSD- SSD3.0 云盘SSD3.0- EHDD 高效云盘- ESSD_SYSTEM_PL0 极速盘- ESSD_SYSTEM_PL1 极速盘- ESSD_SYSTEM_PL2 极速盘请谨慎指定系统盘类型，系统盘类型需要机型的支持*/
            @KsYunField(name="Type")
            private String Type;

            /**系统盘大小范围，当填写了Type，不填写Size时，盘大小默认为最小值Local_SSD 20~100SSD 20~500EHDD 20~500ESSD_SYSTEM_PL0 50~500ESSD_SYSTEM_PL1 50~500ESSD_SYSTEM_PL2 461~500*/
            @KsYunField(name="Size")
            private Integer Size;

        }

    }

    /**容器实例底层云服务器DNS配置*/
    private MachineDnsConfigDto MachineDnsConfigList;

    @Data
    @ToString
    public static class MachineDnsConfigDto {
        /***/
        @KsYunField(name="NameServer",type=2)
        private List<String> NameServerList;

        /***/
        @KsYunField(name="Search",type=2)
        private List<String> SearchList;

        /***/
        @KsYunField(name="Option",type=2)
        private List<OptionDto> OptionList;

        @Data
        @ToString
        public static class OptionDto {
            /***/
            @KsYunField(name="Name")
            private String Name;

            /***/
            @KsYunField(name="Value")
            private String Value;

        }

    }

    /**容器实例底层云主机host配置，如使用场景：当有自建镜像仓库时，可通过此参数配置host，通过域名拉取vpc下自建仓库镜像*/
    @KsYunField(name="MachineHostAliase",type=2)
    private List<MachineHostAliaseDto> MachineHostAliaseList;

    @Data
    @ToString
    public static class MachineHostAliaseDto {
        /***/
        @KsYunField(name="Ip")
        private String Ip;

        /***/
        @KsYunField(name="Hostname",type=2)
        private List<String> HostnameList;

    }

    /****创建无集群模式实例时该字段才生效**，Pod重启策略，不填写默认 Always

- Always 总是重启
- OnFailure 失败时重启
- Never 从不重启*/
    @KsYunField(name="RestartPolicy")
    private String RestartPolicy;

    /****创建无集群模式实例时该字段才生效**拉取镜像仓库私有镜像凭据，公开镜像无须填写。*/
    @KsYunField(name="ImageRegistryCredential",type=2)
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
    @KsYunField(name="Volume",type=2)
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

        /**当Volume.Type=NFSVolume，该配置必须填写*/
        private NFSVolumeDto NFSVolumeList;

        @Data
        @ToString
        public static class NFSVolumeDto {
            /**当Volume.Type=NFSVolume，Server必填*/
            @KsYunField(name="Server")
            private String Server;

            /**当Volume.Type=NFSVolume，路径必填*/
            @KsYunField(name="Path")
            private String Path;

            /***/
            @KsYunField(name="ReadOnly")
            private Boolean ReadOnly;

        }

        /**当Volume.Type=HostPathVolume时，该配置必填*/
        private HostPathVolumeDto HostPathVolumeList;

        @Data
        @ToString
        public static class HostPathVolumeDto {
            /**当Volume.Type=HostPathVolume时，路径必填*/
            @KsYunField(name="Path")
            private String Path;

        }

        /**当Volume.Type=EBSVolume时，该配置必填*/
        private EBSVolumeDto EBSVolumeList;

        @Data
        @ToString
        public static class EBSVolumeDto {
            /**当Volume.Type=EBSVolume时，文件系统类型必填，取值如下- ext3- ext4- xfs*/
            @KsYunField(name="FsType")
            private String FsType;

            /**云盘ID，指定ID，则表示使用已有云盘开实例，其它参数Type、Size、SnapshotId无效*/
            @KsYunField(name="VolumeId")
            private String VolumeId;

            /**数据云盘是否随容器实例删除，默认否*/
            @KsYunField(name="DeleteWithInstance")
            private Boolean DeleteWithInstance;

            /**当VolumeId为空时，云盘类型必填，ESSD盘只支持六代机KVM- SSD3.0- EHDD- ESSD_PL0- ESSD_PL1- ESSD_PL2*/
            @KsYunField(name="Type")
            private String Type;

            /**当VolumeId为空时，数据盘大小必填，大小范围如下(单位GB)- SSD3.0 10~32000- EHDD 10~32000- ESSD_PL0 40~32000- ESSD_PL1 40~32000- ESSD_PL2 461~32000*/
            @KsYunField(name="Size")
            private Integer Size;

            /**基于快照开盘，必须普通快照*/
            @KsYunField(name="SnapshotId")
            private Integer SnapshotId;

        }

        /**当Volume.Type=ConfigFileVolume时，该配置必填*/
        private ConfigFileVolumeDto ConfigFileVolumeList;

        @Data
        @ToString
        public static class ConfigFileVolumeDto {
            /**配置文件的默认权限，采用四位八进制数表示。

例如0644表示权限为-rw-r--r--，0对应-，表示文件类型为普通文件，644对应后续9位字符，表示3组权限，即用户权限为rw-，用户所在组权限为r--，其他用户权限为r--。

权限说明如下：

---：没有任何权限，八进制值为0。

--x：只有执行权限，八进制值为1。

-w-：只有写入权限，八进制值为2。

-wx：有写入和执行权限，八进制值为3。

r--：只有读取权限，八进制值为4。

r-x：有读取和执行权限，八进制值为5。

rw-：有读取和写入权限，八进制值为6。

rwx：具有读取、写入和执行权限，八进制值为7。*/
            @KsYunField(name="DefaultMode")
            private Integer DefaultMode;

            /**当Volume.Type=ConfigFileVolume时，该配置必填*/
            @KsYunField(name="ConfigFileToPath",type=2)
            private List<ConfigFileToPathDto> ConfigFileToPathList;

            @Data
            @ToString
            public static class ConfigFileToPathDto {
                /**相对于挂载目录，配置文件所在的相对文件路径。*/
                @KsYunField(name="Path")
                private String Path;

                /**配置文件内容。需要将内容进行Base64编码。*/
                @KsYunField(name="Content")
                private String Content;

                /**配置文件的权限，如果没有设置，则采用ConfigFileVolume.DefaultMode的值。采用四位八进制数表示。

例如0644表示权限为-rw-r--r--，0对应-，表示文件类型为普通文件，644对应后续9位字符，表示3组权限，即用户权限为rw-，用户所在组权限为r--，其他用户权限为r--。

权限说明如下：

---：没有任何权限，八进制值为0。

--x：只有执行权限，八进制值为1。

-w-：只有写入权限，八进制值为2。

-wx：有写入和执行权限，八进制值为3。

r--：只有读取权限，八进制值为4。

r-x：有读取和执行权限，八进制值为5。

rw-：有读取和写入权限，八进制值为6。

rwx：具有读取、写入和执行权限，八进制值为7。*/
                @KsYunField(name="mode")
                private Integer Mode;

            }

        }

    }

    /****创建无集群模式实例时该字段必填***/
    @KsYunField(name="Container",type=2)
    private List<ContainerDto> ContainerList;

    @Data
    @ToString
    public static class ContainerDto {
        /**容器名称必填，格式`^[a-z0-9]([-a-z0-9]*[a-z0-9])?$`，不能超过63个字符*/
        @KsYunField(name="Name")
        private String Name;

        /**运行命令*/
        @KsYunField(name="Command",type=2)
        private List<String> CommandList;

        /**命令行参数*/
        @KsYunField(name="Arg",type=2)
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

        /**存活探测配置*/
        private LivenessProbeDto LivenessProbeList;

        @Data
        @ToString
        public static class LivenessProbeDto {
            /**初始探测延迟时间*/
            @KsYunField(name="InitialDelaySeconds")
            private Integer InitialDelaySeconds;

            /**探测周期时间，默认10*/
            @KsYunField(name="PeriodSeconds")
            private Integer PeriodSeconds;

            /**探测超时时间，默认1*/
            @KsYunField(name="TimeoutSeconds")
            private Integer TimeoutSeconds;

            /**探测成功次数阀值，固定为1*/
            @KsYunField(name="SuccessThreshold")
            private Integer SuccessThreshold;

            /**探测失败次数阀值，默认1*/
            @KsYunField(name="FailureThreshold")
            private Integer FailureThreshold;

            /**探测方式HttpGet、TcpSocket、Exec三选一， 发送http get请求探测*/
            private HttpGetDto HttpGetList;

            @Data
            @ToString
            public static class HttpGetDto {
                /**端口*/
                @KsYunField(name="Port")
                private Integer Port;

                /**请求路径*/
                @KsYunField(name="Path")
                private String Path;

                /**- HTTPS- HTTP*/
                @KsYunField(name="Scheme")
                private String Scheme;

            }

            /**探测方式HttpGet、TcpSocket、Exec三选一，发送tcp探测*/
            private TcpSocketDto TcpSocketList;

            @Data
            @ToString
            public static class TcpSocketDto {
                /**tcp端口*/
                @KsYunField(name="Port")
                private Integer Port;

            }

            /**探测方式HttpGet、TcpSocket、Exec三选一， 执行命令探测*/
            private ExecDto ExecList;

            @Data
            @ToString
            public static class ExecDto {
                /**命令行*/
                @KsYunField(name="Command",type=2)
                private List<String> CommandList;

            }

        }

        /**就绪探测配置，各参数说明请参考LivenessProbe*/
        private ReadinessProbeDto ReadinessProbeList;

        @Data
        @ToString
        public static class ReadinessProbeDto {
            /**初始探测延时，默认0*/
            @KsYunField(name="InitialDelaySeconds")
            private Integer InitialDelaySeconds;

            /**探测周期默认10*/
            @KsYunField(name="PeriodSeconds")
            private Integer PeriodSeconds;

            /**超时时间默认1*/
            @KsYunField(name="TimeoutSeconds")
            private Integer TimeoutSeconds;

            /**成功次数阀值默认1*/
            @KsYunField(name="SuccessThreshold")
            private Integer SuccessThreshold;

            /**失败次数阀值默认3*/
            @KsYunField(name="FailureThreshold")
            private Integer FailureThreshold;

            /***/
            private HttpGetDto HttpGetList;

            @Data
            @ToString
            public static class HttpGetDto {
                /***/
                @KsYunField(name="Port")
                private Integer Port;

                /***/
                @KsYunField(name="Path")
                private String Path;

                /**- HTTP- HTTPS*/
                @KsYunField(name="Scheme")
                private String Scheme;

            }

            /***/
            private ExecDto ExecList;

            @Data
            @ToString
            public static class ExecDto {
                /***/
                @KsYunField(name="Command",type=2)
                private List<String> CommandList;

            }

            /***/
            private TcpSocketDto TcpSocketList;

            @Data
            @ToString
            public static class TcpSocketDto {
                /***/
                @KsYunField(name="Port")
                private Integer Port;

            }

        }

        /**环境变量*/
        @KsYunField(name="EnvironmentVar",type=2)
        private List<EnvironmentVarDto> EnvironmentVarList;

        @Data
        @ToString
        public static class EnvironmentVarDto {
            /**格式`^[-._a-zA-Z][-._a-zA-Z0-9]*$`*/
            @KsYunField(name="Key")
            private String Key;

            /***/
            @KsYunField(name="Value")
            private String Value;

            /**ValueFrom与Value不能同时存在*/
            private ValueFromDto ValueFromList;

            @Data
            @ToString
            public static class ValueFromDto {
                /**其它方式暂不支持*/
                private FieldRefDto FieldRefList;

                @Data
                @ToString
                public static class FieldRefDto {
                    /**字段路径，如status.podIP*/
                    @KsYunField(name="FieldPath")
                    private String FieldPath;

                }

            }

        }

        /***/
        @KsYunField(name="Port",type=2)
        private List<PortDto> PortList;

        @Data
        @ToString
        public static class PortDto {
            /**容器服务端口*/
            @KsYunField(name="Port")
            private Integer Port;

            /**服务协议- TCP- UDP- HTTP*/
            @KsYunField(name="Protocol")
            private String Protocol;

        }

        /**挂载点信息*/
        @KsYunField(name="VolumeMount",type=2)
        private List<VolumeMountDto> VolumeMountList;

        @Data
        @ToString
        public static class VolumeMountDto {
            /**Volume名称，必填，它必须是Volume.N中已存在的名称*/
            @KsYunField(name="Name")
            private String Name;

            /**挂载路径*/
            @KsYunField(name="MountPath")
            private String MountPath;

            /**是否只读*/
            @KsYunField(name="ReadOnly")
            private Boolean ReadOnly;

        }

    }

    /****创建无集群模式实例时该字段必填**pod dns配置*/
    private DnsConfigDto DnsConfigList;

    @Data
    @ToString
    public static class DnsConfigDto {
        /***/
        @KsYunField(name="NameServer",type=2)
        private List<String> NameServerList;

        /***/
        @KsYunField(name="Search",type=2)
        private List<String> SearchList;

        /***/
        @KsYunField(name="Option",type=2)
        private List<OptionDto> OptionList;

        @Data
        @ToString
        public static class OptionDto {
            /***/
            @KsYunField(name="Name")
            private String Name;

            /***/
            @KsYunField(name="Value")
            private String Value;

        }

    }

    /****创建无集群模式实例时该字段必填**pod host配置*/
    @KsYunField(name="HostAliase",type=2)
    private List<HostAliaseDto> HostAliaseList;

    @Data
    @ToString
    public static class HostAliaseDto {
        /***/
        @KsYunField(name="Ip")
        private String Ip;

        /***/
        @KsYunField(name="Hostname",type=2)
        private List<String> HostnameList;

    }

    /****非Serverless集群模式容器实例创建时必填**集群DNS*/
    @KsYunField(name="ClusterDns")
    private String ClusterDns;

    /****非Serverless集群模式容器实例创建时必填**集群域名*/
    @KsYunField(name="ClusterDomain")
    private String ClusterDomain;

    /**创建集群模式容器实例时，cluster-id、namespace、pod-name标签必填，通常该标签由virtual-kubelet组件自动传递。*/
    @KsYunField(name="Label",type=2)
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

    /****创建集群模式容器实例时该字段才生效**KubeProxy配置*/
    private KubeProxyDto KubeProxyList;

    @Data
    @ToString
    public static class KubeProxyDto {
        /**是否启用kubeProxy，默认不启用，启用kubeProxy后，该pod具备访问集群内ClusterIP类型服务的能力*/
        @KsYunField(name="Enabled")
        private Boolean Enabled;

    }

    /****创建集群模式容器实例该字段才生效**pod日志是否采集到klog，默认false，若开启，则按照kce集群的配置的采集规则将日志输出到klog。*/
    @KsYunField(name="KlogEnabled")
    private Boolean KlogEnabled;

    /****创建集群模式容器实例该字段生效**
实例开机时需要创建的ebs数据盘，主要用于创建集群工作负载中指定了ebs类型的存储卷，最大8块ebs盘，这是底层云服务器的限制。*/
    @KsYunField(name="DataDisk",type=2)
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
    @KsYunField(name="ContainerSpec",type=2)
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
