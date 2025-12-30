package ksyun.client.ebs.describesnapshots.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSnapshotsResponse
* @Description DescribeSnapshots 返回体
*/
@Data
@ToString
public class DescribeSnapshotsResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**快照相关信息列表，若无信息则不返回*/
    @JsonProperty("Snapshots")
    private List<SnapshotsDto> Snapshots;

    @Data
    @ToString
    public static class SnapshotsDto {
        /**快照ID*/
        @JsonProperty("SnapshotId")
        private String SnapshotId;

        /**快照名称*/
        @JsonProperty("SnapshotName")
        private String SnapshotName;

        /**云硬盘ID*/
        @JsonProperty("VolumeId")
        private String VolumeId;

        /**云硬盘大小 单位:GB*/
        @JsonProperty("Size")
        private Integer Size;

        /**云硬盘创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**快照状态*/
        @JsonProperty("SnapshotStatus")
        private String SnapshotStatus;

        /**云硬盘分类，system（系统盘）或data（数据盘）*/
        @JsonProperty("VolumeCategory")
        private String VolumeCategory;

        /**云硬盘名称*/
        @JsonProperty("VolumeName")
        private String VolumeName;

        /**云硬盘类型*/
        @JsonProperty("VolumeType")
        private String VolumeType;

        /**快照进度*/
        @JsonProperty("Progress")
        private String Progress;

        /**可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**云硬盘状态*/
        @JsonProperty("VolumeStatus")
        private String VolumeStatus;

        /**快照类型 LocalSnapShot(本地快照)
CommonSnapShot(普通快照)*/
        @JsonProperty("SnapshotType")
        private String SnapshotType;

    }

}
