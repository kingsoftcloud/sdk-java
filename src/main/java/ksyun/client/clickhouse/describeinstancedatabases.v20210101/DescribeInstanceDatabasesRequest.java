package ksyun.client.clickhouse.describeinstancedatabases.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceDatabasesRequest @Description 请求参数
 */
@Data
public class DescribeInstanceDatabasesRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
