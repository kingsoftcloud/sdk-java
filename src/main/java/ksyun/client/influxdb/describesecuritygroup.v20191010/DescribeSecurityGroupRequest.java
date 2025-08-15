package ksyun.client.influxdb.describesecuritygroup.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSecurityGroupRequest @Description 请求参数
 */
@Data
public class DescribeSecurityGroupRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
