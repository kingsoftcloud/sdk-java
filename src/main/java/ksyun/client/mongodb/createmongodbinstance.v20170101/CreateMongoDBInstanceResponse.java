package ksyun.client.mongodb.createmongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMongoDBInstanceResponse
* @Description CreateMongoDBInstance 返回体
*/
@Data
@ToString
public class CreateMongoDBInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MongoDBInstanceResult")
    private MongoDBInstanceResultDto MongoDBInstanceResult;

    @Data
    @ToString
    public static class MongoDBInstanceResultDto {
        /***/
        @JsonProperty("UserId")
        private String UserId;

        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Name")
        private String Name;

    }

}
