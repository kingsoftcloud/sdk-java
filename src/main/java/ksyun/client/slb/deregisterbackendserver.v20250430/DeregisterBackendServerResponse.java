package ksyun.client.slb.deregisterbackendserver.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeregisterBackendServerResponse
* @Description DeregisterBackendServer 返回体
*/
@Data
@ToString
public class DeregisterBackendServerResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回状态*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
