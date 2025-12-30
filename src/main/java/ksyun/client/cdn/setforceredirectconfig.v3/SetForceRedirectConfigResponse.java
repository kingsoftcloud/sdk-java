package ksyun.client.cdn.setforceredirectconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetForceRedirectConfigResponse
* @Description SetForceRedirectConfig 返回体
*/
@Data
@ToString
public class SetForceRedirectConfigResponse extends BaseResponseModel {

    /**SetForceRedirectConfig*/
    @JsonProperty("SetForceRedirectConfig")
    private String SetForceRedirectConfig;

}
