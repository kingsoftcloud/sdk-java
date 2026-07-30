package ksyun.client.aicp.describememorytokenmonitor.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMemoryTokenMonitorResponse
* @Description DescribeMemoryTokenMonitor 返回体
*/
@Data
@ToString
public class DescribeMemoryTokenMonitorResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Embedding模型输入token数*/
    @JsonProperty("EmbeddingInputTokens")
    private Long EmbeddingInputTokens;

    /**Rerank模型输入token数*/
    @JsonProperty("RerankInputTokens")
    private Long RerankInputTokens;

    /**Chat模型输出token数*/
    @JsonProperty("ChatOutputTokens")
    private Long ChatOutputTokens;

    /**Chat模型缓存命中token数*/
    @JsonProperty("ChatHitCacheTokens")
    private Long ChatHitCacheTokens;

    /**Chat模型缓存未命中token数*/
    @JsonProperty("ChatMissCacheTokens")
    private Long ChatMissCacheTokens;

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

    /**Chat输出token趋势*/
    @JsonProperty("ChatOutputCountTrend")
    private List<ChatOutputCountTrendDto> ChatOutputCountTrend;

    @Data
    @ToString
    public static class ChatOutputCountTrendDto {
        /**时间戳*/
        @JsonProperty("Timestamp")
        private Long Timestamp;

        /**数值*/
        @JsonProperty("Value")
        private Long Value;

    }

    /**Chat缓存命中token趋势*/
    @JsonProperty("ChatHitCacheCountTrend")
    private List<ChatHitCacheCountTrendDto> ChatHitCacheCountTrend;

    @Data
    @ToString
    public static class ChatHitCacheCountTrendDto {
        /**时间戳*/
        @JsonProperty("Timestamp")
        private Long Timestamp;

        /**数值*/
        @JsonProperty("Value")
        private Long Value;

    }

    /**Chat缓存未命中token趋势*/
    @JsonProperty("ChatMissCacheCountTrend")
    private List<ChatMissCacheCountTrendDto> ChatMissCacheCountTrend;

    @Data
    @ToString
    public static class ChatMissCacheCountTrendDto {
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

    /**Tmp限流配置*/
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
