package ksyun.client.kec.runinstances.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RunInstancesRequest
* @Description 请求参数
*/
@Data
public class RunInstancesRequest{
    /**镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**专属宿主机ID*/
    @KsYunField(name="DedicatedHostId")
    private String DedicatedHostId;

    /**实例套餐类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**数据卷容量，单位GB*/
    @KsYunField(name="DataDiskGb")
    private Integer DataDiskGb;

    /**最大实例数，如果指定的实例数大于金山云在本人Region所能创建的最大实例数，则会创建大于MinCount数量的最大允许实例数。*/
    @KsYunField(name="MaxCount")
    private Integer MaxCount;

    /**最小实例数，如果指定的实例数大于金山云在本Region所能创建的最大实例数，则不会创建任何实例。*/
    @KsYunField(name="MinCount")
    private Integer MinCount;

    /**VPC环境下的子网ID，绑定到主网卡*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**实例开机密码*/
    @KsYunField(name="InstancePassword")
    private String InstancePassword;

    /**调用时需要明确指定，无默认值*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，单位月*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**实例绑定的安全组，目前仅支持绑定一个安全组*/
    @KsYunField(name="SecurityGroupId",type=2)
    private List<String> SecurityGroupIdList;

    /**私有IP地址，指定子网IP地址范围内的任意有效值，代表实例的主IP地址，只能选择一个，绑定到主网卡；如果未指定该参数，系统自动从有效地址池中随机选取一个*/
    @KsYunField(name="PrivateIpAddress")
    private String PrivateIpAddress;

    /**实例名称，如果未指定，则自动生成，形如`KSC-IN-[A-Z0-9]{10}`*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**实例名称后缀，InstanceName参数如果缺省，此参数不生效；当大于1台的批量创建主机，后缀编号自动+1，例如后缀输入5，主机名输入"host"，批量3台，则生成的三台主机名分别为："host-5"、"host-6"、"host-7"；*/
    @KsYunField(name="InstanceNameSuffix")
    private String InstanceNameSuffix;

    /**实例所属项目ID*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**数据盘是否随实例释放*/
    @KsYunField(name="DataDisk",type=2)
    private List<DataDiskDto1> DataDiskList;

    @Data
    @ToString
    public static class DataDiskDto1 {
        /**数据盘是否随实例释放*/
        @KsYunField(name="DeleteWithInstance")
        private Boolean DeleteWithInstance;

        /**数据盘类型*/
        @KsYunField(name="Type")
        private String Type;

        /**数据盘大小*/
        @KsYunField(name="Size")
        private Integer Size;

        /**创建云盘所用的快照*/
        @KsYunField(name="SnapshotId")
        private String SnapshotId;

    }

    /**辅网卡*/
    @KsYunField(name="NetworkInterface",type=2)
    private List<NetworkInterfaceDto2> NetworkInterfaceList;

    @Data
    @ToString
    public static class NetworkInterfaceDto2 {
        /**辅网卡的子网id不创建辅网卡时非必填，创建辅网卡时必填*/
        @KsYunField(name="SubnetId")
        private String SubnetId;

        /**辅网卡的安全组id不创建辅网卡时非必填，创建辅网卡时必填*/
        @KsYunField(name="SecurityGroupId",type=2)
        private List<String> SecurityGroupIdList;

        /**辅网卡的内网ip,创建辅网卡传了按传的ip开机，不传自动分配*/
        @KsYunField(name="PrivateIpAddress")
        private String PrivateIpAddress;

    }

    /**用户自定义数据*/
    @KsYunField(name="UserData")
    private String UserData;

    /**系统盘*/
    @KsYunField(name="SystemDisk")
    private SystemDiskDto3 SystemDisk;

    @Data
    @ToString
    public static class SystemDiskDto3 {
        /**系统盘类型*/
        @KsYunField(name="DiskType")
        private String DiskType;

        /**系统盘大小*/
        @KsYunField(name="DiskSize")
        private Integer DiskSize;

    }

    /**实例启动模版ID，如填写了此项，则启动模板中已包含的RunInstances其他参数不生效，启动模板未指定的参数若调用RunInstances时额外传入则可生效，如果批量创建，实例名称后缀依然存在。【传modelId，使用默认版本。传modelId和modelVersion，使用传递的版本】
示例值：3f0d6229-ed2d-4c9c-8554-b9433517cf8b*/
    @KsYunField(name="ModelId")
    private String ModelId;

    /**实例启动模板版本号。如不指定，则采用默认版本号*/
    @KsYunField(name="ModelVersion")
    private Integer ModelVersion;

    /**整机镜像所开云盘数据盘的类型*/
    @KsYunField(name="AssembledImageDataDiskType")
    private String AssembledImageDataDiskType;

    /**整机镜像是否展开镜像中的数据盘*/
    @KsYunField(name="AutoCreateEbs")
    private Boolean AutoCreateEbs;

    /**弹性IP的链路类型的ID */
    @KsYunField(name="LineId")
    private String LineId;

    /**弹性IP的带宽，1，如果购买EIP，AddressBandWidth、LineId、AddressChargeType三个接口参数必须同时存在，如有其中任意一个接口参数，判断是否存在其他两个参数；2，如果选择预付费计费方式，必须有购买时长参数； |*/
    @KsYunField(name="AddressBandWidth")
    private Integer AddressBandWidth;

    /**PrePaidByMonth ：包年包月，有到期时间，只能升带宽；PostPaidByPeak：按峰值月结，无到期时间，可升降带宽；PostPaidByDay：按日月结，无到期时间，可升降带宽；PostPaidByTransfer：按流量月结，无到期时间，可升降带宽；PostPaidByHour：按小时月结，无到期时间，可升降带宽*/
    @KsYunField(name="AddressChargeType")
    private String AddressChargeType;

    /**弹性IP项目的ID,默认值为0*/
    @KsYunField(name="AddressProjectId")
    private String AddressProjectId;

    /**共享带宽ID*/
    @KsYunField(name="BandWidthShareId")
    private String BandWidthShareId;

    /**购买时长*/
    @KsYunField(name="AddressPurchaseTime")
    private Integer AddressPurchaseTime;

    /**秘钥ID*/
    @KsYunField(name="KeyId",type=2)
    private List<String> KeyIdList;

    /**是否保留镜像设置*/
    @KsYunField(name="KeepImageLogin")
    private Boolean KeepImageLogin;

    /**操作系统内部的计算机名*/
    @KsYunField(name="HostName")
    private String HostName;

    /**创建多台实例时为HostName增加有序后缀，有序后缀从1增加，例如host-1*/
    @KsYunField(name="HostNameSuffix")
    private Integer HostNameSuffix;

    /**开机失败是否对外删除 ，默认值是false*/
    @KsYunField(name="FailureAutoDelete")
    private Boolean FailureAutoDelete;

    /**标签信息*/
    @KsYunField(name="Tag",type=2)
    private List<TagDto4> TagList;

    @Data
    @ToString
    public static class TagDto4 {
        /**标签键值*/
        @KsYunField(name="Key")
        private String Key;

        /**标签Id*/
        @KsYunField(name="Id")
        private Integer Id;

        /**标签值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**容灾组id*/
    @KsYunField(name="DataGuardId")
    private String DataGuardId;

    /***/
    @KsYunField(name="InstanceConfigure")
    private InstanceConfigureDto5 InstanceConfigure;

    @Data
    @ToString
    public static class InstanceConfigureDto5 {
        /**cpu*/
        @KsYunField(name="VCPU")
        private String VCPU;

        /**内存*/
        @KsYunField(name="MemoryGb")
        private String MemoryGb;

        /**数据卷容量，单位GB*/
        @KsYunField(name="DataDiskGb")
        private String DataDiskGb;

    }

    /**是否支持联网增强*/
    @KsYunField(name="SriovNetSupport")
    private Boolean SriovNetSupport;

    /**是否分配ipv6*/
    @KsYunField(name="DistributeIpv6")
    private Boolean DistributeIpv6;

    /**本地盘快照id*/
    @KsYunField(name="LocalVolumeSnapshotId")
    private String LocalVolumeSnapshotId;

    /**是否同步ebs标签*/
    @KsYunField(name="SyncTag")
    private Boolean SyncTag;

    /**iam角色名称*/
    @KsYunField(name="IamRoleName")
    private String IamRoleName;

    /**定时删除时间，传参格式：yyyy-MM-dd HH:mm*/
    @KsYunField(name="AutoDeleteTime")
    private String AutoDeleteTime;

    /**是否自动删除eip*/
    @KsYunField(name="AutoDeleteEip")
    private Boolean AutoDeleteEip;

    /**是否开启资源保护*/
    @KsYunField(name="IsProtect")
    private Boolean IsProtect;

}
