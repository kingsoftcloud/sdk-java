package ksyun.client.kce.describeclusterinstance.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClusterInstanceResponse
* @Description DescribeClusterInstance 返回体
*/
@Data
@ToString
public class DescribeClusterInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**节点实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**节点角色

- Worker
- Master
- Etcd
- Master_Etcd*/
        @JsonProperty("InstanceRole")
        private String InstanceRole;

        /**节点实例状态

- building 创建中
- failed 失败
- normal 正常
- abnormal 异常
- installing 安装中
- deleting 删除中
- rebuilding 重装中*/
        @JsonProperty("InstanceStatus")
        private String InstanceStatus;

        /**虚拟机节点配置信息*/
        @JsonProperty("KecInstancePara")
        private InstanceSetKecInstanceParaDto KecInstancePara;

        @Data
        @ToString
        public static class InstanceSetKecInstanceParaDto {
            /**实例所属项目ID*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**节点套餐*/
            @JsonProperty("InstanceType")
            private String InstanceType;

            /**节点的配置信息*/
            @JsonProperty("InstanceConfigure")
            private InstanceSetKecInstanceParaInstanceConfigureDto InstanceConfigure;

            @Data
            @ToString
            public static class InstanceSetKecInstanceParaInstanceConfigureDto {
                /**cpu核数*/
                @JsonProperty("VCPU")
                private Integer VCPU;

                /**内存大小*/
                @JsonProperty("MemoryGb")
                private Integer MemoryGb;

                /**gpu卡数*/
                @JsonProperty("GPU")
                private Integer GPU;

                /**本地数据盘大小*/
                @JsonProperty("DataDiskGb")
                private Integer DataDiskGb;

                /**系统盘大小*/
                @JsonProperty("RootDiskGb")
                private Integer RootDiskGb;

                /**数据盘类型（SSD3.0、EHDD）*/
                @JsonProperty("DataDiskType")
                private String DataDiskType;

            }

            /**系统盘信息*/
            @JsonProperty("SystemDisk")
            private InstanceSetKecInstanceParaSystemDiskDto SystemDisk;

            @Data
            @ToString
            public static class InstanceSetKecInstanceParaSystemDiskDto {
                /**系统盘类型

- Local_SSD
- SSD3.0
- EHDD
- ESSD_PL0
- ESSD_PL1
- ESSD_PL2*/
                @JsonProperty("DiskType")
                private String DiskType;

                /**系统盘大小*/
                @JsonProperty("DiskSize")
                private Integer DiskSize;

            }

            /**镜像id*/
            @JsonProperty("ImageId")
            private String ImageId;

            /**主网卡私有ip地址*/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

            /**实例的计费方式*/
            @JsonProperty("ChargeType")
            private String ChargeType;

            /**实例创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**节点所在可用区*/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /**主网卡所在的子网id*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**主网卡所在vpcid*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**网卡信息*/
            @JsonProperty("NetworkInterfaceSet")
            private List<InstanceSetKecInstanceParaNetworkInterfaceSetDto> NetworkInterfaceSet;

            @Data
            @ToString
            public static class InstanceSetKecInstanceParaNetworkInterfaceSetDto {
                /**网卡id*/
                @JsonProperty("NetworkInterfaceId")
                private String NetworkInterfaceId;

                /**网卡的类型*/
                @JsonProperty("NetworkInterfaceType")
                private String NetworkInterfaceType;

                /**子网id*/
                @JsonProperty("SubnetId")
                private String SubnetId;

                /**服务器的网卡在vpc中的IP*/
                @JsonProperty("PrivateIpAddress")
                private String PrivateIpAddress;

                /**云服务器MAC*/
                @JsonProperty("MacAddress")
                private String MacAddress;

                /**安全组信息*/
                @JsonProperty("SecurityGroupSet")
                private List<securityGroupSetDto1> SecurityGroupSet;

                @Data
                @ToString
                public static class securityGroupSetDto1 {
                    /***/
                    @JsonProperty("SecurityGroupId")
                    private String SecurityGroupId;

                }

            }

            /**专属宿主机的名称*/
            @JsonProperty("DedicatedName")
            private String DedicatedName;

            /**专属宿主机的id*/
            @JsonProperty("DedicatedId")
            private String DedicatedId;

        }

        /**是否可调度*/
        @JsonProperty("UnSchedulable")
        private Boolean UnSchedulable;

        /**节点驱逐状态*/
        @JsonProperty("DrainStatus")
        private String DrainStatus;

        /**节点所属节点池*/
        @JsonProperty("NodePoolId")
        private String NodePoolId;

        /**节点高级设置*/
        @JsonProperty("AdvancedSetting")
        private InstanceSetAdvancedSettingDto AdvancedSetting;

        @Data
        @ToString
        public static class InstanceSetAdvancedSettingDto {
            /**数据盘挂载设置*/
            @JsonProperty("DataDisk")
            private InstanceSetAdvancedSettingDataDiskDto DataDisk;

            @Data
            @ToString
            public static class InstanceSetAdvancedSettingDataDiskDto {
                /**是否对数据盘格式化并挂载*/
                @JsonProperty("AutoFormatAndMount")
                private Boolean AutoFormatAndMount;

                /**数据盘的文件系统*/
                @JsonProperty("FileSystem")
                private String FileSystem;

                /**数据盘挂载点*/
                @JsonProperty("MountTarget")
                private String MountTarget;

            }

            /**容器运行时，根据集群版本和需求选择*/
            @JsonProperty("ContainerRuntime")
            private String ContainerRuntime;

            /**容器的存储路径*/
            @JsonProperty("DockerPath")
            private String DockerPath;

            /**容器的存储路径*/
            @JsonProperty("ContainerPath")
            private String ContainerPath;

            /**base64编码的用户脚本*/
            @JsonProperty("UserScript")
            private String UserScript;

            /**base64编码的用户脚本*/
            @JsonProperty("PreUserScript")
            private String PreUserScript;

            /**节点加入集群后是否可以正常调度*/
            @JsonProperty("Schedulable")
            private Boolean Schedulable;

            /**标签信息*/
            @JsonProperty("Label")
            private List<InstanceSetAdvancedSettingLabelDto> Label;

            @Data
            @ToString
            public static class InstanceSetAdvancedSettingLabelDto {
                /**标签键*/
                @JsonProperty("Key")
                private String Key;

                /**标签值*/
                @JsonProperty("Value")
                private String Value;

            }

            /**自定义节点上k8s组件的参数*/
            @JsonProperty("ExtraArg")
            private InstanceSetAdvancedSettingExtraArgDto ExtraArg;

            @Data
            @ToString
            public static class InstanceSetAdvancedSettingExtraArgDto {
                /**自定义节点上k8s组件的参数*/
                @JsonProperty("Kubelet")
                private List<String> Kubelet;

            }

            /**自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m*/
            @JsonProperty("ContainerLogMaxSize")
            private String ContainerLogMaxSize;

            /**自定义容器日志采集文件最大数量，默认值为10个*/
            @JsonProperty("ContainerLogMaxFiles")
            private String ContainerLogMaxFiles;

        }

        /**物理机节点配置信息*/
        @JsonProperty("EpcInstancePara")
        private InstanceSetEpcInstanceParaDto EpcInstancePara;

        @Data
        @ToString
        public static class InstanceSetEpcInstanceParaDto {
            /**实例所属项目ID*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**物理机机型*/
            @JsonProperty("InstanceType")
            private String InstanceType;

            /**cpu相关信息*/
            @JsonProperty("Cpu")
            private InstanceSetEpcInstanceParaCpuDto Cpu;

            @Data
            @ToString
            public static class InstanceSetEpcInstanceParaCpuDto {
                /**CPU型号*/
                @JsonProperty("Model")
                private String Model;

                /**CPU主频*/
                @JsonProperty("Frequence")
                private String Frequence;

                /**CPU个数*/
                @JsonProperty("Count")
                private Integer Count;

                /**CPU核数*/
                @JsonProperty("CoreCount")
                private Integer CoreCount;

            }

            /**内存大小*/
            @JsonProperty("Memory")
            private String Memory;

            /**Gpu相关信息*/
            @JsonProperty("Gpu")
            private InstanceSetEpcInstanceParaGpuDto Gpu;

            @Data
            @ToString
            public static class InstanceSetEpcInstanceParaGpuDto {
                /**GPU型号*/
                @JsonProperty("Model")
                private String Model;

                /**显存大小*/
                @JsonProperty("Frequence")
                private String Frequence;

                /**CUDA核心数*/
                @JsonProperty("Count")
                private Integer Count;

                /**计算能力*/
                @JsonProperty("CoreCount")
                private Integer CoreCount;

            }

            /**磁盘信息*/
            @JsonProperty("DiskSet")
            private List<InstanceSetEpcInstanceParaDiskSetDto> DiskSet;

            @Data
            @ToString
            public static class InstanceSetEpcInstanceParaDiskSetDto {
                /**磁盘类型*/
                @JsonProperty("DiskType")
                private String DiskType;

                /**数据盘Raid级别*/
                @JsonProperty("Raid")
                private String Raid;

                /**磁盘可用容*/
                @JsonProperty("Space")
                private String Space;

            }

            /**镜像名称*/
            @JsonProperty("OsName")
            private String OsName;

            /**镜像id*/
            @JsonProperty("ImageId")
            private String ImageId;

            /**实例创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**示例所在可用区*/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /**关联的网卡信息*/
            @JsonProperty("NetworkInterfaceSet")
            private List<InstanceSetEpcInstanceParaNetworkInterfaceSetDto> NetworkInterfaceSet;

            @Data
            @ToString
            public static class InstanceSetEpcInstanceParaNetworkInterfaceSetDto {
                /**网卡id*/
                @JsonProperty("NetworkInterfaceId")
                private String NetworkInterfaceId;

                /**网卡的类型*/
                @JsonProperty("NetworkInterfaceType")
                private String NetworkInterfaceType;

                /**子网id*/
                @JsonProperty("SubnetId")
                private String SubnetId;

                /**服务器的网卡在vpc中的IP*/
                @JsonProperty("PrivateIpAddress")
                private String PrivateIpAddress;

                /**服务器MAC*/
                @JsonProperty("MacAddress")
                private String MacAddress;

                /**安全组信息*/
                @JsonProperty("SecurityGroupSet")
                private List<securityGroupSetDto2> SecurityGroupSet;

                @Data
                @ToString
                public static class securityGroupSetDto2 {
                    /**安全组的ID*/
                    @JsonProperty("SecurityGroupId")
                    private String SecurityGroupId;

                }

            }

            /**是否支持加入容器*/
            @JsonProperty("EnableContainer")
            private Boolean EnableContainer;

            /**EPC类型*/
            @JsonProperty("ProductType")
            private String ProductType;

        }

        /**实例类型

- kec 云服务器实例
- dvm 专属云服务器实例
- epc 物理机实例*/
        @JsonProperty("Type")
        private String Type;

        /**节点异常原因简要描述*/
        @JsonProperty("ErrorMessage")
        private String ErrorMessage;

        /**节点名称*/
        @JsonProperty("NodeName")
        private String NodeName;

    }

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**单页调用返回的最大实例数。*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0。*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**集群内节点实例个数（包括master和worker节点）。*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
