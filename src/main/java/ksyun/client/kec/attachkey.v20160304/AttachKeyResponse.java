package ksyun.client.kec.attachkey.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AttachKeyResponse
* @Description AttachKey 返回体
*/
@Data
@ToString
public class AttachKeyResponse extends BaseResponseModel {
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
