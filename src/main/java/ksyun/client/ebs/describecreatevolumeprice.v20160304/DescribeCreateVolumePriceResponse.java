package ksyun.client.ebs.describecreatevolumeprice.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCreateVolumePriceResponse
* @Description DescribeCreateVolumePrice 返回体
*/
@Data
@ToString
public class DescribeCreateVolumePriceResponse extends BaseResponseModel {
    /**唯一请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("VolumePrice")
    private VolumePriceDto VolumePrice;

    @Data
    @ToString
    public static class VolumePriceDto {
        /**计价单位*/
        @JsonProperty("CurrencyUnit")
        private String CurrencyUnit;

        /**实付金额*/
        @JsonProperty("TradePrice")
        private Double TradePrice;

        /**原价*/
        @JsonProperty("OriginalPrice")
        private Double OriginalPrice;

        /**折扣金额*/
        @JsonProperty("DiscountPrice")
        private Double DiscountPrice;

    }

}
