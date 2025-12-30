package ksyun.client.kce.modifynodepoolscaleuppolicy.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNodePoolScaleUpPolicyResponse
* @Description ModifyNodePoolScaleUpPolicy 返回体
*/
@Data
@ToString
public class ModifyNodePoolScaleUpPolicyResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
