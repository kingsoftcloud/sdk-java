package ksyun.client.waf.describealbcertificates.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAlbCertificatesRequest @Description 请求参数
 */
@Data
public class DescribeAlbCertificatesRequest {
  /** rs（请求参数） */
  @KsYunField(name = "Request")
  private String Request;
}
