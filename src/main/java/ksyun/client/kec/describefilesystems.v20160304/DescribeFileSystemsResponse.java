package ksyun.client.kec.describefilesystems.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFileSystemsResponse
* @Description DescribeFileSystems 返回体
*/
@Data
@ToString
public class DescribeFileSystemsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("FileSystemCount")
    private Integer FileSystemCount;

    /***/
    @JsonProperty("FileSystems")
    private List<FileSystemsDto> FileSystems;

    @Data
    @ToString
    public static class FileSystemsDto {
        /***/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /***/
        @JsonProperty("FileSystemName")
        private String FileSystemName;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /***/
        @JsonProperty("StorageType")
        private String StorageType;

        /***/
        @JsonProperty("ProtocolType")
        private String ProtocolType;

        /***/
        @JsonProperty("VpcId")
        private String VpcId;

        /***/
        @JsonProperty("FileSystemState")
        private String FileSystemState;

        /***/
        @JsonProperty("CreationDate")
        private String CreationDate;

        /***/
        @JsonProperty("MountTargets")
        private List<FileSystemsMountTargetsDto> MountTargets;

        @Data
        @ToString
        public static class FileSystemsMountTargetsDto {
            /***/
            @JsonProperty("MountTargetId")
            private String MountTargetId;

            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("IpAddress")
            private String IpAddress;

            /***/
            @JsonProperty("MountTargetState")
            private String MountTargetState;

            /***/
            @JsonProperty("CreationDate")
            private String CreationDate;

        }

        /***/
        @JsonProperty("Size")
        private Integer Size;

        /***/
        @JsonProperty("UsedSize")
        private Integer UsedSize;

        /**回收站信息*/
        @JsonProperty("RecycleBin")
        private FileSystemsRecycleBinDto RecycleBin;

        @Data
        @ToString
        public static class FileSystemsRecycleBinDto {
            /**• 回收站功能是否开启，默认开启
    ◦ TRUE ：表示回收站功能开启
    ◦ FALSE：表示回收站功能不开启*/
            @JsonProperty("IsTrashEnable")
            private Boolean IsTrashEnable;

            /**• 回收站目录是否可见，默认可见
    ◦ TRUE ：表示回收站目录可见
    ◦ FALSE：表示回收站目录不可见*/
            @JsonProperty("IsTrashVisible")
            private Boolean IsTrashVisible;

            /**• 回收站内数据保留时长，默认1天。单位“天”
    ◦ 0：表示“永久保留”，不自动删除
    ◦ 1：表示“固定周期保留”*/
            @JsonProperty("IntervalTrash")
            private Integer IntervalTrash;

            /**• 可以选择操作回收站内文件的用户权限，默认“普通用户”
    ◦ 0：表示“root用户”，只有root用户具有操作所有用户目录的权限。
    undefined1：表示“普通用户”，系统根据用户名和用户ID*/
            @JsonProperty("RecycleOpPermission")
            private Integer RecycleOpPermission;

        }

    }

}
