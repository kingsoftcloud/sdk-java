package ksyun.client.iam.attachuserpolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AttachUserPolicyResponse
* @Description AttachUserPolicy 返回体
*/
@Data
@ToString
public class AttachUserPolicyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
