package ksyun.client.kce.enablemetrics.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableMetricsResponse
* @Description EnableMetrics 返回体
*/
@Data
@ToString
public class EnableMetricsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
