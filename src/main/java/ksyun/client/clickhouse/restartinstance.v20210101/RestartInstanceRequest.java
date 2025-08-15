package ksyun.client.clickhouse.restartinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RestartInstanceRequest @Description 请求参数
 */
@Data
public class RestartInstanceRequest {
  /**
   * 实例ID列表
   *
   * <p>```json 批量操作可使用英文','分隔 ```
   */
  @KsYunField(name = "instanceIds")
  private String InstanceIds;
}
