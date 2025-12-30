package ksyun.client.mongodb.describemongodbshardnode.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMongoDBShardNodeResponse
* @Description DescribeMongoDBShardNode 返回体
*/
@Data
@ToString
public class DescribeMongoDBShardNodeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MongosNodeResult")
    private List<MongosNodeResultDto> MongosNodeResult;

    @Data
    @ToString
    public static class MongosNodeResultDto {
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
        @JsonProperty("Endpoint")
        private String Endpoint;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Connections")
        private Integer Connections;

        /***/
        @JsonProperty("InstanceClass")
        private String InstanceClass;

    }

    /***/
    @JsonProperty("ShardNodeResult")
    private List<ShardNodeResultDto> ShardNodeResult;

    @Data
    @ToString
    public static class ShardNodeResultDto {
        /***/
        @JsonProperty("NodeId")
        private String NodeId;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Disk")
        private Integer Disk;

        /***/
        @JsonProperty("Iops")
        private Integer Iops;

        /***/
        @JsonProperty("InstanceClass")
        private String InstanceClass;

    }

}
