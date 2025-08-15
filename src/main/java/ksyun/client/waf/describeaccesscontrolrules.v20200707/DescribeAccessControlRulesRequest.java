package ksyun.client.waf.describeaccesscontrolrules.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAccessControlRulesRequest @Description 请求参数
 */
@Data
public class DescribeAccessControlRulesRequest {
  /** 描述：防护规则ID */
  @KsYunField(name = "RuleId")
  private String RuleId;

  /** 描述：防护域名ID */
  @KsYunField(name = "ResourceRecordId")
  private String ResourceRecordId;

  /** 描述：防护规则名称 */
  @KsYunField(name = "RuleName")
  private String RuleName;
}
