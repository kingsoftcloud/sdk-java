package ksyun.client.monitor.deletealarmpolicy.v20220101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAlarmPolicyResponse
* @Description DeleteAlarmPolicy 返回体
*/
@Data
@ToString
public class DeleteAlarmPolicyResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("requestId")
    private String RequestId;

}
