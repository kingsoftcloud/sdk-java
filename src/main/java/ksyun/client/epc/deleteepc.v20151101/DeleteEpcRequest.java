package ksyun.client.epc.deleteepc.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteEpcRequest @Description 请求参数
 */
@Data
public class DeleteEpcRequest {
  /** 裸金属服务器资源ID */
  @KsYunField(name = "HostId")
  private String HostId;
}
