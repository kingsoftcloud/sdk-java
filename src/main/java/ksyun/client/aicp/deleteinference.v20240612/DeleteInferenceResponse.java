package ksyun.client.aicp.deleteinference.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInferenceResponse
* @Description DeleteInference 返回体
*/
@Data
@ToString
public class DeleteInferenceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**推理服务ID*/
    @JsonProperty("InferenceId")
    private String InferenceId;

}
