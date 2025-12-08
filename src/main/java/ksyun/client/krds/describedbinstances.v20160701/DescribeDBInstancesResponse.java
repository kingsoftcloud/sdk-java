package ksyun.client.krds.describedbinstances.v20160701;

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
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例列表，若是指定实例id查询，则返回单条数据；

#### 注意
此处demo为指定实例详情返回数据，实例列表返回数据会少具体的绑定及节点详细信息*/
        @JsonProperty("Instances")
        private List<InstancesDto> Instances;

        @Data
        @ToString
        public static class InstancesDto {
            /**实例配置信息*/
            @JsonProperty("DBInstanceClass")
            private DBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DBInstanceClassDto {
                /**配置FlavorID*/
                @JsonProperty("Id")
                private String Id;

                /**Iops总数*/
                @JsonProperty("Iops")
                private Integer Iops;

                /**cpu核数*/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /**磁盘大小*/
                @JsonProperty("Disk")
                private Integer Disk;

                /**内存大小*/
                @JsonProperty("Ram")
                private Integer Ram;

                /**磁盘大小*/
                @JsonProperty("Mem")
                private Integer Mem;

                /**最大连接数(列表不返回)*/
                @JsonProperty("MaxConn")
                private Integer MaxConn;

            }

            /**实例id*/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /**实例名称*/
            @JsonProperty("DBInstanceName")
            private String DBInstanceName;

            /**实例状态*/
            @JsonProperty("DBInstanceStatus")
            private String DBInstanceStatus;

            /**实例类型*/
            @JsonProperty("DBInstanceType")
            private String DBInstanceType;

            /**实例原始参数组ID*/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /**自动备份时间段*/
            @JsonProperty("PreferredBackupTime")
            private String PreferredBackupTime;

            /**实例组ID*/
            @JsonProperty("GroupId")
            private String GroupId;

            /**实例安全组id*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**VIP*/
            @JsonProperty("Vip")
            private String Vip;

            /**端口号，若新建不指定，默认为3306*/
            @JsonProperty("Port")
            private Integer Port;

            /**数据库引擎类型*/
            @JsonProperty("Engine")
            private String Engine;

            /**数据库版本*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**实例创建时间*/
            @JsonProperty("InstanceCreateTime")
            private String InstanceCreateTime;

            /**实例管理员账户名称*/
            @JsonProperty("MasterUserName")
            private String MasterUserName;

            /**数据库版本ID*/
            @JsonProperty("DatastoreVersionId")
            private String DatastoreVersionId;

            /**VPCID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**终端子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**可公开访问*/
            @JsonProperty("PubliclyAccessible")
            private Boolean PubliclyAccessible;

            /**订单付费类型：HourlyInstantSettlement 按量计费*/
            @JsonProperty("BillType")
            private String BillType;

            /**订单类型：REGULAR 一般订单*/
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

            /**可用区节点细节信息*/
            @JsonProperty("AvailabilityZoneList")
            private List<AvailabilityZoneListDto> AvailabilityZoneList;

            @Data
            @ToString
            public static class AvailabilityZoneListDto {
                /**节点名称*/
                @JsonProperty("MemberType")
                private String MemberType;

                /**可用区*/
                @JsonProperty("AzCode")
                private String AzCode;

            }

            /**磁盘使用量*/
            @JsonProperty("DiskUsed")
            private Integer DiskUsed;

            /**可用区内部码*/
            @JsonProperty("InnerAzCode")
            private String InnerAzCode;

            /**是否开启审计*/
            @JsonProperty("Audit")
            private Boolean Audit;

            /**只读节点信息，返回只读节点实例id列表*/
            @JsonProperty("ReadReplicaDBInstanceIdentifiers")
            private List<String> ReadReplicaDBInstanceIdentifiers;

            /**商品ID*/
            @JsonProperty("ProductId")
            private String ProductId;

            /**产品作用*/
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

            /**服务开始时间*/
            @JsonProperty("ServiceStartTime")
            private String ServiceStartTime;

            /**子订单ID*/
            @JsonProperty("SubOrderId")
            private String SubOrderId;

            /**具体版本号*/
            @JsonProperty("MiniVersion")
            private String MiniVersion;

            /**安全组信息列表(支持多安全组，返回多个安全组信息)*/
            @JsonProperty("SecurityGroups")
            private List<SecurityGroupsDto> SecurityGroups;

            @Data
            @ToString
            public static class SecurityGroupsDto {
                /**安全组ID*/
                @JsonProperty("SecurityGroupId")
                private String SecurityGroupId;

                /**安全组名称*/
                @JsonProperty("SecurityGroupName")
                private String SecurityGroupName;

                /**安全组类型(现仅支持IPV4)*/
                @JsonProperty("SecurityGroupType")
                private String SecurityGroupType;

            }

            /**网络类型
2 普通VPC实例
3 互信VPC实例*/
            @JsonProperty("NetworkType")
            private Integer NetworkType;

            /**是否支持支持IPV6*/
            @JsonProperty("SupportIPV6")
            private Boolean SupportIPV6;

            /**关联实例详情，可分配实例节点权重信息*/
            @JsonProperty("BindInstances")
            private List<BindInstancesDto> BindInstances;

            @Data
            @ToString
            public static class BindInstancesDto {
                /**状态*/
                @JsonProperty("Status")
                private String Status;

                /**权重*/
                @JsonProperty("Weight")
                private Integer Weight;

                /**名称*/
                @JsonProperty("Name")
                private String Name;

                /**vpc*/
                @JsonProperty("Vpc")
                private String Vpc;

                /**实例类型*/
                @JsonProperty("Type")
                private String Type;

                /**实例id*/
                @JsonProperty("Id")
                private String Id;

            }

            /**代理实例节点详情(需要开启代理实例，白名单功能)*/
            @JsonProperty("ProxyNodeInfo")
            private List<ProxyNodeInfoDto> ProxyNodeInfo;

            @Data
            @ToString
            public static class ProxyNodeInfoDto {
                /**名称*/
                @JsonProperty("Name")
                private String Name;

                /**id*/
                @JsonProperty("Id")
                private String Id;

            }

            /**代理实例信息*/
            @JsonProperty("ProxyInfo")
            private ProxyInfoDto ProxyInfo;

            @Data
            @ToString
            public static class ProxyInfoDto {
            }

            /**临时关闭主备切换开关*/
            @JsonProperty("AutoSwitch")
            private Integer AutoSwitch;

            /**计费类型code*/
            @JsonProperty("BillTypeId")
            private Integer BillTypeId;

        }

        /**总条数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**每页展示条数*/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /**起始条数*/
        @JsonProperty("Marker")
        private Integer Marker;

    }

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
