package ksyun.client.pdns.describezone.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeZoneRequest @Description 请求参数
 */
@Data
public class DescribeZoneRequest {
  /** Action */
  @KsYunField(name = "Action")
  private String Action;
}
