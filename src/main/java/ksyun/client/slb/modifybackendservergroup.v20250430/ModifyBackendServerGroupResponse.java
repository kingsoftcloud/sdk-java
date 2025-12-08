package ksyun.client.slb.modifybackendservergroup.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ModifyBackendServerGroupResponse
* @Description ModifyBackendServerGroup 返回体
*/
@Data
@ToString
public class ModifyBackendServerGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
