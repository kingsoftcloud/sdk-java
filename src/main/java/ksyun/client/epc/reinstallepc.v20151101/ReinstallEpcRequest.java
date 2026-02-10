package ksyun.client.epc.reinstallepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReinstallEpcRequest
* @Description 请求参数
*/
@Data
public class ReinstallEpcRequest{
    /**裸金属服务器资源ID，也可填入EpcHostId*/
    @KsYunField(name="HostId")
    private String HostId;

    /**镜像资源ID,参见DescribeImages*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**用户密钥对的资源ID*/
    @KsYunField(name="keyId")
    private String KeyId;

    /**系统的登录密码*/
    @KsYunField(name="Password")
    private String Password;

    /**网卡模式
有效值：
bond4：BOND模式
single：非BOND模式
dual：双网卡模式
1. centos、Debin、Ubuntu重装时，bond选项 限制：
    a. 若开机为双网卡模式，则只能重装成双网卡模式，无法重装为bond和非bond模式。
    b. bond/非bond重装时仅可选择bond/非bond 
2. 重装为window系统时，无法选择网卡类型，默认重装为非bond模式,且无法选择密钥验证。*/
    @KsYunField(name="NetworkInterfaceMode")
    private String NetworkInterfaceMode;

    /**安全组件类型
- classic：经典版
- no：不开启*/
    @KsYunField(name="CloudMonitorAgent")
    private String CloudMonitorAgent;

    /**数据盘Raid级别,和数据盘的数量直接相关 
有效值：  Raid1：数据盘数量必须是2的倍数
Raid5：数据盘的数量必须大于等于3
Raid10：数据盘数量必须是4的倍数
Raid50：数据盘的数量必须大于6且是2的倍数
SRaid0：单盘SRaid0无限制，仅针对大数据业务自身有冗余的场景
与RaidId必填其一，RaidId优先级高*/
    @KsYunField(name="Raid")
    private String Raid;

    /**Raid模板Id*/
    @KsYunField(name="RaidId")
    private String RaidId;

    /**云物理主机名称*/
    @KsYunField(name="HostName")
    private String HostName;

    /**系统盘文件格式*/
    @KsYunField(name="SystemFileType")
    private String SystemFileType;

    /**数据盘文件格式*/
    @KsYunField(name="DataFileType")
    private String DataFileType;

    /**数据盘目录*/
    @KsYunField(name="DataDiskCatalogue")
    private String DataDiskCatalogue;

    /**数据盘目录后缀属性*/
    @KsYunField(name="DataDiskCatalogueSuffix")
    private String DataDiskCatalogueSuffix;

    /**对超线程的变更*/
    @KsYunField(name="HyperThreading")
    private String HyperThreading;

    /**NVME数据盘类型*/
    @KsYunField(name="NvmeDataFileType")
    private String NvmeDataFileType;

    /**NVME数据盘目录*/
    @KsYunField(name="NvmeDataDiskCatalogue")
    private String NvmeDataDiskCatalogue;

    /**NVME数据盘目录后缀属性*/
    @KsYunField(name="NvmeDataDiskCatalogueSuffix")
    private String NvmeDataDiskCatalogueSuffix;

    /**网卡bond的属性*/
    @KsYunField(name="BondAttribute")
    private String BondAttribute;

    /**kes组件类型*/
    @KsYunField(name="KesAgent")
    private String KesAgent;

    /**KMR组件类型*/
    @KsYunField(name="KmrAgent")
    private String KmrAgent;

    /**计算机系统内名称*/
    @KsYunField(name="ComputerName")
    private String ComputerName;

    /**超频*/
    @KsYunField(name="OverclockingAttribute")
    private String OverclockingAttribute;

    /**是否延迟开始，0:不延迟开始PxeOn;1:延迟开始PxeOn*/
    @KsYunField(name="DelayStart")
    private Integer DelayStart;

    /**可用区的名称*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**gpu版本*/
    @KsYunField(name="GpuImageDriverId")
    private String GpuImageDriverId;

    /**容器引擎组件类型*/
    @KsYunField(name="ContainerAgent")
    private String ContainerAgent;

    /**是否使用镜像预设的密码和密钥
有效值：
▪ support：开启
▪ unsupport：关闭
默认值：unsupport*/
    @KsYunField(name="PasswordInherit")
    private String PasswordInherit;

    /**是否对数据盘进行磁盘挂载
有效值：
▪ support：开启
▪ unsupport：关闭
默认值：support*/
    @KsYunField(name="DataDiskMount")
    private String DataDiskMount;

    /**RoCE存储卡名称，仅支持
eth8x_bond、storage_bond*/
    @KsYunField(name="StorageRoceNetworkCardName")
    private String StorageRoceNetworkCardName;

    /**自定义脚本*/
    @KsYunField(name="UserDefinedData")
    private String UserDefinedData;

    /**由客户端生成的本次请求的不超过64个ASCII字符唯一标识，同一个ClientToken支持幂等*/
    @KsYunField(name="ClientToken")
    private String ClientToken;

    /**网卡名称格式，仅支持ethN和ethNx(仅对白名单用户生效)*/
    @KsYunField(name="NetworkCardNameFormat")
    private String NetworkCardNameFormat;

    /**网卡的优先级，仅支持VPC-RoCE和RoCE-VPC(仅对白名单用户生效)*/
    @KsYunField(name="NetworkCardPriority")
    private String NetworkCardPriority;

}
