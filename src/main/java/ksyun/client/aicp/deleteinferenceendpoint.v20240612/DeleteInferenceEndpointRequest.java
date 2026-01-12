package ksyun.client.aicp.deleteinferenceendpoint.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteInferenceEndpointRequest
* @Description 请求参数
*/
@Data
public class DeleteInferenceEndpointRequest{
    /***/
    @KsYunField(name="EndpointId")
    private String EndpointId;

}
