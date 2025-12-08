package ksyun.client.kec.deletescalingpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteScalingPolicyResponse
* @Description DeleteScalingPolicy 返回体
*/
@Data
@ToString
public class DeleteScalingPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private ReturnSetDto ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("ScalingPolicyId")
        private String ScalingPolicyId;

    }

}
