package ksyun.client.aicp.stopinferenceendpoint.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StopInferenceEndpointRequest
* @Description 请求参数
*/
@Data
public class StopInferenceEndpointRequest{
    /**推理接入点名称*/
    @KsYunField(name="EndpointId")
    private String EndpointId;

}
