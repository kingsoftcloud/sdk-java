package ksyun.client.kcrs.describeinternalendpoint.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInternalEndpointRequest @Description 请求参数
 */
@Data
public class DescribeInternalEndpointRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
