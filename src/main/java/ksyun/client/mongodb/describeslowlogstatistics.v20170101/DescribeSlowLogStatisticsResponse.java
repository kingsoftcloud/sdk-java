package ksyun.client.mongodb.describeslowlogstatistics.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeSlowLogStatisticsResponse
* @Description DescribeSlowLogStatistics 返回体
*/
@Data
@ToString
public class DescribeSlowLogStatisticsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
