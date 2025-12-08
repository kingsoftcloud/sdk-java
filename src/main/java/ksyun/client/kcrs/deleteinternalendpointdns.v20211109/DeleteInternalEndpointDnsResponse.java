package ksyun.client.kcrs.deleteinternalendpointdns.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInternalEndpointDnsResponse
* @Description DeleteInternalEndpointDns 返回体
*/
@Data
@ToString
public class DeleteInternalEndpointDnsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
