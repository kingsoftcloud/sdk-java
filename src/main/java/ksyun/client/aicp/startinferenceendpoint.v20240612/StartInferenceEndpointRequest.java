package ksyun.client.aicp.startinferenceendpoint.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartInferenceEndpointRequest
* @Description 请求参数
*/
@Data
public class StartInferenceEndpointRequest{
    /**推理接入点名称*/
    @KsYunField(name="EndpointName")
    private String EndpointName;

    /**项目制Id*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**默认绑定的模型名称*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**接入点限流配置*/
    @KsYunField(name="RateLimit ")
    private RateLimitDto RateLimit;

    @Data
    @ToString
    public static class RateLimitDto {
        /***/
        @KsYunField(name="RPM")
        private Integer RPM;

        /***/
        @KsYunField(name="TPM")
        private Integer TPM;

        /**最大并发数*/
        @KsYunField(name="Concurrency")
        private Integer Concurrency;

        /***/
        @KsYunField(name="IPM")
        private Integer IPM;

    }

    /***/
    @KsYunField(name="EndpointId")
    private String EndpointId;

}
