package ksyun.client.monitor.getmetricstatistics.v20100525;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname GetMetricStatisticsResponse
* @Description GetMetricStatistics 返回体
*/
@Data
@ToString
public class GetMetricStatisticsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
