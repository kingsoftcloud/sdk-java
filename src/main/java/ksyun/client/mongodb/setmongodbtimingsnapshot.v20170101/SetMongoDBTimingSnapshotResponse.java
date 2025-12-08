package ksyun.client.mongodb.setmongodbtimingsnapshot.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetMongoDBTimingSnapshotResponse
* @Description SetMongoDBTimingSnapshot 返回体
*/
@Data
@ToString
public class SetMongoDBTimingSnapshotResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceId")
    private String InstanceId;

}
