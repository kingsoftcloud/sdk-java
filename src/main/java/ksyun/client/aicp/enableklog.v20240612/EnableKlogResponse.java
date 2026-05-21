package ksyun.client.aicp.enableklog.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableKlogResponse
* @Description EnableKlog 返回体
*/
@Data
@ToString
public class EnableKlogResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**资源组ID*/
    @JsonProperty("ResourcePoolId")
    private String ResourcePoolId;

}
