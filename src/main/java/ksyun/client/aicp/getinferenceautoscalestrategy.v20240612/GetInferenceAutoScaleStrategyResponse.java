package ksyun.client.aicp.getinferenceautoscalestrategy.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetInferenceAutoScaleStrategyResponse
* @Description GetInferenceAutoScaleStrategy 返回体
*/
@Data
@ToString
public class GetInferenceAutoScaleStrategyResponse extends BaseResponseModel {

    /**自动扩缩容策略*/
    @JsonProperty("AutoScaleStrategy")
    private AutoScaleStrategyDto AutoScaleStrategy;

    @Data
    @ToString
    public static class AutoScaleStrategyDto {
        /**扩缩容模式(目前仅支持 metric 指标扩缩容)*/
        @JsonProperty("Mode")
        private String Mode;

        /**指标扩缩容策略*/
        @JsonProperty("MetricStrategy")
        private AutoScaleStrategyMetricStrategyDto MetricStrategy;

        @Data
        @ToString
        public static class AutoScaleStrategyMetricStrategyDto {
            /**CPU利用率指标阈值*/
            @JsonProperty("CpuUtilization")
            private Integer CpuUtilization;

            /**内存利用率指标阈值*/
            @JsonProperty("MemUtilization")
            private Integer MemUtilization;

            /**最小副本数*/
            @JsonProperty("MinReplicas")
            private Integer MinReplicas;

            /**最大副本数*/
            @JsonProperty("MaxReplicas")
            private Integer MaxReplicas;

        }

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
