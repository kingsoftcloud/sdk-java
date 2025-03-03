package ksyun.client.tidb.deletesecurityrule.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityRuleRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecurityRuleRequest {
    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组规则ID列表。多个安全组规则ID请用英文逗号隔开。
     */
    @KsYunField(name = "RuleIds")
    private String RuleIds;

}