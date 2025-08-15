package ksyun.client.kec.getvncaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetVNCAddressRequest @Description 请求参数
 */
@Data
public class GetVNCAddressRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
