package ksyun.client.aicp.deleteinferenceendpoint.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInferenceEndpointResponse
* @Description DeleteInferenceEndpoint 返回体
*/
@Data
@ToString
public class DeleteInferenceEndpointResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("EndpointId")
    private String EndpointId;

}
