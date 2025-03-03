package ksyun.client.monitor.deletealarmpolicy.v20220101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteAlarmPolicyResponse
 * @Description DeleteAlarmPolicy 返回体
 */
@Data
@ToString
public class DeleteAlarmPolicyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
