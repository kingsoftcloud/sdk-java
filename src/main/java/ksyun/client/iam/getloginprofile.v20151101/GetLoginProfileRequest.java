package ksyun.client.iam.getloginprofile.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetLoginProfileRequest @Description 请求参数
 */
@Data
public class GetLoginProfileRequest {
  /** 要查询的IAM子用户名称 */
  @KsYunField(name = "UserName")
  private String UserName;

  /**
   * 该字段默认是0，0的情况查询未开启控制台访问的账号会抛出异常"LoginProfileNoSuchEntity"，传1则都可以查看，可通过出参"ConsoleLogin"来判断是否开启了控制台访问和编程API访问。
   */
  @KsYunField(name = "NotCheckPassword")
  private Integer NotCheckPassword;
}
