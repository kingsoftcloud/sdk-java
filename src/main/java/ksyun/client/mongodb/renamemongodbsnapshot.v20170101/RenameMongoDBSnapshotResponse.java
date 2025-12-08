package ksyun.client.mongodb.renamemongodbsnapshot.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RenameMongoDBSnapshotResponse
* @Description RenameMongoDBSnapshot 返回体
*/
@Data
@ToString
public class RenameMongoDBSnapshotResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("SnapshotId")
    private String SnapshotId;

}
