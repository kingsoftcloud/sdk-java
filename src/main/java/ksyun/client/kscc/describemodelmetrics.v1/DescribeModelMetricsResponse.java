package ksyun.client.kscc.describemodelmetrics.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModelMetricsResponse
* @Description DescribeModelMetrics 返回体
*/
@Data
@ToString
public class DescribeModelMetricsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型监控指标结果*/
    @JsonProperty("DescribeModelMetricsResult")
    private DescribeModelMetricsResultDto DescribeModelMetricsResult;

    @Data
    @ToString
    public static class DescribeModelMetricsResultDto {
        /**实际返回的统计粒度*/
        @JsonProperty("TimeInterval")
        private String TimeInterval;

        /**模型指标列表*/
        @JsonProperty("Items")
        private List<DescribeModelMetricsResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeModelMetricsResultItemsDto {
            /**模型名称*/
            @JsonProperty("ModelName")
            private String ModelName;

            /**统计时间点*/
            @JsonProperty("TimeStr")
            private String TimeStr;

            /**请求次数*/
            @JsonProperty("RequestCounter")
            private Integer RequestCounter;

            /**总Token数*/
            @JsonProperty("TotalTokens")
            private Integer TotalTokens;

            /**输入Token数*/
            @JsonProperty("PromptTokens")
            private Integer PromptTokens;

            /**输出Token数*/
            @JsonProperty("CompletionTokens")
            private Integer CompletionTokens;

            /**每分钟Token数*/
            @JsonProperty("Tpm")
            private Double Tpm;

            /**每分钟请求数*/
            @JsonProperty("Rpm")
            private Double Rpm;

        }

    }

}
