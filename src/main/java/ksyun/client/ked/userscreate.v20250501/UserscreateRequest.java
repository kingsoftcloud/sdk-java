package ksyun.client.ked.userscreate.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UserscreateRequest @Description 请求参数
 */
@Data
public class UserscreateRequest {
  /** 用户名 */
  @KsYunField(name = "name")
  private String Name;

  /** 密码，请使用 base64 加密后传输 */
  @KsYunField(name = "password")
  private String Password;

  /** 手机号码或者邮箱 */
  @KsYunField(name = "phoneOrEmail")
  private String PhoneOrEmail;

  /** 角色 id */
  @KsYunField(name = "roleId")
  private Integer RoleId;
}
