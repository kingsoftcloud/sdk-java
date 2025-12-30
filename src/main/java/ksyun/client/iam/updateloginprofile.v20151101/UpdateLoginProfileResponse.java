package ksyun.client.iam.updateloginprofile.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateLoginProfileResponse
* @Description UpdateLoginProfile 返回体
*/
@Data
@ToString
public class UpdateLoginProfileResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CreateLoginProfileResult")
    private CreateLoginProfileResultDto CreateLoginProfileResult;

    @Data
    @ToString
    public static class CreateLoginProfileResultDto {
        /***/
        @JsonProperty("LoginProfile")
        private CreateLoginProfileResultLoginProfileDto LoginProfile;

        @Data
        @ToString
        public static class CreateLoginProfileResultLoginProfileDto {
            /***/
            @JsonProperty("UserName")
            private String UserName;

            /***/
            @JsonProperty("OpenLoginProtection")
            private String OpenLoginProtection;

            /***/
            @JsonProperty("OpenSecurityProtection")
            private String OpenSecurityProtection;

            /***/
            @JsonProperty("PasswordResetRequired")
            private String PasswordResetRequired;

            /***/
            @JsonProperty("UpdateDate")
            private String UpdateDate;

            /***/
            @JsonProperty("Password")
            private String Password;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
