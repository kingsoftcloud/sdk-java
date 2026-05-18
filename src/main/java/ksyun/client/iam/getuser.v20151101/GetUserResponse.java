package ksyun.client.iam.getuser.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetUserResponse
* @Description GetUser 返回体
*/
@Data
@ToString
public class GetUserResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("GetUserResult")
    private GetUserResultDto GetUserResult;

    @Data
    @ToString
    public static class GetUserResultDto {
        /***/
        @JsonProperty("User")
        private GetUserResultUserDto User;

        @Data
        @ToString
        public static class GetUserResultUserDto {
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
            private Integer NeedBindMfa;

            /***/
            @JsonProperty("PwdFreeze")
            private Integer PwdFreeze;

            /***/
            @JsonProperty("UpdateDate")
            private String UpdateDate;

            /***/
            @JsonProperty("ViewAllProject")
            private Integer ViewAllProject;

            /***/
            @JsonProperty("pwdLastUsed")
            private String PwdLastUsed;

            /***/
            @JsonProperty("Id")
            private Integer Id;

        }

    }

}
