package ksyun.client.clickhouse.describeinstanceshardinfo.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceShardInfoResponse
* @Description DescribeInstanceShardInfo 返回体
*/
@Data
@ToString
public class DescribeInstanceShardInfoResponse extends BaseResponseModel {
    /**5cd1f522-6975-4ed1-a8db-71830dfb8b92*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /**success*/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Zookeeper")
        private List<DataDtoZookeeperDto> Zookeeper;

        @Data
        @ToString
        public static class DataDtoZookeeperDto {
            /**41a7fcd8-1cd0-4b93-ae3a-23fbbc712739*/
            @JsonProperty("Id")
            private String Id;

            /**2*/
            @JsonProperty("Vcpus")
            private Integer Vcpus;

            /**4*/
            @JsonProperty("Ram")
            private Integer Ram;

            /**50*/
            @JsonProperty("Disk")
            private Integer Disk;

            /**fengjiahua_test_1-zk-1*/
            @JsonProperty("Name")
            private String Name;

            /**fengjiahua_test_1-zk*/
            @JsonProperty("ZkName")
            private String ZkName;

        }

        /***/
        @JsonProperty("Clickhouse")
        private DataDtoClickhouseDto Clickhouse;

        @Data
        @ToString
        public static class DataDtoClickhouseDto {
            /**default_cluster*/
            @JsonProperty("ClusterName")
            private String ClusterName;

            /**3df23844-8ed4-4b14-bfbe-9dacf6b43328*/
            @JsonProperty("ClusterId")
            private String ClusterId;

            /**172.31.252.122*/
            @JsonProperty("ClusterVip")
            private String ClusterVip;

            /**0.0*/
            @JsonProperty("ColdUsage")
            private String ColdUsage;
        }

    }

}
