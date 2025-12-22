package ksyun.client.cdn.getcdndomainbasicinfo.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetCdnDomainBasicInfoRequest
* @Description 请求参数
*/
@Data
public class GetCdnDomainBasicInfoRequest{
    /**DomainId*/
    @KsYunField(name="DomainId")
    private String DomainId;

}
