package ksyun.client.sqlserver.describedbinstances.v20190425;

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
        /***/
        @JsonProperty("Instances")
        private List<DataDtoInstancesDto> Instances;

        @Data
        @ToString
        public static class DataDtoInstancesDto {
            /**实例配置详情*/
            @JsonProperty("DBInstanceClass")
            private DataDtoInstancesDtoDBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DataDtoInstancesDtoDBInstanceClassDto {
                /**配置加密字符串-FlavorId*/
                @JsonProperty("Id")
                private String Id;

                /**CPU核数*/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /**磁盘大小*/
                @JsonProperty("Disk")
                private Integer Disk;

                /**内存大小*/
                @JsonProperty("Ram")
                private Integer Ram;

            }

            /**实例ID*/
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

            /***/
            @JsonProperty("GroupId")
            private String GroupId;

            /**VIP*/
            @JsonProperty("Vip")
            private String Vip;

            /**端口号，若新建不指定，默认为1433*/
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

            /**数据库管理员账户*/
            @JsonProperty("MasterUserName")
            private String MasterUserName;

            /**VPCID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**终端子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**可公开访问*/
            @JsonProperty("PubliclyAccessible")
            private Boolean PubliclyAccessible;

            /**只读实例列表(SQL Server暂无只读)*/
            @JsonProperty("ReadReplicaDBInstanceIdentifiers")
            private List<String> ReadReplicaDBInstanceIdentifiers;

            /**订单付费类型：HourlyInstantSettlement 按量计费*/
            @JsonProperty("BillType")
            private String BillType;

            /**订单类型：REGULAR 一般订单*/
            @JsonProperty("OrderType")
            private String OrderType;

            /**订单来源：OPENAPI 接口创建，CONSOLE 控制台创建*/
            @JsonProperty("OrderSource")
            private String OrderSource;

            /**是否多可用区*/
            @JsonProperty("MultiAvailabilityZone")
            private Boolean MultiAvailabilityZone;

            /**主可用区*/
            @JsonProperty("MasterAvailabilityZone")
            private String MasterAvailabilityZone;

            /**备可用区*/
            @JsonProperty("SlaveAvailabilityZone")
            private String SlaveAvailabilityZone;

            /**商品ID*/
            @JsonProperty("ProductId")
            private String ProductId;

            /**最新订单类型*/
            @JsonProperty("OrderUse")
            private String OrderUse;

            /**是否支持IPV6*/
            @JsonProperty("SupportIPV6")
            private Boolean SupportIPV6;

            /**项目ID*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**项目名称*/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /**区域代码，区分实例所在区域*/
            @JsonProperty("Region")
            private String Region;

            /**订单付费类型代码*/
            @JsonProperty("BillTypeId")
            private Integer BillTypeId;

            /**标签信息*/
            @JsonProperty("Tags")
            private List<String> Tags;

        }

        /**总数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**当前每页展示条数*/
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
