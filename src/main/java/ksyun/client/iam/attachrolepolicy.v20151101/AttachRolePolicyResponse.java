package ksyun.client.iam.attachrolepolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AttachRolePolicyResponse
* @Description AttachRolePolicy 返回体
*/
@Data
@ToString
public class AttachRolePolicyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
