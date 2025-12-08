package ksyun.client.kec.describespotpricehistory.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSpotPriceHistoryResponse
* @Description DescribeSpotPriceHistory 返回体
*/
@Data
@ToString
public class DescribeSpotPriceHistoryResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceType")
    private String InstanceType;

    /***/
    @JsonProperty("AvailabilityZone")
    private String AvailabilityZone;

    /***/
    @JsonProperty("SpotPrices")
    private List<SpotPricesDto> SpotPrices;

    @Data
    @ToString
    public static class SpotPricesDto {
        /***/
        @JsonProperty("SpotPrice")
        private Double SpotPrice;

        /***/
        @JsonProperty("OriginPrice")
        private Double OriginPrice;

        /***/
        @JsonProperty("Timestamp")
        private String Timestamp;

    }

}
