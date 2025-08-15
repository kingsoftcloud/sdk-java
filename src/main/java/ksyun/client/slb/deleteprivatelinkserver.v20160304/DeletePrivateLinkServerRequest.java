package ksyun.client.slb.deleteprivatelinkserver.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeletePrivateLinkServerRequest @Description 请求参数
 */
@Data
public class DeletePrivateLinkServerRequest {
  /** PrivateLinkServer的ID */
  @KsYunField(name = "PrivateLinkServerId")
  private String PrivateLinkServerId;
}
