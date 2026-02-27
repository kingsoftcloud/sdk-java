package ksyun.client.aicp.getinferencedetail.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetInferenceDetailRequest
* @Description 请求参数
*/
@Data
public class GetInferenceDetailRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

}
