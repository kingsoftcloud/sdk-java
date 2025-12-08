package ksyun.client.iam.getloginprofile.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetLoginProfileResponse
* @Description GetLoginProfile 返回体
*/
@Data
@ToString
public class GetLoginProfileResponse extends BaseResponseModel {
    /***/
    @JsonProperty("CreateLoginProfileResult")
    private CreateLoginProfileResultDto CreateLoginProfileResult;

    @Data
    @ToString
    public static class CreateLoginProfileResultDto {
        /***/
        @JsonProperty("LoginProfile")
        private LoginProfileDto LoginProfile;

        @Data
        @ToString
        public static class LoginProfileDto {
            /***/
            @JsonProperty("UserName")
            private String UserName;

            /***/
            @JsonProperty("PasswordResetRequired")
            private Boolean PasswordResetRequired;

            /***/
            @JsonProperty("OpenLoginProtection")
            private Integer OpenLoginProtection;

            /***/
            @JsonProperty("OpenSecurityProtection")
            private Integer OpenSecurityProtection;

            /***/
            @JsonProperty("EnableMfa")
            private Integer EnableMfa;

            /***/
            @JsonProperty("ViewAllProject")
            private Integer ViewAllProject;

            /***/
            @JsonProperty("LastLoginDate")
            private String LastLoginDate;

            /***/
            @JsonProperty("LastLoginIp")
            private String LastLoginIp;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

            /**true：控制台访问
false：编程API访问*/
            @JsonProperty("ConsoleLogin")
            private Boolean ConsoleLogin;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
