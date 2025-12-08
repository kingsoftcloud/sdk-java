package ksyun.client.bill_union.describebillsummarybyproject.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBillSummaryByProjectResponse
* @Description DescribeBillSummaryByProject 返回体
*/
@Data
@ToString
public class DescribeBillSummaryByProjectResponse extends BaseResponseModel {
    /**当前请求的RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**币种*/
    @JsonProperty("Currency")
    private String Currency;

    /**总金额，即折后价*/
    @JsonProperty("RealTotalCost")
    private String RealTotalCost;

    /**各项目制分布详情*/
    @JsonProperty("SummaryOverview")
    private List<SummaryOverviewDto> SummaryOverview;

    @Data
    @ToString
    public static class SummaryOverviewDto {
        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**项目名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**总金额，即折后价*/
        @JsonProperty("RealTotalCost")
        private String RealTotalCost;

        /**账单月份*/
        @JsonProperty("BillMonth")
        private String BillMonth;

    }

}
