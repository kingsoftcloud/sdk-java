package ksyun.client.aicp.querymemorycollectionmetrics.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryMemoryCollectionMetricsResponse
* @Description QueryMemoryCollectionMetrics 返回体
*/
@Data
@ToString
public class QueryMemoryCollectionMetricsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("MemoryCollectionId")
    private String MemoryCollectionId;

    /***/
    @JsonProperty("MetricsByAction")
    private List<MetricsByActionDto> MetricsByAction;

    @Data
    @ToString
    public static class MetricsByActionDto {
        /***/
        @JsonProperty("QueryMemory")
        private MetricsByActionQueryMemoryDto QueryMemory;

        @Data
        @ToString
        public static class MetricsByActionQueryMemoryDto {
            /**调用次数*/
            @JsonProperty("RequestCount")
            private Integer RequestCount;

            /**平均时间，单位ms，精度0.01ms*/
            @JsonProperty("AvgDuration")
            private Double AvgDuration;

            /**错误率*/
            @JsonProperty("ErrorRate")
            private Double ErrorRate;

        }

        /***/
        @JsonProperty("CreateMemory")
        private MetricsByActionCreateMemoryDto CreateMemory;

        @Data
        @ToString
        public static class MetricsByActionCreateMemoryDto {
            /**调用次数*/
            @JsonProperty("RequestCount")
            private Integer RequestCount;

            /**	
平均时间，单位ms，精度0.01ms*/
            @JsonProperty("AvgDuration")
            private Integer AvgDuration;

            /**	
错误率*/
            @JsonProperty("ErrorRate")
            private Double ErrorRate;

        }

    }

}
