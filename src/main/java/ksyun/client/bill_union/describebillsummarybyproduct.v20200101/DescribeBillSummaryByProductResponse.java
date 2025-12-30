package ksyun.client.bill_union.describebillsummarybyproduct.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBillSummaryByProductResponse
* @Description DescribeBillSummaryByProduct 返回体
*/
@Data
@ToString
public class DescribeBillSummaryByProductResponse extends BaseResponseModel {

    /**当前请求的RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**币种*/
    @JsonProperty("Currency")
    private String Currency;

    /**总金额，即折后价*/
    @JsonProperty("RealTotalCost")
    private String RealTotalCost;

    /**各产品线分布详情*/
    @JsonProperty("SummaryOverview")
    private List<SummaryOverviewDto> SummaryOverview;

    @Data
    @ToString
    public static class SummaryOverviewDto {
        /**产品线code*/
        @JsonProperty("ProductCode")
        private String ProductCode;

        /**产品线name*/
        @JsonProperty("ProductName")
        private String ProductName;

        /**总金额，即 折后价*/
        @JsonProperty("RealTotalCost")
        private String RealTotalCost;

        /**账单月份*/
        @JsonProperty("BillMonth")
        private String BillMonth;

    }

}
