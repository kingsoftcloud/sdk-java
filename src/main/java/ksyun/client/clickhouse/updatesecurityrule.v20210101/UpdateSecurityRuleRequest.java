package ksyun.client.clickhouse.updatesecurityrule.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateSecurityRuleRequest @Description 请求参数
 */
@Data
public class UpdateSecurityRuleRequest {
  /** 商品类型：Clickhouse固定取值：523。 */
  @KsYunField(name = "ProductType")
  private Integer ProductType;

  /** 安全组规则ID。安全组规则ID可通过DescribeSecurityGroup接口获取。 */
  @KsYunField(name = "RuleId")
  private String RuleId;

  /** 安全组规则备注。 */
  @KsYunField(name = "Description")
  private String Description;
}
