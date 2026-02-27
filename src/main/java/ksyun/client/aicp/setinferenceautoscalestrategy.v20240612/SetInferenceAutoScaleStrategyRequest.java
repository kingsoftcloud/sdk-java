package ksyun.client.aicp.setinferenceautoscalestrategy.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetInferenceAutoScaleStrategyRequest
* @Description 请求参数
*/
@Data
public class SetInferenceAutoScaleStrategyRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

    /**是否启用自动扩缩容*/
    @KsYunField(name="AutoScaleEnable")
    private Boolean AutoScaleEnable;

    /**自动扩缩容策略*/
    @KsYunField(name="AutoScaleStrategy")
    private AutoScaleStrategyDto AutoScaleStrategy;

    @Data
    @ToString
    public static class AutoScaleStrategyDto {
        /**扩缩容模式(目前仅支持 metric 指标扩缩容)*/
        @KsYunField(name="Mode")
        private String Mode;

        /**指标扩缩容策略*/
        @KsYunField(name="MetricStrategy")
        private AutoScaleStrategyMetricStrategyDto MetricStrategy;

        @Data
        @ToString
        public static class AutoScaleStrategyMetricStrategyDto {
            /**CPU利用率指标阈值*/
            @KsYunField(name="CpuUtilization")
            private Integer CpuUtilization;

            /**内存利用率指标阈值*/
            @KsYunField(name="MemUtilization")
            private Integer MemUtilization;

            /**最小副本数*/
            @KsYunField(name="MinReplicas")
            private Integer MinReplicas;

            /**最大副本数*/
            @KsYunField(name="MaxReplicas")
            private Integer MaxReplicas;

        }

    }

}
