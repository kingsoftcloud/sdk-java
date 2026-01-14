package ksyun.client.aicp.startinferenceendpoint.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartInferenceEndpointRequest
* @Description 请求参数
*/
@Data
public class StartInferenceEndpointRequest{
    /***/
    @KsYunField(name="EndpointId")
    private String EndpointId;

}
