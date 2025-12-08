package ksyun.client.kcrs.createinstancetoken.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInstanceTokenResponse
* @Description CreateInstanceToken 返回体
*/
@Data
@ToString
public class CreateInstanceTokenResponse extends BaseResponseModel {
    /**登录用户名称*/
    @JsonProperty("Username")
    private String Username;

    /**实例访问凭证*/
    @JsonProperty("tokenId")
    private String TokenId;

    /**实例访问凭证的id

*/
    @JsonProperty("Token")
    private String Token;

    /**实例访问凭证过期时间*/
    @JsonProperty("ExpireTime")
    private String ExpireTime;

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
