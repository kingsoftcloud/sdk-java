package ksyun.client.aicp.startinference.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartInferenceResponse
* @Description StartInference 返回体
*/
@Data
@ToString
public class StartInferenceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**推理服务ID*/
    @JsonProperty("InferenceId")
    private String InferenceId;

}
