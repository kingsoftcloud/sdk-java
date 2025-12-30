package ksyun.client.mongodb.describemongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMongoDBInstanceResponse
* @Description DescribeMongoDBInstance 返回体
*/
@Data
@ToString
public class DescribeMongoDBInstanceResponse extends BaseResponseModel {

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
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("InstanceId")
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
        private Integer Port;

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
        @JsonProperty("TimingSwitch")
        private String TimingSwitch;

        /***/
        @JsonProperty("Timezone")
        private String Timezone;

        /***/
        @JsonProperty("TimeCycle")
        private String TimeCycle;

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

        /***/
        @JsonProperty("IamProjectId")
        private String IamProjectId;

        /***/
        @JsonProperty("IamProjectName")
        private String IamProjectName;

    }

}
