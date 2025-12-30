package ksyun.client.ket.stoploop.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopLoopResponse
* @Description StopLoop 返回体
*/
@Data
@ToString
public class StopLoopResponse extends BaseResponseModel {

    /**错误码，0：成功；非0：失败*/
    @JsonProperty("ErrNum")
    private Integer ErrNum;

    /**描述本次请求错误的原因*/
    @JsonProperty("ErrMsg")
    private String ErrMsg;

}
