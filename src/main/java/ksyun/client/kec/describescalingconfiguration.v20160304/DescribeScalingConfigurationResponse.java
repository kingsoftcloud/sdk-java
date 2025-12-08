package ksyun.client.kec.describescalingconfiguration.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeScalingConfigurationResponse
* @Description DescribeScalingConfiguration 返回体
*/
@Data
@ToString
public class DescribeScalingConfigurationResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ScalingConfigurationCount")
    private Integer ScalingConfigurationCount;

    /***/
    @JsonProperty("ScalingConfigurationSet")
    private List<ScalingConfigurationSetDto> ScalingConfigurationSet;

    @Data
    @ToString
    public static class ScalingConfigurationSetDto {
        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("ContainerLabel")
        private String ContainerLabel;

        /***/
        @JsonProperty("HostName")
        private String HostName;

        /***/
        @JsonProperty("HostNameSuffix")
        private Integer HostNameSuffix;

        /***/
        @JsonProperty("KeyIds")
        private String KeyIds;

        /***/
        @JsonProperty("DataDiskPerformanceMode")
        private String DataDiskPerformanceMode;

        /***/
        @JsonProperty("ScalingConfigurationId")
        private String ScalingConfigurationId;

        /***/
        @JsonProperty("ScalingConfigurationName")
        private String ScalingConfigurationName;

        /***/
        @JsonProperty("ScalingGroupIdSet")
        private List<ScalingConfigurationSetDtoScalingGroupIdSetDto> ScalingGroupIdSet;

        @Data
        @ToString
        public static class ScalingConfigurationSetDtoScalingGroupIdSetDto {
            /***/
            @JsonProperty("ScalingGroupId")
            private String ScalingGroupId;

            /***/
            @JsonProperty("ScalingGroupName")
            private String ScalingGroupName;

        }

        /***/
        @JsonProperty("Cpu")
        private Integer Cpu;

        /***/
        @JsonProperty("Mem")
        private Integer Mem;

        /***/
        @JsonProperty("StorageType")
        private String StorageType;

        /***/
        @JsonProperty("StorageSize")
        private Integer StorageSize;

        /***/
        @JsonProperty("RootSize")
        private Integer RootSize;

        /***/
        @JsonProperty("Gpu")
        private Integer Gpu;

        /***/
        @JsonProperty("ImageId")
        private String ImageId;

        /***/
        @JsonProperty("NeedMonitorAgent")
        private Integer NeedMonitorAgent;

        /***/
        @JsonProperty("NeedSecurityAgent")
        private Integer NeedSecurityAgent;

        /***/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("InstanceTypeSet")
        private List<String> InstanceTypeSet;

        /***/
        @JsonProperty("Available")
        private Integer Available;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("Password")
        private String Password;

        /***/
        @JsonProperty("ProductLine")
        private String ProductLine;

        /***/
        @JsonProperty("ContainerParam")
        private String ContainerParam;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("Project")
        private ScalingConfigurationSetDtoProjectDto Project;

        @Data
        @ToString
        public static class ScalingConfigurationSetDtoProjectDto {
            /***/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /***/
            @JsonProperty("AccountId")
            private Integer AccountId;

            /***/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /***/
            @JsonProperty("ProjectDesc")
            private String ProjectDesc;

            /***/
            @JsonProperty("Krn")
            private String Krn;

            /***/
            @JsonProperty("Status")
            private Integer Status;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

        }

        /***/
        @JsonProperty("ProjectId")
        private Integer ProjectId;

        /***/
        @JsonProperty("KeepImageLogin")
        private Boolean KeepImageLogin;

        /***/
        @JsonProperty("DataDiskEbsDetail")
        private String DataDiskEbsDetail;

        /***/
        @JsonProperty("SystemDiskType")
        private String SystemDiskType;

        /***/
        @JsonProperty("SystemDiskSize")
        private Integer SystemDiskSize;

        /***/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /***/
        @JsonProperty("InstanceNameTimeSuffix")
        private Boolean InstanceNameTimeSuffix;

        /***/
        @JsonProperty("SupportAvailabilityZones")
        private List<String> SupportAvailabilityZones;

        /***/
        @JsonProperty("BillType")
        private Integer BillType;

        /***/
        @JsonProperty("IsRunOptimised")
        private Boolean IsRunOptimised;

        /***/
        @JsonProperty("UserData")
        private String UserData;

        /***/
        @JsonProperty("AddressBandWidth")
        private Integer AddressBandWidth;

        /***/
        @JsonProperty("LineId")
        private String LineId;

        /***/
        @JsonProperty("AddressProjectId")
        private Integer AddressProjectId;

        /***/
        @JsonProperty("AddressChargeType")
        private String AddressChargeType;

        /***/
        @JsonProperty("BandWidthShareId")
        private String BandWidthShareId;

        /***/
        @JsonProperty("LocalVolumeSnapshotId")
        private String LocalVolumeSnapshotId;

        /***/
        @JsonProperty("LocalVolumeSnapshotName")
        private String LocalVolumeSnapshotName;

        /***/
        @JsonProperty("AddressProject")
        private String AddressProject;

        /***/
        @JsonProperty("TagSet")
        private List<ScalingConfigurationSetDtoTagSetDto> TagSet;

        @Data
        @ToString
        public static class ScalingConfigurationSetDtoTagSetDto {
            /***/
            @JsonProperty("Key")
            private String Key;

            /***/
            @JsonProperty("Value")
            private String Value;

        }

        /***/
        @JsonProperty("EbsTagSet")
        private List<ScalingConfigurationSetDtoEbsTagSetDto> EbsTagSet;

        @Data
        @ToString
        public static class ScalingConfigurationSetDtoEbsTagSetDto {
            /***/
            @JsonProperty("Key")
            private String Key;

            /***/
            @JsonProperty("Value")
            private String Value;

        }

        /***/
        @JsonProperty("SpotStrategy")
        private String SpotStrategy;

        /***/
        @JsonProperty("SpotPriceLimit")
        private Double SpotPriceLimit;

        /**是否同步ebs标签*/
        @JsonProperty("SyncTag")
        private Boolean SyncTag;

    }

}
