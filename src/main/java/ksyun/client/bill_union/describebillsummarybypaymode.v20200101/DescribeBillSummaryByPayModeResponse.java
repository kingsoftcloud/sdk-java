package ksyun.client.bill_union.describebillsummarybypaymode.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBillSummaryByPayModeResponse
* @Description DescribeBillSummaryByPayMode 返回体
*/
@Data
@ToString
public class DescribeBillSummaryByPayModeResponse extends BaseResponseModel {

    /**当前请求的RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**币种*/
    @JsonProperty("Currency")
    private String Currency;

    /**总金额，即折后价*/
    @JsonProperty("RealTotalCost")
    private String RealTotalCost;

    /**各计费类别分布详情，包括 预付费（即 购买时付款）、按量付费（按 小时或天 扣款）、后付费（按月扣款）*/
    @JsonProperty("SummaryOverview")
    private List<SummaryOverviewDto> SummaryOverview;

    @Data
    @ToString
    public static class SummaryOverviewDto {
        /**计费类别，包括 预付费、按量付费、后付费*/
        @JsonProperty("PayMode")
        private String PayMode;

        /**总金额，即 折后价*/
        @JsonProperty("RealTotalCost")
        private String RealTotalCost;

        /**账单月份*/
        @JsonProperty("BillMonth")
        private String BillMonth;

    }

}
