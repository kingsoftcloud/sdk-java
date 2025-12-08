package ksyun.client.iam.detachrolepolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DetachRolePolicyResponse
* @Description DetachRolePolicy 返回体
*/
@Data
@ToString
public class DetachRolePolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
