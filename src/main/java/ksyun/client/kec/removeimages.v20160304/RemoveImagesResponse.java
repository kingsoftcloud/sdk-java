package ksyun.client.kec.removeimages.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemoveImagesResponse
* @Description RemoveImages 返回体
*/
@Data
@ToString
public class RemoveImagesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ReturnSet")
    private List<ReturnSetDto> ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("ImageId")
        private String ImageId;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
