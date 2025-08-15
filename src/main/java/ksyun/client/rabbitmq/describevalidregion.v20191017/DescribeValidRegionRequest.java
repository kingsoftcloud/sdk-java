package ksyun.client.rabbitmq.describevalidregion.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeValidRegionRequest @Description 请求参数
 */
@Data
public class DescribeValidRegionRequest {
  /** Action */
  @KsYunField(name = "Action")
  private String Action;
}
