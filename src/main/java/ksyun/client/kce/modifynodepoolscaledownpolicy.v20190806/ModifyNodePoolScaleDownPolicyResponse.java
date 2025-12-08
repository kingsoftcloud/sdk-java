package ksyun.client.kce.modifynodepoolscaledownpolicy.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNodePoolScaleDownPolicyResponse
* @Description ModifyNodePoolScaleDownPolicy 返回体
*/
@Data
@ToString
public class ModifyNodePoolScaleDownPolicyResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
