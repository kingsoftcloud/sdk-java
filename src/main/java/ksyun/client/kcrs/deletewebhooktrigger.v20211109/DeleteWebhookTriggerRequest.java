package ksyun.client.kcrs.deletewebhooktrigger.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteWebhookTriggerRequest @Description 请求参数
 */
@Data
public class DeleteWebhookTriggerRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 命名空间 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /** 触发器ID */
  @KsYunField(name = "TriggerId")
  private String TriggerId;
}
