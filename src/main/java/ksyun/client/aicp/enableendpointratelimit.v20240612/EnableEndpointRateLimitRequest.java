package ksyun.client.aicp.enableendpointratelimit.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname EnableEndpointRateLimitRequest
* @Description 请求参数
*/
@Data
public class EnableEndpointRateLimitRequest{
    /**接入点id*/
    @KsYunField(name="EndpointId")
    private String EndpointId;

    /***/
    @KsYunField(name="RateLimit")
    private RateLimitDto RateLimit;

    @Data
    @ToString
    public static class RateLimitDto {
        /**TPM*/
        @KsYunField(name="TPM")
        private Integer TPM;

        /**RPM*/
        @KsYunField(name="RPM")
        private Integer RPM;

    }

}
