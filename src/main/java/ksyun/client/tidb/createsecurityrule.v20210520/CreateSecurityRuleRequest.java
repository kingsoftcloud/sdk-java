package ksyun.client.tidb.createsecurityrule.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname CreateSecurityRuleRequest
 * @Description 请求参数
 */
@Data
public class CreateSecurityRuleRequest {
    /**
     * 安全组规则。格式：{Rules: [{"Cidr": "***", "Desc": "***", "AclAction": "***"}]}。
     * 请注意：1. Cidr为必填参数；2. AclAction（控制策略）可选：accept（放行），reject（拒绝）；默认为accept。
     */
    @KsYunField(name = "Rules", type = 2)
    private List<String> RulesList;

    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;


}