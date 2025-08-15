package ksyun.client.pdns.describeprivatedns.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribePrivateDnsRequest @Description 请求参数
 */
@Data
public class DescribePrivateDnsRequest {
  /** Action */
  @KsYunField(name = "Action")
  private String Action;

  /** Version */
  @KsYunField(name = "Version")
  private String Version;
}
