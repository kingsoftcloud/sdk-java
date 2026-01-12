package ksyun.client.aicp.disableendpointratelimit.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisableEndpointRateLimitResponse
* @Description DisableEndpointRateLimit 返回体
*/
@Data
@ToString
public class DisableEndpointRateLimitResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("EndpointId")
    private String EndpointId;

}
