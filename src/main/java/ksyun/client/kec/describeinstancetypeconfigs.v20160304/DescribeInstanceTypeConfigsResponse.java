package ksyun.client.kec.describeinstancetypeconfigs.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceTypeConfigsResponse
* @Description DescribeInstanceTypeConfigs 返回体
*/
@Data
@ToString
public class DescribeInstanceTypeConfigsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceTypeConfigSet")
    private List<InstanceTypeConfigSetDto> InstanceTypeConfigSet;

    @Data
    @ToString
    public static class InstanceTypeConfigSetDto {
        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("InstanceFamily")
        private String InstanceFamily;

        /***/
        @JsonProperty("InstanceFamilyName")
        private String InstanceFamilyName;

        /***/
        @JsonProperty("CPU")
        private Integer CPU;

        /***/
        @JsonProperty("GPU")
        private Integer GPU;

        /***/
        @JsonProperty("Memory")
        private Integer Memory;

        /***/
        @JsonProperty("NetworkInterfaceQuota")
        private InstanceTypeConfigSetNetworkInterfaceQuotaDto NetworkInterfaceQuota;

        @Data
        @ToString
        public static class InstanceTypeConfigSetNetworkInterfaceQuotaDto {
            /***/
            @JsonProperty("NetworkInterfaceCount")
            private Integer NetworkInterfaceCount;

        }

        /***/
        @JsonProperty("PrivateIpQuota")
        private InstanceTypeConfigSetPrivateIpQuotaDto PrivateIpQuota;

        @Data
        @ToString
        public static class InstanceTypeConfigSetPrivateIpQuotaDto {
            /***/
            @JsonProperty("PrivateIpCount")
            private Integer PrivateIpCount;

        }

        /***/
        @JsonProperty("AvailabilityZoneSet")
        private List<InstanceTypeConfigSetAvailabilityZoneSetDto> AvailabilityZoneSet;

        @Data
        @ToString
        public static class InstanceTypeConfigSetAvailabilityZoneSetDto {
            /***/
            @JsonProperty("AzCode")
            private String AzCode;

        }

        /***/
        @JsonProperty("SystemDiskQuotaSet")
        private List<InstanceTypeConfigSetSystemDiskQuotaSetDto> SystemDiskQuotaSet;

        @Data
        @ToString
        public static class InstanceTypeConfigSetSystemDiskQuotaSetDto {
            /***/
            @JsonProperty("SystemDiskType")
            private String SystemDiskType;

        }

        /***/
        @JsonProperty("DataDiskQuotaSet")
        private List<InstanceTypeConfigSetDataDiskQuotaSetDto> DataDiskQuotaSet;

        @Data
        @ToString
        public static class InstanceTypeConfigSetDataDiskQuotaSetDto {
            /***/
            @JsonProperty("DataDiskType")
            private String DataDiskType;

            /***/
            @JsonProperty("DataDiskMinSize")
            private Double DataDiskMinSize;

            /***/
            @JsonProperty("DataDiskMaxsize")
            private Double DataDiskMaxsize;

            /***/
            @JsonProperty("DataDiskCount")
            private Integer DataDiskCount;

            /***/
            @JsonProperty("AvailabilityZoneSet")
            private List<InstanceTypeConfigSetDataDiskQuotaSetAvailabilityZoneSetDto> AvailabilityZoneSet;

            @Data
            @ToString
            public static class InstanceTypeConfigSetDataDiskQuotaSetAvailabilityZoneSetDto {
                /***/
                @JsonProperty("AzCode")
                private String AzCode;

                /***/
                @JsonProperty("IsSellOut")
                private Boolean IsSellOut;

            }

        }

        /***/
        @JsonProperty("GPUspec")
        private String GPUspec;

    }

}
