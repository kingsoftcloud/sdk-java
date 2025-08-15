package ksyun.client.epc.startepc.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StartEpcRequest @Description 请求参数
 */
@Data
public class StartEpcRequest {
  /** 裸金属服务器资源ID，也可填入EpcHostId */
  @KsYunField(name = "HostId")
  private String HostId;
}
