package ksyun.client.kcrs.deleteinternalendpoint.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInternalEndpointResponse
* @Description DeleteInternalEndpoint 返回体
*/
@Data
@ToString
public class DeleteInternalEndpointResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
