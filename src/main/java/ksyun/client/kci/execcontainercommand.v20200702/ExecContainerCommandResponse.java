package ksyun.client.kci.execcontainercommand.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ExecContainerCommandResponse
* @Description ExecContainerCommand 返回体
*/
@Data
@ToString
public class ExecContainerCommandResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
