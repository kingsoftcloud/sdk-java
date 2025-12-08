package ksyun.client.kec.describeimages.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImagesResponse
* @Description DescribeImages 返回体
*/
@Data
@ToString
public class DescribeImagesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ImagesSet")
    private List<ImagesSetDto> ImagesSet;

    @Data
    @ToString
    public static class ImagesSetDto {
        /***/
        @JsonProperty("ImageId")
        private String ImageId;

        /***/
        @JsonProperty("InstantAccess")
        private Boolean InstantAccess;

        /**如果是标准镜像，值为ovf；如果是自定义镜像，值为assembled_image*/
        @JsonProperty("ContainerFormat")
        private String ContainerFormat;

        /***/
        @JsonProperty("SnapshotSet")
        private List<SnapshotSetDto> SnapshotSet;

        @Data
        @ToString
        public static class SnapshotSetDto {
            /***/
            @JsonProperty("SnapshotId")
            private String SnapshotId;

            /***/
            @JsonProperty("DiskType")
            private String DiskType;

            /***/
            @JsonProperty("DiskSize")
            private Integer DiskSize;

            /***/
            @JsonProperty("Type")
            private String Type;

            /***/
            @JsonProperty("VolumeType")
            private String VolumeType;

        }

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("ExportingStatus")
        private String ExportingStatus;

        /***/
        @JsonProperty("ExportingFinishedTime")
        private String ExportingFinishedTime;

        /**镜像类型 ，枚举值：标准镜像 自定义镜像*/
        @JsonProperty("Type")
        private String Type;

        /***/
        @JsonProperty("Name")
        private String Name;

        /**镜像状态*/
        @JsonProperty("ImageState")
        private String ImageState;

        /***/
        @JsonProperty("CreationDate")
        private String CreationDate;

        /**版本号*/
        @JsonProperty("Platform")
        private String Platform;

        /***/
        @JsonProperty("IsPublic")
        private Boolean IsPublic;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**是否是网络增强型镜像*/
        @JsonProperty("IsNpe")
        private Boolean IsNpe;

        /**镜像类别标识，标识镜像是普通镜像还是导入的镜像还是云市场镜像等。取值，常用的有common、import、copy*/
        @JsonProperty("UserCategory")
        private String UserCategory;

        /***/
        @JsonProperty("SysDisk")
        private Integer SysDisk;

        /**任务进度 */
        @JsonProperty("Progress")
        private String Progress;

        /**镜像来源 ，枚举值：import copy share
extend  system*/
        @JsonProperty("ImageSource")
        private String ImageSource;

        /**是否支持CloudInit*/
        @JsonProperty("CloudInitSupport")
        private Boolean CloudInitSupport;

        /**镜像是否支持ipv6*/
        @JsonProperty("Ipv6Support")
        private Boolean Ipv6Support;

        /**镜像是否支持热升配标识*/
        @JsonProperty("IsModifyType")
        private Boolean IsModifyType;

        /***/
        @JsonProperty("Architecture")
        private String Architecture;

        /**是否预热*/
        @JsonProperty("FastBoot")
        private Boolean FastBoot;

        /***/
        @JsonProperty("OriginalImageId")
        private String OriginalImageId;

        /**是否是市场镜像*/
        @JsonProperty("IsCloudMarket")
        private Boolean IsCloudMarket;

        /**底层imageid 映射*/
        @JsonProperty("RealImageId")
        private String RealImageId;

        /**是否支持在线扩容*/
        @JsonProperty("OnlineExpansion")
        private Boolean OnlineExpansion;

        /**主机启动方式（已废弃，可参考BootMode）
*/
        @JsonProperty("ImageMode")
        private String ImageMode;

        /**镜像模式（启动方式），枚举值：BIOS(Legacy)，UEFI*/
        @JsonProperty("BootMode")
        private String BootMode;

    }

}
