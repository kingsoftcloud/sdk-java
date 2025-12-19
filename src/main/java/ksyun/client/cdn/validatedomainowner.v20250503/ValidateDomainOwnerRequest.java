package ksyun.client.cdn.validatedomainowner.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ValidateDomainOwnerRequest
* @Description 请求参数
*/
@Data
public class ValidateDomainOwnerRequest{
    /**本次需要验证的域名，只支持单个域名，如test-cdn.com。*/
    @KsYunField(name="DomainName")
    private String DomainName;

    /**验证方式，支持两种方式 DNS校验： dnsCheck；文件校验：fileCheck*/
    @KsYunField(name="AuthType")
    private String AuthType;

}
