package ksyun.client.iam.updatepolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdatePolicyResponse
* @Description UpdatePolicy 返回体
*/
@Data
@ToString
public class UpdatePolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("UpdatePolicyResult")
    private UpdatePolicyResultDto UpdatePolicyResult;

    @Data
    @ToString
    public static class UpdatePolicyResultDto {
        /***/
        @JsonProperty("Policy")
        private Boolean Policy;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
