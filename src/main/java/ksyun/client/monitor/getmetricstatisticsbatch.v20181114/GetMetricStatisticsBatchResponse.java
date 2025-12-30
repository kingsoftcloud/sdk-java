package ksyun.client.monitor.getmetricstatisticsbatch.v20181114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetMetricStatisticsBatchResponse
* @Description GetMetricStatisticsBatch 返回体
*/
@Data
@ToString
public class GetMetricStatisticsBatchResponse extends BaseResponseModel {

    /***/
    @JsonProperty("getMetricStatisticsBatchResults")
    private GetMetricStatisticsBatchResultsDto GetMetricStatisticsBatchResults;

    @Data
    @ToString
    public static class GetMetricStatisticsBatchResultsDto {
        /**监控数据列表*/
        @JsonProperty("datapoints")
        private GetMetricStatisticsBatchResultsDatapointsDto Datapoints;

        @Data
        @ToString
        public static class GetMetricStatisticsBatchResultsDatapointsDto {
            /**监控数据。*/
            @JsonProperty("member")
            private List<GetMetricStatisticsBatchResultsDatapointsMemberDto> Member;

            @Data
            @ToString
            public static class GetMetricStatisticsBatchResultsDatapointsMemberDto {
                /**该监控数据点生成的时间点。*/
                @JsonProperty("timestamp")
                private String Timestamp;

                /**该监控数据点生成的时间戳。*/
                @JsonProperty("unixTimestamp")
                private Integer UnixTimestamp;

                /**监控数据点的值（平均值）。*/
                @JsonProperty("average")
                private String Average;

                /**监控数据点的值（最大值）。*/
                @JsonProperty("max")
                private String Max;

                /**监控数据点的值（最小值）。*/
                @JsonProperty("min")
                private String Min;

            }

        }

        /**监控项名称。*/
        @JsonProperty("label")
        private String Label;

        /**实例ID。*/
        @JsonProperty("Instance")
        private String Instance;

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

    /**错误信息列表。*/
    @JsonProperty("errorMessage")
    private List<String> ErrorMessage;

}
