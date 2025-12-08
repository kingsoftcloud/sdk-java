package ksyun.client.tidb.listinstance.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInstanceResponse
* @Description ListInstance 返回体
*/
@Data
@ToString
public class ListInstanceResponse extends BaseResponseModel {
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
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

    /***/
    @JsonProperty("Total")
    private Integer Total;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**管理员名称,默认admin*/
        @JsonProperty("AdminUser")
        private String AdminUser;

        /**实例状态-zh*/
        @JsonProperty("StatusName")
        private String StatusName;

        /**实例状态-en*/
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

        /**商品Id*/
        @JsonProperty("ProductId")
        private String ProductId;

        /**商品类型*/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /**商品类型名称*/
        @JsonProperty("ProductTypeName")
        private String ProductTypeName;

        /**商品作用(创建/购买，更配)*/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /**创建时间*/
        @JsonProperty("CreateDate")
        private String CreateDate;

        /**更新时间*/
        @JsonProperty("UpdateDate")
        private String UpdateDate;

        /**地域*/
        @JsonProperty("Region")
        private String Region;

        /**地域名称*/
        @JsonProperty("RegionName")
        private String RegionName;

        /**可用区*/
        @JsonProperty("Az")
        private String Az;

        /**可用区名称*/
        @JsonProperty("AzName")
        private String AzName;

        /**用户ID*/
        @JsonProperty("UserId")
        private String UserId;

        /**安全组ID*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**tidb服务IP*/
        @JsonProperty("ClientIp")
        private String ClientIp;

        /**tidb服务端口*/
        @JsonProperty("ClientPort")
        private Integer ClientPort;

        /**开启模块列表*/
        @JsonProperty("EnableModules")
        private String EnableModules;

        /**模块配置信息列表*/
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

        /***/
        @JsonProperty("EndTime")
        private String EndTime;

    }

}
