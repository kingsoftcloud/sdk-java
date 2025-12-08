package ksyun.client.krds.createdbinstancereadreplica.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDBInstanceReadReplicaResponse
* @Description CreateDBInstanceReadReplica 返回体
*/
@Data
@ToString
public class CreateDBInstanceReadReplicaResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**RDS实例信息
*/
        @JsonProperty("DBInstance")
        private DBInstanceDto DBInstance;

        @Data
        @ToString
        public static class DBInstanceDto {
            /***/
            @JsonProperty("DBInstanceClass")
            private DBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DBInstanceClassDto {
                /**请求ID
*/
                @JsonProperty("Id")
                private String Id;

                /**请求ID
*/
                @JsonProperty("Iops")
                private Integer Iops;

                /**请求ID
*/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /**请求ID
*/
                @JsonProperty("Disk")
                private Integer Disk;

                /**请求ID
*/
                @JsonProperty("Ram")
                private Integer Ram;

                /**请求ID
*/
                @JsonProperty("Mem")
                private Integer Mem;

                /**请求ID
*/
                @JsonProperty("MaxConn")
                private Integer MaxConn;

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
            @JsonProperty("PreferredBackupTime")
            private String PreferredBackupTime;

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
            @JsonProperty("MasterUserName")
            private String MasterUserName;

            /***/
            @JsonProperty("DatastoreVersionId")
            private String DatastoreVersionId;

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
            @JsonProperty("BillType")
            private String BillType;

            /***/
            @JsonProperty("OrderType")
            private String OrderType;

            /***/
            @JsonProperty("MultiAvailabilityZone")
            private Boolean MultiAvailabilityZone;

            /***/
            @JsonProperty("AvailabilityZoneList")
            private AvailabilityZoneListDto AvailabilityZoneList;

            @Data
            @ToString
            public static class AvailabilityZoneListDto {
            }

            /***/
            @JsonProperty("DiskUsed")
            private Double DiskUsed;

            /***/
            @JsonProperty("Audit")
            private Boolean Audit;

            /***/
            @JsonProperty("ReadReplicaDBInstanceIdentifiers")
            private ReadReplicaDBInstanceIdentifiersDto ReadReplicaDBInstanceIdentifiers;

            @Data
            @ToString
            public static class ReadReplicaDBInstanceIdentifiersDto {
            }

            /***/
            @JsonProperty("DBSource")
            private DBSourceDto DBSource;

            @Data
            @ToString
            public static class DBSourceDto {
                /***/
                @JsonProperty("DBInstanceIdentifier")
                private String DBInstanceIdentifier;

                /***/
                @JsonProperty("DBInstanceName")
                private String DBInstanceName;

                /***/
                @JsonProperty("DBInstanceType")
                private String DBInstanceType;

            }

            /***/
            @JsonProperty("ProductId")
            private String ProductId;

            /***/
            @JsonProperty("ProductWhat")
            private Integer ProductWhat;

            /***/
            @JsonProperty("Region")
            private String Region;

            /***/
            @JsonProperty("SubOrderId")
            private String SubOrderId;

            /***/
            @JsonProperty("SecurityGroups")
            private SecurityGroupsDto SecurityGroups;

            @Data
            @ToString
            public static class SecurityGroupsDto {
            }

            /***/
            @JsonProperty("SupportIPV6")
            private Boolean SupportIPV6;

            /***/
            @JsonProperty("BillTypeId")
            private Integer BillTypeId;

        }

    }

    /**请求ID
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
