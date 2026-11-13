package ksyun.client.aicp.describeapikeys.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeApikeysResponse
* @Description DescribeApikeys 返回体
*/
@Data
@ToString
public class DescribeApikeysResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("KeyId")
        private String KeyId;

        /***/
        @JsonProperty("KeyValue")
        private String KeyValue;

        /**关联的模型列表*/
        @JsonProperty("AssociatedModelIds")
        private List<String> AssociatedModelIds;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Description")
        private String Description;

        /**状态：1启用，2禁用*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间毫秒时间戳*/
        @JsonProperty("CreateTimestamp")
        private Long CreateTimestamp;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**项目名*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**创建用户ID*/
        @JsonProperty("CreateUserId")
        private String CreateUserId;

        /**创建用户名称*/
        @JsonProperty("CreateUserName")
        private String CreateUserName;

        /***/
        @JsonProperty("AssociatedModels")
        private List<DataAssociatedModelsDto> AssociatedModels;

        @Data
        @ToString
        public static class DataAssociatedModelsDto {
            /***/
            @JsonProperty("ModelId")
            private String ModelId;

            /***/
            @JsonProperty("ModelName")
            private String ModelName;

        }

        /***/
        @JsonProperty("AllAssociatedModel")
        private Boolean AllAssociatedModel;

        /**IP白名单，返回空数组时表示未开启IP白名单*/
        @JsonProperty("AllowedIps")
        private List<String> AllowedIps;

        /**接入点是否全选*/
        @JsonProperty("AllAssociatedEndpoint")
        private Boolean AllAssociatedEndpoint;

        /**接入点列表*/
        @JsonProperty("AllowEndpoints")
        private List<String> AllowEndpoints;

        /**项目下所有资源全选*/
        @JsonProperty("AllAssociatedProjectResources")
        private Boolean AllAssociatedProjectResources;

        /**高价池模型名称列表*/
        @JsonProperty("HighPriceModels")
        private List<String> HighPriceModels;

        /**低价池模型列表*/
        @JsonProperty("LowPriceModels")
        private List<String> LowPriceModels;

        /**配额额度上限（Token 总量）*/
        @JsonProperty("QuotaLimit")
        private String QuotaLimit;

        /**周期类型：monthly/weekly/daily/custom*/
        @JsonProperty("QuotaType")
        private String QuotaType;

        /**自定义周期天数（1~90，仅 custom 类型有效）*/
        @JsonProperty("QuotaPeriodValue")
        private String QuotaPeriodValue;

        /**生效时间（yyyy-MM-dd HH:mm:ss，UTC 时区）*/
        @JsonProperty("QuotaStartTime")
        private String QuotaStartTime;

        /**配额状态：1=启用，0=禁用*/
        @JsonProperty("QuotaStatus")
        private String QuotaStatus;

        /***/
        @JsonProperty("UsedQuota")
        private String UsedQuota;

        /**闲时模型*/
        @JsonProperty("OffpeakModels")
        private List<String> OffpeakModels;

        /***/
        @JsonProperty("CostQuotas")
        private List<DataCostQuotasDto> CostQuotas;

        @Data
        @ToString
        public static class DataCostQuotasDto {
            /**周期类型：cost_daily/cost_weekly/cost_monthly/cost_custom*/
            @JsonProperty("QuotaType")
            private String QuotaType;

            /**配额上限（CNY 金额）*/
            @JsonProperty("QuotaLimit")
            private String QuotaLimit;

            /**自定义周期天数（仅 cost_custom 有效）*/
            @JsonProperty("PeriodValue")
            private String PeriodValue;

            /**生效时间（yyyy-MM-dd HH:mm:ss）*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**状态：1=启用，0=禁用*/
            @JsonProperty("Status")
            private Integer Status;

            /**是否开启使用率告警*/
            @JsonProperty("AlertEnabled")
            private Boolean AlertEnabled;

            /**告警阈值百分比（0-100）*/
            @JsonProperty("AlertThreshold")
            private Integer AlertThreshold;

            /**使用百分比（0-100）*/
            @JsonProperty("UsagePercent")
            private Integer UsagePercent;

        }

    }

    /**分页页码，从1开始*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**分页每页大小，最大100*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
