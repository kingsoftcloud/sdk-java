package ksyun.client.krds.modifysecuritygrouprulename.v20160701;

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