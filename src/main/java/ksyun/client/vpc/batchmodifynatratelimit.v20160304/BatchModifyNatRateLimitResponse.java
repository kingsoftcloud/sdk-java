package ksyun.client.vpc.batchmodifynatratelimit.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchModifyNatRateLimitResponse
* @Description BatchModifyNatRateLimit 返回体
*/
@Data
@ToString
public class BatchModifyNatRateLimitResponse extends BaseResponseModel {
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
