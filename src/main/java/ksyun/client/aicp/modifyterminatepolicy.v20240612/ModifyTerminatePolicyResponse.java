package ksyun.client.aicp.modifyterminatepolicy.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyTerminatePolicyResponse
* @Description ModifyTerminatePolicy 返回体
*/
@Data
@ToString
public class ModifyTerminatePolicyResponse extends BaseResponseModel {

    /**关停策略ID*/
    @JsonProperty("TerminatePolicyId")
    private String TerminatePolicyId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
