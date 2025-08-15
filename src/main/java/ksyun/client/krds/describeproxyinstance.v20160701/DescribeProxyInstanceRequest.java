package ksyun.client.krds.describeproxyinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeProxyInstanceRequest @Description 请求参数
 */
@Data
public class DescribeProxyInstanceRequest {
  /** 代理实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;
}
