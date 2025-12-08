package ksyun.client.mongodb.deletemongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteMongoDBInstanceResponse
* @Description DeleteMongoDBInstance 返回体
*/
@Data
@ToString
public class DeleteMongoDBInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceId")
    private String InstanceId;

}
