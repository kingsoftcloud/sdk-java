package ksyun.client.kec.describelocalvolumesnapshots.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLocalVolumeSnapshotsResponse
* @Description DescribeLocalVolumeSnapshots 返回体
*/
@Data
@ToString
public class DescribeLocalVolumeSnapshotsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("LocalVolumeSnapshotCount")
    private Integer LocalVolumeSnapshotCount;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("LocalVolumeSnapshotSet")
    private List<LocalVolumeSnapshotSetDto> LocalVolumeSnapshotSet;

    @Data
    @ToString
    public static class LocalVolumeSnapshotSetDto {
        /***/
        @JsonProperty("LocalVolumeSnapshotId")
        private String LocalVolumeSnapshotId;

        /***/
        @JsonProperty("InstantAccess")
        private Boolean InstantAccess;

        /***/
        @JsonProperty("LocalVolumeSnapshotName")
        private String LocalVolumeSnapshotName;

        /***/
        @JsonProperty("LocalVolumeSnapshotDesc")
        private String LocalVolumeSnapshotDesc;

        /***/
        @JsonProperty("SourceLocalVolumeId")
        private String SourceLocalVolumeId;

        /***/
        @JsonProperty("SourceLocalVolumeName")
        private String SourceLocalVolumeName;

        /***/
        @JsonProperty("ScheduledDeleteTime")
        private String ScheduledDeleteTime;

        /***/
        @JsonProperty("CreateImage")
        private Boolean CreateImage;

        /***/
        @JsonProperty("CopyFromRemote")
        private Boolean CopyFromRemote;

        /***/
        @JsonProperty("SourceLocalVolumeCategory")
        private String SourceLocalVolumeCategory;

        /***/
        @JsonProperty("SourceLocalVolumeState")
        private String SourceLocalVolumeState;

        /***/
        @JsonProperty("State")
        private String State;

        /***/
        @JsonProperty("CreationDate")
        private String CreationDate;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("DiskSize")
        private Integer DiskSize;

        /***/
        @JsonProperty("SnapshotType")
        private String SnapshotType;

        /***/
        @JsonProperty("MinDisk")
        private Integer MinDisk;

    }

}
