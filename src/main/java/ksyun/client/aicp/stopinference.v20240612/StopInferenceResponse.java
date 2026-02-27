package ksyun.client.aicp.stopinference.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopInferenceResponse
* @Description StopInference 返回体
*/
@Data
@ToString
public class StopInferenceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**推理服务ID*/
    @JsonProperty("InferenceId")
    private String InferenceId;

}
