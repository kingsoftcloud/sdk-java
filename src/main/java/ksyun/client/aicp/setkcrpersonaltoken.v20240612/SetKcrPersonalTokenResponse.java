package ksyun.client.aicp.setkcrpersonaltoken.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetKcrPersonalTokenResponse
* @Description SetKcrPersonalToken 返回体
*/
@Data
@ToString
public class SetKcrPersonalTokenResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回结果*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
