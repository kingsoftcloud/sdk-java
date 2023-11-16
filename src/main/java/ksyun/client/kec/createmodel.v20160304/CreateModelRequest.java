package ksyun.client.kec.createmodel.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateModelRequest
* @Description 请求参数
*/
@Data
public class CreateModelRequest{
    /**镜像ID
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**实例套餐类型，如果调用时未指定实例套餐类型，默认值为I1.1A
[实例套餐类型有效值](https://docs.ksyun.com/documents/40858) <br>具体套餐信息参考[实例套餐类型定义](https://docs.ksyun.com/documents/705)*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**系统盘内存大小，最小值为0，最大值为500*/
    @KsYunField(name="SystemDisk.DiskSize")
    private String SystemDiskDiskSize;

    /**数据卷容量，单位GB，容量限制依据[实例套餐类型定义](https://docs.ksyun.com/documents/705)变化，如果调用时未指定，则为相应实例套餐类型最小值。InstanceType为通用型主机时，此参数不生效。*/
    @KsYunField(name="DataDiskGb")
    private Integer DataDiskGb;

    /**VPC环境下的子网ID，绑定到主网卡。
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**数据盘（云盘）的类型，数据盘n的类型，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、N1、N2、N3、S3和I3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
SSD3.0，EHDD*/
    @KsYunField(name="DataDisk")
    private List<DataDiskDto> DataDiskList;

    @Data
    @ToString
    public static class DataDiskDto {
        /**数据盘（云盘）的类型，数据盘n的类型，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、N1、N2、N3、S3和I3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
SSD3.0，EHDD*/
        @KsYunField(name="Type")
        private String Type;
        /**第 n 个数据盘（云盘）的容量大小，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、N1、N2、N3、S3和I3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
[10，16000]*/
        @KsYunField(name="Size")
        private Integer Size;
        /**数据盘是否随实例释放，默认值为false
true：实例释放时，这块磁盘随实例一起释放。<br>false：实例释放时，这块磁盘保留不释放。*/
        @KsYunField(name="DeleteWithInstance")
        private Boolean DeleteWithInstance;
    }

    /**保留镜像设置登录。该参数只对使用自定义镜像有效。当该值填写为true，默认InstancePassword参数无效。该参数与InstancePassword必须填写一个。
true/false，默认值为false*/
    @KsYunField(name="KeepImageLogin")
    private Boolean KeepImageLogin;

    /**秘钥ID，非必填项，无默认值，若填写则默认InstancePassword参数无效，当用户选择other-linux镜像时，不支持该登录方式。若使用的自定义镜像，KeepImageLogin 为true时，默认keyId和InstancePassword参数无效。*/
    @KsYunField(name="KeyId")
    private String KeyId;

    /**计费类型，调用时需要明确指定，无默认值。
Monthly(包年包月）、Daily（按量付费（按日月结）)、 HourlyInstantSettlement（按量付费）、Spot（竞价型实例）*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，单位月。
当计费类型为Monthly（包年包月）时，有效值1-36；其他计费类型时，强制要求参数值为0。*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**实例绑定的安全组，目前仅支持绑定一个安全组。
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**私有IP地址，指定子网IP地址范围内的任意有效值，代表实例的主IP地址，只能选择一个，绑定到主网卡；如果未指定该参数，系统自动从有效地址池中随机选取一个。
标准IP地址格式*/
    @KsYunField(name="PrivateIpAddress")
    private String PrivateIpAddress;

    /**实例名称，如果未指定，则自动生成，形如`KSC-IN-[A-Z0-9]{10}`。
最短2字符，最长64字符，支持中英文*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**实例名称后缀，InstanceName参数如果缺省，此参数不生效；当大于1台的批量创建主机，后缀编号自动+1，例如后缀输入5，主机名输入"host"，批量3台，则生成的三台主机名分别为：“host-5”、“host-6”、“host-7”。
0到9999,默认值为空*/
    @KsYunField(name="InstanceNameSuffix")
    private String InstanceNameSuffix;

    /**联网增强属性<br>该参数需要满足以下两个条件：<br>1.IO优化型I1，计算优化型C1，IO优化型I2的8C以上套餐<br>2.使用的是金山云提高的标准镜像或者通过金山云标准镜像开机的实例再制作的自定义镜像*/
    @KsYunField(name="SriovNetSupport")
    private String SriovNetSupport;

    /**实例所属项目ID
账户有权限的项目ID，0为默认项目,默认值为默认项目*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**容灾分组ID*/
    @KsYunField(name="DataGuardId")
    private String DataGuardId;

    /**弹性IP的带宽*/
    @KsYunField(name="AddressBandWidth")
    private Integer AddressBandWidth;

    /**弹性IP的链路类型的ID*/
    @KsYunField(name="LineId")
    private String LineId;

    /**弹性IP的计费类型
**Monthly**：包年包月，有到期时间，只能升带宽<br>**Peak**：按量付费（月峰值），无到期时间，可升降带宽<br>**Daily**：按量付费（按日月结），无到期时间，可升降带宽<br>**TrafficMonthly**：按量付费（流量月结），无到期时间，可升降带宽<br>**DailyPaidByTransfer**：按量付费（流量），无到期时间，可升降带宽<br>**HourlyInstantSettlement**：按量付费，无到期时间，可升降带宽*/
    @KsYunField(name="AddressChargeType")
    private String AddressChargeType;

    /**弹性IP的购买时长，只有购买包年包月弹性IP时不可缺省。*/
    @KsYunField(name="AddressPurchaseTime")
    private Integer AddressPurchaseTime;

    /**弹性IP项目的ID*/
    @KsYunField(name="AddressProjectId")
    private String AddressProjectId;

    /**实例启动模版名称，不允许重复
ModelTest001*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**不能给默认值，不传默认按价格体系配置systemDisk属性中第一个创建*/
    @KsYunField(name="SystemDisk.DiskType")
    private String SystemDiskDiskType;

    /**扩容 offline 离线扩容| online 在线扩容*/
    @KsYunField(name="SystemDisk.ResizeType")
    private String SystemDiskResizeType;

    /**模板描述*/
    @KsYunField(name="VersionDetail")
    private String VersionDetail;

    /**开机失败是否自动删除，默认值是false*/
    @KsYunField(name="FailureAutoDelete")
    private Boolean FailureAutoDelete;


}