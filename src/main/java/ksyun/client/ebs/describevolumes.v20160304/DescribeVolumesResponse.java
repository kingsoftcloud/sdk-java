package ksyun.client.ebs.describevolumes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeVolumesResponse
* @Description DescribeVolumes 返回体
*/
@Data
@ToString
public class DescribeVolumesResponse extends BaseResponseModel {
    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**云硬盘相关信息列表，若无信息则不返回*/
    @JsonProperty("Volumes")
    private List<VolumesDto> Volumes;

    @Data
    @ToString
    public static class VolumesDto {
        /**云硬盘ID*/
        @JsonProperty("VolumeId")
        private String VolumeId;

        /**云硬盘名称*/
        @JsonProperty("VolumeName")
        private String VolumeName;

        /**云硬盘描述信息*/
        @JsonProperty("VolumeDesc")
        private String VolumeDesc;

        /**云硬盘大小，单位：GB*/
        @JsonProperty("Size")
        private Integer Size;

        /**云硬盘状态，八种creating、available、attaching、inuse、detaching、extending、deleting、error*/
        @JsonProperty("VolumeStatus")
        private String VolumeStatus;

        /**云硬盘类型，三种，SSD2.0/SSD3.0/EHDD*/
        @JsonProperty("VolumeType")
        private String VolumeType;

        /**云硬盘分类，两种，有效值是系统盘（system）或者数据盘（data）*/
        @JsonProperty("VolumeCategory")
        private String VolumeCategory;

        /**云硬盘状态为in-use时，该云硬盘关联的实例ID（主机ID）*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**云硬盘所在可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**云硬盘计费方式*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**云硬盘订单状态，取值范围：1:正式 2:试用*/
        @JsonProperty("InstanceTradeType")
        private Integer InstanceTradeType;

        /**云硬盘创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**硬盘的当前挂载信息*/
        @JsonProperty("Attachment")
        private List<VolumesDtoAttachmentDto> Attachment;

        @Data
        @ToString
        public static class VolumesDtoAttachmentDto {
            /**硬盘当前挂载的实例ID（主机ID）*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**硬盘挂载点*/
            @JsonProperty("MountPoint")
            private String MountPoint;

            /**待挂载的云硬盘是否随云主机删除。取值范围：
true：删除云主机时，该云硬盘随云主机一起删除
false：删除云主机时，保留该云硬盘，仅卸载，不随云主机一起释放*/
            @JsonProperty("DeleteWithInstance")
            private Boolean DeleteWithInstance;

        }

        /**硬盘所属项目组id*/
        @JsonProperty("ProjectId")
        private Integer ProjectId;

        /**云硬盘到期时间*/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

    }

}
