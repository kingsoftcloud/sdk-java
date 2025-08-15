package ksyun.client.ked.strategybound.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StrategyboundRequest @Description 请求参数
 */
@Data
public class StrategyboundRequest {
  /** 策略组 id */
  @KsYunField(name = "securityGroupId")
  private String SecurityGroupId;

  /** 云电脑 id */
  @KsYunField(name = "instanceId")
  private String InstanceId;
}
