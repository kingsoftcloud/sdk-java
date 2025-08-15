package ksyun.client.tidb.createaccount.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAccountRequest @Description 请求参数
 */
@Data
public class CreateAccountRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /**
   * 账户名称
   *
   * <p>```json 注：支持数字字母,中划线,下划线。不支持保留字符串。 ```
   */
  @KsYunField(name = "AccountName")
  private String AccountName;

  /** 账户密码 */
  @KsYunField(name = "AccountPassword")
  private String AccountPassword;

  /** 账户描述 */
  @KsYunField(name = "Describe")
  private String Describe;

  /**
   * 权限列表，支持多传,接收参数为Map<String,String>
   *
   * <p>例如："Privileges":{"test":"onlyDdl"}
   */
  @KsYunField(name = "Privileges")
  private String Privileges;
}
