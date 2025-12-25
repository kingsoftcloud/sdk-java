package ksyun.client.krds.modifysecuritygrouprule.v20200825;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifySecurityGroupRuleRequest
* @Description 请求参数
*/
@Data
public class ModifySecurityGroupRuleRequest{
    /**对安全组规则列表的操作。		取值范围：Attach|Delete|Cover
Attach: 将传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）追加到安全组规则列表内。所有绑定了此安全组的实例都会发生变化。
Delete：从安全组中删除传入的规则列表（SecurityGroupRuleId）。所有绑定了此安全组的实例都会发生变化。
Cover：用传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）覆盖安全组规则列表。所有绑定了此安全组的实例都会发生变化。*/
    @KsYunField(name="SecurityGroupRuleAction")
    private String SecurityGroupRuleAction;

    /**安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**规则id列表*/
    @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleId", type = 1)
    private List<String> SecurityGroupRuleSecurityGroupRuleIdList;

    /**规则名称列表*/
    @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleName", type = 1)
    private List<String> SecurityGroupRuleSecurityGroupRuleNameList;

    /**规则协议列表*/
    @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleCidr", type = 1)
    private List<String> SecurityGroupRuleSecurityGroupRuleCidrList;

}
