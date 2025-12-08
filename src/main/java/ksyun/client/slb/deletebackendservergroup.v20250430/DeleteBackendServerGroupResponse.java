package ksyun.client.slb.deletebackendservergroup.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DeleteBackendServerGroupResponse
* @Description DeleteBackendServerGroup 返回体
*/
@Data
@ToString
public class DeleteBackendServerGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
