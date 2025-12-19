package ksyun.client.cdn.getdomainauthcontent.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDomainAuthContentRequest
* @Description 请求参数
*/
@Data
public class GetDomainAuthContentRequest{
    /**本次需要验证的域名，只支持单个域名，如test.com。*/
    @KsYunField(name="DomainName")
    private String DomainName;

}
