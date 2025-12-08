package ksyun.client.monitor.getmetricstatistics.v20100525;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetMetricStatisticsResponse
* @Description GetMetricStatistics 返回体
*/
@Data
@ToString
public class GetMetricStatisticsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("getMetricStatisticsResult")
    private GetMetricStatisticsResultDto GetMetricStatisticsResult;

    @Data
    @ToString
    public static class GetMetricStatisticsResultDto {
        /**按照指定的统计方法获取的监控数据*/
        @JsonProperty("datapoints")
        private DatapointsDto Datapoints;

        @Data
        @ToString
        public static class DatapointsDto {
            /***/
            @JsonProperty("member")
            private List<MemberDto> Member;

            @Data
            @ToString
            public static class MemberDto {
            }

        }

        /**监控指标*/
        @JsonProperty("label")
        private String Label;

    }

    /***/
    @JsonProperty("responseMetadata")
    private ResponseMetadataDto ResponseMetadata;

    @Data
    @ToString
    public static class ResponseMetadataDto {
        /**请求ID*/
        @JsonProperty("requestId")
        private String RequestId;

    }

}
