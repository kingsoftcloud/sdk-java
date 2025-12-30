package ksyun.client.epc.describeprice.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePriceResponse
* @Description DescribePrice 返回体
*/
@Data
@ToString
public class DescribePriceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**价格信息*/
    @JsonProperty("PriceInfo")
    private PriceInfoDto PriceInfo;

    @Data
    @ToString
    public static class PriceInfoDto {
        /**价格信息*/
        @JsonProperty("PriceSet")
        private List<PriceInfoPriceSetDto> PriceSet;

        @Data
        @ToString
        public static class PriceInfoPriceSetDto {
            /**货币类型*/
            @JsonProperty("Currency")
            private String Currency;

            /**折扣金额*/
            @JsonProperty("DiscountPrice")
            private Integer DiscountPrice;

            /**原价*/
            @JsonProperty("OriginalPrice")
            private Integer OriginalPrice;

            /**成交价*/
            @JsonProperty("TradePrice")
            private Integer TradePrice;

        }

    }

}
