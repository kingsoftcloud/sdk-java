package ksyun.client.vpc.batchcreatenatratelimit.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchCreateNatRateLimitResponse
* @Description BatchCreateNatRateLimit 返回体
*/
@Data
@ToString
public class BatchCreateNatRateLimitResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("NatRateLimit")
    private NatRateLimitDto NatRateLimit;

    @Data
    @ToString
    public static class NatRateLimitDto {
        /***/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /***/
        @JsonProperty("BandwidthLimit")
        private Integer BandwidthLimit;

        /***/
        @JsonProperty("NatRateLimitId")
        private String NatRateLimitId;

        /***/
        @JsonProperty("InBandwidthLimit")
        private Integer InBandwidthLimit;

    }

}
