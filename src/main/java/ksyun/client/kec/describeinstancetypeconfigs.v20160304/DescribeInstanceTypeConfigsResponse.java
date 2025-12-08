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
        private NetworkInterfaceQuotaDto NetworkInterfaceQuota;

        @Data
        @ToString
        public static class NetworkInterfaceQuotaDto {
            /***/
            @JsonProperty("NetworkInterfaceCount")
            private Integer NetworkInterfaceCount;

        }

        /***/
        @JsonProperty("PrivateIpQuota")
        private PrivateIpQuotaDto PrivateIpQuota;

        @Data
        @ToString
        public static class PrivateIpQuotaDto {
            /***/
            @JsonProperty("PrivateIpCount")
            private Integer PrivateIpCount;

        }

        /***/
        @JsonProperty("AvailabilityZoneSet")
        private List<AvailabilityZoneSetDto> AvailabilityZoneSet;

        @Data
        @ToString
        public static class AvailabilityZoneSetDto {
            /***/
            @JsonProperty("AzCode")
            private String AzCode;

        }

        /***/
        @JsonProperty("SystemDiskQuotaSet")
        private List<SystemDiskQuotaSetDto> SystemDiskQuotaSet;

        @Data
        @ToString
        public static class SystemDiskQuotaSetDto {
            /***/
            @JsonProperty("SystemDiskType")
            private String SystemDiskType;

        }

        /***/
        @JsonProperty("DataDiskQuotaSet")
        private List<DataDiskQuotaSetDto> DataDiskQuotaSet;

        @Data
        @ToString
        public static class DataDiskQuotaSetDto {
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
            private List<AvailabilityZoneSetDto> AvailabilityZoneSet;

            @Data
            @ToString
            public static class AvailabilityZoneSetDto {
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
