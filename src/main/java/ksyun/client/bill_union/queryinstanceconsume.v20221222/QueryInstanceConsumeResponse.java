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
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
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
            /***/
            @JsonProperty("aliasName")
            private String AliasName;

            /***/
            @JsonProperty("email")
            private String Email;

            /***/
            @JsonProperty("membershipGroup")
            private String MembershipGroup;

            /***/
            @JsonProperty("userId")
            private Integer UserId;

            /***/
            @JsonProperty("userName")
            private String UserName;

            /***/
            @JsonProperty("sellerCompanyName")
            private String SellerCompanyName;

            /***/
            @JsonProperty("billMonth")
            private Integer BillMonth;

            /***/
            @JsonProperty("customerBillMonth")
            private Integer CustomerBillMonth;

            /***/
            @JsonProperty("currencyCode")
            private String CurrencyCode;

            /***/
            @JsonProperty("currencyInfo")
            private String CurrencyInfo;

            /***/
            @JsonProperty("exchangeRate")
            private Double ExchangeRate;

            /***/
            @JsonProperty("billDay")
            private Integer BillDay;

            /***/
            @JsonProperty("loginName")
            private String LoginName;

            /***/
            @JsonProperty("id")
            private String Id;

            /***/
            @JsonProperty("financeUnitName")
            private String FinanceUnitName;

            /***/
            @JsonProperty("billStartTime")
            private String BillStartTime;

            /***/
            @JsonProperty("billEndTime")
            private String BillEndTime;

            /***/
            @JsonProperty("instanceId")
            private String InstanceId;

            /***/
            @JsonProperty("instanceName")
            private String InstanceName;

            /***/
            @JsonProperty("productTypeId")
            private Integer ProductTypeId;

            /***/
            @JsonProperty("productTypeName")
            private String ProductTypeName;

            /***/
            @JsonProperty("productGroupId")
            private Integer ProductGroupId;

            /***/
            @JsonProperty("productGroupName")
            private String ProductGroupName;

            /***/
            @JsonProperty("payType")
            private Integer PayType;

            /***/
            @JsonProperty("billRealAmount")
            private Double BillRealAmount;

            /***/
            @JsonProperty("originalAmount")
            private String OriginalAmount;

            /***/
            @JsonProperty("regionCode")
            private String RegionCode;

            /***/
            @JsonProperty("projectId")
            private Integer ProjectId;

            /***/
            @JsonProperty("projectName")
            private String ProjectName;

            /***/
            @JsonProperty("regionName")
            private String RegionName;

            /***/
            @JsonProperty("billType")
            private Integer BillType;

            /***/
            @JsonProperty("billTypeName")
            private String BillTypeName;

            /***/
            @JsonProperty("payTypeName")
            private String PayTypeName;

            /***/
            @JsonProperty("billDetailType")
            private Integer BillDetailType;

            /***/
            @JsonProperty("billDetailTypeName")
            private String BillDetailTypeName;

            /***/
            @JsonProperty("duration")
            private String Duration;

            /***/
            @JsonProperty("durationNumber")
            private Integer DurationNumber;

            /***/
            @JsonProperty("ruleRemark")
            private String RuleRemark;

            /***/
            @JsonProperty("availabilityZone")
            private String AvailabilityZone;

            /***/
            @JsonProperty("discount")
            private String Discount;

            /***/
            @JsonProperty("cash")
            private Double Cash;

            /***/
            @JsonProperty("reward")
            private Double Reward;

            /***/
            @JsonProperty("vouchers")
            private Double Vouchers;

            /***/
            @JsonProperty("cloudTicketDenomination")
            private Double CloudTicketDenomination;

            /***/
            @JsonProperty("cloudTicketCost")
            private Double CloudTicketCost;

            /***/
            @JsonProperty("serviceBegionTime")
            private String ServiceBegionTime;

            /***/
            @JsonProperty("configInfo")
            private List<String> ConfigInfo;

            /***/
            @JsonProperty("priceFactorInfo")
            private List<String> PriceFactorInfo;

            /***/
            @JsonProperty("extraInfo")
            private List<String> ExtraInfo;

            /***/
            @JsonProperty("resourceDeductionInfo")
            private List<String> ResourceDeductionInfo;

            /***/
            @JsonProperty("tagInfo")
            private List<String> TagInfo;

        }

    }

}
