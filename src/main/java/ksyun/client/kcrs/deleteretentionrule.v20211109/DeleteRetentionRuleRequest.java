package ksyun.client.kcrs.deleteretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteRetentionRuleRequest @Description 请求参数
 */
@Data
public class DeleteRetentionRuleRequest {
  /** 实例Id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 命名空间 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /** 参数实体类 */
  @KsYunField(name = "Rule")
  private RuleDto RuleList;

  @Data
  @ToString
  public static class RuleDto {
    /** 规则Id */
    @KsYunField(name = "RuleId")
    private String RuleId;
  }
}
