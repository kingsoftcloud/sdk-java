package ksyun.client.cdn.setbackoriginhostconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetBackOriginHostConfigResponse
* @Description SetBackOriginHostConfig 返回体
*/
@Data
@ToString
public class SetBackOriginHostConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetBackOriginHostConfigResponse")
    private String SetBackOriginHostConfigResponse;

}
