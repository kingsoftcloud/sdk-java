package ksyun.client.aicp.deleteapikey.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteApikeyResponse
* @Description DeleteApikey 返回体
*/
@Data
@ToString
public class DeleteApikeyResponse extends BaseResponseModel {

    /**true 表示执行成功，其他情况为失败。*/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
