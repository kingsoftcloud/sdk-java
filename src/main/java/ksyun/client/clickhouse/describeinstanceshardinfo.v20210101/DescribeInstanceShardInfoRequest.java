package ksyun.client.clickhouse.describeinstanceshardinfo.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceShardInfoRequest @Description 请求参数
 */
@Data
public class DescribeInstanceShardInfoRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
