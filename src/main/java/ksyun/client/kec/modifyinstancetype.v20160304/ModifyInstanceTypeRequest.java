package ksyun.client.kec.modifyinstancetype.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceTypeRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceTypeRequest{
    /**待调整配置的实例ID
*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**实例目标套餐规格
[实例套餐类型有效值](https://docs.ksyun.com/documents/40858) <br>若对应实例为专属虚机，该值需填写DVM1.NONE(专属型)、DVM2.NONE(专属型2.0)、DVM3.NONE（专属型3.0），专属虚机只支持升降配，不支持变更实例类型。<br>具体套餐信息参考[实例套餐类型定义](https://docs.ksyun.com/documents/705)*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**目标CPU值；当需变更实例为专属虚机时需填写该值
*/
    @KsYunField(name="InstanceConfigure.VCPU")
    private String InstanceConfigureVCPU;

    /**目标内存值*/
    @KsYunField(name="InstanceConfigure.MemoryGb")
    private String InstanceConfigureMemoryGb;

    /**数据卷容量，单位GB，数据卷只能扩容或者保持不变，且不能低于[实例套餐类型定义](https://docs.ksyun.com/documents/705)的最小值。
*/
    @KsYunField(name="DataDiskGb")
    private Integer DataDiskGb;

    /**当前操作是否为变更实例套餐类型，若当前操作变更实例类型必须指定为true。（变更过程中必须保持云服务器关机状态；变更完成后启动云服务器生效；涉及本地盘类型的机型变更需加白名单）
true/false*/
    @KsYunField(name="CrossInstanceMigrate")
    private Boolean CrossInstanceMigrate;

    /**不能给默认值，不传默认按价格体系配置systemDisk属性中第一个创建*/
    @KsYunField(name="SystemDisk.DiskType")
    private String SystemDiskDiskType;

    /**目标套餐数据盘类型（当本地盘机型变更为云盘机型时才需填写此参数，此参数仅对源本地数据盘生效）
*/
    @KsYunField(name="DataDisk")
    private List<DataDiskDto> DataDiskList;

    @Data
    @ToString
    public static class DataDiskDto {
        /**是，本地盘变云盘时此参数不可缺省	*/
        @KsYunField(name="Type")
        private String Type;
        /**是，本地盘变云盘时此参数不可缺省*/
        @KsYunField(name="Size")
        private String Size;
    }

    /**是否对运行中的实例选择关机：是-true，否-false(默认)*/
    @KsYunField(name="StopInstance")
    private Boolean StopInstance;

    /**变更实例类型后是否自动重启: 是-true，否-false(默认)*/
    @KsYunField(name="AutoRestart")
    private Boolean AutoRestart;

    /**系统盘大小，最大值500，最小值0*/
    @KsYunField(name="SystemDisk.DiskSize")
    private Integer SystemDiskDiskSize;

    /**扩容 offline 离线扩容| online 在线扩容*/
    @KsYunField(name="SystemDisk.ResizeType")
    private String SystemDiskResizeType;

    /**	
支持快速开盘/快速变更，该参数仅对本地盘/本地盘机型/本地盘快照生效*/
    @KsYunField(name="InstantAccess")
    private Boolean InstantAccess;


}