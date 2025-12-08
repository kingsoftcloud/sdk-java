package ksyun.client.kec.rebootinstances.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RebootInstancesResponse
* @Description RebootInstances 返回体
*/
@Data
@ToString
public class RebootInstancesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstancesSet")
    private List<InstancesSetDto> InstancesSet;

    @Data
    @ToString
    public static class InstancesSetDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

    }

}
