package ksyun.client.influxdb.createsecurityrule.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateSecurityRuleRequest @Description 请求参数
 */
@Data
public class CreateSecurityRuleRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /***/
  @KsYunField(name = "SecurityRuleCidrs")
  private String SecurityRuleCidrs;
}
