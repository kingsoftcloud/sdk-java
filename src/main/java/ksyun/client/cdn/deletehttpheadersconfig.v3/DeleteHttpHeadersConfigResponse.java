package ksyun.client.cdn.deletehttpheadersconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteHttpHeadersConfigResponse
* @Description DeleteHttpHeadersConfig 返回体
*/
@Data
@ToString
public class DeleteHttpHeadersConfigResponse extends BaseResponseModel {

    /**DeleteHttpHeadersConfig*/
    @JsonProperty("DeleteHttpHeadersConfig")
    private String DeleteHttpHeadersConfig;

}
