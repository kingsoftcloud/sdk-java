package ksyun.client.krds.overridedbinstance.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname OverrideDBInstanceResponse
* @Description OverrideDBInstance 返回体
*/
@Data
@ToString
public class OverrideDBInstanceResponse extends BaseResponseModel {
    /**实例基本信息	
*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Instances")
        private List<InstancesDto> Instances;

        @Data
        @ToString
        public static class InstancesDto {
            /***/
            @JsonProperty("DBInstanceClass")
            private DBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DBInstanceClassDto {
                /**请求id	
*/
                @JsonProperty("Id")
                private String Id;

                /**请求id	
*/
                @JsonProperty("Iops")
                private Integer Iops;

                /**请求id	
*/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /**请求id	
*/
                @JsonProperty("Disk")
                private Integer Disk;

                /**请求id	
*/
                @JsonProperty("Ram")
                private Integer Ram;

                /**请求id	
*/
                @JsonProperty("Mem")
                private Integer Mem;

                /**请求id	
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
            @JsonProperty("InstanceCreateTime")
            private String InstanceCreateTime;

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
            @JsonProperty("MasterAvailabilityZone")
            private String MasterAvailabilityZone;

            /***/
            @JsonProperty("SlaveAvailabilityZone")
            private String SlaveAvailabilityZone;

            /***/
            @JsonProperty("AvailabilityZoneList")
            private List<AvailabilityZoneListDto> AvailabilityZoneList;

            @Data
            @ToString
            public static class AvailabilityZoneListDto {
                /***/
                @JsonProperty("MemberType")
                private String MemberType;

                /***/
                @JsonProperty("AzCode")
                private String AzCode;

            }

            /***/
            @JsonProperty("DiskUsed")
            private Double DiskUsed;

            /***/
            @JsonProperty("InnerAzCode")
            private String InnerAzCode;

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

                /***/
                @JsonProperty("DBBackupIdentifier")
                private String DBBackupIdentifier;

            }

            /***/
            @JsonProperty("ProductId")
            private String ProductId;

            /***/
            @JsonProperty("ProductWhat")
            private Integer ProductWhat;

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
            @JsonProperty("ServiceEndTime")
            private String ServiceEndTime;

            /***/
            @JsonProperty("ServiceStartTime")
            private String ServiceStartTime;

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

    /**请求id	
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
