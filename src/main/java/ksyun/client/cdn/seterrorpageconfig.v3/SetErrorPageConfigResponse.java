package ksyun.client.cdn.seterrorpageconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetErrorPageConfigResponse
* @Description SetErrorPageConfig 返回体
*/
@Data
@ToString
public class SetErrorPageConfigResponse extends BaseResponseModel {

    /**SetErrorPageConfig*/
    @JsonProperty("SetErrorPageConfig")
    private String SetErrorPageConfig;

}
