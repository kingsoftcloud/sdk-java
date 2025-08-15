package ksyun.client.postgresql.describedbinstanceparameters.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDBInstanceParametersRequest @Description 请求参数
 */
@Data
public class DescribeDBInstanceParametersRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;
}
