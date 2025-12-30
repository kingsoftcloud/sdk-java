package ksyun.client.krds.allocatedbinstanceeip.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AllocateDBInstanceEipResponse
* @Description AllocateDBInstanceEip 返回体
*/
@Data
@ToString
public class AllocateDBInstanceEipResponse extends BaseResponseModel {

    /**返回实例详情信息，可参见接口：DescribeDBInstances*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DBInstance")
        private DataDBInstanceDto DBInstance;

        @Data
        @ToString
        public static class DataDBInstanceDto {
            /***/
            @JsonProperty("DBInstanceClass")
            private DataDBInstanceDBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DataDBInstanceDBInstanceClassDto {
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
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

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
            private List<DataDBInstanceAvailabilityZoneListDto> AvailabilityZoneList;

            @Data
            @ToString
            public static class DataDBInstanceAvailabilityZoneListDto {
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
            private List<DataDBInstanceReadReplicaDBInstanceIdentifiersDto> ReadReplicaDBInstanceIdentifiers;

            @Data
            @ToString
            public static class DataDBInstanceReadReplicaDBInstanceIdentifiersDto {
                /***/
                @JsonProperty("Vip")
                private String Vip;

                /***/
                @JsonProperty("ReadReplicaDBInstanceIdentifier")
                private String ReadReplicaDBInstanceIdentifier;

                /***/
                @JsonProperty("id")
                private String Id;

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
            @JsonProperty("ServiceStartTime")
            private String ServiceStartTime;

            /***/
            @JsonProperty("SubOrderId")
            private String SubOrderId;

            /***/
            @JsonProperty("SecurityGroups")
            private List<DataDBInstanceSecurityGroupsDto> SecurityGroups;

            @Data
            @ToString
            public static class DataDBInstanceSecurityGroupsDto {
                /***/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

                /***/
                @JsonProperty("SecurityGroupName")
                private String SecurityGroupName;

                /***/
                @JsonProperty("SecurityGroupType")
                private String SecurityGroupType;

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
	–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
