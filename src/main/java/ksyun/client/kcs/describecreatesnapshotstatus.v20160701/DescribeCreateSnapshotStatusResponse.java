package ksyun.client.kcs.describecreatesnapshotstatus.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCreateSnapshotStatusResponse
* @Description DescribeCreateSnapshotStatus 返回体
*/
@Data
@ToString
public class DescribeCreateSnapshotStatusResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("backup_resource")
        private DataDtoBackup_resourceDto Backup_resource;

        @Data
        @ToString
        public static class DataDtoBackup_resourceDto {
            /***/
            @JsonProperty("resourceId")
            private String ResourceId;

            /***/
            @JsonProperty("backup_type")
            private Integer Backup_type;

            /***/
            @JsonProperty("backup_timezone")
            private String Backup_timezone;

            /***/
            @JsonProperty("resource_mode")
            private String Resource_mode;

            /***/
            @JsonProperty("task_status")
            private String Task_status;

            /***/
            @JsonProperty("metadata")
            private DataDtoBackup_resourceDtoMetadataDto Metadata;

            @Data
            @ToString
            public static class DataDtoBackup_resourceDtoMetadataDto {
                /***/
                @JsonProperty("bigkey")
                private Integer Bigkey;

            }

            /***/
            @JsonProperty("resource_type")
            private String Resource_type;

        }

    }

}
