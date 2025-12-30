package ksyun.client.mongodb.describeshardnode.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeShardNodeResponse
* @Description DescribeShardNode 返回体
*/
@Data
@ToString
public class DescribeShardNodeResponse extends BaseResponseModel {

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

        /***/
        @JsonProperty("ipv6Vip")
        private String Ipv6Vip;

        /***/
        @JsonProperty("eipEport")
        private String EipEport;

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

        /***/
        @JsonProperty("NodeNum")
        private Integer NodeNum;

        /***/
        @JsonProperty("UsedDisk")
        private Integer UsedDisk;

    }

}
