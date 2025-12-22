package ksyun.client.cdn.sethttp2optionconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname SetHttp2OptionConfigResponse
* @Description SetHttp2OptionConfig 返回体
*/
@Data
@ToString
public class SetHttp2OptionConfigResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
