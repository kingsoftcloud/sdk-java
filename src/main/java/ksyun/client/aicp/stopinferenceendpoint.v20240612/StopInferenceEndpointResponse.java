package ksyun.client.aicp.stopinferenceendpoint.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopInferenceEndpointResponse
* @Description StopInferenceEndpoint 返回体
*/
@Data
@ToString
public class StopInferenceEndpointResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("EndpointId")
    private String EndpointId;

}
