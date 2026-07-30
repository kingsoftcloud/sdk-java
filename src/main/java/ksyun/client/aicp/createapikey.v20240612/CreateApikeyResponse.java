package ksyun.client.aicp.createapikey.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateApikeyResponse
* @Description CreateApikey 返回体
*/
@Data
@ToString
public class CreateApikeyResponse extends BaseResponseModel {

    /**是否成功*/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
