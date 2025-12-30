package ksyun.client.cdn.startstopcdndomain.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartStopCdnDomainResponse
* @Description StartStopCdnDomain 返回体
*/
@Data
@ToString
public class StartStopCdnDomainResponse extends BaseResponseModel {

    /**StartStopCdnDomainResponse*/
    @JsonProperty("StartStopCdnDomainResponse")
    private String StartStopCdnDomainResponse;

}
