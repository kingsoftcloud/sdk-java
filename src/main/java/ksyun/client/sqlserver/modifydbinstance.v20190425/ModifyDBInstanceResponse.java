package ksyun.client.sqlserver.modifydbinstance.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDBInstanceResponse
* @Description ModifyDBInstance 返回体
*/
@Data
@ToString
public class ModifyDBInstanceResponse extends BaseResponseModel {
    /***/
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
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Iops")
                private Integer Iops;

                /***/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /***/
                @JsonProperty("Disk")
                private Integer Disk;

                /***/
                @JsonProperty("Ram")
                private Integer Ram;

                /***/
                @JsonProperty("Mem")
                private Integer Mem;

                /***/
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
            private Integer DiskUsed;

            /***/
            @JsonProperty("InnerAzCode")
            private String InnerAzCode;

            /***/
            @JsonProperty("Audit")
            private Boolean Audit;

            /***/
            @JsonProperty("ReadReplicaDBInstanceIdentifiers")
            private List<String> ReadReplicaDBInstanceIdentifiers;

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
            @JsonProperty("ServiceStartTime")
            private String ServiceStartTime;

            /***/
            @JsonProperty("SubOrderId")
            private String SubOrderId;

            /***/
            @JsonProperty("MiniVersion")
            private String MiniVersion;

            /***/
            @JsonProperty("SecurityGroups")
            private List<String> SecurityGroups;

            /***/
            @JsonProperty("NetworkType")
            private Integer NetworkType;

            /***/
            @JsonProperty("MaintenanceTime")
            private String MaintenanceTime;

            /***/
            @JsonProperty("SupportIPV6")
            private Boolean SupportIPV6;

            /***/
            @JsonProperty("BindInstances")
            private List<String> BindInstances;

            /***/
            @JsonProperty("ProxyNodeInfo")
            private List<String> ProxyNodeInfo;

            /***/
            @JsonProperty("ProxyInfo")
            private List<String> ProxyInfo;

            /***/
            @JsonProperty("AutoSwitch")
            private Integer AutoSwitch;

            /***/
            @JsonProperty("BillTypeId")
            private Integer BillTypeId;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
