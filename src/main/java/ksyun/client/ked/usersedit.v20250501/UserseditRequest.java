package ksyun.client.ked.usersedit.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UserseditRequest @Description 请求参数
 */
@Data
public class UserseditRequest {
  /** 主键 id */
  @KsYunField(name = "id")
  private Integer Id;

  /** 用户名 */
  @KsYunField(name = "name")
  private String Name;

  /** 电话或邮箱 */
  @KsYunField(name = "phoneOrEmail")
  private String PhoneOrEmail;

  /** 昵称 */
  @KsYunField(name = "nickName")
  private String NickName;

  /** 1: 启用/0: 禁用 不传递或者传递 null 时不修改 */
  @KsYunField(name = "status")
  private Integer Status;
}
