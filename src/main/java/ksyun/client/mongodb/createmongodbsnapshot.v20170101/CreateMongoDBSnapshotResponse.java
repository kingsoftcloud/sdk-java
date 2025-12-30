package ksyun.client.mongodb.createmongodbsnapshot.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMongoDBSnapshotResponse
* @Description CreateMongoDBSnapshot 返回体
*/
@Data
@ToString
public class CreateMongoDBSnapshotResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MongoDBSnapshotResult")
    private MongoDBSnapshotResultDto MongoDBSnapshotResult;

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
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Create")
        private String Create;

    }

}
