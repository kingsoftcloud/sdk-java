package ksyun.client.aicp.enableendpointquotalimit.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableEndpointQuotaLimitResponse
* @Description EnableEndpointQuotaLimit 返回体
*/
@Data
@ToString
public class EnableEndpointQuotaLimitResponse extends BaseResponseModel {

    /***/
    @JsonProperty("EndpointId")
    private String EndpointId;

}
