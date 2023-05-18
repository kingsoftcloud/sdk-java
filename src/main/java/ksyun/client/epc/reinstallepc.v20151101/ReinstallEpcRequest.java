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

    /**是否支持Bond，是：“Yes”；不是:”No”*/
    @KsYunField(name="NetworkInterfaceMode")
    private String NetworkInterfaceMode;

    /**安全组件类型
- classic：经典版
- no：不开启*/
    @KsYunField(name="SecurityAgent")
    private String SecurityAgent;

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
SRaid0：单盘SRaid0无限制，仅针对大数据业务自身有冗余的场景*/
    @KsYunField(name="Raid")
    private String Raid;

    /**Raid模板Id*/
    @KsYunField(name="RaidId")
    private String RaidId;

    /**是否保留DISK：Yes|No*/
    @KsYunField(name="ReserveDisk")
    private String ReserveDisk;

    /**云物理主机名称*/
    @KsYunField(name="HostName")
    private String HostName;

    /**容器扩展信息*/
    @KsYunField(name="ContainerInfo")
    private String ContainerInfo;

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
    @KsYunField(name="bondAttribute")
    private String BondAttribute;

    /**机房信息*/
    @KsYunField(name="Region")
    private String Region;

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


}