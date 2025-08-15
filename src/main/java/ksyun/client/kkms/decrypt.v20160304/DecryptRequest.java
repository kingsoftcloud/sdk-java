package ksyun.client.kkms.decrypt.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DecryptRequest @Description 请求参数
 */
@Data
public class DecryptRequest {
  /** 客户主KEY的ID */
  @KsYunField(name = "KeyId")
  private String KeyId;

  /** 密文数据 */
  @KsYunField(name = "CiphertextBlob")
  private String CiphertextBlob;
}
