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
    @JsonProperty("GetUserResult")
    private GetUserResultDto GetUserResult;

    @Data
    @ToString
    public static class GetUserResultDto {
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
        @JsonProperty("CreateDate")
        private String CreateDate;

        /***/
        @JsonProperty("Phone")
        private Integer Phone;

        /***/
        @JsonProperty("CountryMobileCode")
        private Integer CountryMobileCode;

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
        @JsonProperty("PasswordResetRequired")
        private String PasswordResetRequired;

        /***/
        @JsonProperty("EnableMFA")
        private Integer EnableMFA;

        /***/
        @JsonProperty("NeedBindMfa")
        private Integer NeedBindMfa;

        /***/
        @JsonProperty("UpdateDate")
        private String UpdateDate;

        /***/
        @JsonProperty("ViewAllProject")
        private String ViewAllProject;

        /***/
        @JsonProperty("Id")
        private Integer Id;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
