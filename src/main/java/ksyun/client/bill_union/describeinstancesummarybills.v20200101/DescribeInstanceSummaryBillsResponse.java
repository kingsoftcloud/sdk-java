package ksyun.client.bill_union.describeinstancesummarybills.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceSummaryBillsResponse
* @Description DescribeInstanceSummaryBills 返回体
*/
@Data
@ToString
public class DescribeInstanceSummaryBillsResponse extends BaseResponseModel {
    /**当前请求的RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**登录邮箱*/
    @JsonProperty("Email")
    private String Email;

    /**页码*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**每页数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总记录数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**客户UID*/
    @JsonProperty("CustomerId")
    private Integer CustomerId;

    /**实例账单汇总详情*/
    @JsonProperty("SummaryOverview")
    private List<SummaryOverviewDto> SummaryOverview;

    @Data
    @ToString
    public static class SummaryOverviewDto {
        /**账单编号*/
        @JsonProperty("BillsNo")
        private String BillsNo;

        /**账期(执行月)*/
        @JsonProperty("CustomerBillMonth")
        private String CustomerBillMonth;

        /**账单月*/
        @JsonProperty("BillMonth")
        private String BillMonth;

        /**产品线*/
        @JsonProperty("ProductName")
        private String ProductName;

        /**产品类型*/
        @JsonProperty("ProductSubTyeName")
        private String ProductSubTyeName;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**币种*/
        @JsonProperty("Currency")
        private String Currency;

        /**账单开始时间*/
        @JsonProperty("DetailBillStartTime")
        private String DetailBillStartTime;

        /**账单结束时间*/
        @JsonProperty("DetailBillEndTime")
        private String DetailBillEndTime;

        /**服务开始时间*/
        @JsonProperty("ServiceBillStartTime")
        private String ServiceBillStartTime;

        /**计费类别，包含“预付费”、“按量付费”、“后付费”*/
        @JsonProperty("PayMode")
        private String PayMode;

        /**计费方式名称*/
        @JsonProperty("BillTypeName")
        private String BillTypeName;

        /**机房*/
        @JsonProperty("RegionName")
        private String RegionName;

        /**可用区*/
        @JsonProperty("ZoneName")
        private String ZoneName;

        /**项目名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**计费时长，单位为秒*/
        @JsonProperty("Duration")
        private String Duration;

        /**说明，预付费，退订时，备注提示；后付费，账单调整时，会有说明；按量付费场景，特殊标识，如关机不收费场景时，针对不计费时长段的明细，标识“已排除不计费金额”。*/
        @JsonProperty("Remark")
        private String Remark;

        /**原价*/
        @JsonProperty("Cost")
        private String Cost;

        /**成交价*/
        @JsonProperty("RealCost")
        private String RealCost;

        /**配置用量信息*/
        @JsonProperty("ConfigSet")
        private List<SummaryOverviewDtoConfigSetDto> ConfigSet;

        @Data
        @ToString
        public static class SummaryOverviewDtoConfigSetDto {
            /**表示数据的key*/
            @JsonProperty("Key")
            private String Key;

            /**表示数据的code*/
            @JsonProperty("Code")
            private String Code;

            /**表示数据的值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**价格影响因子。无值不返回*/
        @JsonProperty("ProviderSet")
        private List<SummaryOverviewDtoProviderSetDto> ProviderSet;

        @Data
        @ToString
        public static class SummaryOverviewDtoProviderSetDto {
            /**表示数据的key*/
            @JsonProperty("Key")
            private String Key;

            /**表示数据的code*/
            @JsonProperty("Code")
            private String Code;

            /**表示数据的值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**资源包抵扣配置。包含计费用量抵扣用量相关信息。无值不返回*/
        @JsonProperty("ConsumeResources")
        private List<String> ConsumeResources;

        /**附属信息。 无值不返回*/
        @JsonProperty("ExtraSet")
        private List<SummaryOverviewDtoExtraSetDto> ExtraSet;

        @Data
        @ToString
        public static class SummaryOverviewDtoExtraSetDto {
            /**表示数据的key*/
            @JsonProperty("Key")
            private String Key;

            /**表示数据的code*/
            @JsonProperty("Code")
            private String Code;

            /**表示数据的值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**tag信息。 无值不返回*/
        @JsonProperty("TagSet")
        private List<SummaryOverviewDtoTagSetDto> TagSet;

        @Data
        @ToString
        public static class SummaryOverviewDtoTagSetDto {
            /**表示数据的key*/
            @JsonProperty("Key")
            private String Key;

            /**表示数据的值*/
            @JsonProperty("Value")
            private String Value;

        }

    }

}
