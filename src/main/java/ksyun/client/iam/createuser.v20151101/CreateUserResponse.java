package ksyun.client.iam.createuser.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateUserResponse
* @Description CreateUser 返回体
*/
@Data
@ToString
public class CreateUserResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CreateUserResult")
    private CreateUserResultDto CreateUserResult;

    @Data
    @ToString
    public static class CreateUserResultDto {
        /***/
        @JsonProperty("User")
        private CreateUserResultUserDto User;

        @Data
        @ToString
        public static class CreateUserResultUserDto {
            /***/
            @JsonProperty("UserId")
            private String UserId;

            /***/
            @JsonProperty("Path")
            private String Path;

            /***/
            @JsonProperty("UserName")
            private String UserName;

            /***/
            @JsonProperty("RealName")
            private String RealName;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

            /***/
            @JsonProperty("Phone")
            private String Phone;

            /***/
            @JsonProperty("CountryMobileCode")
            private String CountryMobileCode;

            /***/
            @JsonProperty("isInternational")
            private Integer IsInternational;

            /***/
            @JsonProperty("Email")
            private String Email;

            /***/
            @JsonProperty("PhoneVerified")
            private String PhoneVerified;

            /***/
            @JsonProperty("EmailVerified")
            private String EmailVerified;

            /***/
            @JsonProperty("Remark")
            private String Remark;

            /***/
            @JsonProperty("Krn")
            private String Krn;

            /***/
            @JsonProperty("PasswordResetRequired")
            private Boolean PasswordResetRequired;

            /***/
            @JsonProperty("EnableMFA")
            private Integer EnableMFA;

            /***/
            @JsonProperty("NeedBindMfa")
            private String NeedBindMfa;

            /***/
            @JsonProperty("UpdateDate")
            private String UpdateDate;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
