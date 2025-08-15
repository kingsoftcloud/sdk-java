package ksyun.client.waf.describealbdomains.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAlbDomainsRequest @Description 请求参数
 */
@Data
public class DescribeAlbDomainsRequest {
  /***/
  @KsYunField(name = "ResourceRecord")
  private String ResourceRecord;
}
