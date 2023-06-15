package ksyun.client.mongodb.resetpasswordmongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ResetPasswordMongoDBInstanceResponse
* @Description ResetPasswordMongoDBInstance 返回体
*/
@Data
@ToString
public class ResetPasswordMongoDBInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
