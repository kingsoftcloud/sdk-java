package ksyun.client.aicp.getinferencepods.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetInferencePodsRequest
* @Description 请求参数
*/
@Data
public class GetInferencePodsRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

    /**Pod状态（Pending，Running，Failed，Succeeded，Stopped，Unknown）*/
    @KsYunField(name="State")
    private String State;

}
