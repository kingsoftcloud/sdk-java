package ksyun.client.cdn.deletecdndomain.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteCdnDomainResponse
* @Description DeleteCdnDomain 返回体
*/
@Data
@ToString
public class DeleteCdnDomainResponse extends BaseResponseModel {

    /**DeleteCdnDomainResponse*/
    @JsonProperty("DeleteCdnDomainResponse")
    private String DeleteCdnDomainResponse;

}
