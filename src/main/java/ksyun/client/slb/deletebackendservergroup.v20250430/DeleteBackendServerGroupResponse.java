package ksyun.client.slb.deletebackendservergroup.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteBackendServerGroupResponse
* @Description DeleteBackendServerGroup 返回体
*/
@Data
@ToString
public class DeleteBackendServerGroupResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回状态*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
