package ksyun.client.krds.modifydbinstanceavailabilityzone.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDBInstanceAvailabilityZoneResponse
* @Description ModifyDBInstanceAvailabilityZone 返回体
*/
@Data
@ToString
public class ModifyDBInstanceAvailabilityZoneResponse extends BaseResponseModel {
    /**实例列表
返回实例详细信息*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例列表
返回实例详细信息*/
        @JsonProperty("DBInstance")
        private DataDtoDBInstanceDto DBInstance;

        @Data
        @ToString
        public static class DataDtoDBInstanceDto {
            /***/
            @JsonProperty("DBInstanceClass")
            private DataDtoDBInstanceDtoDBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DataDtoDBInstanceDtoDBInstanceClassDto {
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Iops")
                private Integer Iops;

                /**
 */
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /** */
                @JsonProperty("Disk")
                private Integer Disk;

                /** */
                @JsonProperty("Ram")
                private Integer Ram;

                /** */
                @JsonProperty("Mem")
                private Integer Mem;

                /** */
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
            private List<DataDtoDBInstanceDtoAvailabilityZoneListDto> AvailabilityZoneList;

            @Data
            @ToString
            public static class DataDtoDBInstanceDtoAvailabilityZoneListDto {
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
            private DataDtoDBInstanceDtoReadReplicaDBInstanceIdentifiersDto ReadReplicaDBInstanceIdentifiers;

            @Data
            @ToString
            public static class DataDtoDBInstanceDtoReadReplicaDBInstanceIdentifiersDto {
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
            private DataDtoDBInstanceDtoSecurityGroupsDto SecurityGroups;

            @Data
            @ToString
            public static class DataDtoDBInstanceDtoSecurityGroupsDto {
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
