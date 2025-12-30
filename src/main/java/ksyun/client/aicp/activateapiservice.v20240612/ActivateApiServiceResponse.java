package ksyun.client.aicp.activateapiservice.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ActivateApiServiceResponse
* @Description ActivateApiService 返回体
*/
@Data
@ToString
public class ActivateApiServiceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否开通成功：true 为开通成功，其他情况都是失败。*/
    @JsonProperty("Success")
    private Boolean Success;

}
