package ksyun.client.kci.execcontainercommand.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ExecContainerCommandResponse
* @Description ExecContainerCommand 返回体
*/
@Data
@ToString
public class ExecContainerCommandResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("WebSocketUri")
    private String WebSocketUri;

}
