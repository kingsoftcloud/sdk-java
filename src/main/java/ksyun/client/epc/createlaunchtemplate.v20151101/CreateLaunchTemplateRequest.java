package ksyun.client.epc.createlaunchtemplate.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateLaunchTemplateRequest
* @Description 请求参数
*/
@Data
public class CreateLaunchTemplateRequest{
    /**计费方式，包年包月Monthly，按日月结Daily
有效值：
• Monthly
• Daily*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，计费类型为包年包月时不可缺省*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**实例所属的可用区ID
示例值：cn-beijing-6a*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**实例的机型*/
    @KsYunField(name="HostType")
    private String HostType;

    /**网卡模式
有效值：
• bond4：bond模式
• single：非bond模式
• dual：双网卡模式
说明：windows创建时，只支持非bond模式。*/
    @KsYunField(name="NetworkInterfaceMode")
    private String NetworkInterfaceMode;

    /**bond名称
有效值： bond0|bond1
默认值：bond0*/
    @KsYunField(name="BondAttribute")
    private String BondAttribute;

    /**启动实例时使用的镜像ID
可通过 DescribeImages 查询可以使用的镜像资源*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**GPU的驱动版本*/
    @KsYunField(name="GpuImageDriverId")
    private String GpuImageDriverId;

    /**数据盘Raid级别,和数据盘的数量直接相关
有效值：
• Jbod：直连模式
• Raid1：数据盘数量必须是2的倍数
• Raid5：数据盘的数量必须大于等于3
• Raid10：数据盘数量必须是4的倍数
• Raid50：数据盘的数量必须大于6且是2的倍数
• SRaid0：单盘SRaid0无限制，仅针对大数据业务自身有冗余的场景
说明：Raid与RaidId必填其一，RaidId优先级高*/
    @KsYunField(name="Raid")
    private String Raid;

    /**Raid模板Id*/
    @KsYunField(name="RaidId")
    private String RaidId;

    /**是否对数据盘进行磁盘挂载
有效值：
• support：开启
• unsupport：关闭
默认值：support*/
    @KsYunField(name="DataDiskMount")
    private String DataDiskMount;

    /**系统盘文件格式(NTFS仅支持windows)
有效值：EXT4|XFS|NTFS
默认值：EXT4*/
    @KsYunField(name="SystemFileType")
    private String SystemFileType;

    /**数据盘文件格式(NTFS仅支持windows)
有效值：EXT4|XFS|NTFS
默认值：XFS*/
    @KsYunField(name="DataFileType")
    private String DataFileType;

    /**数据盘目录
有效值：
/DATA/disk：在系统的DATA目录下，系统里展示内容如/DATA/disk1，/DATA/disk2
/data：在系统的根目录下，系统里展示内容从/data1开始，如/data1，/data2默认值：/DATA/disk*/
    @KsYunField(name="DataDiskCatalogue")
    private String DataDiskCatalogue;

    /**数据盘目录后缀属性
有效值：
NoSuffix ：不使用后缀，只有在数据盘有一块的时候，可以使用此参数
NaturalNumber：后缀从1底层的整数
NaturalNumberFromZero：后缀从0递增的整数默认值：NaturalNumber*/
    @KsYunField(name="DataDiskCatalogueSuffix")
    private String DataDiskCatalogueSuffix;

    /**NVME数据盘类型
有效值：
EXT4
XFS*/
    @KsYunField(name="NvmeDataFileType")
    private String NvmeDataFileType;

    /**NVME数据盘目录*/
    @KsYunField(name="NvmeDataDiskCatalogue")
    private String NvmeDataDiskCatalogue;

    /**NVME数据盘目录后缀属性*/
    @KsYunField(name="NvmeDataDiskCatalogueSuffix")
    private String NvmeDataDiskCatalogueSuffix;

    /**主网卡子网ID*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**主网卡安全组ID，一个裸金属服务器最多可以支持5个安全组*/
    @KsYunField(name="SecurityGroupId",type=1)
    private List<String> SecurityGroupIdList;

    /**从网卡的子网ID*/
    @KsYunField(name="ExtensionSubnetId")
    private String ExtensionSubnetId;

    /**辅网卡安全组ID，一个裸金属服务器最多可以支持5个安全组*/
    @KsYunField(name="ExtensionSecurityGroupId",type=1)
    private List<String> ExtensionSecurityGroupIdList;

    /**弹性IP的带宽*/
    @KsYunField(name="AddressBandWidth")
    private String AddressBandWidth;

    /**弹性IP的链路类型的ID*/
    @KsYunField(name="LineId")
    private String LineId;

    /**共享带宽ID*/
    @KsYunField(name="BandWidthShareId")
    private String BandWidthShareId;

    /**弹性IP的计费类型*/
    @KsYunField(name="AddressChargeType")
    private String AddressChargeType;

    /**购买时长，只有购买包年包月弹性IP时不可缺省*/
    @KsYunField(name="AddressPurchaseTime")
    private Integer AddressPurchaseTime;

    /**弹性IP项目的ID*/
    @KsYunField(name="AddressProjectId")
    private String AddressProjectId;

    /**实例启动模板名称。取值：
• 不能以数字、中划线、下划线开头。
• 只能包含中文、字母、数字、下划线和中划线。
• 长度限制为1 ~ 128个字符。
• 暂不支持特殊字符。
示例值：testLaunchTemplateName*/
    @KsYunField(name="LaunchTemplateName")
    private String LaunchTemplateName;

    /**实例启动模板描述。长度为1~255个英文或中文字符。
示例值：testVersionDescription*/
    @KsYunField(name="VersionDescription")
    private String VersionDescription;

    /**实例名称
默认值：ksc_epc
*/
    @KsYunField(name="HostName")
    private String HostName;

    /**实例描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**计算机系统内名称*/
    @KsYunField(name="ComputerName")
    private String ComputerName;

    /**实例起始值
示例值：1*/
    @KsYunField(name="HostNameStartNo")
    private Integer HostNameStartNo;

    /**计算机名称起始值
示例值：1*/
    @KsYunField(name="ComputerNameStartNo")
    private Integer ComputerNameStartNo;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**密钥ID*/
    @KsYunField(name="KeyId")
    private String KeyId;

    /**是否使用镜像预设的密码和密钥
有效值：
• support：开启
• unsupport：关闭
默认值：unsupport*/
    @KsYunField(name="PasswordInherit")
    private String PasswordInherit;

    /**云监控
• classic：经典版
• no：不开启
默认值：no*/
    @KsYunField(name="CloudMonitorAgent")
    private String CloudMonitorAgent;

    /**容器引擎组件类型
默认值：unsupport*/
    @KsYunField(name="ContainerAgent")
    private String ContainerAgent;

    /**创建pdns所需参数*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**创建pdns所需参数
示例值：A*/
    @KsYunField(name="ZoneType")
    private String ZoneType;

    /**存储网卡名称，有效值：
eth8x_bond
storage_bond*/
    @KsYunField(name="StorageRoceNetworkCardName")
    private String StorageRoceNetworkCardName;

    /**实例自定义数据。设置的自定义数据必须经过Base64编码，且Base64编码前的自定义数据大小不能超过16KB。不填则默认为空。
示例值：ZWNobyBoZWxsbyBlY3Mh*/
    @KsYunField(name="UserData")
    private String UserData;

}
