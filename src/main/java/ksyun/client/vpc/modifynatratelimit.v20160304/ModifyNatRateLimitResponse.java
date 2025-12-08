package ksyun.client.vpc.modifynatratelimit.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNatRateLimitResponse
* @Description ModifyNatRateLimit 返回体
*/
@Data
@ToString
public class ModifyNatRateLimitResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**网关流控限速的信息*/
    @JsonProperty("NatRateLimit")
    private NatRateLimitDto NatRateLimit;

    @Data
    @ToString
    public static class NatRateLimitDto {
        /**网卡ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /**出网带宽限速*/
        @JsonProperty("BandwidthLimit")
        private Integer BandwidthLimit;

        /**入网带宽限速*/
        @JsonProperty("InBandwidthLimit")
        private Integer InBandwidthLimit;

        /**网关限速规则ID*/
        @JsonProperty("NatRateLimitId")
        private String NatRateLimitId;

    }

}
