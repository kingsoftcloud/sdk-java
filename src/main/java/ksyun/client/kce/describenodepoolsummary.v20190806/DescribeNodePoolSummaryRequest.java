package ksyun.client.kce.describenodepoolsummary.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeNodePoolSummaryRequest @Description 请求参数
 */
@Data
public class DescribeNodePoolSummaryRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;
}
