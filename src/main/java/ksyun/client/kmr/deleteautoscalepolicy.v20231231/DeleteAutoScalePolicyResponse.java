package ksyun.client.kmr.deleteautoscalepolicy.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DeleteAutoScalePolicyResponse
 * @Description DeleteAutoScalePolicy 返回体
 */
@Data
@ToString
public class DeleteAutoScalePolicyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
