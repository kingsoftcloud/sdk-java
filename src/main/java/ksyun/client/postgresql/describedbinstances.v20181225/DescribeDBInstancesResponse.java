package ksyun.client.postgresql.describedbinstances.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBInstancesResponse
* @Description DescribeDBInstances 返回体
*/
@Data
@ToString
public class DescribeDBInstancesResponse extends BaseResponseModel {
    /**实例列表详情/返回数据域*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例详情/列表*/
        @JsonProperty("Instances")
        private List<InstancesDto> Instances;

        @Data
        @ToString
        public static class InstancesDto {
            /**实例配置简版信息*/
            @JsonProperty("DBInstanceClass")
            private DBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DBInstanceClassDto {
                /**实例配置ID*/
                @JsonProperty("Id")
                private String Id;

                /**IOPS*/
                @JsonProperty("Iops")
                private Integer Iops;

                /**核数*/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /**磁盘*/
                @JsonProperty("Disk")
                private Integer Disk;

                /**内存*/
                @JsonProperty("Ram")
                private Integer Ram;

                /**内存*/
                @JsonProperty("Mem")
                private Integer Mem;

                /**最大连接数*/
                @JsonProperty("MaxConn")
                private Integer MaxConn;

            }

            /**实例ID*/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /**数据库实例名称*/
            @JsonProperty("DBInstanceName")
            private String DBInstanceName;

            /**数据库实例状态*/
            @JsonProperty("DBInstanceStatus")
            private String DBInstanceStatus;

            /**数据库实例类型：
HRDS_PG 高可用版
TRDS_PG 临时版
*/
            @JsonProperty("DBInstanceType")
            private String DBInstanceType;

            /**参数组ID*/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /**自动备份执行时间段*/
            @JsonProperty("PreferredBackupTime")
            private String PreferredBackupTime;

            /**组Id*/
            @JsonProperty("GroupId")
            private String GroupId;

            /**安全组ID*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**内网IP*/
            @JsonProperty("Vip")
            private String Vip;

            /**内网端口*/
            @JsonProperty("Port")
            private Integer Port;

            /**引擎*/
            @JsonProperty("Engine")
            private String Engine;

            /**引擎版本*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**实例创建时间*/
            @JsonProperty("InstanceCreateTime")
            private String InstanceCreateTime;

            /**管理员用户名*/
            @JsonProperty("MasterUserName")
            private String MasterUserName;

            /**数据存储版本Id*/
            @JsonProperty("DatastoreVersionId")
            private String DatastoreVersionId;

            /**VPC ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**可公开访问*/
            @JsonProperty("PubliclyAccessible")
            private Boolean PubliclyAccessible;

            /**账单类型/付费类型

HourlyInstantSettlement(87) 按小时实时结算 
YEAR_MONTH(1) 包年包月

*/
            @JsonProperty("BillType")
            private String BillType;

            /**订单类型：
REGULAR 一般/正常订单
TRIAL 试用订单
*/
            @JsonProperty("OrderType")
            private String OrderType;

            /**是否多可用区*/
            @JsonProperty("MultiAvailabilityZone")
            private Boolean MultiAvailabilityZone;

            /**主可用区*/
            @JsonProperty("MasterAvailabilityZone")
            private String MasterAvailabilityZone;

            /**从可用区*/
            @JsonProperty("SlaveAvailabilityZone")
            private String SlaveAvailabilityZone;

            /**可用区列表*/
            @JsonProperty("AvailabilityZoneList")
            private List<AvailabilityZoneListDto> AvailabilityZoneList;

            @Data
            @ToString
            public static class AvailabilityZoneListDto {
                /**成员类型*/
                @JsonProperty("MemberType")
                private String MemberType;

                /**可用区代码*/
                @JsonProperty("AzCode")
                private String AzCode;

            }

            /**磁盘使用量*/
            @JsonProperty("DiskUsed")
            private Integer DiskUsed;

            /**外网EIP*/
            @JsonProperty("Eip")
            private String Eip;

            /**外网EIP号*/
            @JsonProperty("EipPort")
            private Integer EipPort;

            /**内部可用区代码*/
            @JsonProperty("InnerAzCode")
            private String InnerAzCode;

            /**是否开启审计*/
            @JsonProperty("Audit")
            private Boolean Audit;

            /**只读节点信息，返回只读节点实例id列表*/
            @JsonProperty("ReadReplicaDBInstanceIdentifiers")
            private List<String> ReadReplicaDBInstanceIdentifiers;

            /**商品ID(订单信息)*/
            @JsonProperty("ProductId")
            private String ProductId;

            /**实例类型 1:正式 2:试用*/
            @JsonProperty("ProductWhat")
            private Integer ProductWhat;

            /**项目ID*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**项目名称*/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /**区域*/
            @JsonProperty("Region")
            private String Region;

            /**服务开始时间(可能存在订单创建时间与此事件不同)*/
            @JsonProperty("ServiceStartTime")
            private String ServiceStartTime;

            /**子订单ID(订单信息)*/
            @JsonProperty("SubOrderId")
            private String SubOrderId;

            /**具体版本号*/
            @JsonProperty("MiniVersion")
            private String MiniVersion;

            /**安全组列表信息(暂不支持多安全组)*/
            @JsonProperty("SecurityGroups")
            private List<SecurityGroupsDto> SecurityGroups;

            @Data
            @ToString
            public static class SecurityGroupsDto {
                /**安全组ID*/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

                /**安全组类型(现仅支持IPV4)*/
                @JsonProperty("SecurityGroupType")
                private String SecurityGroupType;

            }

            /**网络类型
2 普通VPC网络
3 互信VPC网络*/
            @JsonProperty("NetworkType")
            private Integer NetworkType;

            /**是否支持IPV6*/
            @JsonProperty("SupportIPV6")
            private Boolean SupportIPV6;

            /**代理实例功能返回数据域(PG不支持该功能)*/
            @JsonProperty("BindInstances")
            private List<String> BindInstances;

            /**代理实例功能返回数据域(PG不支持该功能)*/
            @JsonProperty("ProxyNodeInfo")
            private List<String> ProxyNodeInfo;

            /**代理实例功能返回数据域(PG不支持该功能)*/
            @JsonProperty("ProxyInfo")
            private List<String> ProxyInfo;

            /**是否自动切换；
1为开启
0为关闭*/
            @JsonProperty("AutoSwitch")
            private Integer AutoSwitch;

            /**计费类型；

87 按量付费 Pay-As-You-Go
1  包年包月 Subscription
*/
            @JsonProperty("BillTypeId")
            private Integer BillTypeId;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
