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

    /**实例VCPU核数*/
    @KsYunField(name="InstanceConfigure.VCPU")
    private String InstanceConfigureVCPU;

    /**实例内存*/
    @KsYunField(name="InstanceConfigure.MemoryGb")
    private String InstanceConfigureMemoryGb;

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

    /**计费类型，调用时需要明确指定，无默认值*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，单位月*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**实例绑定的安全组，目前仅支持绑定一个安全组*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

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
    @KsYunField(name="DataDisk")
    private List<DataDiskDto> DataDiskList;

    @Data
    @ToString
    public static class DataDiskDto {
        /**数据盘是否随实例释放*/
        @KsYunField(name="DeleteWithInstance")
        private Boolean DeleteWithInstance;
        /**数据盘类型*/
        @KsYunField(name="Type")
        private String Type;
        /**数据盘大小*/
        @KsYunField(name="Size")
        private Integer Size;
    }

    /**辅网卡*/
    @KsYunField(name="NetworkInterface")
    private List<NetworkInterfaceDto> NetworkInterfaceList;

    @Data
    @ToString
    public static class NetworkInterfaceDto {
        /**辅网卡的子网id不创建辅网卡时非必填，创建辅网卡时必填*/
        @KsYunField(name="SubnetId")
        private String SubnetId;
        /**辅网卡的安全组id不创建辅网卡时非必填，创建辅网卡时必填*/
        @KsYunField(name="SecurityGroupId")
        private String SecurityGroupId;
        /**辅网卡的内网ip,创建辅网卡传了按传的ip开机，不传自动分配*/
        @KsYunField(name="PrivateIpAddress")
        private String PrivateIpAddress;
    }


}