package ksyun.client.monitor.createalarmpolicy.v20220101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateAlarmPolicyResponse
 * @Description CreateAlarmPolicy 返回体
 */
@Data
@ToString
public class CreateAlarmPolicyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
