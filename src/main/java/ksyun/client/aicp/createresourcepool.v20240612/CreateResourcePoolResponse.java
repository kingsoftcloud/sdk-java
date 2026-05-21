package ksyun.client.aicp.createresourcepool.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateResourcePoolResponse
* @Description CreateResourcePool 返回体
*/
@Data
@ToString
public class CreateResourcePoolResponse extends BaseResponseModel {

    /**资源组ID*/
    @JsonProperty("ResourcePoolId")
    private String ResourcePoolId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
