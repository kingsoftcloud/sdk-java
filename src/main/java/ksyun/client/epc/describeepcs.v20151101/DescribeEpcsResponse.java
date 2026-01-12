package ksyun.client.epc.describeepcs.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcsResponse
* @Description DescribeEpcs 返回体
*/
@Data
@ToString
public class DescribeEpcsResponse extends BaseResponseModel {

    /**物理机信息*/
    @JsonProperty("HostSet")
    private List<HostSetDto> HostSet;

    @Data
    @ToString
    public static class HostSetDto {
        /**名称*/
        @JsonProperty("ComputerName")
        private String ComputerName;

        /**KMR组件类型
support
unsupport
*/
        @JsonProperty("KmrAgent")
        private String KmrAgent;

        /**机架位的ID*/
        @JsonProperty("RackId")
        private String RackId;

        /**组名称*/
        @JsonProperty("GroupName")
        private String GroupName;

        /**容器引擎组件类型
supported
unsupported

*/
        @JsonProperty("ContainerAgent")
        private String ContainerAgent;

        /**KES组件类型
support
unsupport*/
        @JsonProperty("KesAgent")
        private String KesAgent;

        /**网卡bond的属性
bond0
bond1
*/
        @JsonProperty("BondAttribute")
        private String BondAttribute;

        /**NVME数据盘目录后缀属性
NoSuffix ：不使用后缀，只有在数据盘有一块的时候，可以使用此参数
NaturalNumber：后缀从1底层的整数
NaturalNumberFromZero：后缀从0递增的整数
*/
        @JsonProperty("NvmeDataDiskCatalogueSuffix")
        private String NvmeDataDiskCatalogueSuffix;

        /**NVME数据盘目录
/disks/nvme-ssd/disk
/data*/
        @JsonProperty("NvmeDataDiskCatalogue")
        private String NvmeDataDiskCatalogue;

        /**NVME数据盘类型
EXT4
XFS
*/
        @JsonProperty("NvmeDataFileType")
        private String NvmeDataFileType;

        /**对超线程的变更
Open：开启
Close：关闭
NoChange：不改变
*/
        @JsonProperty("HyperThreading")
        private String HyperThreading;

        /**数据盘目录后缀属性*/
        @JsonProperty("DataDiskCatalogueSuffix")
        private String DataDiskCatalogueSuffix;

        /**系统盘文件格式
EXT4
XFS
*/
        @JsonProperty("SystemFileType")
        private String SystemFileType;

        /**数据盘文件格式
EXT4
XFS
*/
        @JsonProperty("DataFileType")
        private String DataFileType;

        /**数据盘目录
/DATA/disk：在系统的DATA目录下，系统里展示内容如/DATA/disk1，/DATA/disk2
data：在系统的根目录下，系统里展示内容从/data1开始，如/data1，/data2
*/
        @JsonProperty("DataDiskCatalogue")
        private String DataDiskCatalogue;

        /**可释放的时间*/
        @JsonProperty("ReleasableTime")
        private String ReleasableTime;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**云物理主机名称*/
        @JsonProperty("HostName")
        private String HostName;

        /**云物理主机机型

    计算型
        CAL：标准计算型
        CAL-III：标准计算III型
        CAL-IV：标准计算IV型
        CAL-V：标准计算V型
        MI-I1：标准计算II型
        MI-R1：标准计算III型
        DB：标准存储型
        DB-I：存储I型
        DB-II：标准存储II型
        DB-III：标准存储III型
        DB-IV：标准存储IV型
        DB-VI：标准存储VI型
        DB-VII：标准存储VII型
        DB-III-I：标准存储III型-I
        SSD：计算优化型
        SSD-III：计算效能型
        SSD-VI：计算效能II型
        MI-I2：存储优化型
        SSD-III-II：计算效能型-II
        DB-V：标准存储V型
        MEM-I：内存I型
        DB-VIII：标准存储VIII型
        EIO-I：极致IO型
        EC-I：高性能计算型
        EIO-III：极致IO型-III
        EIOS：极致IO存储型
        SSDS-II：存储优化II型
        SSDS-III：存储优化III型
    GPU型
        GPU-I：GPU I型
        P3E：GPU物理实例标准型
        P3E-R：GPU物理实例标准集群型
        P3X：GPU物理实例效能型
        P3X-R：GPU物理实例效能集群型
        P3S：GPU物理实例性能型
        P3IE：GPU物理实例推理型
        P4E.56F8：标准计算型
        P4X.56D8：效能计算型
        GN6-I：推理II型-I
        GN6-II：推理II型-II
        GN6-III：推理II型-III
        GN3-II：推理I型-II
        GN3-III：推理I型-III
        GND5：效能V型
        CMLU1：寒武纪I型
*/
        @JsonProperty("HostType")
        private String HostType;

        /**机型套餐组*/
        @JsonProperty("GroupHostType")
        private String GroupHostType;

        /**实例Id*/
        @JsonProperty("HostId")
        private String HostId;

        /**机器序列号*/
        @JsonProperty("Sn")
        private String Sn;

        /**roce信息*/
        @JsonProperty("Roces")
        private List<HostSetRocesDto> Roces;

        @Data
        @ToString
        public static class HostSetRocesDto {
            /**IP信息*/
            @JsonProperty("Ip")
            private String Ip;

            /**掩码*/
            @JsonProperty("Mask")
            private String Mask;

            /**网关*/
            @JsonProperty("GateWay")
            private String GateWay;

            /**网卡类型
storage
calculate*/
            @JsonProperty("Type")
            private String Type;

            /**交换机名称*/
            @JsonProperty("SwName")
            private String SwName;

            /**交换机端口*/
            @JsonProperty("SwPort")
            private String SwPort;

            /**网卡名称*/
            @JsonProperty("NetworkCardName")
            private String NetworkCardName;

        }

        /**合同到期时间*/
        @JsonProperty("ContractDueTime")
        private String ContractDueTime;

        /**热备机计费客户ID*/
        @JsonProperty("DependencyUserId")
        private String DependencyUserId;

        /**预约删除时间*/
        @JsonProperty("AutoDeleteTime")
        private String AutoDeleteTime;

        /***/
        @JsonProperty("TimedRegularizationTime")
        private String TimedRegularizationTime;

        /**机柜id*/
        @JsonProperty("CabinetId")
        private String CabinetId;

        /**可用区code*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**数据盘Raid级别

    Raid10
    Raid5
    Raid1
    Raid50
    SRaid0
    Jbod：不做RAID
*/
        @JsonProperty("Raid")
        private String Raid;

        /**数据盘RAID的ID，替代RAID级别，支持多RAID*/
        @JsonProperty("RaidTemplateId")
        private String RaidTemplateId;

        /**镜像id*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**密钥id*/
        @JsonProperty("KeyId")
        private String KeyId;

        /**网卡的模式
bond4：双网卡做BOND，mode4模式
single：单网卡
dual：两个网卡分别加入不同的VPC
*/
        @JsonProperty("NetworkInterfaceMode")
        private String NetworkInterfaceMode;

        /***/
        @JsonProperty("PublicNetworkLimit")
        private Boolean PublicNetworkLimit;

        /**是否支持BOND*/
        @JsonProperty("EnableBond")
        private Boolean EnableBond;

        /**允许开启关闭超线程

    true
    false
*/
        @JsonProperty("AllowModifyHyperThreading")
        private Boolean AllowModifyHyperThreading;

        /**安全组件类型*/
        @JsonProperty("SecurityAgent")
        private String SecurityAgent;

        /**监控组件类型*/
        @JsonProperty("CloudMonitorAgent")
        private String CloudMonitorAgent;

        /**产品类型*/
        @JsonProperty("ProductType")
        private String ProductType;

        /**操作系统名称*/
        @JsonProperty("OsName")
        private String OsName;

        /**内存*/
        @JsonProperty("Memory")
        private String Memory;

        /**物理机状态
Initializing：创建中
Stopped：已关机
Stopping：关机中
Reinstalling ：重装中
Rebooting：重启中
ResetPassword：重置密码中
Starting：开机中
StartHyperThreading：开启超线程中
StopHyperThreading：关闭超线程中
InstallFailed：创建失败
Running：运行中
Packing：打包中
Packed：打包完成
PackError：打包错误
Borrow：借用
ResetPasswordError：重置密码完成
ModifyHyperThreadingError：修改超线程失败
Locked：已停用，待续费
Recycle：已回收
ReinstallFailed：重装失败
NoNetwork：未配置网络
AttachingEbs：挂载云盘中
HotStandbyPreheating：热备机预热
HotStandby：热备机
HotStandbyRepairing：热备机维修
HotStandbyToBeActivated：热备机待激活*/
        @JsonProperty("HostStatus")
        private String HostStatus;

        /***/
        @JsonProperty("Cpu")
        private HostSetCpuDto Cpu;

        @Data
        @ToString
        public static class HostSetCpuDto {
            /**CPU型号*/
            @JsonProperty("Model")
            private String Model;

            /**CPU主频*/
            @JsonProperty("Frequence")
            private String Frequence;

            /**CPU核数*/
            @JsonProperty("Count")
            private Integer Count;

            /**CPU线程数*/
            @JsonProperty("CoreCount")
            private Integer CoreCount;

        }

        /***/
        @JsonProperty("Gpu")
        private HostSetGpuDto Gpu;

        @Data
        @ToString
        public static class HostSetGpuDto {
            /**GPU型号*/
            @JsonProperty("Model")
            private String Model;

            /**GPU频率*/
            @JsonProperty("Frequence")
            private String Frequence;

            /**CUDA核心数*/
            @JsonProperty("Count")
            private Integer Count;

            /**计算能力*/
            @JsonProperty("CoreCount")
            private Integer CoreCount;

            /**GPU的数量*/
            @JsonProperty("GpuCount")
            private Integer GpuCount;

        }

        /***/
        @JsonProperty("DiskSet")
        private List<HostSetDiskSetDto> DiskSet;

        @Data
        @ToString
        public static class HostSetDiskSetDto {
            /**磁盘类型

    System
    Data

*/
            @JsonProperty("DiskType")
            private String DiskType;

            /**Raid等级
Jbod
Raid0
Raid10
Raid5
Raid1
Raid50
SRaid0*/
            @JsonProperty("Raid")
            private String Raid;

            /**原始容量大小*/
            @JsonProperty("DiskSpace")
            private String DiskSpace;

            /**磁盘可用容量(做完raid)*/
            @JsonProperty("Space")
            private String Space;

            /**磁盘展示名称
SATA
U.2NVME
NVMe
PCIESSD
SSD
*/
            @JsonProperty("DiskAttribute")
            private String DiskAttribute;

            /**磁盘数量*/
            @JsonProperty("DiskCount")
            private Integer DiskCount;

        }

        /**关联的网卡信息*/
        @JsonProperty("NetworkInterfaceAttributeSet")
        private List<HostSetNetworkInterfaceAttributeSetDto> NetworkInterfaceAttributeSet;

        @Data
        @ToString
        public static class HostSetNetworkInterfaceAttributeSetDto {
            /**VPCid*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**网卡的ID*/
            @JsonProperty("NetworkInterfaceId")
            private String NetworkInterfaceId;

            /**网卡的类型，主网卡(primary)、从网卡(extension)*/
            @JsonProperty("NetworkInterfaceType")
            private String NetworkInterfaceType;

            /**云物理主机的子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**服务器的网卡在VPC中的IP*/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

            /**DNS1的值*/
            @JsonProperty("DNS1")
            private String DNS1;

            /**DNS2的值*/
            @JsonProperty("DNS2")
            private String DNS2;

            /**云物理服务器MAC*/
            @JsonProperty("Mac")
            private String Mac;

            /***/
            @JsonProperty("SecurityGroupSet")
            private List<HostSetNetworkInterfaceAttributeSetSecurityGroupSetDto> SecurityGroupSet;

            @Data
            @ToString
            public static class HostSetNetworkInterfaceAttributeSetSecurityGroupSetDto {
                /**安全组的ID*/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

            }

            /**弹性公网 IP 绑定信息*/
            @JsonProperty("EipAddress")
            private HostSetNetworkInterfaceAttributeSetEipAddressDto EipAddress;

            @Data
            @ToString
            public static class HostSetNetworkInterfaceAttributeSetEipAddressDto {
                /**弹性IP的带宽*/
                @JsonProperty("BandWidth")
                private Integer BandWidth;

                /**创建时间*/
                @JsonProperty("CreateTime")
                private String CreateTime;

                /**弹性IP的ID*/
                @JsonProperty("AllocationId")
                private String AllocationId;

                /**IP地址*/
                @JsonProperty("PublicIp")
                private String PublicIp;

                /**弹性IP生效状态 start|stop*/
                @JsonProperty("IpState")
                private String IpState;

                /**服务结束时间*/
                @JsonProperty("ServiceEndTime")
                private String ServiceEndTime;

                /**IP版本*/
                @JsonProperty("IpVersion")
                private String IpVersion;

            }

            /**Ipv6地址信息*/
            @JsonProperty("Ipv6Address")
            private String Ipv6Address;

        }

        /**EPC网卡*/
        @JsonProperty("NetworkCardSet")
        private List<HostSetNetworkCardSetDto> NetworkCardSet;

        @Data
        @ToString
        public static class HostSetNetworkCardSetDto {
            /**网卡类型属性*/
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

        }

        /**项目id*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**机柜名称*/
        @JsonProperty("CabinetName")
        private String CabinetName;

        /**机架位名称*/
        @JsonProperty("RackName")
        private String RackName;

        /***/
        @JsonProperty("TorName")
        private String TorName;

        /**集群id*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**是否支持容器agent*/
        @JsonProperty("EnableContainer")
        private Boolean EnableContainer;

        /***/
        @JsonProperty("SupportEbs")
        private String SupportEbs;

        /***/
        @JsonProperty("SystemVolumeType")
        private String SystemVolumeType;

        /**云硬盘系统盘大小*/
        @JsonProperty("SystemVolumeSize")
        private String SystemVolumeSize;

        /***/
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

            /**云硬盘的大小，GB*/
            @JsonProperty("VolumeSize")
            private String VolumeSize;

            /**数据盘云硬盘是否随实例删除*/
            @JsonProperty("DeleteWithInstance")
            private Boolean DeleteWithInstance;

        }

        /**GPU镜像驱动ID*/
        @JsonProperty("GpuImageDriverId")
        private String GpuImageDriverId;

        /**互信VPC*/
        @JsonProperty("VpcTrust")
        private Integer VpcTrust;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**计费类型*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**裸金属服务器anaconda信息*/
        @JsonProperty("Anacondas")
        private List<String> Anacondas;

        /**裸金属服务器训练框架信息*/
        @JsonProperty("Frameworks")
        private List<String> Frameworks;

        /**裸金属服务器推理引擎信息*/
        @JsonProperty("Engines")
        private List<String> Engines;

        /**裸金属服务器AI模型信息*/
        @JsonProperty("AiModels")
        private List<String> AiModels;

        /**RoCE集群*/
        @JsonProperty("RoceCluster")
        private String RoceCluster;

        /**RoCE集群Group*/
        @JsonProperty("RoceClusterGroup")
        private String RoceClusterGroup;

        /**Roce存储集群名称*/
        @JsonProperty("SRoceCluster")
        private String SRoceCluster;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**下一页起始值*/
    @JsonProperty("NextToken")
    private String NextToken;

    /***/
    @JsonProperty("Tags")
    private List<TagsDto> Tags;

    @Data
    @ToString
    public static class TagsDto {
        /***/
        @JsonProperty("ResourceId")
        private String ResourceId;

        /***/
        @JsonProperty("TagId")
        private String TagId;

        /***/
        @JsonProperty("Key")
        private String Key;

        /***/
        @JsonProperty("Value")
        private String Value;

    }

}
