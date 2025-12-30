package ksyun.client.epc.describeepctrashes.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcTrashesResponse
* @Description DescribeEpcTrashes 返回体
*/
@Data
@ToString
public class DescribeEpcTrashesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**Host的信息*/
    @JsonProperty("HostSet")
    private List<HostSetDto> HostSet;

    @Data
    @ToString
    public static class HostSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**裸金属服务器系统内名称*/
        @JsonProperty("ComputerName")
        private String ComputerName;

        /**云物理主机资源ID*/
        @JsonProperty("HostId")
        private String HostId;

        /**云物理主机名称*/
        @JsonProperty("HostName")
        private String HostName;

        /**云物理主机机型*/
        @JsonProperty("HostType")
        private String HostType;

        /**允许开启关闭超线程*/
        @JsonProperty("AllowModifyHyperThreading")
        private Boolean AllowModifyHyperThreading;

        /**可释放的时间*/
        @JsonProperty("ReleasableTime")
        private String ReleasableTime;

        /**上联交换机信息*/
        @JsonProperty("TorName")
        private String TorName;

        /**机柜信息*/
        @JsonProperty("CabinetName")
        private String CabinetName;

        /**机架位*/
        @JsonProperty("RackName")
        private String RackName;

        /**云物理主机序列号*/
        @JsonProperty("Sn")
        private String Sn;

        /**托管机柜ID*/
        @JsonProperty("CabinetId")
        private String CabinetId;

        /**可用区的名称*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**数据盘Raid级别,枚举值为：Raid0, Raid10, Raid5, Raid1，单盘raid0*/
        @JsonProperty("Raid")
        private String Raid;

        /**数据盘模板ID*/
        @JsonProperty("RaidTemplateId")
        private String RaidTemplateId;

        /**镜像资源ID*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**用户密钥对的资源ID*/
        @JsonProperty("KeyId")
        private String KeyId;

        /**网卡的模式,bond4:双网卡做BOND，mode4模式.single:单网卡.dual:两个网卡分别加入不同的VPC*/
        @JsonProperty("NetworkInterfaceMode")
        private String NetworkInterfaceMode;

        /**网卡bond的属性，只有在bond4的模式下才生效*/
        @JsonProperty("BondAttribute")
        private String BondAttribute;

        /**是否支持Bond*/
        @JsonProperty("EnableBond")
        private Boolean EnableBond;

        /**安全组件类型*/
        @JsonProperty("SecurityAgent")
        private String SecurityAgent;

        /**监控组件类型*/
        @JsonProperty("CloudMonitorAgent")
        private String CloudMonitorAgent;

        /**是否支持EBS*/
        @JsonProperty("SupportEbs")
        private String SupportEbs;

        /**云物理主机产品服务类型，租赁(lease)、客户托管（customer）*/
        @JsonProperty("ProductType")
        private String ProductType;

        /**操作系统名称*/
        @JsonProperty("OsName")
        private String OsName;

        /**内存大小，单位：G*/
        @JsonProperty("Memory")
        private String Memory;

        /**云物理主机状态*/
        @JsonProperty("HostStatus")
        private String HostStatus;

        /**容器ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**是否支持容器*/
        @JsonProperty("EnableContainer")
        private Boolean EnableContainer;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**系统盘文件格式*/
        @JsonProperty("SystemFileType")
        private String SystemFileType;

        /**数据盘文件格式*/
        @JsonProperty("DataFileType")
        private String DataFileType;

        /**数据盘目录*/
        @JsonProperty("DataDiskCatalogue")
        private String DataDiskCatalogue;

        /**数据盘目录后缀属性*/
        @JsonProperty("DataDiskCatalogueSuffix")
        private String DataDiskCatalogueSuffix;

        /**NVME数据盘目录后缀属性*/
        @JsonProperty("NvmeDataDiskCatalogueSuffix")
        private String NvmeDataDiskCatalogueSuffix;

        /**数据盘目录*/
        @JsonProperty("NvmeDataDiskCatalogue")
        private String NvmeDataDiskCatalogue;

        /**数据盘文件格式*/
        @JsonProperty("NvmeDataFileType")
        private String NvmeDataFileType;

        /**KES组件类型*/
        @JsonProperty("KesAgent")
        private String KesAgent;

        /**KPL组件类型*/
        @JsonProperty("KplAgent")
        private String KplAgent;

        /**KMR组件类型*/
        @JsonProperty("KmrAgent")
        private String KmrAgent;

        /**磁盘信息*/
        @JsonProperty("DiskSet")
        private List<HostSetDiskSetDto> DiskSet;

        @Data
        @ToString
        public static class HostSetDiskSetDto {
            /**磁盘类型*/
            @JsonProperty("DiskType")
            private String DiskType;

            /**系统盘大小，单位G，仅在磁盘类型*/
            @JsonProperty("SystemDiskSpace")
            private String SystemDiskSpace;

            /**Raid等级*/
            @JsonProperty("Raid")
            private String Raid;

            /**磁盘属性*/
            @JsonProperty("DiskAttribute")
            private String DiskAttribute;

            /**磁盘可用容量，单位G*/
            @JsonProperty("Space")
            private String Space;

            /**磁盘数量*/
            @JsonProperty("DiskCount")
            private Integer DiskCount;

            /***/
            @JsonProperty("DiskSpace")
            private String DiskSpace;

        }

        /**关联的网卡信息*/
        @JsonProperty("NetworkInterfaceAttributeSet")
        private List<HostSetNetworkInterfaceAttributeSetDto> NetworkInterfaceAttributeSet;

        @Data
        @ToString
        public static class HostSetNetworkInterfaceAttributeSetDto {
            /**网卡的ID*/
            @JsonProperty("NetworkInterfaceId")
            private String NetworkInterfaceId;

            /**网卡的类型，主网卡(primary)、从网卡(extension)*/
            @JsonProperty("NetworkInterfaceType")
            private String NetworkInterfaceType;

            /**云物理主机的子网ID */
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**服务器的网卡在VPC中的IP*/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

            /**DNS 1的值,当通过该接口进行修改网络配置时不填写此参数,保持与之前不变*/
            @JsonProperty("DNS1")
            private String DNS1;

            /**DNS 2的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变*/
            @JsonProperty("DNS2")
            private String DNS2;

            /**云物理服务器MAC*/
            @JsonProperty("Mac")
            private String Mac;

            /**安全组的信息*/
            @JsonProperty("SecurityGroupSet")
            private List<HostSetNetworkInterfaceAttributeSetSecurityGroupSetDto> SecurityGroupSet;

            @Data
            @ToString
            public static class HostSetNetworkInterfaceAttributeSetSecurityGroupSetDto {
                /**安全组的ID*/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

            }

            /***/
            @JsonProperty("VpcId")
            private String VpcId;

        }

        /**云硬盘的系统盘类型*/
        @JsonProperty("SystemVolumeType")
        private String SystemVolumeType;

        /**云硬盘系统盘大小*/
        @JsonProperty("SystemVolumeSize")
        private String SystemVolumeSize;

        /**云硬盘数据盘的列表*/
        @JsonProperty("DataVolumeSet")
        private List<HostSetDataVolumeSetDto> DataVolumeSet;

        @Data
        @ToString
        public static class HostSetDataVolumeSetDto {
            /**云硬盘的ID*/
            @JsonProperty("VolumeId")
            private String VolumeId;

            /**云硬盘的类型*/
            @JsonProperty("VolumeType")
            private String VolumeType;

            /**云硬盘的大小*/
            @JsonProperty("VolumeSize")
            private String VolumeSize;

            /**数据盘云硬盘是否随实例删除*/
            @JsonProperty("DeleteWithInstance")
            private Boolean DeleteWithInstance;

        }

        /**GPU镜像驱动ID*/
        @JsonProperty("GpuImageDriverId")
        private String GpuImageDriverId;

        /**标签*/
        @JsonProperty("Tags")
        private String Tags;

        /**超线程*/
        @JsonProperty("HyperThreading")
        private String HyperThreading;

        /***/
        @JsonProperty("RackId")
        private String RackId;

        /***/
        @JsonProperty("ContainerAgent")
        private String ContainerAgent;

        /***/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /***/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /***/
        @JsonProperty("Cpu")
        private HostSetCpuDto Cpu;

        @Data
        @ToString
        public static class HostSetCpuDto {
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
        private HostSetGpuDto Gpu;

        @Data
        @ToString
        public static class HostSetGpuDto {
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
        private List<HostSetRocesDto> Roces;

        @Data
        @ToString
        public static class HostSetRocesDto {
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

    }

}
