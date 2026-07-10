package ksyun.client.aicp.describeknowledgetokenmonitor.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKnowledgeTokenMonitorResponse
* @Description DescribeKnowledgeTokenMonitor 返回体
*/
@Data
@ToString
public class DescribeKnowledgeTokenMonitorResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Embedding模型输入token数*/
    @JsonProperty("EmbeddingInputTokens")
    private Long EmbeddingInputTokens;

    /**Rerank模型输入token数*/
    @JsonProperty("RerankInputTokens")
    private Long RerankInputTokens;

    /**Embedding输入token趋势*/
    @JsonProperty("EmbeddingInputTokenTrend")
    private List<EmbeddingInputTokenTrendDto> EmbeddingInputTokenTrend;

    @Data
    @ToString
    public static class EmbeddingInputTokenTrendDto {
        /**时间戳*/
        @JsonProperty("Timestamp")
        private Long Timestamp;

        /**数值*/
        @JsonProperty("Value")
        private Long Value;

    }

    /**Rerank输入token趋势*/
    @JsonProperty("RerankInputTokenTrend")
    private List<RerankInputTokenTrendDto> RerankInputTokenTrend;

    @Data
    @ToString
    public static class RerankInputTokenTrendDto {
        /**时间戳*/
        @JsonProperty("Timestamp")
        private Long Timestamp;

        /**数值*/
        @JsonProperty("Value")
        private Long Value;

    }

    /**请求次数趋势*/
    @JsonProperty("RequestCountTrend")
    private List<RequestCountTrendDto> RequestCountTrend;

    @Data
    @ToString
    public static class RequestCountTrendDto {
        /**时间戳*/
        @JsonProperty("Timestamp")
        private Long Timestamp;

        /**数值*/
        @JsonProperty("Value")
        private Long Value;

    }

    /**RPM限流配置*/
    @JsonProperty("RpmRateLimits")
    private List<RpmRateLimitsDto> RpmRateLimits;

    @Data
    @ToString
    public static class RpmRateLimitsDto {
        /**模型名称*/
        @JsonProperty("Model")
        private String Model;

        /**限流值*/
        @JsonProperty("Value")
        private Double Value;

    }

    /**TPM限流配置*/
    @JsonProperty("TpmRateLimits")
    private List<TpmRateLimitsDto> TpmRateLimits;

    @Data
    @ToString
    public static class TpmRateLimitsDto {
        /**模型名称*/
        @JsonProperty("Model")
        private String Model;

        /**限流值*/
        @JsonProperty("Value")
        private Double Value;

    }

}
