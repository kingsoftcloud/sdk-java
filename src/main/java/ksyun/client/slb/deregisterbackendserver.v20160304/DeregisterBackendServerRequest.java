package ksyun.client.slb.deregisterbackendserver.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeregisterBackendServerRequest @Description 请求参数
 */
@Data
public class DeregisterBackendServerRequest {
  /** 绑定服务器组的注册ID */
  @KsYunField(name = "RegisterId")
  private String RegisterId;
}
