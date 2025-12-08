package ksyun.client.mongodb.restartmongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RestartMongoDBInstanceResponse
* @Description RestartMongoDBInstance 返回体
*/
@Data
@ToString
public class RestartMongoDBInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceId")
    private String InstanceId;

}
