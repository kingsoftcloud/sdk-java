package ksyun.client.aicp.createinferenceendpoint.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateInferenceEndpointRequest
* @Description 请求参数
*/
@Data
public class CreateInferenceEndpointRequest{
    /**推理接入点名称,1-64个字符，允许字母中文，数字，特殊字符-_、()*/
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
        /**不大于模型的限流值*/
        @KsYunField(name="RPM")
        private Integer RPM;

        /**不大于模型的限流值*/
        @KsYunField(name="TPM")
        private Integer TPM;

    }

    /**ModelId 模型名称*/
    @KsYunField(name="ModelId")
    private String ModelId;

}
