package ksyun.client.aicp.disableoverfreelimit.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisableOverFreeLimitResponse
* @Description DisableOverFreeLimit 返回体
*/
@Data
@ToString
public class DisableOverFreeLimitResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Success")
    private Boolean Success;

}
