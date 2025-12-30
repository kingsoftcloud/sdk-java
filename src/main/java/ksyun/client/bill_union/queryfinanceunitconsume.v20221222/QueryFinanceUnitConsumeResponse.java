package ksyun.client.bill_union.queryfinanceunitconsume.v20221222;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryFinanceUnitConsumeResponse
* @Description QueryFinanceUnitConsume 返回体
*/
@Data
@ToString
public class QueryFinanceUnitConsumeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("status")
    private Integer Status;

    /**当前请求的RequestId

*/
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
            /**备注名

*/
            @JsonProperty("aliasName")
            private String AliasName;

            /**客户邮箱

*/
            @JsonProperty("email")
            private String Email;

            /**所属集团*/
            @JsonProperty("membershipGroup")
            private String MembershipGroup;

            /**客户Id

*/
            @JsonProperty("userId")
            private Integer UserId;

            /**客户名称

*/
            @JsonProperty("userName")
            private String UserName;

            /**合同主体

*/
            @JsonProperty("sellerCompanyName")
            private String SellerCompanyName;

            /**账单月

*/
            @JsonProperty("billMonth")
            private String BillMonth;

            /**账期(执行月)

*/
            @JsonProperty("customerBillMonth")
            private Integer CustomerBillMonth;

            /**币种

*/
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

            /**财务单元名称*/
            @JsonProperty("financeUnitName")
            private String FinanceUnitName;

            /**预付费消费*/
            @JsonProperty("prePayCost")
            private String PrePayCost;

            /**预付费退款金额*/
            @JsonProperty("prePayRefundAmount")
            private String PrePayRefundAmount;

            /**预付费账单*/
            @JsonProperty("prePayBillsAmount")
            private String PrePayBillsAmount;

            /**按量付费消费*/
            @JsonProperty("realtimeCost")
            private String RealtimeCost;

            /**按量付费调整金额*/
            @JsonProperty("realtimeAdjustAmount")
            private String RealtimeAdjustAmount;

            /**按量付费金额*/
            @JsonProperty("realtimeBillsAmount")
            private String RealtimeBillsAmount;

            /**后付费消费*/
            @JsonProperty("postPayCost")
            private String PostPayCost;

            /**后付费调整金额*/
            @JsonProperty("postPayAdjustAmount")
            private String PostPayAdjustAmount;

            /**后付费金额*/
            @JsonProperty("postPayBillsAmount")
            private String PostPayBillsAmount;

            /**账单合计*/
            @JsonProperty("billFinalAmount")
            private String BillFinalAmount;

            /**现金应付金额

*/
            @JsonProperty("cash")
            private String Cash;

            /**赠送金支付

*/
            @JsonProperty("reward")
            private String Reward;

            /**券抵扣

*/
            @JsonProperty("vouchers")
            private String Vouchers;

            /**云票支付

*/
            @JsonProperty("cloudTicketDenomination")
            private String CloudTicketDenomination;

        }

    }

    /***/
    @JsonProperty("ok")
    private Boolean Ok;

}
