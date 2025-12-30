package ksyun.client.cdn.modifycdndomainbasicinfo.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyCdnDomainBasicInfoResponse
* @Description ModifyCdnDomainBasicInfo 返回体
*/
@Data
@ToString
public class ModifyCdnDomainBasicInfoResponse extends BaseResponseModel {

    /**ModifyCdnDomainBasicInfoResponse*/
    @JsonProperty("ModifyCdnDomainBasicInfoResponse")
    private String ModifyCdnDomainBasicInfoResponse;

}
