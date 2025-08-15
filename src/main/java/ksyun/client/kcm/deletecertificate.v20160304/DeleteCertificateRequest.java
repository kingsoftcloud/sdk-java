package ksyun.client.kcm.deletecertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCertificateRequest @Description 请求参数
 */
@Data
public class DeleteCertificateRequest {
  /***/
  @KsYunField(name = "CertificateId")
  private String CertificateId;
}
