package ksyun.client.aicp.startinference.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartInferenceRequest
* @Description 请求参数
*/
@Data
public class StartInferenceRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

}
