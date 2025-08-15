package ksyun.client.tidb.checktaskname.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CheckTaskNameRequest @Description 请求参数
 */
@Data
public class CheckTaskNameRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
