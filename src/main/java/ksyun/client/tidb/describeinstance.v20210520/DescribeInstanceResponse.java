package ksyun.client.tidb.describeinstance.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceResponse
* @Description DescribeInstance 返回体
*/
@Data
@ToString
public class DescribeInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**开启模块列表*/
        @JsonProperty("EnableModules")
        private String EnableModules;

        /**模块配置*/
        @JsonProperty("ModuleConfigs")
        private List<ModuleConfigsDto> ModuleConfigs;

        @Data
        @ToString
        public static class ModuleConfigsDto {
            /**模块名称*/
            @JsonProperty("moduleType")
            private String ModuleType;

            /**模块套餐*/
            @JsonProperty("packageCode")
            private String PackageCode;

            /**模块副本数*/
            @JsonProperty("replicas")
            private Integer Replicas;

            /**模块CPU*/
            @JsonProperty("cpu")
            private Integer Cpu;

            /**模块MEM*/
            @JsonProperty("mem")
            private Integer Mem;

            /**模块磁盘大小*/
            @JsonProperty("tidisk")
            private Integer Tidisk;

            /**模块创建时间*/
            @JsonProperty("createTime")
            private String CreateTime;

        }

        /**管理员名称,默认admin*/
        @JsonProperty("AdminUser")
        private String AdminUser;

        /**实例状态名称*/
        @JsonProperty("StatusName")
        private String StatusName;

        /**实例状态*/
        @JsonProperty("Status")
        private String Status;

        /**VPC网络ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**终端子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**实例内核类型*/
        @JsonProperty("Engine")
        private String Engine;

        /**实例内核版本号*/
        @JsonProperty("EngineVersion")
        private String EngineVersion;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**项目制名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**计费类型*/
        @JsonProperty("BillType")
        private Integer BillType;

        /**项目ID*/
        @JsonProperty("ProductId")
        private String ProductId;

        /**商品类型*/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /**商品类型名称*/
        @JsonProperty("ProductTypeName")
        private String ProductTypeName;

        /**商品性质
1:正式产品 2:试用产品*/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /**创建日期*/
        @JsonProperty("CreateDate")
        private String CreateDate;

        /**机房/地域*/
        @JsonProperty("Region")
        private String Region;

        /**机房/地域名称*/
        @JsonProperty("RegionName")
        private String RegionName;

        /**可用区*/
        @JsonProperty("Az")
        private String Az;

        /**可用区名称*/
        @JsonProperty("AzName")
        private String AzName;

        /**所属用户*/
        @JsonProperty("UserId")
        private String UserId;

        /**安全组ID*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**安全组名称*/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /**安全组描述*/
        @JsonProperty("SecurityGroupDesc")
        private String SecurityGroupDesc;

        /**备份配置信息*/
        @JsonProperty("BackupConfig")
        private BackupConfigDto BackupConfig;

        @Data
        @ToString
        public static class BackupConfigDto {
            /**最大备份记录数*/
            @JsonProperty("maxBackups")
            private Integer MaxBackups;

            /**备份记录最大保留时长，单位：小时；*/
            @JsonProperty("maxReservedHours")
            private Integer MaxReservedHours;

            /**备份时段选择 格式：HH:mm-HH:mm*/
            @JsonProperty("preferredBackupTime")
            private String PreferredBackupTime;

            /**增量备份是否开启*/
            @JsonProperty("increment")
            private String Increment;

        }

        /**tidb服务IP*/
        @JsonProperty("ClientIp")
        private String ClientIp;

        /**tidb服务端口*/
        @JsonProperty("ClientPort")
        private Integer ClientPort;

        /**服务到期时间*/
        @JsonProperty("EndTime")
        private String EndTime;

        /**控制台LB VIP*/
        @JsonProperty("DashboardClientVip")
        private String DashboardClientVip;

        /**控制台LB 端口*/
        @JsonProperty("DashboardClientVport")
        private Integer DashboardClientVport;

        /**监控URL路径*/
        @JsonProperty("TimonitorURL")
        private String TimonitorURL;

    }

}
