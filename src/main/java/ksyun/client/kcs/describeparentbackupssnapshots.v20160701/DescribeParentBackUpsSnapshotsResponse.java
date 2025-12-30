package ksyun.client.kcs.describeparentbackupssnapshots.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeParentBackUpsSnapshotsResponse
* @Description DescribeParentBackUpsSnapshots 返回体
*/
@Data
@ToString
public class DescribeParentBackUpsSnapshotsResponse extends BaseResponseModel {

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
        @JsonProperty("backupType")
        private String BackupType;

        /***/
        @JsonProperty("backupName")
        private String BackupName;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("backUpTime")
        private String BackUpTime;

        /***/
        @JsonProperty("updateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("taskStatus")
        private String TaskStatus;

        /***/
        @JsonProperty("resourceSize")
        private Integer ResourceSize;

    }

}
