package ksyun.client.bill_union.describesplititembilldetails.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSplitItemBillDetailsResponse
* @Description DescribeSplitItemBillDetails 返回体
*/
@Data
@ToString
public class DescribeSplitItemBillDetailsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Status")
    private Integer Status;

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
        @JsonProperty("Page")
        private Integer Page;

        /***/
        @JsonProperty("Size")
        private Integer Size;

        /***/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("bills")
        private List<DataDtoBillsDto> Bills;

        @Data
        @ToString
        public static class DataDtoBillsDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /***/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /***/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /***/
            @JsonProperty("ProductGroupName")
            private String ProductGroupName;

            /***/
            @JsonProperty("ProductTypeName")
            private String ProductTypeName;

            /***/
            @JsonProperty("BillItemName")
            private String BillItemName;

            /***/
            @JsonProperty("BillStartTime")
            private String BillStartTime;

            /***/
            @JsonProperty("BillEndTime")
            private String BillEndTime;

            /***/
            @JsonProperty("ServiceBeginTime")
            private String ServiceBeginTime;

            /***/
            @JsonProperty("RegionName")
            private String RegionName;

            /***/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /***/
            @JsonProperty("PayTypeName")
            private String PayTypeName;

            /***/
            @JsonProperty("BillTypeName")
            private String BillTypeName;

            /***/
            @JsonProperty("BillDetailTypeName")
            private String BillDetailTypeName;

            /***/
            @JsonProperty("MeasureValue")
            private String MeasureValue;

            /***/
            @JsonProperty("MeasureValueUnit")
            private String MeasureValueUnit;

            /***/
            @JsonProperty("SplitItemName")
            private String SplitItemName;

            /***/
            @JsonProperty("SplitRatio")
            private String SplitRatio;

            /***/
            @JsonProperty("Price")
            private String Price;

            /***/
            @JsonProperty("RealPrice")
            private String RealPrice;

            /***/
            @JsonProperty("Cash")
            private String Cash;

            /***/
            @JsonProperty("Reward")
            private String Reward;

            /***/
            @JsonProperty("CloudTicketDenomination")
            private String CloudTicketDenomination;

            /***/
            @JsonProperty("ResourceDeductValue")
            private String ResourceDeductValue;

            /***/
            @JsonProperty("Duration")
            private String Duration;

            /***/
            @JsonProperty("RuleRemark")
            private String RuleRemark;

            /***/
            @JsonProperty("FinanceUnitName")
            private String FinanceUnitName;

            /***/
            @JsonProperty("PriceFactorInfo")
            private List<String> PriceFactorInfo;

            /***/
            @JsonProperty("ExtraInfo")
            private List<String> ExtraInfo;

            /***/
            @JsonProperty("TagInfo")
            private List<String> TagInfo;

            /***/
            @JsonProperty("UserId")
            private Integer UserId;

            /***/
            @JsonProperty("UserName")
            private String UserName;

            /***/
            @JsonProperty("BillMonth")
            private Integer BillMonth;

            /***/
            @JsonProperty("CustomerBillMonth")
            private Integer CustomerBillMonth;

            /***/
            @JsonProperty("CurrencyCode")
            private String CurrencyCode;

        }

    }

    /***/
    @JsonProperty("Error")
    private String Error;

}
