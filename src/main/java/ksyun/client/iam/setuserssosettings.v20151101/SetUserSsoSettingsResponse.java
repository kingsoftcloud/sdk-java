package ksyun.client.iam.setuserssosettings.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetUserSsoSettingsResponse
* @Description SetUserSsoSettings 返回体
*/
@Data
@ToString
public class SetUserSsoSettingsResponse extends BaseResponseModel {

    /**请求 ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**用户 SSO 配置信息*/
    @JsonProperty("UserSsoSettings")
    private UserSsoSettingsDto UserSsoSettings;

    @Data
    @ToString
    public static class UserSsoSettingsDto {
        /**	
是否开启用户 SSO*/
        @JsonProperty("Status")
        private Integer Status;

        /**元数据文档。经过 Base64 编码。*/
        @JsonProperty("Metadata")
        private String Metadata;

        /**	
域名*/
        @JsonProperty("Domain")
        private String Domain;

    }

}
