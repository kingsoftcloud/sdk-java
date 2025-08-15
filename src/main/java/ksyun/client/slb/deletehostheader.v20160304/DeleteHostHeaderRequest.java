package ksyun.client.slb.deletehostheader.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteHostHeaderRequest @Description 请求参数
 */
@Data
public class DeleteHostHeaderRequest {
  /** 域名的ID */
  @KsYunField(name = "HostHeaderId")
  private String HostHeaderId;
}
