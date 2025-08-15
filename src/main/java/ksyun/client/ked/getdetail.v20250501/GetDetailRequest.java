package ksyun.client.ked.getdetail.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDetailRequest @Description 请求参数
 */
@Data
public class GetDetailRequest {
  /** 实例id */
  @KsYunField(name = "instanceId")
  private String InstanceId;
}
