package ksyun.client.influxdb.describeaccounts.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAccountsRequest @Description 请求参数
 */
@Data
public class DescribeAccountsRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
