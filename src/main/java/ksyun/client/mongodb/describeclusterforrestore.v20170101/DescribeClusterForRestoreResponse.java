package ksyun.client.mongodb.describeclusterforrestore.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClusterForRestoreResponse
* @Description DescribeClusterForRestore 返回体
*/
@Data
@ToString
public class DescribeClusterForRestoreResponse extends BaseResponseModel {

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
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

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
        @JsonProperty("PayType")
        private String PayType;

        /***/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

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

        /***/
        @JsonProperty("NodeNum")
        private Integer NodeNum;

        /***/
        @JsonProperty("MongosNum")
        private String MongosNum;

        /***/
        @JsonProperty("ShardNum")
        private String ShardNum;

        /***/
        @JsonProperty("Mode")
        private String Mode;

        /***/
        @JsonProperty("Config")
        private String Config;

        /***/
        @JsonProperty("Area")
        private String Area;

        /***/
        @JsonProperty("SlbaclId")
        private String SlbaclId;

        /***/
        @JsonProperty("Ipv6Vip")
        private String Ipv6Vip;

        /***/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /***/
        @JsonProperty("Tags")
        private List<String> Tags;

        /***/
        @JsonProperty("shards")
        private MongoDBInstanceResultShardsDto Shards;

        @Data
        @ToString
        public static class MongoDBInstanceResultShardsDto {
            /***/
            @JsonProperty("vcpu")
            private Integer Vcpu;

            /***/
            @JsonProperty("mem_size")
            private Integer Mem_size;

            /***/
            @JsonProperty("shards_num")
            private Integer Shards_num;

            /***/
            @JsonProperty("disk_size")
            private Integer Disk_size;

        }

        /***/
        @JsonProperty("mongos")
        private MongoDBInstanceResultMongosDto Mongos;

        @Data
        @ToString
        public static class MongoDBInstanceResultMongosDto {
            /***/
            @JsonProperty("vcpu")
            private Integer Vcpu;

            /***/
            @JsonProperty("mem_size")
            private Integer Mem_size;

            /***/
            @JsonProperty("mongos_num")
            private Integer Mongos_num;

            /***/
            @JsonProperty("disk_size")
            private Integer Disk_size;

        }

    }

}
