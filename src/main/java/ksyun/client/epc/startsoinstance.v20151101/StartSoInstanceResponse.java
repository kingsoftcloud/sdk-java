package ksyun.client.epc.startsoinstance.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartSoInstanceResponse
* @Description StartSoInstance 返回体
*/
@Data
@ToString
public class StartSoInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("OperationDetails")
    private List<OperationDetailsDto> OperationDetails;

    @Data
    @ToString
    public static class OperationDetailsDto {
        /*********/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Error")
        private OperationDetailsErrorDto Error;

        @Data
        @ToString
        public static class OperationDetailsErrorDto {
            /**InvalidInstanceStatus*/
            @JsonProperty("Code")
            private String Code;

            /**The status of the specified instance does not support this request.*/
            @JsonProperty("Message")
            private String Message;

        }

    }

}
