package ksyun.client.sqlserver.modifysecuritygrouprulename.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifySecurityGroupRuleNameRequest
 * @Description 请求参数
 */
@Data
public class ModifySecurityGroupRuleNameRequest {
    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组规则ID
     */
    @KsYunField(name = "SecurityGroupRuleId")
    private String SecurityGroupRuleId;

    /**
     * 安全组规则名称
     * <p>
     * ```json
     * 不传则清空当前备注
     * ```
     */
    @KsYunField(name = "SecurityGroupRuleName")
    private String SecurityGroupRuleName;

}