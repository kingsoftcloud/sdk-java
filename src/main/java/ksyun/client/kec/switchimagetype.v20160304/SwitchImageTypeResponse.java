package ksyun.client.kec.switchimagetype.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SwitchImageTypeResponse
* @Description SwitchImageType 返回体
*/
@Data
@ToString
public class SwitchImageTypeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ImageErrorResponses")
    private List<ImageErrorResponsesDto> ImageErrorResponses;

    @Data
    @ToString
    public static class ImageErrorResponsesDto {
        /***/
        @JsonProperty("Result")
        private Boolean Result;

        /***/
        @JsonProperty("Reason")
        private String Reason;

        /***/
        @JsonProperty("ImageId")
        private String ImageId;

    }

}
