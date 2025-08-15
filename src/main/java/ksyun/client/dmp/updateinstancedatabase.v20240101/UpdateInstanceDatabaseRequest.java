package ksyun.client.dmp.updateinstancedatabase.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateInstanceDatabaseRequest @Description 请求参数
 */
@Data
public class UpdateInstanceDatabaseRequest {
  /** 实例Id. */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
