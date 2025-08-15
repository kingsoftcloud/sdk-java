package ksyun.client.iam.getuser.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetUserRequest @Description 请求参数
 */
@Data
public class GetUserRequest {
  /** UserName */
  @KsYunField(name = "UserName")
  private String UserName;
}
