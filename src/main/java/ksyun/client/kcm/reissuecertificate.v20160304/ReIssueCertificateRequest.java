package ksyun.client.kcm.reissuecertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ReIssueCertificateRequest @Description 请求参数
 */
@Data
public class ReIssueCertificateRequest {
  /** 证书id */
  @KsYunField(name = "CertificateId")
  private String CertificateId;

  /** 是否重新生成csr。 值：new：重新生成csr。不传则用老的csr */
  @KsYunField(name = "CsrSource")
  private String CsrSource;
}
