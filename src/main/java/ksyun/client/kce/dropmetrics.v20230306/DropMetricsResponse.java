package ksyun.client.kce.dropmetrics.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DropMetricsResponse
 * @Description DropMetrics 返回体
 */
@Data
@ToString
public class DropMetricsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
