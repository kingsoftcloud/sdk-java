package ksyun.client.postgresql.describeinstanceaccounts.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceAccountsRequest @Description 请求参数
 */
@Data
public class DescribeInstanceAccountsRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;
}
