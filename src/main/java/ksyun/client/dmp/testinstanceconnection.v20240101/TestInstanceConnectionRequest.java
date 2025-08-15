package ksyun.client.dmp.testinstanceconnection.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname TestInstanceConnectionRequest @Description 请求参数
 */
@Data
public class TestInstanceConnectionRequest {
  /** 实例Id. */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 数据库类型 */
  @KsYunField(name = "DatabaseType")
  private String DatabaseType;

  /** 数据库版本 */
  @KsYunField(name = "DatabaseVersion")
  private String DatabaseVersion;

  /** 用户名 */
  @KsYunField(name = "Username")
  private String Username;

  /** 用户名密码 */
  @KsYunField(name = "Password")
  private String Password;

  /** 是否使用加入dmp时的用户名和密码 */
  @KsYunField(name = "UseSourceUser")
  private Boolean UseSourceUser;
}
