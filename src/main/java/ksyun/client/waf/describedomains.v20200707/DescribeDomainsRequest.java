package ksyun.client.waf.describedomains.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDomainsRequest
 * @Description 请求参数
 */
@Data
public class DescribeDomainsRequest {
    /***/
    @KsYunField(name = "ResourceRecord")
    private String ResourceRecord;


}