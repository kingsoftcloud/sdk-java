package ksyun.client.tidb.configurationinstanceeip.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ConfigurationInstanceEipRequest @Description 请求参数
 */
@Data
public class ConfigurationInstanceEipRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 操作类型 */
  @KsYunField(name = "Operation")
  private String Operation;

  /**
   * 端口号
   *
   * <p>```json 自定义支持区间：[10000, 65500] ```
   */
  @KsYunField(name = "EipPort")
  private Integer EipPort;
}
