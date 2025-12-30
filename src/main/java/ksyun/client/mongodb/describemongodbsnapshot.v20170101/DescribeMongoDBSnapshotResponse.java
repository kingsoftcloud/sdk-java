package ksyun.client.mongodb.describemongodbsnapshot.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMongoDBSnapshotResponse
* @Description DescribeMongoDBSnapshot 返回体
*/
@Data
@ToString
public class DescribeMongoDBSnapshotResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MongoDBSnapshotResult")
    private List<MongoDBSnapshotResultDto> MongoDBSnapshotResult;

    @Data
    @ToString
    public static class MongoDBSnapshotResultDto {
        /***/
        @JsonProperty("SnapshotId")
        private String SnapshotId;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Type")
        private String Type;

        /***/
        @JsonProperty("Size")
        private Integer Size;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("BackupMode")
        private String BackupMode;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

}
