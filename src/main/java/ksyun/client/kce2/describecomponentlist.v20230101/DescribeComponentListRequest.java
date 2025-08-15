package ksyun.client.kce2.describecomponentlist.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeComponentListRequest @Description 请求参数
 */
@Data
public class DescribeComponentListRequest {
  /** K8S 版本 */
  @KsYunField(name = "K8sVersion")
  private String K8sVersion;
}
