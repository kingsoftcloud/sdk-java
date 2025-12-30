package ksyun.client.mongodb.describeslowloglinechart.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSlowLogLineChartResponse
* @Description DescribeSlowLogLineChart 返回体
*/
@Data
@ToString
public class DescribeSlowLogLineChartResponse extends BaseResponseModel {

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
        @JsonProperty("execTime")
        private Integer ExecTime;

        /***/
        @JsonProperty("count")
        private Integer Count;

    }

}
