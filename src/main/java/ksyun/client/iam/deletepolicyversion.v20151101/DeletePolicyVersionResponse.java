package ksyun.client.iam.deletepolicyversion.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeletePolicyVersionResponse
* @Description DeletePolicyVersion 返回体
*/
@Data
@ToString
public class DeletePolicyVersionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
