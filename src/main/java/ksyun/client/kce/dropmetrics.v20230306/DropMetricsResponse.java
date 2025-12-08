package ksyun.client.kce.dropmetrics.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DropMetricsResponse
* @Description DropMetrics 返回体
*/
@Data
@ToString
public class DropMetricsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
