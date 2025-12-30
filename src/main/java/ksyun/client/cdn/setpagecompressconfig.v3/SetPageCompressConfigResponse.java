package ksyun.client.cdn.setpagecompressconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetPageCompressConfigResponse
* @Description SetPageCompressConfig 返回体
*/
@Data
@ToString
public class SetPageCompressConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetPageCompressConfigResponse")
    private String SetPageCompressConfigResponse;

}
