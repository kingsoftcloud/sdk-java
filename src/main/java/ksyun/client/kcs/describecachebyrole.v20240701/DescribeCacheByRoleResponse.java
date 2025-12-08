package ksyun.client.kcs.describecachebyrole.v20240701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCacheByRoleResponse
* @Description DescribeCacheByRole 返回体
*/
@Data
@ToString
public class DescribeCacheByRoleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("MasterNodes")
        private List<MasterNodesDto> MasterNodes;

        @Data
        @ToString
        public static class MasterNodesDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("Ip")
            private String Ip;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("InstanceRole")
            private String InstanceRole;

            /***/
            @JsonProperty("Az")
            private String Az;

            /***/
            @JsonProperty("ShardId")
            private String ShardId;

        }

        /***/
        @JsonProperty("SlavesNodes")
        private List<SlavesNodesDto> SlavesNodes;

        @Data
        @ToString
        public static class SlavesNodesDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("Ip")
            private String Ip;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("InstanceRole")
            private String InstanceRole;

            /***/
            @JsonProperty("Az")
            private String Az;

            /***/
            @JsonProperty("ShardId")
            private String ShardId;

        }

        /***/
        @JsonProperty("ProxyNodes")
        private List<ProxyNodesDto> ProxyNodes;

        @Data
        @ToString
        public static class ProxyNodesDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("Ip")
            private String Ip;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("InstanceRole")
            private String InstanceRole;

            /***/
            @JsonProperty("Az")
            private String Az;

            /***/
            @JsonProperty("ShardId")
            private String ShardId;

        }

    }

}
