package ksyun.client.kec.addvmintodataguard.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddVmIntoDataGuardResponse
* @Description AddVmIntoDataGuard 返回体
*/
@Data
@ToString
public class AddVmIntoDataGuardResponse extends BaseResponseModel {

    /***/
    @JsonProperty("DataGuardResult")
    private DataGuardResultDto DataGuardResult;

    @Data
    @ToString
    public static class DataGuardResultDto {
        /***/
        @JsonProperty("Flag")
        private Boolean Flag;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Message")
        private String Message;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
