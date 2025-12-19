package ksyun.client.cdn.setpagecompressconfig.v20250503;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname SetPageCompressConfigResponse
* @Description SetPageCompressConfig 返回体
*/
@Data
@ToString
public class SetPageCompressConfigResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
