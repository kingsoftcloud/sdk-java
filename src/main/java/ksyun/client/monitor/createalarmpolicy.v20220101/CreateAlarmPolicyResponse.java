package ksyun.client.monitor.createalarmpolicy.v20220101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAlarmPolicyResponse
* @Description CreateAlarmPolicy 返回体
*/
@Data
@ToString
public class CreateAlarmPolicyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("policyId")
        private Integer PolicyId;

    }

}
