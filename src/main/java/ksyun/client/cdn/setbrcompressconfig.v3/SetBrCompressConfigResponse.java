package ksyun.client.cdn.setbrcompressconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetBrCompressConfigResponse
* @Description SetBrCompressConfig 返回体
*/
@Data
@ToString
public class SetBrCompressConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetBrCompressConfigResponse")
    private String SetBrCompressConfigResponse;

}
