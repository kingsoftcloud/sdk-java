package ksyun.client.slb.setenableaccesslog.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname SetEnableAccessLogResponse
* @Description SetEnableAccessLog 返回体
*/
@Data
@ToString
public class SetEnableAccessLogResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
