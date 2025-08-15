package ksyun.client.clickhouse.describeinstanceaccounts.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceAccountsRequest @Description 请求参数
 */
@Data
public class DescribeInstanceAccountsRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
