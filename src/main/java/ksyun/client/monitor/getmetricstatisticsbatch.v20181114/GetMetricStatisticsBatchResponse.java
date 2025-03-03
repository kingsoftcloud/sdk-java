package ksyun.client.monitor.getmetricstatisticsbatch.v20181114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetMetricStatisticsBatchResponse
 * @Description GetMetricStatisticsBatch 返回体
 */
@Data
@ToString
public class GetMetricStatisticsBatchResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
