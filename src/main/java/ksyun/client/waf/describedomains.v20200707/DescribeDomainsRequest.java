package ksyun.client.waf.describedomains.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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