package ksyun.client.cdn.getdomainconfigs.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDomainConfigsRequest
* @Description 请求参数
*/
@Data
public class GetDomainConfigsRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**需要查询的配置，多个配置用逗号（半角）分隔。不填代表查询所有，具体参数说明见下表*/
    @KsYunField(name="ConfigList")
    private String ConfigList;

}
