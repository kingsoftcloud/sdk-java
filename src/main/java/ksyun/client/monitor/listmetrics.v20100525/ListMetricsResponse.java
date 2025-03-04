package ksyun.client.monitor.listmetrics.v20100525;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListMetricsResponse
 * @Description ListMetrics 返回体
 */
@Data
@ToString
public class ListMetricsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
