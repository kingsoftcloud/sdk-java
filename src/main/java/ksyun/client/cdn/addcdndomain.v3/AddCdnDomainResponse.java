package ksyun.client.cdn.addcdndomain.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddCdnDomainResponse
* @Description AddCdnDomain 返回体
*/
@Data
@ToString
public class AddCdnDomainResponse extends BaseResponseModel {

    /***/
    @JsonProperty("DomainId")
    private String DomainId;

    /**域名状态*/
    @JsonProperty("DomainStatus")
    private String DomainStatus;

}
