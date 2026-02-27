package ksyun.client.aicp.setinferencereplicas.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetInferenceReplicasResponse
* @Description SetInferenceReplicas 返回体
*/
@Data
@ToString
public class SetInferenceReplicasResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**推理服务详情*/
    @JsonProperty("InferenceId")
    private String InferenceId;

}
