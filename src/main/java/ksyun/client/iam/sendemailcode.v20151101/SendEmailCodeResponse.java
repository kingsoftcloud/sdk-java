package ksyun.client.iam.sendemailcode.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SendEmailCodeResponse
* @Description SendEmailCode 返回体
*/
@Data
@ToString
public class SendEmailCodeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("SendEmailCodeResult")
    private SendEmailCodeResultDto SendEmailCodeResult;

    @Data
    @ToString
    public static class SendEmailCodeResultDto {
        /***/
        @JsonProperty("ToEmail")
        private String ToEmail;

        /***/
        @JsonProperty("ExpiresAt")
        private String ExpiresAt;

    }

}
