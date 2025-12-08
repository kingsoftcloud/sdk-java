package ksyun.client.waf.deletealbdomain.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DeleteAlbDomainResponse
* @Description DeleteAlbDomain 返回体
*/
@Data
@ToString
public class DeleteAlbDomainResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
