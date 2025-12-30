package ksyun.client.kec.createscalingconfiguration.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateScalingConfigurationRequest
* @Description 请求参数
*/
@Data
public class CreateScalingConfigurationRequest{
    /**启动配置名称 
 */
    @KsYunField(name="ScalingConfigurationName")
    private String ScalingConfigurationName;

    /**镜像ID 
 */
    @KsYunField(name="ImageId")
    private String ImageId;

    /**实例密码 
 */
    @KsYunField(name="Password")
    private String Password;

    /**选择一个云主机类型 
 */
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**选择云主机计费方式 
 */
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**本地数据盘容量 
 */
    @KsYunField(name="DataDiskGb")
    private Integer DataDiskGb;

    /**项目制id，默认0 
 */
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**保留镜像设置 
 */
    @KsYunField(name="KeepImageLogin")
    private Boolean KeepImageLogin;

    /**密钥对 
 */
    @KsYunField(name="KeyId",type=1)
    private List<String> KeyIdList;

    /**云盘数据盘类型 
 */
    @KsYunField(name="DataDisk",type=1)
    private List<DataDiskDto> DataDiskList;

    @Data
    @ToString
    public static class DataDiskDto {
        /**云盘数据盘类型 
 */
        @KsYunField(name="Type")
        private String Type;

        /**云盘数据盘大小 
 */
        @KsYunField(name="Size")
        private Integer Size;

        /**云盘数据盘是否随实例删除 
 */
        @KsYunField(name="DeleteWithInstance")
        private Boolean DeleteWithInstance;

        /**云盘数据盘 快照id*/
        @KsYunField(name="SnapshotId")
        private String SnapshotId;

    }

    /**系统盘大小，最小值为0，最大值为500*/
    @KsYunField(name="SystemDisk.DiskSize")
    private String SystemDiskDiskSize;

    /**弹性IP的带宽 
 */
    @KsYunField(name="AddressBandWidth")
    private Integer AddressBandWidth;

    /**弹性IP指定的共享带宽ID 
 */
    @KsYunField(name="BandWidthShareId")
    private String BandWidthShareId;

    /**弹性IP的链路类型的ID 
 */
    @KsYunField(name="LineId")
    private String LineId;

    /**弹性IP项目的ID 
 */
    @KsYunField(name="AddressProjectId")
    private Integer AddressProjectId;

    /**实例名称 
 */
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**实例名称后缀 
 */
    @KsYunField(name="InstanceNameSuffix")
    private String InstanceNameSuffix;

    /** 用户自定义数据 
 */
    @KsYunField(name="UserData")
    private String UserData;

    /** 实例名称时间戳后缀，true/false 
 */
    @KsYunField(name="InstanceNameTimeSuffix")
    private Boolean InstanceNameTimeSuffix;

    /** 启动配置创建的ECS实例的标签键 
 支持1-128个字符，仅支持中英文字符、数字及±=._/@:*/
    @KsYunField(name="Tag",type=1)
    private List<TagDto> TagList;

    @Data
    @ToString
    public static class TagDto {
        /** 启动配置创建的ECS实例的标签键 
 支持1-128个字符，仅支持中英文字符、数字及±=._/@:*/
        @KsYunField(name="Key")
        private String Key;

        /** 启动配置创建的ECS实例的标签值 
 256个字符内，仅支持中英文字符、数字及±=._/@()[]（）【】:*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**不能给默认值，不传默认按价格体系配置systemDisk属性中第一个创建*/
    @KsYunField(name="SystemDisk.DiskType")
    private String SystemDiskDiskType;

    /**扩容 offline 离线扩容| online 在线扩容*/
    @KsYunField(name="SystemDisk.ResizeType")
    private String SystemDiskResizeType;

    /**是否同步ebs标签*/
    @KsYunField(name="SyncTag")
    private Boolean SyncTag;

}
