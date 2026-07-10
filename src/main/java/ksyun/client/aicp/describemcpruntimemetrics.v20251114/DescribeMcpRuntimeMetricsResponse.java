package ksyun.client.aicp.describemcpruntimemetrics.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMcpRuntimeMetricsResponse
* @Description DescribeMcpRuntimeMetrics 返回体
*/
@Data
@ToString
public class DescribeMcpRuntimeMetricsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**MCP服务ID*/
    @JsonProperty("McpServerId")
    private String McpServerId;

    /**开始时间（Unix时间戳，秒）*/
    @JsonProperty("StartTime")
    private Long StartTime;

    /**结束时间（Unix时间戳，秒）*/
    @JsonProperty("EndTime")
    private Long EndTime;

    /**聚合周期（秒）*/
    @JsonProperty("Interval")
    private Integer Interval;

    /**实例数量*/
    @JsonProperty("InstanceCount")
    private Integer InstanceCount;

    /**指标序列列表*/
    @JsonProperty("Series")
    private List<SeriesDto> Series;

    @Data
    @ToString
    public static class SeriesDto {
        /**指标名称（如CpuUsagePercent, MemoryUsagePercent）*/
        @JsonProperty("MetricName")
        private String MetricName;

        /**显示名称*/
        @JsonProperty("DisplayName")
        private String DisplayName;

        /**单位*/
        @JsonProperty("Unit")
        private String Unit;

        /**数据点列表*/
        @JsonProperty("Points")
        private List<SeriesPointsDto> Points;

        @Data
        @ToString
        public static class SeriesPointsDto {
            /**时间戳（Unix时间戳，秒）*/
            @JsonProperty("Timestamp")
            private Long Timestamp;

            /**数值*/
            @JsonProperty("Value")
            private Double Value;

        }

    }

}
