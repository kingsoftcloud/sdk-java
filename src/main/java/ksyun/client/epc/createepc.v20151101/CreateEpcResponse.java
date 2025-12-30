package ksyun.client.epc.createepc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateEpcResponse
* @Description CreateEpc 返回体
*/
@Data
@ToString
public class CreateEpcResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("AutoReserveInfo")
    private AutoReserveInfoDto AutoReserveInfo;

    @Data
    @ToString
    public static class AutoReserveInfoDto {
        /***/
        @JsonProperty("Reserve")
        private Boolean Reserve;

        /***/
        @JsonProperty("HostId")
        private String HostId;

    }

    /***/
    @JsonProperty("Host")
    private HostDto Host;

    @Data
    @ToString
    public static class HostDto {
        /***/
        @JsonProperty("TorName")
        private String TorName;

        /***/
        @JsonProperty("RackId")
        private String RackId;

        /***/
        @JsonProperty("ContainerAgent")
        private String ContainerAgent;

        /***/
        @JsonProperty("KesAgent")
        private String KesAgent;

        /***/
        @JsonProperty("BondAttribute")
        private String BondAttribute;

        /***/
        @JsonProperty("GpuImageDriverId")
        private String GpuImageDriverId;

        /***/
        @JsonProperty("NvmeDataFileType")
        private String NvmeDataFileType;

        /***/
        @JsonProperty("Memory")
        private String Memory;

        /***/
        @JsonProperty("Raid")
        private String Raid;

        /***/
        @JsonProperty("CloudMonitorAgent")
        private String CloudMonitorAgent;

        /***/
        @JsonProperty("DataDiskCatalogue")
        private String DataDiskCatalogue;

        /***/
        @JsonProperty("NetworkInterfaceMode")
        private String NetworkInterfaceMode;

        /***/
        @JsonProperty("RaidTemplateId")
        private String RaidTemplateId;

        /***/
        @JsonProperty("DataVolumeSet")
        private List<HostDataVolumeSetDto> DataVolumeSet;

        @Data
        @ToString
        public static class HostDataVolumeSetDto {
            /***/
            @JsonProperty("VolumeId")
            private String VolumeId;

            /***/
            @JsonProperty("VolumeType")
            private String VolumeType;

            /***/
            @JsonProperty("DeleteWithInstance")
            private Boolean DeleteWithInstance;

            /***/
            @JsonProperty("VolumeSize")
            private String VolumeSize;

        }

        /***/
        @JsonProperty("ImageId")
        private String ImageId;

        /***/
        @JsonProperty("SystemVolumeType")
        private String SystemVolumeType;

        /***/
        @JsonProperty("HostName")
        private String HostName;

        /***/
        @JsonProperty("Tags")
        private String Tags;

        /***/
        @JsonProperty("SystemFileType")
        private String SystemFileType;

        /***/
        @JsonProperty("EnableBond")
        private Boolean EnableBond;

        /***/
        @JsonProperty("ProductType")
        private String ProductType;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("HostId")
        private String HostId;

        /***/
        @JsonProperty("NetworkInterfaceAttributeSet")
        private List<HostNetworkInterfaceAttributeSetDto> NetworkInterfaceAttributeSet;

        @Data
        @ToString
        public static class HostNetworkInterfaceAttributeSetDto {
            /***/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

            /***/
            @JsonProperty("NetworkInterfaceType")
            private String NetworkInterfaceType;

            /***/
            @JsonProperty("SecurityGroupSet")
            private List<HostNetworkInterfaceAttributeSetSecurityGroupSetDto> SecurityGroupSet;

            @Data
            @ToString
            public static class HostNetworkInterfaceAttributeSetSecurityGroupSetDto {
                /***/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

            }

            /***/
            @JsonProperty("DNS1")
            private String DNS1;

            /***/
            @JsonProperty("DNS2")
            private String DNS2;

            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("NetworkInterfaceId")
            private String NetworkInterfaceId;

            /***/
            @JsonProperty("Mac")
            private String Mac;

            /***/
            @JsonProperty("VpcId")
            private String VpcId;

        }

        /***/
        @JsonProperty("ComputerName")
        private String ComputerName;

        /***/
        @JsonProperty("CabinetId")
        private String CabinetId;

        /***/
        @JsonProperty("DiskSet")
        private List<HostDiskSetDto> DiskSet;

        @Data
        @ToString
        public static class HostDiskSetDto {
            /***/
            @JsonProperty("DiskType")
            private String DiskType;

            /***/
            @JsonProperty("Space")
            private String Space;

            /***/
            @JsonProperty("DiskCount")
            private Integer DiskCount;

            /***/
            @JsonProperty("Raid")
            private String Raid;

            /***/
            @JsonProperty("DiskAttribute")
            private String DiskAttribute;

            /***/
            @JsonProperty("SystemDiskSpace")
            private String SystemDiskSpace;

            /***/
            @JsonProperty("DiskSpace")
            private String DiskSpace;

        }

        /***/
        @JsonProperty("DataDiskCatalogueSuffix")
        private String DataDiskCatalogueSuffix;

        /***/
        @JsonProperty("DataFileType")
        private String DataFileType;

        /***/
        @JsonProperty("HostType")
        private String HostType;

        /***/
        @JsonProperty("SystemVolumeSize")
        private String SystemVolumeSize;

        /***/
        @JsonProperty("NvmeDataDiskCatalogue")
        private String NvmeDataDiskCatalogue;

        /***/
        @JsonProperty("HostStatus")
        private String HostStatus;

        /***/
        @JsonProperty("EnableContainer")
        private Boolean EnableContainer;

        /***/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /***/
        @JsonProperty("HyperThreading")
        private String HyperThreading;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("OsName")
        private String OsName;

        /***/
        @JsonProperty("CabinetName")
        private String CabinetName;

        /***/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /***/
        @JsonProperty("KeyId")
        private String KeyId;

        /***/
        @JsonProperty("AllowModifyHyperThreading")
        private Boolean AllowModifyHyperThreading;

        /***/
        @JsonProperty("ReleasableTime")
        private String ReleasableTime;

        /***/
        @JsonProperty("RackName")
        private String RackName;

        /***/
        @JsonProperty("KmrAgent")
        private String KmrAgent;

        /***/
        @JsonProperty("Sn")
        private String Sn;

        /***/
        @JsonProperty("NvmeDataDiskCatalogueSuffix")
        private String NvmeDataDiskCatalogueSuffix;

        /***/
        @JsonProperty("SecurityAgent")
        private String SecurityAgent;

        /***/
        @JsonProperty("SupportEbs")
        private String SupportEbs;

        /***/
        @JsonProperty("KplAgent")
        private String KplAgent;

        /***/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /***/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /***/
        @JsonProperty("Cpu")
        private HostCpuDto Cpu;

        @Data
        @ToString
        public static class HostCpuDto {
            /***/
            @JsonProperty("Model")
            private String Model;

            /***/
            @JsonProperty("Frequence")
            private String Frequence;

            /***/
            @JsonProperty("Count")
            private Integer Count;

            /***/
            @JsonProperty("CoreCount")
            private Integer CoreCount;

        }

        /***/
        @JsonProperty("Gpu")
        private HostGpuDto Gpu;

        @Data
        @ToString
        public static class HostGpuDto {
            /***/
            @JsonProperty("Model")
            private String Model;

            /***/
            @JsonProperty("Frequence")
            private String Frequence;

            /***/
            @JsonProperty("Count")
            private Integer Count;

            /***/
            @JsonProperty("CoreCount")
            private Integer CoreCount;

            /***/
            @JsonProperty("GpuCount")
            private Integer GpuCount;

        }

        /***/
        @JsonProperty("Roces")
        private List<HostRocesDto> Roces;

        @Data
        @ToString
        public static class HostRocesDto {
            /***/
            @JsonProperty("Ip")
            private String Ip;

            /***/
            @JsonProperty("Mask")
            private String Mask;

            /***/
            @JsonProperty("GateWay")
            private String GateWay;

            /***/
            @JsonProperty("Type")
            private String Type;

        }

        /***/
        @JsonProperty("ContractDueTime")
        private String ContractDueTime;

        /***/
        @JsonProperty("AutoDeleteTime")
        private String AutoDeleteTime;

        /***/
        @JsonProperty("VpcTrust")
        private Integer VpcTrust;

        /***/
        @JsonProperty("TimedRegularizationTime")
        private String TimedRegularizationTime;

        /**Anaconda*/
        @JsonProperty("Anacondas")
        private List<String> Anacondas;

        /**训练框架*/
        @JsonProperty("Frameworks")
        private List<String> Frameworks;

        /**推理引擎*/
        @JsonProperty("Engines")
        private List<String> Engines;

        /**AI模型*/
        @JsonProperty("AiModels")
        private List<String> AiModels;

    }

    /**存储集群名称*/
    @JsonProperty("SRoceCluster")
    private String SRoceCluster;

    /**计算Roce卡集群名称*/
    @JsonProperty("RoceCluster")
    private String RoceCluster;

}
