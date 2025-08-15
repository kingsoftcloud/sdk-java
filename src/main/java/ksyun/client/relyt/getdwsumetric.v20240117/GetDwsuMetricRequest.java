package ksyun.client.relyt.getdwsumetric.v20240117;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDwsuMetricRequest @Description 请求参数
 */
@Data
public class GetDwsuMetricRequest {
  /** Dwsu ID，即实例ID */
  @KsYunField(name = "DwsuId")
  private String DwsuId;

  /** 秒级 Unix 时间戳，如果不提供则默认表示当时间 */
  @KsYunField(name = "Timestamp")
  private Integer Timestamp;
}
