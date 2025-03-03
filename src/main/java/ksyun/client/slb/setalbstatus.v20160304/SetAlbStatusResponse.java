package ksyun.client.slb.setalbstatus.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname SetAlbStatusResponse
 * @Description SetAlbStatus 返回体
 */
@Data
@ToString
public class SetAlbStatusResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
