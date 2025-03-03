package ksyun.client.mongodb.describeslowloglinechart.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeSlowLogLineChartResponse
 * @Description DescribeSlowLogLineChart 返回体
 */
@Data
@ToString
public class DescribeSlowLogLineChartResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
