package ksyun.client.epc.createepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateEpcRequest
 * @Description 请求参数
 */
@Data
public class CreateEpcRequest {
    /**
     - 裸金属服务器机型
     - 有效值:
     - CPU型
     - CAL：标准计算型
     - CAL-III：标准计算III型
     - CAL-IV：标准计算IV型
     - CAL-V：标准计算V型
     - MI-I1：标准计算II型
     - DB：标准存储型
     - DB-I：存储I型
     - DB-II：标准存储II型
     - DB-III：标准存储III型
     - DB-III-I：标准存储III型-I
     - DB-IV：标准存储IV型
     - DB-V：标准存储V型
     - DB-VI：标准存储VI型
     - DB-VII：标准存储VII型
     - DB-VIII：标准存储VIII型
     - SSD：计算优化型
     - SSD-III：计算效能型
     - SSD-III-II：计算效能型-II
     - SSD-VI：计算效能II型
     - MI-I2：存储优化型
     - MEM-I：内存I型
     - EC-I：高性能计算型
     - EIO-I：极致IO型
     - EIO-III：极致IO型-III
     - EIOS：极致IO存储型
     - SSDS-II：存储优化II型
     - SSDS-III：存储优化III型
     - SSDS-V：存储优化V型
     - EC-I-V-III：高性能计算型-V-III
     - EC-I-V-V：高性能计算型-V-V
     - EC-I-V-VI：高性能计算型-V-VI
     - GPU型
     - GPU-I：GPU I型
     - P3E：GPU裸金属服务器实例标准型
     - P3E-R：GPU裸金属服务器实例标准集群型
     - P3X：GPU裸金属服务器实例效能型
     - P3X-R：GPU裸金属服务器实例效能集群型
     - P3S：GPU裸金属服务器实例性能型
     - P3IE：GPU裸金属服务器实例推理型
     - P4E.56F8：标准计算型
     - P4X.56D8：效能计算型
     - GN6-I：推理II型-I
     - GN6-II：推理II型-II
     - GN6-III：推理II型-III
     - GN3-II：推理I型-II
     - GN3-III：推理I型-III
     - GND5：效能V型
     - CMLU1：寒武纪I型
     - ...*/
    @KsYunField(name = "HostType")
    private String HostType;

    /**
     * 可用区的名称
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 数据盘Raid级别,和数据盘的数量直接相关
     * 有效值：  Raid1：数据盘数量必须是2的倍数
     * Raid5：数据盘的数量必须大于等于3
     * Raid10：数据盘数量必须是4的倍数
     * Raid50：数据盘的数量必须大于6且是2的倍数
     * SRaid0：单盘SRaid0无限制，仅针对大数据业务自身有冗余的场景
     * 与RaidId必填其一，RaidId优先级高
     */
    @KsYunField(name = "Raid")
    private String Raid;

    /**Raid模板Id*/
    @KsYunField(name = "RaidId")
    private String RaidId;

    /**镜像资源ID,参见DescribeImages*/
    @KsYunField(name = "ImageId")
    private String ImageId;

    /**网卡模式
     有效值：
     bond4：bond模式
     single：非bond模式
     dual：双网卡模式
     windows创建时，只支持非bond模式。*/
    @KsYunField(name = "NetworkInterfaceMode")
    private String NetworkInterfaceMode;

    /**云物理主机的子网ID*/
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**内网资源IP地址*/
    @KsYunField(name = "PrivateIpAddress")
    private String PrivateIpAddress;

    /**用户密钥对的资源ID*/
    @KsYunField(name = "keyId")
    private String KeyId;

    /**裸金属服务器关联的安全组ID，一个裸金属服务器最多可以支持3个安全组*/
    @KsYunField(name = "SecurityGroupId")
    private List<String> SecurityGroupIdList;

    /**DNS1的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变*/
    @KsYunField(name = "DNS1")
    private String DNS1;

    /**DNS2的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变*/
    @KsYunField(name = "DNS2")
    private String DNS2;

    /**云物理主机名称*/
    @KsYunField(name = "HostName")
    private String HostName;

    /**项目的ID*/
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**云物理主机计费类型，包年包月Monthly，按日月结Daily，试用Trial
-有效值：Monthly | Daily | Trial*/
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**购买时长，计费类型为包年包月时不可缺省。*/
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;

    /**系统的登录密码*/
    @KsYunField(name = "Password")
    private String Password;

    /**云监控
- classic：经典版
- no：不开启*/
    @KsYunField(name = "CloudMonitorAgent")
    private String CloudMonitorAgent;

    /**从网卡的子网ID*/
    @KsYunField(name = "ExtensionSubnetId")
    private String ExtensionSubnetId;

    /**从网卡在VPC中的IP*/
    @KsYunField(name="ExtensionPrivateIpAddress")
    private String ExtensionPrivateIpAddress;

    /**DNS1的值*/
    @KsYunField(name = "ExtensionDNS1")
    private String ExtensionDNS1;

    /**DNS2的值*/
    @KsYunField(name = "ExtensionDNS2")
    private String ExtensionDNS2;

    /**描述信息*/
    @KsYunField(name = "Description")
    private String Description;

    /**弹性IP的带宽*/
    @KsYunField(name = "AddressBandWidth")
    private String AddressBandWidth;

    /**弹性IP的链路类型的ID*/
    @KsYunField(name = "LineId")
    private String LineId;

    /**共享带宽ID*/
    @KsYunField(name = "BandWidthShareId")
    private String BandWidthShareId;

    /**弹性IP的计费类型*/
    @KsYunField(name = "AddressChargeType")
    private String AddressChargeType;

    /**购买时长，只有购买包年包月弹性IP时不可缺省*/
    @KsYunField(name = "AddressPurchaseTime")
    private String AddressPurchaseTime;

    /**弹性IP项目的ID*/
    @KsYunField(name = "AddressProjectId")
    private String AddressProjectId;

    /**系统盘文件格式(NTFS仅支持windows)
有效值：EXT4|XFS|NTFS*/
    @KsYunField(name = "SystemFileType")
    private String SystemFileType;

    /**数据盘文件格式(NTFS仅支持windows)
有效值：EXT4|XFS|NTFS
*/
    @KsYunField(name = "DataFileType")
    private String DataFileType;

    /**数据盘目录
     有效值：

     /DATA/disk：在系统的DATA目录下，系统里展示内容如/DATA/disk1，/DATA/disk2
     /data：在系统的根目录下，系统里展示内容从/data1开始，如/data1，/data2
*/
    @KsYunField(name = "DataDiskCatalogue")
    private String DataDiskCatalogue;

    /**数据盘目录后缀属性
     有效值：

     NoSuffix ：不使用后缀，只有在数据盘有一块的时候，可以使用此参数
     NaturalNumber：后缀从1底层的整数
     NaturalNumberFromZero：后缀从0递增的整数
*/
    @KsYunField(name="DataDiskCatalogueSuffix")
    private String DataDiskCatalogueSuffix;

    /**对超线程的变更
     有效值：

     Open：开启
     Close：关闭
    NoChange：不改变
*/
    @KsYunField(name = "HyperThreading")
    private String HyperThreading;

    /**NVME数据盘类型
有效值：

    EXT4
    XFS
*/
    @KsYunField(name = "NvmeDataFileType")
    private String NvmeDataFileType;

    /**NVME数据盘目录*/
    @KsYunField(name = "NvmeDataDiskCatalogue")
    private String NvmeDataDiskCatalogue;

    /**NVME数据盘目录后缀属性*/
    @KsYunField(name="NvmeDataDiskCatalogueSuffix")
    private String NvmeDataDiskCatalogueSuffix;

    /**bond名称
有效值： bond0|bond1*/
    @KsYunField(name = "BondAttribute")
    private String BondAttribute;

    /**容器引擎组件类型*/
    @KsYunField(name = "ContainerAgent")
    private String ContainerAgent;

    /**kes组件类型*/
    @KsYunField(name = "KesAgent")
    private String KesAgent;

    /**KMR组件类型*/
    @KsYunField(name = "KmrAgent")
    private String KmrAgent;

    /**计算机系统内名称*/
    @KsYunField(name = "ComputerName")
    private String ComputerName;

    /**超频*/
    @KsYunField(name = "OverclockingAttribute")
    private String OverclockingAttribute;

    /**gpu版本*/
    @KsYunField(name = "GpuImageDriverId")
    private String GpuImageDriverId;

    /**云硬盘的系统盘类型*/
    @KsYunField(name = "SystemVolumeType")
    private String SystemVolumeType;

    /**云硬盘系统盘大小*/
    @KsYunField(name = "SystemVolumeSize")
    private String SystemVolumeSize;

    /**roce网络
     有效值： Open：开启  Close：关闭
添加白名单的用户为必填项


*/
    @KsYunField(name = "RoceNetwork")
    private String RoceNetwork;

    /**创建pdns所需参数*/
    @KsYunField(name = "ZoneId")
    private String ZoneId;

    /**创建pdns所需参数*/
    @KsYunField(name = "ZoneType")
    private String ZoneType;

    /**是否开启热备机，有效值
     support开启
     unsupport不开启
onlyHotStandby只开热备机*/
    @KsYunField(name = "UseHotStandby")
    private String UseHotStandby;

    /**释义：试用定时转正
     有效值：
     ▪ support：开启
     ▪ unsupport：关闭
默认值：unsupport，不传默认关闭*/
    @KsYunField(name = "TimedRegularization")
    private String TimedRegularization;

    /**
     * 是否使用镜像预设的密码和密钥
     * 有效值：
     * ▪ support：开启
     * ▪ unsupport：关闭
     * 默认值：unsupport
     */
    @KsYunField(name = "PasswordInherit")
    private String PasswordInherit;

    /**
     * 是否对数据盘进行磁盘挂载
     * 有效值：
     * ▪ support：开启
     * ▪ unsupport：关闭
     * 默认值：support
     */
    @KsYunField(name = "DataDiskMount")
    private String DataDiskMount;

    /**
     * 存储网卡名称，有效值
     * eth8x_bond
     * storage_bond
     */
    @KsYunField(name = "StorageRoceNetworkCardName")
    private String StorageRoceNetworkCardName;

    /**
     * 裸金属服务器anaconda信息
     * 类型： String
     * 是否必填：否
     */
    @KsYunField(name = "Anaconda.N")
    private String AnacondaN;

    /**
     * 裸金属服务器训练框架信息
     * 类型： String
     * 是否必填：否
     */
    @KsYunField(name = "Framework.N")
    private String FrameworkN;

    /**
     * 裸金属服务器推理引擎信息
     * 类型： String
     * 是否必填：否
     */
    @KsYunField(name = "Engine.N")
    private String EngineN;

    /**裸金属服务器AI模型信息
     类型： String
     是否必填：否*/
    @KsYunField(name="AiModel.N")
    private String AiModelN;

}