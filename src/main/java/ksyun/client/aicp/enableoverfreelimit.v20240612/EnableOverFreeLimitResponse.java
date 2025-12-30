package ksyun.client.aicp.enableoverfreelimit.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableOverFreeLimitResponse
* @Description EnableOverFreeLimit 返回体
*/
@Data
@ToString
public class EnableOverFreeLimitResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Success")
    private Boolean Success;

}
