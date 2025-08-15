package ksyun.client.krds.modifysecuritygrouprule.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifySecurityGroupRuleRequest @Description 请求参数
 */
@Data
public class ModifySecurityGroupRuleRequest {
  /**
   * 取值范围：Attach|Delete|Cover Attach:
   * 将传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）追加到安全组规则列表内。所有绑定了此安全组的实例都会发生变化。
   * Delete：从安全组中删除传入的规则列表（SecurityGroupRuleId）。所有绑定了此安全组的实例都会发生变化。
   * Cover：用传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）覆盖安全组规则列表。所有绑定了此安全组的实例都会发生变化。
   */
  @KsYunField(name = "SecurityGroupRuleAction")
  private String SecurityGroupRuleAction;

  /** 安全组Id */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;

  /** 规则id列表. 如SecurityGroupRule.SecurityGroupRuleId.1= **** */
  @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleId.N")
  private String SecurityGroupRuleSecurityGroupRuleIdN;

  /** 规则名称列表。不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线。如SecurityGroupRule.SecurityGroupRuleName.1= ** */
  @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleName.N")
  private String SecurityGroupRuleSecurityGroupRuleNameN;

  /** 规则协议列表。 0.0.0.0/32格式 */
  @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleCidr.N")
  private String SecurityGroupRuleSecurityGroupRuleCidrN;
}
