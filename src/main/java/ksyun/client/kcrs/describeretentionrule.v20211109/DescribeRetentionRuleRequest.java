package ksyun.client.kcrs.describeretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeRetentionRuleRequest
 * @Description 请求参数
 */
@Data
public class DescribeRetentionRuleRequest {
    /**
     * 请求Id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

}