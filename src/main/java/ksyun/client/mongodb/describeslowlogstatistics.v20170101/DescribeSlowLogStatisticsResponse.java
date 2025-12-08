package ksyun.client.mongodb.describeslowlogstatistics.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSlowLogStatisticsResponse
* @Description DescribeSlowLogStatistics 返回体
*/
@Data
@ToString
public class DescribeSlowLogStatisticsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("op")
        private String Op;

        /***/
        @JsonProperty("nameSpace")
        private String NameSpace;

        /***/
        @JsonProperty("queryCount")
        private Integer QueryCount;

        /***/
        @JsonProperty("millisAvg")
        private Integer MillisAvg;

        /***/
        @JsonProperty("millisMax")
        private Integer MillisMax;

        /***/
        @JsonProperty("docsExaminedAvg")
        private Integer DocsExaminedAvg;

        /***/
        @JsonProperty("keysExaminedAvg")
        private Integer KeysExaminedAvg;

        /***/
        @JsonProperty("keysUpdatesAvg")
        private Integer KeysUpdatesAvg;

        /***/
        @JsonProperty("nreturnedAvg")
        private Integer NreturnedAvg;

        /***/
        @JsonProperty("slowLogDetailVo")
        private String SlowLogDetailVo;

    }

    /***/
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

    /***/
    @JsonProperty("Total")
    private Integer Total;

}
