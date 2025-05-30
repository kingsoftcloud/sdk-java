package ksyun.client.sqlserver.modifysecuritygrouprulename.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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