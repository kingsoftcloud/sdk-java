package ksyun.client.aicp.disableapikeystatus.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisableApikeyStatusResponse
* @Description DisableApikeyStatus 返回体
*/
@Data
@ToString
public class DisableApikeyStatusResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
