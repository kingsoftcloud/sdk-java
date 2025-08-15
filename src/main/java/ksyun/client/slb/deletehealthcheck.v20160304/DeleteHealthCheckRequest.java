package ksyun.client.slb.deletehealthcheck.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteHealthCheckRequest @Description 请求参数
 */
@Data
public class DeleteHealthCheckRequest {
  /** 健康检查的ID */
  @KsYunField(name = "HealthCheckId")
  private String HealthCheckId;
}
