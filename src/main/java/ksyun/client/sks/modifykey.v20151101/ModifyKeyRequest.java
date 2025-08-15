package ksyun.client.sks.modifykey.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyKeyRequest @Description 请求参数
 */
@Data
public class ModifyKeyRequest {
  /** 密钥名称 */
  @KsYunField(name = "KeyName")
  private String KeyName;

  /** 密钥Id */
  @KsYunField(name = "KeyId")
  private String KeyId;
}
