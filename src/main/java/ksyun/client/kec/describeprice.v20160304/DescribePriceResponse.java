package ksyun.client.kec.describeprice.v20160304;

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
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("PriceInfo")
    private PriceInfoDto PriceInfo;

    @Data
    @ToString
    public static class PriceInfoDto {
        /***/
        @JsonProperty("InstancePrice")
        private InstancePriceDto InstancePrice;

        @Data
        @ToString
        public static class InstancePriceDto {
            /**优惠金额；例如原价100元，成交价80元，该参数即为20。示例值：20*/
            @JsonProperty("DiscountPrice")
            private Double DiscountPrice;

            /**原价/列表价。示例值：100*/
            @JsonProperty("OriginalPrice")
            private Double OriginalPrice;

            /**成交价；例如原价100元，该套餐打8折，该参数即为80。示例值：80*/
            @JsonProperty("TradePrice")
            private Double TradePrice;

            /**价格单位*/
            @JsonProperty("PriceUnit")
            private String PriceUnit;

            /**用户折扣；合同约定的优惠折扣。示例值：8*/
            @JsonProperty("UserDiscount")
            private Double UserDiscount;

        }

        /**ebs盘价格*/
        @JsonProperty("EBSPrice")
        private EBSPriceDto EBSPrice;

        @Data
        @ToString
        public static class EBSPriceDto {
            /***/
            @JsonProperty("DiscountPrice")
            private Double DiscountPrice;

            /***/
            @JsonProperty("OriginalPrice")
            private Double OriginalPrice;

            /***/
            @JsonProperty("TradePrice")
            private Double TradePrice;

            /***/
            @JsonProperty("PriceUnit")
            private String PriceUnit;

            /***/
            @JsonProperty("UserDiscount")
            private Double UserDiscount;

        }

    }

}
