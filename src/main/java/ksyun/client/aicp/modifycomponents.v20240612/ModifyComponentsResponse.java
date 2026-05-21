package ksyun.client.aicp.modifycomponents.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyComponentsResponse
* @Description ModifyComponents 返回体
*/
@Data
@ToString
public class ModifyComponentsResponse extends BaseResponseModel {

    /**资源池ID*/
    @JsonProperty("ResourcePoolId")
    private String ResourcePoolId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
