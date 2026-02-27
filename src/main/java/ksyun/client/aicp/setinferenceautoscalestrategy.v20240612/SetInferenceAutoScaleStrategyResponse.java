package ksyun.client.aicp.setinferenceautoscalestrategy.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetInferenceAutoScaleStrategyResponse
* @Description SetInferenceAutoScaleStrategy 返回体
*/
@Data
@ToString
public class SetInferenceAutoScaleStrategyResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**推理服务Id*/
    @JsonProperty("InferenceId")
    private String InferenceId;

}
