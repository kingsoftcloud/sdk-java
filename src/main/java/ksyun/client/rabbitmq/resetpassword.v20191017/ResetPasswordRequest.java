package ksyun.client.rabbitmq.resetpassword.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResetPasswordRequest @Description 请求参数
 */
@Data
public class ResetPasswordRequest {
  /** 实例Id。 */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 实例新密码。 */
  @KsYunField(name = "InstancePassword")
  private String InstancePassword;
}
