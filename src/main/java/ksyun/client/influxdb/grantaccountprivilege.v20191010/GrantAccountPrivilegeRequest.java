package ksyun.client.influxdb.grantaccountprivilege.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GrantAccountPrivilegeRequest @Description 请求参数
 */
@Data
public class GrantAccountPrivilegeRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /***/
  @KsYunField(name = "AccountName")
  private String AccountName;

  /***/
  @KsYunField(name = "DatabaseName")
  private String DatabaseName;

  /***/
  @KsYunField(name = "AccountPrivilege")
  private String AccountPrivilege;
}
