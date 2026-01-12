package ksyun.client.aicp.createinferenceendpoint.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInferenceEndpointResponse
* @Description CreateInferenceEndpoint 返回体
*/
@Data
@ToString
public class CreateInferenceEndpointResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("EndpointId")
    private String EndpointId;

}
