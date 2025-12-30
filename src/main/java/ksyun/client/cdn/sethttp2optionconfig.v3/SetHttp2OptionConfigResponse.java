package ksyun.client.cdn.sethttp2optionconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetHttp2OptionConfigResponse
* @Description SetHttp2OptionConfig 返回体
*/
@Data
@ToString
public class SetHttp2OptionConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetHttp2OptionConfigResponse")
    private String SetHttp2OptionConfigResponse;

}
