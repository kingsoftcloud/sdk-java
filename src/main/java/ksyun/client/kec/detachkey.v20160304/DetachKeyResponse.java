package ksyun.client.kec.detachkey.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DetachKeyResponse
* @Description DetachKey 返回体
*/
@Data
@ToString
public class DetachKeyResponse extends BaseResponseModel {

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
        @JsonProperty("Message")
        private String Message;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

    }

}
