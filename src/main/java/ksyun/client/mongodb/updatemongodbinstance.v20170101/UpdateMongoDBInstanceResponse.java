package ksyun.client.mongodb.updatemongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateMongoDBInstanceResponse
 * @Description UpdateMongoDBInstance 返回体
 */
@Data
@ToString
public class UpdateMongoDBInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
