package ksyun.client.influxdb.describeinstance.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceRequest @Description 请求参数
 */
@Data
public class DescribeInstanceRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
