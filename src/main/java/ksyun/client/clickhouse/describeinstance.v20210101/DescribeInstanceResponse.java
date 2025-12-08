package ksyun.client.clickhouse.describeinstance.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceResponse
* @Description DescribeInstance 返回体
*/
@Data
@ToString
public class DescribeInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("InstacneConfig")
        private String InstacneConfig;

        /***/
        @JsonProperty("AdminUser")
        private String AdminUser;

        /***/
        @JsonProperty("StatusName")
        private String StatusName;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("NetworkType")
        private String NetworkType;

        /***/
        @JsonProperty("VpcId")
        private String VpcId;

        /***/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /***/
        @JsonProperty("Vip")
        private String Vip;

        /***/
        @JsonProperty("Engine")
        private String Engine;

        /***/
        @JsonProperty("EngineVersion")
        private String EngineVersion;

        /***/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /***/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /***/
        @JsonProperty("BillType")
        private Integer BillType;

        /***/
        @JsonProperty("StorageSize")
        private Integer StorageSize;

        /***/
        @JsonProperty("UsedStorageSize")
        private Integer UsedStorageSize;

        /***/
        @JsonProperty("StorageType")
        private String StorageType;

        /***/
        @JsonProperty("Mem")
        private Integer Mem;

        /***/
        @JsonProperty("Cpu")
        private Integer Cpu;

        /***/
        @JsonProperty("TcpPort")
        private Integer TcpPort;

        /***/
        @JsonProperty("HttpPort")
        private Integer HttpPort;

        /***/
        @JsonProperty("NodeNum")
        private Integer NodeNum;

        /***/
        @JsonProperty("ProductId")
        private String ProductId;

        /***/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /***/
        @JsonProperty("ProductTypeName")
        private String ProductTypeName;

        /***/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /***/
        @JsonProperty("CreateDate")
        private String CreateDate;

        /***/
        @JsonProperty("UpdateDate")
        private String UpdateDate;

        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("Az")
        private String Az;

        /***/
        @JsonProperty("UserId")
        private String UserId;

        /***/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /***/
        @JsonProperty("SecurityGroupDesc")
        private String SecurityGroupDesc;

        /***/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /***/
        @JsonProperty("ShardList")
        private List<ShardListDto> ShardList;

        @Data
        @ToString
        public static class ShardListDto {
            /***/
            @JsonProperty("id")
            private String Id;

            /***/
            @JsonProperty("name")
            private String Name;

        }

        /***/
        @JsonProperty("Replicas")
        private Integer Replicas;

        /***/
        @JsonProperty("DirectConnectionVips")
        private List<String> DirectConnectionVips;

        /***/
        @JsonProperty("MultiAz")
        private Integer MultiAz;

        /***/
        @JsonProperty("Area")
        private AreaDto Area;

        @Data
        @ToString
        public static class AreaDto {
            /***/
            @JsonProperty("Master")
            private String Master;

            /***/
            @JsonProperty("Standby")
            private String Standby;

        }

    }

}
