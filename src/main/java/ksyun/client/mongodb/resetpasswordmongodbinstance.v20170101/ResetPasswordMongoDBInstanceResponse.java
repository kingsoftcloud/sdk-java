package ksyun.client.mongodb.resetpasswordmongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResetPasswordMongoDBInstanceResponse
* @Description ResetPasswordMongoDBInstance 返回体
*/
@Data
@ToString
public class ResetPasswordMongoDBInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceId")
    private String InstanceId;

}
