package ksyun.client.influxdb.revokeaccountprivilege.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RevokeAccountPrivilegeRequest @Description 请求参数
 */
@Data
public class RevokeAccountPrivilegeRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /***/
  @KsYunField(name = "AccountName")
  private String AccountName;

  /***/
  @KsYunField(name = "DatabaseName")
  private String DatabaseName;
}
