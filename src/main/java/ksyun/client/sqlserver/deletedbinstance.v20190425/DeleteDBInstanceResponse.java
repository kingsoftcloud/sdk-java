package ksyun.client.sqlserver.deletedbinstance.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDBInstanceResponse
* @Description DeleteDBInstance 返回体
*/
@Data
@ToString
public class DeleteDBInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Instances")
        private List<DataInstancesDto> Instances;

        @Data
        @ToString
        public static class DataInstancesDto {
            /***/
            @JsonProperty("DBInstanceClass")
            private DataInstancesDBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DataInstancesDBInstanceClassDto {
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /***/
                @JsonProperty("Disk")
                private Integer Disk;

                /***/
                @JsonProperty("Ram")
                private Integer Ram;

            }

            /***/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /***/
            @JsonProperty("DBInstanceName")
            private String DBInstanceName;

            /***/
            @JsonProperty("DBInstanceStatus")
            private String DBInstanceStatus;

            /***/
            @JsonProperty("DBInstanceType")
            private String DBInstanceType;

            /***/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /***/
            @JsonProperty("GroupId")
            private String GroupId;

            /***/
            @JsonProperty("Vip")
            private String Vip;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("Engine")
            private String Engine;

            /***/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /***/
            @JsonProperty("InstanceCreateTime")
            private String InstanceCreateTime;

            /***/
            @JsonProperty("MasterUserName")
            private String MasterUserName;

            /***/
            @JsonProperty("VpcId")
            private String VpcId;

            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("PubliclyAccessible")
            private Boolean PubliclyAccessible;

            /***/
            @JsonProperty("ReadReplicaDBInstanceIdentifiers")
            private List<String> ReadReplicaDBInstanceIdentifiers;

            /***/
            @JsonProperty("BillType")
            private String BillType;

            /***/
            @JsonProperty("OrderType")
            private String OrderType;

            /***/
            @JsonProperty("OrderSource")
            private String OrderSource;

            /***/
            @JsonProperty("MultiAvailabilityZone")
            private Boolean MultiAvailabilityZone;

            /***/
            @JsonProperty("MasterAvailabilityZone")
            private String MasterAvailabilityZone;

            /***/
            @JsonProperty("SlaveAvailabilityZone")
            private String SlaveAvailabilityZone;

            /***/
            @JsonProperty("ProductId")
            private String ProductId;

            /***/
            @JsonProperty("OrderUse")
            private String OrderUse;

            /***/
            @JsonProperty("Eip")
            private String Eip;

            /***/
            @JsonProperty("EipPort")
            private String EipPort;

            /***/
            @JsonProperty("SupportIPV6")
            private Boolean SupportIPV6;

            /***/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /***/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /***/
            @JsonProperty("Region")
            private String Region;

            /***/
            @JsonProperty("BillTypeId")
            private Integer BillTypeId;

            /***/
            @JsonProperty("Tags")
            private List<String> Tags;

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /***/
        @JsonProperty("Marker")
        private Integer Marker;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
