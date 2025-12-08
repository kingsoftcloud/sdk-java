package ksyun.client.iam.listusersforgroup.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListUsersForGroupResponse
* @Description ListUsersForGroup 返回体
*/
@Data
@ToString
public class ListUsersForGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListUsersForGroupResult")
    private ListUsersForGroupResultDto ListUsersForGroupResult;

    @Data
    @ToString
    public static class ListUsersForGroupResultDto {
        /***/
        @JsonProperty("Users")
        private List<UsersDto> Users;

        @Data
        @ToString
        public static class UsersDto {
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
            @JsonProperty("UpdateDate")
            private String UpdateDate;

            /***/
            @JsonProperty("Id")
            private Integer Id;

        }

        /***/
        @JsonProperty("IsTruncated")
        private Boolean IsTruncated;

        /***/
        @JsonProperty("Marker")
        private String Marker;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
