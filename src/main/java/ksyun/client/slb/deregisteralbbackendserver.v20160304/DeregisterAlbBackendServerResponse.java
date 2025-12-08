package ksyun.client.slb.deregisteralbbackendserver.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeregisterAlbBackendServerResponse
* @Description DeregisterAlbBackendServer 返回体
*/
@Data
@ToString
public class DeregisterAlbBackendServerResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回状态*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
