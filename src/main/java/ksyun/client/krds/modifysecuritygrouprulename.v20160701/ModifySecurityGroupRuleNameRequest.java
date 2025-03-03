package ksyun.client.krds.modifysecuritygrouprulename.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifySecurityGroupRuleNameRequest
 * @Description 请求参数
 */
@Data
public class ModifySecurityGroupRuleNameRequest {
    /**
     * 安全组规则id
     */
    @KsYunField(name = "SecurityGroupRuleId")
    private String SecurityGroupRuleId;

    /**
     * 安全组规则名称
     */
    @KsYunField(name = "SecurityGroupRuleName")
    private String SecurityGroupRuleName;

}