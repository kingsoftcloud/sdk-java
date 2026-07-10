package ksyun.client.epc.describelaunchtemplateversions.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLaunchTemplateVersionsResponse
* @Description DescribeLaunchTemplateVersions 返回体
*/
@Data
@ToString
public class DescribeLaunchTemplateVersionsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("LaunchTemplateVersions")
    private List<LaunchTemplateVersionsDto> LaunchTemplateVersions;

    @Data
    @ToString
    public static class LaunchTemplateVersionsDto {
        /***/
        @JsonProperty("LaunchTemplateId")
        private String LaunchTemplateId;

        /***/
        @JsonProperty("LaunchTemplateName")
        private String LaunchTemplateName;

        /***/
        @JsonProperty("VersionDescription")
        private String VersionDescription;

        /***/
        @JsonProperty("VersionNumber")
        private Integer VersionNumber;

        /***/
        @JsonProperty("IsDefault")
        private Boolean IsDefault;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("LaunchTemplateVersionData")
        private LaunchTemplateVersionsLaunchTemplateVersionDataDto LaunchTemplateVersionData;

        @Data
        @ToString
        public static class LaunchTemplateVersionsLaunchTemplateVersionDataDto {
            /***/
            @JsonProperty("ChargeType")
            private String ChargeType;

            /***/
            @JsonProperty("PurchaseTime")
            private Integer PurchaseTime;

            /***/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /***/
            @JsonProperty("HostType")
            private String HostType;

            /***/
            @JsonProperty("NetworkInterfaceMode")
            private String NetworkInterfaceMode;

            /***/
            @JsonProperty("BondAttribute")
            private String BondAttribute;

            /***/
            @JsonProperty("ImageId")
            private String ImageId;

            /***/
            @JsonProperty("OsType")
            private String OsType;

            /***/
            @JsonProperty("GpuImageDriverId")
            private String GpuImageDriverId;

            /***/
            @JsonProperty("Raid")
            private String Raid;

            /***/
            @JsonProperty("RaidId")
            private String RaidId;

            /***/
            @JsonProperty("DataDiskMount")
            private String DataDiskMount;

            /***/
            @JsonProperty("SystemFileType")
            private String SystemFileType;

            /***/
            @JsonProperty("DataFileType")
            private String DataFileType;

            /***/
            @JsonProperty("DataDiskCatalogue")
            private String DataDiskCatalogue;

            /***/
            @JsonProperty("DataDiskCatalogueSuffix")
            private String DataDiskCatalogueSuffix;

            /***/
            @JsonProperty("NvmeDataFileType")
            private String NvmeDataFileType;

            /***/
            @JsonProperty("NvmeDataDiskCatalogue")
            private String NvmeDataDiskCatalogue;

            /***/
            @JsonProperty("NvmeDataDiskCatalogueSuffix")
            private String NvmeDataDiskCatalogueSuffix;

            /***/
            @JsonProperty("NetworkInterfaceAttributeSet")
            private List<networkInterfaceAttributeSetDto1> NetworkInterfaceAttributeSet;

            @Data
            @ToString
            public static class networkInterfaceAttributeSetDto1 {
                /***/
                @JsonProperty("VpcId")
                private String VpcId;

                /***/
                @JsonProperty("NetworkInterfaceType")
                private String NetworkInterfaceType;

                /***/
                @JsonProperty("SubnetId")
                private String SubnetId;

                /***/
                @JsonProperty("SecurityGroupSet")
                private List<securityGroupSetDto2> SecurityGroupSet;

                @Data
                @ToString
                public static class securityGroupSetDto2 {
                    /***/
                    @JsonProperty("SecurityGroupId")
                    private String SecurityGroupId;

                }

            }

            /***/
            @JsonProperty("AddressBandWidth")
            private String AddressBandWidth;

            /***/
            @JsonProperty("LineId")
            private String LineId;

            /***/
            @JsonProperty("BandWidthShareId")
            private String BandWidthShareId;

            /***/
            @JsonProperty("AddressChargeType")
            private String AddressChargeType;

            /***/
            @JsonProperty("AddressPurchaseTime")
            private String AddressPurchaseTime;

            /***/
            @JsonProperty("AddressProjectId")
            private String AddressProjectId;

            /***/
            @JsonProperty("HostName")
            private String HostName;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("ComputerName")
            private String ComputerName;

            /***/
            @JsonProperty("HostNameStartNo")
            private Integer HostNameStartNo;

            /***/
            @JsonProperty("ComputerNameStartNo")
            private Integer ComputerNameStartNo;

            /***/
            @JsonProperty("ProjectId")
            private String ProjectId;

            /***/
            @JsonProperty("KeyId")
            private String KeyId;

            /***/
            @JsonProperty("KeepImageCredential")
            private String KeepImageCredential;

            /***/
            @JsonProperty("CloudMonitorAgent")
            private String CloudMonitorAgent;

            /***/
            @JsonProperty("ContainerAgent")
            private String ContainerAgent;

            /***/
            @JsonProperty("ZoneId")
            private String ZoneId;

            /***/
            @JsonProperty("ZoneType")
            private String ZoneType;

            /***/
            @JsonProperty("StorageRoceNetworkCardName")
            private String StorageRoceNetworkCardName;

            /***/
            @JsonProperty("UserData")
            private String UserData;

            /***/
            @JsonProperty("HostTypeName")
            private String HostTypeName;

            /***/
            @JsonProperty("CpuModel")
            private String CpuModel;

            /***/
            @JsonProperty("CpuCount")
            private Integer CpuCount;

            /***/
            @JsonProperty("Memory")
            private String Memory;

            /***/
            @JsonProperty("GpuModel")
            private String GpuModel;

            /***/
            @JsonProperty("CudaVersion")
            private String CudaVersion;

            /***/
            @JsonProperty("CudaDriver")
            private String CudaDriver;

            /***/
            @JsonProperty("KernelVersion")
            private String KernelVersion;

            /***/
            @JsonProperty("NetworkCardSet")
            private List<networkCardSetDto3> NetworkCardSet;

            @Data
            @ToString
            public static class networkCardSetDto3 {
                /***/
                @JsonProperty("Type")
                private String Type;

                /***/
                @JsonProperty("Attribute")
                private String Attribute;

                /***/
                @JsonProperty("Num")
                private Integer Num;

                /***/
                @JsonProperty("Kind")
                private String Kind;

                /***/
                @JsonProperty("UseType")
                private String UseType;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

}
