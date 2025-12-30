package ksyun.client.krds.slowloglinechart.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SlowLogLineChartResponse
* @Description SlowLogLineChart 返回体
*/
@Data
@ToString
public class SlowLogLineChartResponse extends BaseResponseModel {

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("reportTime")
        private Integer ReportTime;

        /***/
        @JsonProperty("reportCount")
        private Integer ReportCount;

        /***/
        @JsonProperty("percentage")
        private String Percentage;

    }

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("QuerySum")
    private Integer QuerySum;

}
