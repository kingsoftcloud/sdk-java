package ksyun.client.mongodb.deletemongodbsnapshot.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteMongoDBSnapshotResponse
* @Description DeleteMongoDBSnapshot 返回体
*/
@Data
@ToString
public class DeleteMongoDBSnapshotResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("SnapshotId")
    private String SnapshotId;

}
