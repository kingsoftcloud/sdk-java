package ksyun.client.sqlserver.describeinstanceaccounts.v20190425;

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

  /** 模糊查询，指定模糊查询的字段 */
  @KsYunField(name = "Keyword")
  private String Keyword;
}
