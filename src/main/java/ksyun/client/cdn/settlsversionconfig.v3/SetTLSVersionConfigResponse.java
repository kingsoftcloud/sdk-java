package ksyun.client.cdn.settlsversionconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetTLSVersionConfigResponse
* @Description SetTLSVersionConfig 返回体
*/
@Data
@ToString
public class SetTLSVersionConfigResponse extends BaseResponseModel {

    /**TLSVersionConfigResponse*/
    @JsonProperty("TLSVersionConfigResponse")
    private String TLSVersionConfigResponse;

}
