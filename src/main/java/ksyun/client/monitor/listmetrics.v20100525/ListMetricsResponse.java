package ksyun.client.monitor.listmetrics.v20100525;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListMetricsResponse
* @Description ListMetrics 返回体
*/
@Data
@ToString
public class ListMetricsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("listMetricsResult")
    private ListMetricsResultDto ListMetricsResult;

    @Data
    @ToString
    public static class ListMetricsResultDto {
        /**监控项列表。*/
        @JsonProperty("metrics")
        private ListMetricsResultDtoMetricsDto Metrics;

        @Data
        @ToString
        public static class ListMetricsResultDtoMetricsDto {
            /***/
            @JsonProperty("member")
            private List<ListMetricsResultDtoMetricsDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListMetricsResultDtoMetricsDtoMemberDto {
                /**实例ID。*/
                @JsonProperty("instanceId")
                private String InstanceId;

                /**监控项。*/
                @JsonProperty("metricName")
                private String MetricName;

                /**监控项说明。*/
                @JsonProperty("metricDesc")
                private String MetricDesc;

                /**产品命名空间，表示一类云产品。*/
                @JsonProperty("namespace")
                private String Namespace;

                /**指标采集间隔，单位：秒。*/
                @JsonProperty("interval")
                private String Interval;

                /**指标类型，取值：
- float：浮点
- int：整型*/
                @JsonProperty("type")
                private String Type;

                /**指标单位。*/
                @JsonProperty("unit")
                private String Unit;

            }

        }

    }

    /***/
    @JsonProperty("responseMetadata")
    private ResponseMetadataDto ResponseMetadata;

    @Data
    @ToString
    public static class ResponseMetadataDto {
        /**请求ID。*/
        @JsonProperty("requestId")
        private String RequestId;

    }

}
