package ksyun.client.slb.addalbrule.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddAlbRuleRequest @Description 请求参数
 */
@Data
public class AddAlbRuleRequest {
  /** 转发策略的ID */
  @KsYunField(name = "AlbRuleGroupId")
  private String AlbRuleGroupId;

  /** 匹配规则类型(domain|url) */
  @KsYunField(name = "AlbRuleType")
  private String AlbRuleType;

  /** 匹配规则的值 */
  @KsYunField(name = "AlbRuleValue")
  private String AlbRuleValue;
}
