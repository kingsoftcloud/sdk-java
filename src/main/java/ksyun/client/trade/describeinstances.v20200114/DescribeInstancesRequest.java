package ksyun.client.trade.describeinstances.v20200114;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstancesRequest @Description 请求参数
 */
@Data
public class DescribeInstancesRequest {
  /** 实例Id（多个英文逗号隔开） */
  @KsYunField(name = "InstanceIds")
  private String InstanceIds;
}
