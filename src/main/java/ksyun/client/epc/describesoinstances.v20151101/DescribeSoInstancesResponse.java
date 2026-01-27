package ksyun.client.epc.describesoinstances.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoInstancesResponse
* @Description DescribeSoInstances 返回体
*/
@Data
@ToString
public class DescribeSoInstancesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Instances")
    private List<InstancesDto> Instances;

    @Data
    @ToString
    public static class InstancesDto {
        /**2025-02-19T14:43:45+08:00*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**2025-02-19T14:43:53+08:00*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

        /**cn-beijing-6b*/
        @JsonProperty("ZoneId")
        private String ZoneId;

        /**8981d45e-b3dc-44c6-b02f-2d1969551316*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**RUNNING*/
        @JsonProperty("Status")
        private String Status;

        /**ECS-MwaP*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("Description")
        private String Description;

        /**8981d45e-b3dc-44c6-b02f-2d1969551316*/
        @JsonProperty("VpcId")
        private String VpcId;

        /***/
        @JsonProperty("NetworkInterfaces")
        private List<InstancesNetworkInterfacesDto> NetworkInterfaces;

        @Data
        @ToString
        public static class InstancesNetworkInterfacesDto {
            /**8981d45e-b3dc-44c6-b02f-2d1969551316*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**8981d45e-b3dc-44c6-b02f-2d1969551316*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**192.168.**.***/
            @JsonProperty("PrimaryIpAddress")
            private String PrimaryIpAddress;

            /**primary*/
            @JsonProperty("Type")
            private String Type;

            /**00:16:3e:42:**:***/
            @JsonProperty("MacAddress")
            private String MacAddress;

            /***/
            @JsonProperty("Ipv6Addresses")
            /**8981d45e-b3dc-44c6-b02f-2d1969551316*/
            @JsonProperty("SecurityGroupIds")
            private List<String> SecurityGroupIds;

        }

        /***/
        @JsonProperty("RdmaIpAddresses")
        /*****/
        @JsonProperty("KeyPairName")
        private String KeyPairName;

        /**kp-yd6njlvoj6ldcrkn*****/
        @JsonProperty("KeyPairId")
        private String KeyPairId;

        /**NotApplicable*/
        @JsonProperty("StoppedMode")
        private String StoppedMode;

        /**PostPaid*/
        @JsonProperty("InstanceChargeType")
        private String InstanceChargeType;

        /**ecs.d2s.xlarge*/
        @JsonProperty("InstanceTypeId")
        private String InstanceTypeId;

        /**2200-01-01T00:00:00+08:00*/
        @JsonProperty("ExpiredAt")
        private String ExpiredAt;

        /**Linux*/
        @JsonProperty("OsType")
        private String OsType;

        /**CentOS 6.9 64位*/
        @JsonProperty("OsName")
        private String OsName;

        /**4*/
        @JsonProperty("Cpus")
        private Integer Cpus;

        /**16384*/
        @JsonProperty("MemorySize")
        private Integer MemorySize;

        /**i-ydpq4a603kwh2yov*****/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**iv-ydpq4a603kwh2yov*****/
        @JsonProperty("Hostname")
        private String Hostname;

        /**000c67b5-7da0-0000-000b-b79d02*******/
        @JsonProperty("Uuid")
        private String Uuid;

        /***/
        @JsonProperty("LocalVolumes")
        private List<InstancesLocalVolumesDto> LocalVolumes;

        @Data
        @ToString
        public static class InstancesLocalVolumesDto {
            /**LOCAL_HDD*/
            @JsonProperty("VolumeType")
            private String VolumeType;

            /**7452*/
            @JsonProperty("Size")
            private Integer Size;

            /**2*/
            @JsonProperty("Count")
            private Integer Count;

        }

        /***/
        @JsonProperty("CpuOptions")
        private InstancesCpuOptionsDto CpuOptions;

        @Data
        @ToString
        public static class InstancesCpuOptionsDto {
            /**2*/
            @JsonProperty("CoreCount")
            private Integer CoreCount;

            /**2*/
            @JsonProperty("ThreadsPerCore")
            private Integer ThreadsPerCore;

        }

        /**true*/
        @JsonProperty("DeletionProtection")
        private Boolean DeletionProtection;

        /**系统盘信息*/
        @JsonProperty("SystemDisk")
        private InstancesSystemDiskDto SystemDisk;

        @Data
        @ToString
        public static class InstancesSystemDiskDto {
            /**系统盘类型*/
            @JsonProperty("Type")
            private String Type;

            /**系统盘性能级别
示例值：PL0*/
            @JsonProperty("DiskPl")
            private String DiskPl;

            /**系统盘大小*/
            @JsonProperty("Size")
            private Integer Size;

            /**系统盘数量*/
            @JsonProperty("Count")
            private Integer Count;

        }

        /**数据盘信息*/
        @JsonProperty("DataDisk")
        private InstancesDataDiskDto DataDisk;

        @Data
        @ToString
        public static class InstancesDataDiskDto {
            /**数据盘类型*/
            @JsonProperty("Type")
            private String Type;

            /**数据盘性能级别
示例值：PL0*/
            @JsonProperty("DiskPl")
            private String DiskPl;

            /**数据盘大小*/
            @JsonProperty("Size")
            private Integer Size;

            /**数据盘数量*/
            @JsonProperty("Count")
            private Integer Count;

        }

    }

}
