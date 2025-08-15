package ksyun.client.slb.deletelisteners.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteListenersRequest @Description 请求参数
 */
@Data
public class DeleteListenersRequest {
  /** 监听器的ID */
  @KsYunField(name = "ListenerId")
  private String ListenerId;
}
