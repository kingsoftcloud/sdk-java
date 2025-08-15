package ksyun.client.epc.describegpurocetopology.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeGpuRoceTopologyRequest @Description 请求参数
 */
@Data
public class DescribeGpuRoceTopologyRequest {
  /** Spine名称 */
  @KsYunField(name = "SpineName")
  private String SpineName;
}
