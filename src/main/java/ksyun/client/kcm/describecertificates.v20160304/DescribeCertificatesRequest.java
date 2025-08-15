package ksyun.client.kcm.describecertificates.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeCertificatesRequest @Description 请求参数
 */
@Data
public class DescribeCertificatesRequest {
  /***/
  @KsYunField(name = "CertificateId")
  private List<String> CertificateIdList;
}
