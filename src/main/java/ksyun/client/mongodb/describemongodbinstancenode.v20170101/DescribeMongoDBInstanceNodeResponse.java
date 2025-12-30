package ksyun.client.mongodb.describemongodbinstancenode.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMongoDBInstanceNodeResponse
* @Description DescribeMongoDBInstanceNode 返回体
*/
@Data
@ToString
public class DescribeMongoDBInstanceNodeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MongoDBInstanceNodeResult")
    private List<MongoDBInstanceNodeResultDto> MongoDBInstanceNodeResult;

    @Data
    @ToString
    public static class MongoDBInstanceNodeResultDto {
        /***/
        @JsonProperty("NodeId")
        private String NodeId;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Role")
        private String Role;

        /***/
        @JsonProperty("IP")
        private String IP;

        /***/
        @JsonProperty("Port")
        private Integer Port;

        /***/
        @JsonProperty("Status")
        private String Status;

    }

}
