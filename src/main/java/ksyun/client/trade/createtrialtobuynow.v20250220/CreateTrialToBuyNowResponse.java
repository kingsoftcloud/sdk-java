package ksyun.client.trade.createtrialtobuynow.v20250220;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateTrialToBuyNowResponse
* @Description CreateTrialToBuyNow 返回体
*/
@Data
@ToString
public class CreateTrialToBuyNowResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Error")
    private ErrorDto Error;

    @Data
    @ToString
    public static class ErrorDto {
        /**错误码*/
        @JsonProperty("Code")
        private String Code;

        /**错误详情*/
        @JsonProperty("Message")
        private String Message;

    }

    /**本次请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否转正成功。true-成功，false-失败*/
    @JsonProperty("success")
    private Boolean Success;

}
