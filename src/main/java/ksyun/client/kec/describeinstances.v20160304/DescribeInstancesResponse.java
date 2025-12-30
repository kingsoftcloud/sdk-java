package ksyun.client.kec.describeinstances.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstancesResponse
* @Description DescribeInstances 返回体
*/
@Data
@ToString
public class DescribeInstancesResponse extends BaseResponseModel {

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**实例数量*/
    @JsonProperty("InstanceCount")
    private Integer InstanceCount;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstancesSet")
    private List<InstancesSetDto> InstancesSet;

    @Data
    @ToString
    public static class InstancesSetDto {
        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private Integer ProjectId;

        /**是否开启关机不收费*/
        @JsonProperty("ShutdownNoCharge")
        private Boolean ShutdownNoCharge;

        /**是否分配Ipv6地址*/
        @JsonProperty("IsDistributeIpv6")
        private Boolean IsDistributeIpv6;

        /**服务器实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例的资源规格*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("InstanceConfigure")
        private InstancesSetInstanceConfigureDto InstanceConfigure;

        @Data
        @ToString
        public static class InstancesSetInstanceConfigureDto {
            /**vCPU数量*/
            @JsonProperty("VCPU")
            private Integer VCPU;

            /**GPU数量*/
            @JsonProperty("GPU")
            private Integer GPU;

            /**内存容量(单位：Gb)*/
            @JsonProperty("MemoryGb")
            private Integer MemoryGb;

            /**数据盘容量(单位：Gb)*/
            @JsonProperty("DataDiskGb")
            private Integer DataDiskGb;

            /**系统盘大小(单位：Gb）*/
            @JsonProperty("RootDiskGb")
            private Integer RootDiskGb;

            /**数据盘类型*/
            @JsonProperty("DataDiskType")
            private String DataDiskType;

            /**vGPU数量*/
            @JsonProperty("VGPU")
            private String VGPU;

            /**GPU规格信息
*/
            @JsonProperty("Spec")
            private String Spec;

        }

        /**镜像 ID*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**挂载网卡的子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**私网IP地址*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /***/
        @JsonProperty("InstanceState")
        private InstancesSetInstanceStateDto InstanceState;

        @Data
        @ToString
        public static class InstancesSetInstanceStateDto {
            /**实例状态*/
            @JsonProperty("Name")
            private String Name;

            /**是否发生迁移*/
            @JsonProperty("OnMigrate")
            private Boolean OnMigrate;

            /***/
            @JsonProperty("TaskState")
            private String TaskState;

            /**预迁移状态*/
            @JsonProperty("PreMigrationStatus")
            private String PreMigrationStatus;

            /***/
            @JsonProperty("CostTime")
            private String CostTime;

            /***/
            @JsonProperty("TimeStamp")
            private String TimeStamp;

        }

        /***/
        @JsonProperty("IsRunOptimised")
        private Boolean IsRunOptimised;

        /***/
        @JsonProperty("PreMigrateConfig")
        private InstancesSetPreMigrateConfigDto PreMigrateConfig;

        @Data
        @ToString
        public static class InstancesSetPreMigrateConfigDto {
            /***/
            @JsonProperty("VmConfig")
            private InstancesSetPreMigrateConfigVmConfigDto VmConfig;

            @Data
            @ToString
            public static class InstancesSetPreMigrateConfigVmConfigDto {
                /**预迁移目标实例类型*/
                @JsonProperty("InstanceType")
                private String InstanceType;

                /**预迁移目标实例CPU数量*/
                @JsonProperty("Cpu")
                private Integer Cpu;

                /**预迁移目标机型内存容量*/
                @JsonProperty("Mem")
                private Integer Mem;

                /**产品类型*/
                @JsonProperty("ProductType")
                private Integer ProductType;

                /**系统盘类型*/
                @JsonProperty("SystemType")
                private String SystemType;

                /**系统盘容量*/
                @JsonProperty("SystemSize")
                private Integer SystemSize;

                /**宿主机ID*/
                @JsonProperty("DedicatedHostId")
                private String DedicatedHostId;

                /***/
                @JsonProperty("Model")
                private String Model;

            }

            /***/
            @JsonProperty("VolumeConfig")
            private InstancesSetPreMigrateConfigVolumeConfigDto VolumeConfig;

            @Data
            @ToString
            public static class InstancesSetPreMigrateConfigVolumeConfigDto {
                /**盘类型*/
                @JsonProperty("VolumeType")
                private String VolumeType;

                /**盘容量*/
                @JsonProperty("VolumeSize")
                private Integer VolumeSize;

                /**盘的产品类型*/
                @JsonProperty("VolumeProductType")
                private Integer VolumeProductType;

                /**盘ID*/
                @JsonProperty("VolumeId")
                private String VolumeId;

            }

        }

        /***/
        @JsonProperty("Monitoring")
        private InstancesSetMonitoringDto Monitoring;

        @Data
        @ToString
        public static class InstancesSetMonitoringDto {
            /**云监控状态*/
            @JsonProperty("State")
            private String State;

        }

        /***/
        @JsonProperty("NetworkInterfaceSet")
        private List<InstancesSetNetworkInterfaceSetDto> NetworkInterfaceSet;

        @Data
        @ToString
        public static class InstancesSetNetworkInterfaceSetDto {
            /**网卡ID*/
            @JsonProperty("NetworkInterfaceId")
            private String NetworkInterfaceId;

            /**网卡类型*/
            @JsonProperty("NetworkInterfaceType")
            private String NetworkInterfaceType;

            /**网卡VPC ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**MAC地址*/
            @JsonProperty("MacAddress")
            private String MacAddress;

            /**私网IP地址*/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

            /***/
            @JsonProperty("GroupSet")
            private List<InstancesSetNetworkInterfaceSetGroupSetDto> GroupSet;

            @Data
            @ToString
            public static class InstancesSetNetworkInterfaceSetGroupSetDto {
                /**安全组ID用于多安全组*/
                @JsonProperty("GroupId")
                private String GroupId;

            }

            /***/
            @JsonProperty("SecurityGroupSet")
            private List<InstancesSetNetworkInterfaceSetSecurityGroupSetDto> SecurityGroupSet;

            @Data
            @ToString
            public static class InstancesSetNetworkInterfaceSetSecurityGroupSetDto {
                /**安全组ID*/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

            }

            /**加入此安全组的云服务器网卡名称*/
            @JsonProperty("NetworkInterfaceName")
            private String NetworkInterfaceName;

        }

        /**是否支持 SR-IOV*/
        @JsonProperty("SriovNetSupport")
        private String SriovNetSupport;

        /***/
        @JsonProperty("IsShowSriovNetSupport")
        private Boolean IsShowSriovNetSupport;

        /**创建日期*/
        @JsonProperty("CreationDate")
        private String CreationDate;

        /**可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**可用区名称*/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /***/
        @JsonProperty("DataGuardSet")
        private List<InstancesSetDataGuardSetDto> DataGuardSet;

        @Data
        @ToString
        public static class InstancesSetDataGuardSetDto {
            /**容灾组ID*/
            @JsonProperty("DataGuardId")
            private String DataGuardId;

            /**容灾组名称*/
            @JsonProperty("DataGuardName")
            private String DataGuardName;

            /**容灾组类型*/
            @JsonProperty("DataGuardType")
            private String DataGuardType;

        }

        /**宿主机名称*/
        @JsonProperty("DedicatedName")
        private String DedicatedName;

        /**宿主机集群ID*/
        @JsonProperty("DedicatedClusterId")
        private String DedicatedClusterId;

        /**宿主机Uuid
*/
        @JsonProperty("DedicatedUuid")
        private String DedicatedUuid;

        /**弹性伸缩类型*/
        @JsonProperty("AutoScalingType")
        private String AutoScalingType;

        /***/
        @JsonProperty("LargeEBSCapacity")
        private String LargeEBSCapacity;

        /***/
        @JsonProperty("Metadata")
        private List<InstancesSetMetadataDto> Metadata;

        @Data
        @ToString
        public static class InstancesSetMetadataDto {
            /***/
            @JsonProperty("Id")
            private String Id;

            /***/
            @JsonProperty("Key")
            private Boolean Key;

            /***/
            @JsonProperty("Value")
            private String Value;

            /***/
            @JsonProperty("Instance_uuid")
            private String Instance_uuid;

        }

        /**产品类型ID*/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /**1 正式产品 2试用产品*/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /**是否支持在线升配*/
        @JsonProperty("LiveUpgradeSupport")
        private Boolean LiveUpgradeSupport;

        /**调用时需要明确指定，无默认值

示例值：Monthly(包年包月）、Daily（按量付费（按日月结）)、 HourlyInstantSettlement（按量付费（按小时月结））*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /***/
        @JsonProperty("SystemDisk")
        private InstancesSetSystemDiskDto SystemDisk;

        @Data
        @ToString
        public static class InstancesSetSystemDiskDto {
            /**系统盘类型*/
            @JsonProperty("DiskType")
            private String DiskType;

            /**系统盘容量大小*/
            @JsonProperty("DiskSize")
            private Integer DiskSize;

        }

        /**主机名称*/
        @JsonProperty("HostName")
        private String HostName;

        /**实例自定义数据*/
        @JsonProperty("UserData")
        private String UserData;

        /**是否可迁移，0：不可迁移，1：可迁移，-1：正在迁移*/
        @JsonProperty("Migration")
        private Integer Migration;

        /***/
        @JsonProperty("DataDisks")
        private List<InstancesSetDataDisksDto> DataDisks;

        @Data
        @ToString
        public static class InstancesSetDataDisksDto {
            /**数据盘ID*/
            @JsonProperty("DiskId")
            private String DiskId;

            /**数据盘类型*/
            @JsonProperty("DiskType")
            private String DiskType;

            /**数据盘容量大小*/
            @JsonProperty("DiskSize")
            private Integer DiskSize;

            /**数据盘是否跟随实例释放*/
            @JsonProperty("DeleteWithInstance")
            private Boolean DeleteWithInstance;

            /**数据盘N是否加密*/
            @JsonProperty("Encrypted")
            private Boolean Encrypted;

        }

        /**VNC支持*/
        @JsonProperty("VncSupport")
        private Boolean VncSupport;

        /**镜像版本*/
        @JsonProperty("Platform")
        private String Platform;

        /**开机失败是否自动删除，默认值为false*/
        @JsonProperty("FailureAutoDelete")
        private Boolean FailureAutoDelete;

        /**是否同步ebs标签*/
        @JsonProperty("SyncTag")
        private Boolean SyncTag;

    }

}
