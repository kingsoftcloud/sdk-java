package ksyun.client.aicp.modifyinference.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInferenceResponse
* @Description ModifyInference 返回体
*/
@Data
@ToString
public class ModifyInferenceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**推理服务详情*/
    @JsonProperty("InferenceId")
    private String InferenceId;

}
