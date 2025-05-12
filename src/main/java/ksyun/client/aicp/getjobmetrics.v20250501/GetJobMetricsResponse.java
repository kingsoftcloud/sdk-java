package ksyun.client.aicp.getjobmetrics.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetJobMetricsResponse
 * @Description GetJobMetrics 返回体
 */
@Data
@ToString
public class GetJobMetricsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
