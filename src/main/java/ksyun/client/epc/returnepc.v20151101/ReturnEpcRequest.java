package ksyun.client.epc.returnepc.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ReturnEpcRequest @Description 请求参数
 */
@Data
public class ReturnEpcRequest {
  /** 裸金属服务器资源ID */
  @KsYunField(name = "HostId")
  private String HostId;
}
