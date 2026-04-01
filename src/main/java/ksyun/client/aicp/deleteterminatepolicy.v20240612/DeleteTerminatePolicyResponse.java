package ksyun.client.aicp.deleteterminatepolicy.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteTerminatePolicyResponse
* @Description DeleteTerminatePolicy 返回体
*/
@Data
@ToString
public class DeleteTerminatePolicyResponse extends BaseResponseModel {

    /**关停策略ID*/
    @JsonProperty("TerminatePolicyId")
    private String TerminatePolicyId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
