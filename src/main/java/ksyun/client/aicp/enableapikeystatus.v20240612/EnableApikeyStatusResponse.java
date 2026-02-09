package ksyun.client.aicp.enableapikeystatus.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableApikeyStatusResponse
* @Description EnableApikeyStatus 返回体
*/
@Data
@ToString
public class EnableApikeyStatusResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
