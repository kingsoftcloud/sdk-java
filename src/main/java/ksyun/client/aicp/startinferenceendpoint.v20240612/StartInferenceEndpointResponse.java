package ksyun.client.aicp.startinferenceendpoint.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartInferenceEndpointResponse
* @Description StartInferenceEndpoint 返回体
*/
@Data
@ToString
public class StartInferenceEndpointResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("EndpointId")
    private String EndpointId;

}
