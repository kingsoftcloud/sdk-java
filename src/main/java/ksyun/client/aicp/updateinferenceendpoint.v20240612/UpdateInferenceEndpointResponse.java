package ksyun.client.aicp.updateinferenceendpoint.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateInferenceEndpointResponse
* @Description UpdateInferenceEndpoint 返回体
*/
@Data
@ToString
public class UpdateInferenceEndpointResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("EndpointId")
    private String EndpointId;

}
