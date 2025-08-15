package ksyun.client.iam.createaccesskey.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAccessKeyRequest @Description 请求参数
 */
@Data
public class CreateAccessKeyRequest {
  /** IAM子用户名 */
  @KsYunField(name = "UserName")
  private String UserName;
}
