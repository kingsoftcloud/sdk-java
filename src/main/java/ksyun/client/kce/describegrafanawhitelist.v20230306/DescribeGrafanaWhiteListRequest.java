package ksyun.client.kce.describegrafanawhitelist.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeGrafanaWhiteListRequest @Description 请求参数
 */
@Data
public class DescribeGrafanaWhiteListRequest {
  /** Grafana所关联的Prometheus的实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
