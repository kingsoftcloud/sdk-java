package ksyun.client.epc.modifyremotemanagement.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ModifyRemoteManagementResponse
* @Description ModifyRemoteManagement 返回体
*/
@Data
@ToString
public class ModifyRemoteManagementResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
