package ksyun.client.iam.getuserssosettings.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname GetUserSsoSettingsResponse
* @Description GetUserSsoSettings 返回体
*/
@Data
@ToString
public class GetUserSsoSettingsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
