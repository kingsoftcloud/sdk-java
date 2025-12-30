package ksyun.client.cdn.sethttpheadersconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetHttpHeadersConfigResponse
* @Description SetHttpHeadersConfig 返回体
*/
@Data
@ToString
public class SetHttpHeadersConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetHttpHeadersConfig")
    private String SetHttpHeadersConfig;

}
