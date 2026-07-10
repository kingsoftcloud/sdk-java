package ksyun.client.aicp.querymcpmetrics.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryMcpMetricsResponse
* @Description QueryMcpMetrics 返回体
*/
@Data
@ToString
public class QueryMcpMetricsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**指标时序数据列表*/
    @JsonProperty("Metrics")
    private List<MetricsDto> Metrics;

    @Data
    @ToString
    public static class MetricsDto {
        /**MCP服务ID*/
        @JsonProperty("McpServerId")
        private String McpServerId;

        /**聚合间隔（秒）*/
        @JsonProperty("Interval")
        private Integer Interval;

        /**开始时间戳*/
        @JsonProperty("StartTime")
        private Long StartTime;

        /**结束时间戳*/
        @JsonProperty("EndTime")
        private Long EndTime;

        /**指标数据列表*/
        @JsonProperty("Data")
        private List<MetricsDataDto> Data;

        @Data
        @ToString
        public static class MetricsDataDto {
            /**指标名称编码（如RequestQps, AvgLatencyMillis等）*/
            @JsonProperty("MetricName")
            private String MetricName;

            /**显示名称（根据语言环境国际化）*/
            @JsonProperty("DisplayName")
            private String DisplayName;

            /**单位（如req/s, ms, bps等）*/
            @JsonProperty("Unit")
            private String Unit;

            /**单维度数据点列表（普通指标使用）*/
            @JsonProperty("Points")
            private List<MetricsDataPointsDto> Points;

            @Data
            @ToString
            public static class MetricsDataPointsDto {
                /**Unix时间戳*/
                @JsonProperty("Timestamp")
                private Long Timestamp;

                /**指标值*/
                @JsonProperty("Value")
                private Double Value;

            }

            /**多维度数据点映射（状态码分布类指标使用，如2xx/3xx/4xx/5xx）*/
            @JsonProperty("StatusPoint")
            private MetricsDataStatusPointDto StatusPoint;

            @Data
            @ToString
            public static class MetricsDataStatusPointDto {
            }

        }

    }

}
