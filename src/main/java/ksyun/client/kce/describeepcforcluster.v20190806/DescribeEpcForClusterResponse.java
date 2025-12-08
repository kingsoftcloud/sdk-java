package ksyun.client.kce.describeepcforcluster.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcForClusterResponse
* @Description DescribeEpcForCluster 返回体
*/
@Data
@ToString
public class DescribeEpcForClusterResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**单次调用所返回的最大实例数目*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**示例总数量*/
    @JsonProperty("TotalCount")
    private String TotalCount;

    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**EPC实例信息*/
        @JsonProperty("EpcInstancePara")
        private EpcInstanceParaDto EpcInstancePara;

        @Data
        @ToString
        public static class EpcInstanceParaDto {
            /**实例所属项目ID*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**物理机机型*/
            @JsonProperty("InstanceType")
            private String InstanceType;

            /**CPU信息*/
            @JsonProperty("Cpu")
            private CpuDto Cpu;

            @Data
            @ToString
            public static class CpuDto {
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

            /**内存大小，单位GB*/
            @JsonProperty("Memory")
            private String Memory;

            /**GPU信息*/
            @JsonProperty("Gpu")
            private GpuDto Gpu;

            @Data
            @ToString
            public static class GpuDto {
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
            private List<DiskSetDto> DiskSet;

            @Data
            @ToString
            public static class DiskSetDto {
                /**磁盘类型，枚举值：System（系统盘） 、Data（数据盘）*/
                @JsonProperty("DiskType")
                private String DiskType;

                /**数据盘Raid级别,枚举值为：Raid0, Raid10, Raid5, Raid1，单盘raid0
有效值：Raid0 、Raid10 、 Raid5 、 Raid1 、 SRaid0*/
                @JsonProperty("Raid")
                private String Raid;

                /**磁盘可用容量*/
                @JsonProperty("Space")
                private String Space;

            }

            /**镜像id*/
            @JsonProperty("ImageId")
            private String ImageId;

            /**镜像名称*/
            @JsonProperty("OsName")
            private String OsName;

            /**所在可用区*/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /***/
            @JsonProperty("NetworkInterfaceSet")
            private List<NetworkInterfaceSetDto> NetworkInterfaceSet;

            @Data
            @ToString
            public static class NetworkInterfaceSetDto {
                /**网卡id*/
                @JsonProperty("NetworkInterfaceId")
                private String NetworkInterfaceId;

                /**网卡的类型，主网卡(primary)、从网卡(extension)*/
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
                private List<SecurityGroupSetDto> SecurityGroupSet;

                @Data
                @ToString
                public static class SecurityGroupSetDto {
                    /**安全组的ID*/
                    @JsonProperty("SecurityGroupId")
                    private String SecurityGroupId;

                }

            }

            /**物理机产品类型*/
            @JsonProperty("ProductType")
            private String ProductType;

            /**是否支持加入容器集群*/
            @JsonProperty("EnableContainer")
            private Boolean EnableContainer;

        }

        /**实例类型*/
        @JsonProperty("Type")
        private String Type;

        /**实例状态*/
        @JsonProperty("InstanceStatus")
        private String InstanceStatus;

    }

}
