package ksyun.client.kcrs.createinternalendpoint.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInternalEndpointResponse
* @Description CreateInternalEndpoint 返回体
*/
@Data
@ToString
public class CreateInternalEndpointResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
