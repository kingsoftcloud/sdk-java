package ksyun.client.mongodb.describemongodbinstances.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMongoDBInstancesResponse
* @Description DescribeMongoDBInstances 返回体
*/
@Data
@ToString
public class DescribeMongoDBInstancesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MongoDBInstancesResult")
    private List<MongoDBInstancesResultDto> MongoDBInstancesResult;

    @Data
    @ToString
    public static class MongoDBInstancesResultDto {
        /***/
        @JsonProperty("IamProjectId")
        private String IamProjectId;

        /***/
        @JsonProperty("IamProjectName")
        private String IamProjectName;

        /***/
        @JsonProperty("UserId")
        private String UserId;

        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("instanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("IP")
        private String IP;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("Version")
        private String Version;

        /***/
        @JsonProperty("InstanceClass")
        private String InstanceClass;

        /***/
        @JsonProperty("Storage")
        private Integer Storage;

        /***/
        @JsonProperty("Port")
        private String Port;

        /***/
        @JsonProperty("NetworkType")
        private String NetworkType;

        /***/
        @JsonProperty("VpcId")
        private String VpcId;

        /***/
        @JsonProperty("VnetId")
        private String VnetId;

        /***/
        @JsonProperty("ProductId")
        private String ProductId;

        /***/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /***/
        @JsonProperty("PayType")
        private String PayType;

        /***/
        @JsonProperty("CreateDate")
        private String CreateDate;

        /***/
        @JsonProperty("ExpirationDate")
        private String ExpirationDate;

    }

    /***/
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

    /***/
    @JsonProperty("Total")
    private Integer Total;

}
