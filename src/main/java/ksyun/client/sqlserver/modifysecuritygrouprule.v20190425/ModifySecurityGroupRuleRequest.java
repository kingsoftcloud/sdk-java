package ksyun.client.sqlserver.modifysecuritygrouprule.v20190425;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifySecurityGroupRuleRequest @Description 请求参数
 */
@Data
public class ModifySecurityGroupRuleRequest {
  /**
   * 对安全组规则列表的操作
   *
   * <p>```json Attach|Delete|Cover Attach:
   * 将传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）追加到安全组规则列表内。所有绑定了此安全组的实例都会发生变化。
   * Delete：从安全组中删除传入的规则列表（SecurityGroupRuleId）。所有绑定了此安全组的实例都会发生变化。
   * Cover：用传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）覆盖安全组规则列表。所有绑定了此安全组的实例都会发生变化。
   * ```
   */
  @KsYunField(name = "SecurityGroupRuleAction")
  private String SecurityGroupRuleAction;

  /** 安全组ID */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;

  /***/
  @KsYunField(name = "SecurityGroupRule")
  private List<SecurityGroupRuleDto> SecurityGroupRuleList;

  @Data
  @ToString
  public static class SecurityGroupRuleDto {
    /**
     * 规则ID
     *
     * <p>```json 新增/覆盖不传，删除必传 ```
     */
    @KsYunField(name = "SecurityGroupRuleId")
    private String SecurityGroupRuleId;

    /**
     * 规则协议
     *
     * <p>```json 新增/覆盖不传，删除必传 ```
     */
    @KsYunField(name = "SecurityGroupRuleProtocol")
    private String SecurityGroupRuleProtocol;

    /** 安全组规则名称 */
    @KsYunField(name = "SecurityGroupRuleName")
    private String SecurityGroupRuleName;
  }
}
