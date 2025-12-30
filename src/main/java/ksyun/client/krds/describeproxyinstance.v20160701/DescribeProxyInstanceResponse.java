package ksyun.client.krds.describeproxyinstance.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeProxyInstanceResponse
* @Description DescribeProxyInstance 返回体
*/
@Data
@ToString
public class DescribeProxyInstanceResponse extends BaseResponseModel {

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
            private List<DataInstancesAvailabilityZoneListDto> AvailabilityZoneList;

            @Data
            @ToString
            public static class DataInstancesAvailabilityZoneListDto {
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
            private List<DataInstancesSecurityGroupsDto> SecurityGroups;

            @Data
            @ToString
            public static class DataInstancesSecurityGroupsDto {
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
            @JsonProperty("NetworkType")
            private Integer NetworkType;

            /***/
            @JsonProperty("SupportIPV6")
            private Boolean SupportIPV6;

            /**代理实例绑定只读实例信息，详情可参见实例详情接口；具体返回绑定只读实例id,状态,权重等信息*/
            @JsonProperty("BindInstances")
            private List<String> BindInstances;

            /**返回代理实例节点具体信息，包含实例名称及ID*/
            @JsonProperty("ProxyNodeInfo")
            private List<String> ProxyNodeInfo;

            /***/
            @JsonProperty("ProxyInfo")
            private DataInstancesProxyInfoDto ProxyInfo;

            @Data
            @ToString
            public static class DataInstancesProxyInfoDto {
            }

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
