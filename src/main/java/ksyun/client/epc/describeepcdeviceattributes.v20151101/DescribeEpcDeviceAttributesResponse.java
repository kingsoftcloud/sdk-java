package ksyun.client.epc.describeepcdeviceattributes.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcDeviceAttributesResponse
* @Description DescribeEpcDeviceAttributes 返回体
*/
@Data
@ToString
public class DescribeEpcDeviceAttributesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**设备配置的信息*/
    @JsonProperty("EpcDeviceAttributeSet")
    private List<EpcDeviceAttributeSetDto> EpcDeviceAttributeSet;

    @Data
    @ToString
    public static class EpcDeviceAttributeSetDto {
        /**设备ID*/
        @JsonProperty("DeviceAttributeId")
        private String DeviceAttributeId;

        /**云物理主机机型*/
        @JsonProperty("HostType")
        private String HostType;

        /**云物理主机机型的名称*/
        @JsonProperty("HostTypeName")
        private String HostTypeName;

        /**内存*/
        @JsonProperty("Memory")
        private String Memory;

        /**网卡*/
        @JsonProperty("NetworkCard")
        private String NetworkCard;

        /**CPU信息*/
        @JsonProperty("CpuDeviceSet")
        private List<CpuDeviceSetDto> CpuDeviceSet;

        @Data
        @ToString
        public static class CpuDeviceSetDto {
            /**CPU*/
            @JsonProperty("CpuSpec")
            private String CpuSpec;

        }

        /**GPU信息*/
        @JsonProperty("GpuDeviceSet")
        private List<GpuDeviceSetDto> GpuDeviceSet;

        @Data
        @ToString
        public static class GpuDeviceSetDto {
            /**GPU*/
            @JsonProperty("GpuModel")
            private String GpuModel;

            /**GPU数量*/
            @JsonProperty("GpuCount")
            private String GpuCount;

        }

        /**物理磁盘信息*/
        @JsonProperty("PhysicalDiskDeviceSet")
        private List<PhysicalDiskDeviceSetDto> PhysicalDiskDeviceSet;

        @Data
        @ToString
        public static class PhysicalDiskDeviceSetDto {
            /**磁盘*/
            @JsonProperty("DiskAttribute")
            private String DiskAttribute;

            /**磁盘数量*/
            @JsonProperty("DiskCount")
            private String DiskCount;

            /**磁盘空间*/
            @JsonProperty("Space")
            private String Space;

        }

        /**价格信息*/
        @JsonProperty("PriceSet")
        private List<PriceSetDto> PriceSet;

        @Data
        @ToString
        public static class PriceSetDto {
            /**按月价格*/
            @JsonProperty("MonthlylistPrice")
            private String MonthlylistPrice;

        }

        /**是否套餐组*/
        @JsonProperty("IsGroup")
        private Boolean IsGroup;

        /**套餐组关联子机型信息*/
        @JsonProperty("SubEpcDeviceAttributeSet")
        private List<SubEpcDeviceAttributeSetDto> SubEpcDeviceAttributeSet;

        @Data
        @ToString
        public static class SubEpcDeviceAttributeSetDto {
            /**设备ID*/
            @JsonProperty("DeviceAttributeId")
            private String DeviceAttributeId;

            /**云物理主机机型*/
            @JsonProperty("HostType")
            private String HostType;

            /**云物理主机机型的名称*/
            @JsonProperty("HostTypeName")
            private String HostTypeName;

            /**内存*/
            @JsonProperty("Memory")
            private String Memory;

            /**CPU信息*/
            @JsonProperty("CpuDeviceSet")
            private List<CpuDeviceSetDto> CpuDeviceSet;

            @Data
            @ToString
            public static class CpuDeviceSetDto {
                /**CPU*/
                @JsonProperty("CpuSpec")
                private String CpuSpec;

            }

            /**GPU信息*/
            @JsonProperty("GpuDeviceSet")
            private List<GpuDeviceSetDto> GpuDeviceSet;

            @Data
            @ToString
            public static class GpuDeviceSetDto {
                /**GPU*/
                @JsonProperty("GpuModel")
                private String GpuModel;

                /**GPU数量*/
                @JsonProperty("GpuCount")
                private String GpuCount;

            }

            /**物理磁盘信息*/
            @JsonProperty("PhysicalDiskDeviceSet")
            private List<PhysicalDiskDeviceSetDto> PhysicalDiskDeviceSet;

            @Data
            @ToString
            public static class PhysicalDiskDeviceSetDto {
                /**磁盘*/
                @JsonProperty("DiskAttribute")
                private String DiskAttribute;

                /**磁盘数量*/
                @JsonProperty("DiskCount")
                private String DiskCount;

                /**磁盘空间*/
                @JsonProperty("Space")
                private String Space;

            }

            /**子机型code*/
            @JsonProperty("SubHostType")
            private String SubHostType;

            /**子机型code名称*/
            @JsonProperty("SubHostTypeName")
            private String SubHostTypeName;

            /**是否套餐组*/
            @JsonProperty("IsGroup")
            private Boolean IsGroup;

            /**vpc网卡*/
            @JsonProperty("VpcNetworkCard")
            private List<VpcNetworkCardDto> VpcNetworkCard;

            @Data
            @ToString
            public static class VpcNetworkCardDto {
                /**网卡类型*/
                @JsonProperty("Type")
                private String Type;

                /**数量*/
                @JsonProperty("Num")
                private Integer Num;

            }

            /**rdma网卡信息*/
            @JsonProperty("RdmaNetworkCard")
            private List<RdmaNetworkCardDto> RdmaNetworkCard;

            @Data
            @ToString
            public static class RdmaNetworkCardDto {
                /**网卡类型*/
                @JsonProperty("Type")
                private String Type;

                /**数量*/
                @JsonProperty("Num")
                private Integer Num;

                /**网卡种类 IB/RoCE*/
                @JsonProperty("Kind")
                private String Kind;

                /**使用类型 calculate/storage*/
                @JsonProperty("UseType")
                private String UseType;

            }

        }

        /**vpc网卡信息*/
        @JsonProperty("VpcNetworkCard")
        private List<VpcNetworkCardDto> VpcNetworkCard;

        @Data
        @ToString
        public static class VpcNetworkCardDto {
            /**网卡类型*/
            @JsonProperty("Type")
            private String Type;

            /**数量*/
            @JsonProperty("Num")
            private Integer Num;

        }

        /**rdma网卡*/
        @JsonProperty("RdmaNetworkCard")
        private List<RdmaNetworkCardDto> RdmaNetworkCard;

        @Data
        @ToString
        public static class RdmaNetworkCardDto {
            /**网卡类型*/
            @JsonProperty("Type")
            private String Type;

            /**数量*/
            @JsonProperty("Num")
            private Integer Num;

            /**种类 IB/RoCE*/
            @JsonProperty("Kind")
            private String Kind;

            /**使用类型 calculate/storage*/
            @JsonProperty("UseType")
            private String UseType;

        }

    }

}
