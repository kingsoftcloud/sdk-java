package ksyun.client.clickhouse.deletesecurityrule.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityRuleRequest @Description 请求参数
 */
@Data
public class DeleteSecurityRuleRequest {
  /** 商品类型：Clickhouse固定取值：523。 */
  @KsYunField(name = "ProductType")
  private Integer ProductType;

  /** 安全组ID。 */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;

  /** 安全组规则ID列表。多个安全组规则ID用逗号隔开。安全组规则ID可通过DescribeSecurityGroup接口获取。 */
  @KsYunField(name = "RuleIds")
  private String RuleIds;
}
