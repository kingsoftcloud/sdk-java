package ksyun.client.cdn.getvaliddomainlist.v20250503;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname GetValidDomainListResponse
* @Description GetValidDomainList 返回体
*/
@Data
@ToString
public class GetValidDomainListResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
