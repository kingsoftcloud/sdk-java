package ksyun.client.influxdb.createretentionpolicy.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateRetentionPolicyRequest @Description 请求参数
 */
@Data
public class CreateRetentionPolicyRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /***/
  @KsYunField(name = "DatabaseName")
  private String DatabaseName;

  /***/
  @KsYunField(name = "PolicyName")
  private String PolicyName;

  /** 1d10h */
  @KsYunField(name = "Duration")
  private String Duration;

  /** 默认值：0, 支持0|1 0 否 1是 */
  @KsYunField(name = "DefaultPolicy")
  private String DefaultPolicy;
}
