package ksyun.client.aicp.getinferencepods.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetInferencePodsResponse
* @Description GetInferencePods 返回体
*/
@Data
@ToString
public class GetInferencePodsResponse extends BaseResponseModel {

    /**模型在线服务Pod列表*/
    @JsonProperty("Pods")
    private List<PodsDto> Pods;

    @Data
    @ToString
    public static class PodsDto {
        /**Pod名称*/
        @JsonProperty("PodName")
        private String PodName;

        /**推理服务ID*/
        @JsonProperty("InferenceId")
        private String InferenceId;

        /**命名空间*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**Pod状态*/
        @JsonProperty("State")
        private String State;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
