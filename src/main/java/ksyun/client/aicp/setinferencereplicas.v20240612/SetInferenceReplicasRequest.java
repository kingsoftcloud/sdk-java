package ksyun.client.aicp.setinferencereplicas.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetInferenceReplicasRequest
* @Description 请求参数
*/
@Data
public class SetInferenceReplicasRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

    /**副本数*/
    @KsYunField(name="Replicas")
    private Integer Replicas;

}
