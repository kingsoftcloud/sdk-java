package ksyun.client.kmr.querymetrics.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryMetricsResponse
* @Description QueryMetrics 返回体
*/
@Data
@ToString
public class QueryMetricsResponse extends BaseResponseModel {

    /**查询状态
• success：查询成功
• error：查询失败
*/
    @JsonProperty("status")
    private String Status;

    /**是否为部分结果
• true：表示返回的为部分结果，可能还有更多的数据需要获取
• false：表示返回的为完整结果*/
    @JsonProperty("isPartial")
    private Boolean IsPartial;

    /**查询结果的数据部分，异常时直接返回字符串*/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**结果类型
• vector：返回的是瞬时值，即一个时间点的指标值
• matrix：返回的是时间序列数据，包含多个时间点的指标值*/
        @JsonProperty("resultType")
        private String ResultType;

        /**实际的查询结果，为一个数组，每个元素表示一个时间序列的数据*/
        @JsonProperty("result")
        private List<DataResultDto> Result;

        @Data
        @ToString
        public static class DataResultDto {
            /**指标的元数据，包含指标名称和标签*/
            @JsonProperty("metric")
            private DataResultMetricDto Metric;

            @Data
            @ToString
            public static class DataResultMetricDto {
                /***/
                @JsonProperty("__name__")
                private String __name__;

                /***/
                @JsonProperty("JobRunId")
                private String JobRunId;

                /***/
                @JsonProperty("component")
                private String Component;

                /***/
                @JsonProperty("WorkspaceId")
                private String WorkspaceId;

            }

            /**指标值
为一个二维数组，每个元素包含一个时间戳和对应的指标值
*/
            @JsonProperty("values")
            private List<String> Values;

        }

    }

    /**查询的统计信息*/
    @JsonProperty("stats")
    private StatsDto Stats;

    @Data
    @ToString
    public static class StatsDto {
        /**获取的序列数量*/
        @JsonProperty("seriesFetched")
        private String SeriesFetched;

        /**查询的执行时间，单位为毫秒*/
        @JsonProperty("executionTimeMsec")
        private Integer ExecutionTimeMsec;

    }

}
