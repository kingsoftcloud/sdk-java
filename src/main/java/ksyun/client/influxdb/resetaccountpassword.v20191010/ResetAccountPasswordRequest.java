package ksyun.client.influxdb.resetaccountpassword.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResetAccountPasswordRequest @Description 请求参数
 */
@Data
public class ResetAccountPasswordRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /***/
  @KsYunField(name = "AccountName")
  private String AccountName;

  /***/
  @KsYunField(name = "AccountPassword")
  private String AccountPassword;
}
