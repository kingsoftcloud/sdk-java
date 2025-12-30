package ksyun.client.bill_union.queryinstanceconsume.v20221222;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryInstanceConsumeResponse
* @Description QueryInstanceConsume 返回体
*/
@Data
@ToString
public class QueryInstanceConsumeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("status")
    private Integer Status;

    /**当前请求的RequestId*/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("page")
        private Integer Page;

        /***/
        @JsonProperty("size")
        private Integer Size;

        /***/
        @JsonProperty("total")
        private Integer Total;

        /***/
        @JsonProperty("bills")
        private List<DataBillsDto> Bills;

        @Data
        @ToString
        public static class DataBillsDto {
            /**备注名*/
            @JsonProperty("aliasName")
            private String AliasName;

            /**客户邮箱*/
            @JsonProperty("email")
            private String Email;

            /**所属集团*/
            @JsonProperty("membershipGroup")
            private String MembershipGroup;

            /**客户Id*/
            @JsonProperty("userId")
            private Integer UserId;

            /**客户名称*/
            @JsonProperty("userName")
            private String UserName;

            /**合同主体*/
            @JsonProperty("sellerCompanyName")
            private String SellerCompanyName;

            /**账单月*/
            @JsonProperty("billMonth")
            private Integer BillMonth;

            /**账期(执行月)*/
            @JsonProperty("customerBillMonth")
            private Integer CustomerBillMonth;

            /**币种*/
            @JsonProperty("currencyCode")
            private String CurrencyCode;

            /***/
            @JsonProperty("currencyInfo")
            private String CurrencyInfo;

            /***/
            @JsonProperty("exchangeRate")
            private String ExchangeRate;

            /**日期*/
            @JsonProperty("billDay")
            private Integer BillDay;

            /***/
            @JsonProperty("id")
            private String Id;

            /**财务单元*/
            @JsonProperty("financeUnitName")
            private String FinanceUnitName;

            /**账单开始时间*/
            @JsonProperty("billStartTime")
            private String BillStartTime;

            /**账单结束时间*/
            @JsonProperty("billEndTime")
            private String BillEndTime;

            /**实例ID*/
            @JsonProperty("instanceId")
            private String InstanceId;

            /**实例名称*/
            @JsonProperty("instanceName")
            private String InstanceName;

            /**产品类型ID*/
            @JsonProperty("productTypeId")
            private Integer ProductTypeId;

            /**产品类型*/
            @JsonProperty("productTypeName")
            private String ProductTypeName;

            /**产品线ID*/
            @JsonProperty("productGroupId")
            private Integer ProductGroupId;

            /**产品线*/
            @JsonProperty("productGroupName")
            private String ProductGroupName;

            /**计费类别 0:预付费，1:实时付费, 2:后付费*/
            @JsonProperty("payType")
            private Integer PayType;

            /**成交价*/
            @JsonProperty("billRealAmount")
            private String BillRealAmount;

            /**原价*/
            @JsonProperty("originalAmount")
            private String OriginalAmount;

            /***/
            @JsonProperty("regionCode")
            private String RegionCode;

            /**项目ID*/
            @JsonProperty("projectId")
            private Integer ProjectId;

            /**项目名称*/
            @JsonProperty("projectName")
            private String ProjectName;

            /**机房*/
            @JsonProperty("regionName")
            private String RegionName;

            /***/
            @JsonProperty("billType")
            private Integer BillType;

            /**计费方式*/
            @JsonProperty("billTypeName")
            private String BillTypeName;

            /**计费类别*/
            @JsonProperty("payTypeName")
            private String PayTypeName;

            /***/
            @JsonProperty("billDetailType")
            private Integer BillDetailType;

            /**账单类型*/
            @JsonProperty("billDetailTypeName")
            private String BillDetailTypeName;

            /**计费时长*/
            @JsonProperty("duration")
            private String Duration;

            /***/
            @JsonProperty("durationNumber")
            private Integer DurationNumber;

            /***/
            @JsonProperty("ruleRemark")
            private String RuleRemark;

            /**可用区*/
            @JsonProperty("availabilityZone")
            private String AvailabilityZone;

            /**折扣*/
            @JsonProperty("discount")
            private String Discount;

            /**现金应付金额*/
            @JsonProperty("cash")
            private String Cash;

            /**赠送金支付*/
            @JsonProperty("reward")
            private String Reward;

            /**券抵扣*/
            @JsonProperty("vouchers")
            private String Vouchers;

            /**云票支付*/
            @JsonProperty("cloudTicketDenomination")
            private String CloudTicketDenomination;

            /***/
            @JsonProperty("cloudTicketCost")
            private String CloudTicketCost;

            /**服务开始时间*/
            @JsonProperty("serviceBegionTime")
            private String ServiceBegionTime;

            /**配置/用量*/
            @JsonProperty("configInfo")
            private List<String> ConfigInfo;

            /**价格影响因子*/
            @JsonProperty("priceFactorInfo")
            private List<String> PriceFactorInfo;

            /**附属信息*/
            @JsonProperty("extraInfo")
            private List<String> ExtraInfo;

            /**资源包抵扣配置*/
            @JsonProperty("resourceDeductionInfo")
            private List<String> ResourceDeductionInfo;

            /**标签信息*/
            @JsonProperty("tagInfo")
            private List<String> TagInfo;

        }

    }

    /***/
    @JsonProperty("ok")
    private Boolean Ok;

}
