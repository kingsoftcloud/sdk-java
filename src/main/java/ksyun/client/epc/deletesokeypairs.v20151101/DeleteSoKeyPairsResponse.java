package ksyun.client.epc.deletesokeypairs.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSoKeyPairsResponse
* @Description DeleteSoKeyPairs 返回体
*/
@Data
@ToString
public class DeleteSoKeyPairsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("OperationDetails")
    private List<OperationDetailsDto> OperationDetails;

    @Data
    @ToString
    public static class OperationDetailsDto {
        /**33222*/
        @JsonProperty("KeyPairName")
        private String KeyPairName;

        /***/
        @JsonProperty("Error")
        private ErrorDto Error;

        @Data
        @ToString
        public static class ErrorDto {
            /**123*/
            @JsonProperty("Code")
            private String Code;

            /**2222*/
            @JsonProperty("Message")
            private String Message;

        }

    }

    /**aff0c88b-1832-4f41-995d-5742ad06db7b*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
