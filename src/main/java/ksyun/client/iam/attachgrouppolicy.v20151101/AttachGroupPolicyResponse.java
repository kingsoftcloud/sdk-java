package ksyun.client.iam.attachgrouppolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AttachGroupPolicyResponse
* @Description AttachGroupPolicy 返回体
*/
@Data
@ToString
public class AttachGroupPolicyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
