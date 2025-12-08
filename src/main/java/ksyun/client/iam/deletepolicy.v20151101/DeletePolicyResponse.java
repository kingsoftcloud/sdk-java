package ksyun.client.iam.deletepolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeletePolicyResponse
* @Description DeletePolicy 返回体
*/
@Data
@ToString
public class DeletePolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
