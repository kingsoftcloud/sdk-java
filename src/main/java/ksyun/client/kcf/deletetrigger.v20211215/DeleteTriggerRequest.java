package ksyun.client.kcf.deletetrigger.v20211215;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteTriggerRequest @Description 请求参数
 */
@Data
public class DeleteTriggerRequest {
  /** 触发器ID */
  @KsYunField(name = "Id")
  private String Id;
}
