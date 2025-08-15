package ksyun.client.mongodb.describeregions.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeRegionsRequest @Description 请求参数
 */
@Data
public class DescribeRegionsRequest {
  /** Action */
  @KsYunField(name = "Action")
  private String Action;
}
