package ksyun.client.sts.assumerole.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AssumeRoleResponse
* @Description AssumeRole 返回体
*/
@Data
@ToString
public class AssumeRoleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("AssumeRoleResult")
    private AssumeRoleResultDto AssumeRoleResult;

    @Data
    @ToString
    public static class AssumeRoleResultDto {
        /**访问凭证*/
        @JsonProperty("Credentials")
        private CredentialsDto Credentials;

        @Data
        @ToString
        public static class CredentialsDto {
            /**失效时间，UTC时间，即协调世界时。*/
            @JsonProperty("Expiration")
            private String Expiration;

            /**访问密钥*/
            @JsonProperty("SecretAccessKey")
            private String SecretAccessKey;

            /**访问密钥ID*/
            @JsonProperty("AccessKeyId")
            private String AccessKeyId;

            /**安全令牌*/
            @JsonProperty("SecurityToken")
            private String SecurityToken;

        }

        /**角色扮演时的临时身份。*/
        @JsonProperty("AssumedRoleUser")
        private AssumedRoleUserDto AssumedRoleUser;

        @Data
        @ToString
        public static class AssumedRoleUserDto {
            /**临时身份的KRN信息*/
            @JsonProperty("Krn")
            private String Krn;

            /**临时身份的ID*/
            @JsonProperty("AssumedRoleId")
            private String AssumedRoleId;

        }

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
