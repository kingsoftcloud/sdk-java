package ksyun.client.kcs.describebackupssnapshotsdetail.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBackUpsSnapshotsDetailResponse
* @Description DescribeBackUpsSnapshotsDetail 返回体
*/
@Data
@ToString
public class DescribeBackUpsSnapshotsDetailResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("snapshotId")
        private String SnapshotId;

        /***/
        @JsonProperty("resourceId")
        private String ResourceId;

        /***/
        @JsonProperty("resourceSize")
        private Integer ResourceSize;

        /***/
        @JsonProperty("backupName")
        private String BackupName;

        /***/
        @JsonProperty("backupType")
        private String BackupType;

        /***/
        @JsonProperty("taskStatus")
        private String TaskStatus;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("updateTime")
        private String UpdateTime;

    }

}
