package ksyun.client.kci.describecontainergroup.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeContainerGroupResponse
* @Description DescribeContainerGroup 返回体
*/
@Data
@ToString
public class DescribeContainerGroupResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回最大记录数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**请求下一页数据起始记录值，如果为0表示全部数据已获取*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**总记录数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**响应数据体*/
    @JsonProperty("ContainerGroups")
    private List<ContainerGroupsDto> ContainerGroups;

    @Data
    @ToString
    public static class ContainerGroupsDto {
        /**容器实例ID*/
        @JsonProperty("ContainerGroupId")
        private String ContainerGroupId;

        /**容器实例名称*/
        @JsonProperty("ContainerGroupName")
        private String ContainerGroupName;

        /**容器实例所在可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**计费类型
- HourlyInstantSettlement 按量付费(按小时实时结算)
- Spot 竞价实例*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**容器实例所在项目ID*/
        @JsonProperty("ProjectId")
        private Long ProjectId;

        /**容器实例类型，当前固定值为RBKCI*/
        @JsonProperty("KciType")
        private String KciType;

        /**容器实例模式
- Cluster 集群模式，通过部署vk连接k8s集群
- STANDALONE 静态Pod启动模式*/
        @JsonProperty("KciMode")
        private String KciMode;

        /**容器实例底层启动的云服务器机型，如N3.4B*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**容器实例状态，并非kubernetes Pod状态
- CreateError 创建失败(底层主机未成功启动)
- Pending Pod未成功调度或者正在调度中
- ImagePulling Pod正在拉镜像
- Running Pod运行中
- Failed Pod运行失败
- Succeeded Pod运行结束
*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间，格式yyyy-MM-dd mm:HH:ss*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**容器实例规格Cpu核数*/
        @JsonProperty("Cpu")
        private Integer Cpu;

        /**容器实例规格内存大小，单位GB*/
        @JsonProperty("Memory")
        private Integer Memory;

        /**Gpu容器实例gpu颗数*/
        @JsonProperty("Gpu")
        private Double Gpu;

        /**是否预留IP*/
        @JsonProperty("RetainIp")
        private Boolean RetainIp;

        /**实例IP保留时间，单位小时*/
        @JsonProperty("RetainIpHours")
        private Integer RetainIpHours;

        /**实例网卡信息，可参考云主机*/
        @JsonProperty("NetworkInterfaceAttributes")
        private List<ContainerGroupsNetworkInterfaceAttributesDto> NetworkInterfaceAttributes;

        @Data
        @ToString
        public static class ContainerGroupsNetworkInterfaceAttributesDto {
            /**网卡ID*/
            @JsonProperty("NetworkInterfaceId")
            private String NetworkInterfaceId;

            /**网卡类型，如主网卡primary*/
            @JsonProperty("NetworkInterfaceType")
            private String NetworkInterfaceType;

            /**虚拟私有网络ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**网络地址IP*/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

            /**公网IP*/
            @JsonProperty("PublicIp")
            private String PublicIp;

            /**网卡物理地址*/
            @JsonProperty("MacAddress")
            private String MacAddress;

            /***/
            @JsonProperty("SecurityGroups")
            private List<ContainerGroupsNetworkInterfaceAttributesSecurityGroupsDto> SecurityGroups;

            @Data
            @ToString
            public static class ContainerGroupsNetworkInterfaceAttributesSecurityGroupsDto {
                /**安全组ID*/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

            }

        }

        /**当前只有无集群模式容器实例返回该值，取值如下:
- Never
- Always
- OnFailure*/
        @JsonProperty("RestartPolicy")
        private String RestartPolicy;

        /**当前无集群模式容器实例才会反回该字段，Pod运行成功结束时间，请参考k8s pod yaml*/
        @JsonProperty("SucceededTime")
        private String SucceededTime;

        /**指定的标签值
- cluster-id
- namespace
- node-name
- pod-name
- cluster-mode
- pod-uuid*/
        @JsonProperty("Labels")
        private List<ContainerGroupsLabelsDto> Labels;

        @Data
        @ToString
        public static class ContainerGroupsLabelsDto {
            /***/
            @JsonProperty("Key")
            private String Key;

            /***/
            @JsonProperty("Value")
            private String Value;

        }

        /**只有无集群模式容器实例才返回，Pod DnsConfig 配置，对应pod yaml中pod.spec.dnsConfig*/
        @JsonProperty("DnsConfig")
        private ContainerGroupsDnsConfigDto DnsConfig;

        @Data
        @ToString
        public static class ContainerGroupsDnsConfigDto {
            /***/
            @JsonProperty("NameServers")
            private List<String> NameServers;

            /***/
            @JsonProperty("Searches")
            private List<String> Searches;

            /***/
            @JsonProperty("Options")
            private List<ContainerGroupsDnsConfigOptionsDto> Options;

            @Data
            @ToString
            public static class ContainerGroupsDnsConfigOptionsDto {
                /***/
                @JsonProperty("Name")
                private String Name;

                /***/
                @JsonProperty("Value")
                private String Value;

            }

        }

        /**只有无集群模式容器实例才返回，pod host配置，对应pod yaml中的pod.spec.hostAliases*/
        @JsonProperty("HostAliases")
        private List<ContainerGroupsHostAliasesDto> HostAliases;

        @Data
        @ToString
        public static class ContainerGroupsHostAliasesDto {
            /***/
            @JsonProperty("Hostnames")
            private List<String> Hostnames;

            /***/
            @JsonProperty("Ip")
            private String Ip;

        }

        /**只有无集群模式容器实例才返回，pod实例创建的volume列表*/
        @JsonProperty("Volumes")
        private List<ContainerGroupsVolumesDto> Volumes;

        @Data
        @ToString
        public static class ContainerGroupsVolumesDto {
            /**存储卷名称*/
            @JsonProperty("Name")
            private String Name;

            /**存储卷类型
- NFSVolume
- EBSVolume
- EmptyDirVolume
- HostPathVolume
- ConfigFileVolume*/
            @JsonProperty("Type")
            private String Type;

            /**NFSVolume存储卷配置，当Volume.Type=NFSVolume时返回*/
            @JsonProperty("NFSVolume")
            private ContainerGroupsVolumesNFSVolumeDto NFSVolume;

            @Data
            @ToString
            public static class ContainerGroupsVolumesNFSVolumeDto {
                /***/
                @JsonProperty("Path")
                private String Path;

                /***/
                @JsonProperty("Server")
                private String Server;

                /***/
                @JsonProperty("ReadOnly")
                private Boolean ReadOnly;

            }

            /**HostPath存储卷配置，当Volume.Type=HostPathVolume时返回*/
            @JsonProperty("HostPathVolume")
            private ContainerGroupsVolumesHostPathVolumeDto HostPathVolume;

            @Data
            @ToString
            public static class ContainerGroupsVolumesHostPathVolumeDto {
                /***/
                @JsonProperty("Path")
                private String Path;

            }

            /**EBSVolume存储卷配置，当Volume.Type=EBSVolume时返回*/
            @JsonProperty("EBSVolume")
            private ContainerGroupsVolumesEBSVolumeDto EBSVolume;

            @Data
            @ToString
            public static class ContainerGroupsVolumesEBSVolumeDto {
                /**文件系统类型，支持ext3、ext4、xfs等*/
                @JsonProperty("FsType")
                private String FsType;

                /**ebs盘id*/
                @JsonProperty("VolumeId")
                private String VolumeId;

            }

            /**ConfigFileVolume存储卷配置，当Volume.Type=ConfigFileVolume时返回*/
            @JsonProperty("ConfigFileVolume")
            private ContainerGroupsVolumesConfigFileVolumeDto ConfigFileVolume;

            @Data
            @ToString
            public static class ContainerGroupsVolumesConfigFileVolumeDto {
                /***/
                @JsonProperty("ConfigFileToPaths")
                private List<ContainerGroupsVolumesConfigFileVolumeConfigFileToPathsDto> ConfigFileToPaths;

                @Data
                @ToString
                public static class ContainerGroupsVolumesConfigFileVolumeConfigFileToPathsDto {
                    /***/
                    @JsonProperty("Path")
                    private String Path;

                }

            }

        }

        /**只有无集群模式容器实例才返回*/
        @JsonProperty("Containers")
        private List<ContainerGroupsContainersDto> Containers;

        @Data
        @ToString
        public static class ContainerGroupsContainersDto {
            /**容器名称*/
            @JsonProperty("Name")
            private String Name;

            /**容器启动命令*/
            @JsonProperty("Commands")
            private List<String> Commands;

            /**容器启动参数*/
            @JsonProperty("Args")
            private List<String> Args;

            /**容器环境变量*/
            @JsonProperty("EnvironmentVars")
            private List<ContainerGroupsContainersEnvironmentVarsDto> EnvironmentVars;

            @Data
            @ToString
            public static class ContainerGroupsContainersEnvironmentVarsDto {
                /**环境变量Key*/
                @JsonProperty("Key")
                private String Key;

                /**环境变量Value*/
                @JsonProperty("Value")
                private String Value;

                /**环境变量Value来源，该字段与Value不会同时存在*/
                @JsonProperty("ValueFrom")
                private ContainerGroupsContainersEnvironmentVarsValueFromDto ValueFrom;

                @Data
                @ToString
                public static class ContainerGroupsContainersEnvironmentVarsValueFromDto {
                    /**字段引用*/
                    @JsonProperty("FieldRef")
                    private ContainerGroupsContainersEnvironmentVarsValueFromFieldRefDto FieldRef;

                    @Data
                    @ToString
                    public static class ContainerGroupsContainersEnvironmentVarsValueFromFieldRefDto {
                        /**字段路径，如status.podIP*/
                        @JsonProperty("FieldPath")
                        private String FieldPath;

                    }

                }

            }

            /**容器申请的Cpu资源，单位核*/
            @JsonProperty("Cpu")
            private Double Cpu;

            /**容器申请的内存资源，单位GB*/
            @JsonProperty("Memory")
            private Double Memory;

            /**容器申请的Gpu资源，单位颗*/
            @JsonProperty("Gpu")
            private Double Gpu;

            /**工作目录*/
            @JsonProperty("WorkingDir")
            private String WorkingDir;

            /**容器运行镜像*/
            @JsonProperty("Image")
            private String Image;

            /**镜像拉取策略*/
            @JsonProperty("ImagePullPolicy")
            private String ImagePullPolicy;

            /**重启次数*/
            @JsonProperty("RestartCount")
            private Integer RestartCount;

            /**容器开放端口*/
            @JsonProperty("Ports")
            private List<ContainerGroupsContainersPortsDto> Ports;

            @Data
            @ToString
            public static class ContainerGroupsContainersPortsDto {
                /**协议*/
                @JsonProperty("Protocol")
                private String Protocol;

                /**端口*/
                @JsonProperty("Port")
                private Integer Port;

            }

            /**容器存储卷挂载点*/
            @JsonProperty("VolumeMounts")
            private List<ContainerGroupsContainersVolumeMountsDto> VolumeMounts;

            @Data
            @ToString
            public static class ContainerGroupsContainersVolumeMountsDto {
                /**存储卷名称*/
                @JsonProperty("Name")
                private String Name;

                /**挂载路径*/
                @JsonProperty("MountPath")
                private String MountPath;

                /**是否只读*/
                @JsonProperty("ReadOnly")
                private Boolean ReadOnly;

            }

            /**当前状态*/
            @JsonProperty("CurrentState")
            private ContainerGroupsContainersCurrentStateDto CurrentState;

            @Data
            @ToString
            public static class ContainerGroupsContainersCurrentStateDto {
                /**开始时间*/
                @JsonProperty("StartTime")
                private String StartTime;

                /**结束时间*/
                @JsonProperty("FinishTime")
                private String FinishTime;

                /**状态*/
                @JsonProperty("State")
                private String State;

                /**原因*/
                @JsonProperty("Reason")
                private String Reason;

                /**命令退出状态码*/
                @JsonProperty("ExitCode")
                private Integer ExitCode;

            }

            /**上一次状态*/
            @JsonProperty("PreviousState")
            private ContainerGroupsContainersPreviousStateDto PreviousState;

            @Data
            @ToString
            public static class ContainerGroupsContainersPreviousStateDto {
                /**开始时间*/
                @JsonProperty("StartTime")
                private String StartTime;

                /**结束时间*/
                @JsonProperty("FinishTime")
                private String FinishTime;

                /**状态*/
                @JsonProperty("State")
                private String State;

                /**原因*/
                @JsonProperty("Reason")
                private String Reason;

                /**退出状态码*/
                @JsonProperty("ExitCode")
                private Integer ExitCode;

            }

            /**存活健康检查配置*/
            @JsonProperty("LivenessProbe")
            private ContainerGroupsContainersLivenessProbeDto LivenessProbe;

            @Data
            @ToString
            public static class ContainerGroupsContainersLivenessProbeDto {
                /**初始延迟时间*/
                @JsonProperty("InitialDelaySeconds")
                private Integer InitialDelaySeconds;

                /**检测周期时间*/
                @JsonProperty("PeriodSeconds")
                private Integer PeriodSeconds;

                /**探测超时时间*/
                @JsonProperty("TimeoutSeconds")
                private Integer TimeoutSeconds;

                /**成功次数阀值*/
                @JsonProperty("SuccessThreshold")
                private Integer SuccessThreshold;

                /**失败次数阀值*/
                @JsonProperty("FailureThreshold")
                private Integer FailureThreshold;

                /**http get请求探测*/
                @JsonProperty("HttpGet")
                private ContainerGroupsContainersLivenessProbeHttpGetDto HttpGet;

                @Data
                @ToString
                public static class ContainerGroupsContainersLivenessProbeHttpGetDto {
                    /**端口*/
                    @JsonProperty("Port")
                    private Integer Port;

                    /**请求路径*/
                    @JsonProperty("Path")
                    private String Path;

                    /**https或者http*/
                    @JsonProperty("Scheme")
                    private String Scheme;

                }

                /**执行命令探测*/
                @JsonProperty("Exec")
                private ContainerGroupsContainersLivenessProbeExecDto Exec;

                @Data
                @ToString
                public static class ContainerGroupsContainersLivenessProbeExecDto {
                    /**命令行*/
                    @JsonProperty("Commands")
                    private List<String> Commands;

                }

                /**tcp探测*/
                @JsonProperty("TcpSocket")
                private ContainerGroupsContainersLivenessProbeTcpSocketDto TcpSocket;

                @Data
                @ToString
                public static class ContainerGroupsContainersLivenessProbeTcpSocketDto {
                    /**端口*/
                    @JsonProperty("Port")
                    private Integer Port;

                }

            }

            /**就绪健康检查配置*/
            @JsonProperty("ReadinessProbe")
            private ContainerGroupsContainersReadinessProbeDto ReadinessProbe;

            @Data
            @ToString
            public static class ContainerGroupsContainersReadinessProbeDto {
                /**初始延迟时间*/
                @JsonProperty("InitialDelaySeconds")
                private Integer InitialDelaySeconds;

                /**健康探测周期*/
                @JsonProperty("PeriodSeconds")
                private Integer PeriodSeconds;

                /**探测超时时间*/
                @JsonProperty("TimeoutSeconds")
                private Integer TimeoutSeconds;

                /**探测成功次数阀值*/
                @JsonProperty("SuccessThreshold")
                private Integer SuccessThreshold;

                /**探测失败阀值*/
                @JsonProperty("FailureThreshold")
                private Integer FailureThreshold;

                /**http get 请求探测*/
                @JsonProperty("HttpGet")
                private ContainerGroupsContainersReadinessProbeHttpGetDto HttpGet;

                @Data
                @ToString
                public static class ContainerGroupsContainersReadinessProbeHttpGetDto {
                    /**端口*/
                    @JsonProperty("Port")
                    private Integer Port;

                    /**请求路径*/
                    @JsonProperty("Path")
                    private String Path;

                    /**https或http*/
                    @JsonProperty("Scheme")
                    private String Scheme;

                }

                /**命令行exec探测*/
                @JsonProperty("Exec")
                private ContainerGroupsContainersReadinessProbeExecDto Exec;

                @Data
                @ToString
                public static class ContainerGroupsContainersReadinessProbeExecDto {
                    /**命令行*/
                    @JsonProperty("Commands")
                    private List<String> Commands;

                }

                /**tcp探测*/
                @JsonProperty("TcpSocket")
                private ContainerGroupsContainersReadinessProbeTcpSocketDto TcpSocket;

                @Data
                @ToString
                public static class ContainerGroupsContainersReadinessProbeTcpSocketDto {
                    /**端口*/
                    @JsonProperty("Port")
                    private Integer Port;

                }

            }

        }

    }

}
