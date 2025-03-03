package ksyun.client.postgresql.modifysecuritygrouprulename.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifySecurityGroupRuleNameRequest
 * @Description 请求参数
 */
@Data
public class ModifySecurityGroupRuleNameRequest {
    /**
     * 安全组规则ID
     */
    @KsYunField(name = "SecurityGroupRuleId")
    private String SecurityGroupRuleId;

    /**
     * 安全组规则名称
     * <p>
     * ```json
     * 安全组规则备注，不指定默认''
     * ```
     */
    @KsYunField(name = "SecurityGroupRuleName")
    private String SecurityGroupRuleName;


}