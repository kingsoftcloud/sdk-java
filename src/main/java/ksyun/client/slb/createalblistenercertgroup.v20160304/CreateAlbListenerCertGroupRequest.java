package ksyun.client.slb.createalblistenercertgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAlbListenerCertGroupRequest @Description 请求参数
 */
@Data
public class CreateAlbListenerCertGroupRequest {
  /** 应用型负载均衡监听器的ID */
  @KsYunField(name = "AlbListenerId")
  private String AlbListenerId;
}
