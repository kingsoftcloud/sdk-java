package ksyun.client.iam.createaccesskey.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAccessKeyResponse
* @Description CreateAccessKey 返回体
*/
@Data
@ToString
public class CreateAccessKeyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("CreateAccessKeyResult")
    private CreateAccessKeyResultDto CreateAccessKeyResult;

    @Data
    @ToString
    public static class CreateAccessKeyResultDto {
        /***/
        @JsonProperty("AccessKey")
        private CreateAccessKeyResultDtoAccessKeyDto AccessKey;

        @Data
        @ToString
        public static class CreateAccessKeyResultDtoAccessKeyDto {
            /***/
            @JsonProperty("UserName")
            private String UserName;

            /***/
            @JsonProperty("AccessKeyId")
            private String AccessKeyId;

            /***/
            @JsonProperty("SecretAccessKey")
            private String SecretAccessKey;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
