package ksyun.client.epc.deletesoimages.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSoImagesResponse
* @Description DeleteSoImages 返回体
*/
@Data
@ToString
public class DeleteSoImagesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("OperationDetails")
    private List<OperationDetailsDto> OperationDetails;

    @Data
    @ToString
    public static class OperationDetailsDto {
        /**prtb54be2bc-e96a-41d1-8156-3990d1f9ba41*/
        @JsonProperty("ImageId")
        private String ImageId;

        /***/
        @JsonProperty("Error")
        private OperationDetailsErrorDto Error;

        @Data
        @ToString
        public static class OperationDetailsErrorDto {
            /***/
            @JsonProperty("Code")
            private String Code;

            /***/
            @JsonProperty("Message")
            private String Message;

        }

    }

    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
