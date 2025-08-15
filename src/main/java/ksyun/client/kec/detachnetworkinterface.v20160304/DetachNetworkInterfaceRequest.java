package ksyun.client.kec.detachnetworkinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DetachNetworkInterfaceRequest @Description 请求参数
 */
@Data
public class DetachNetworkInterfaceRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 弹性网卡ID */
  @KsYunField(name = "NetworkInterfaceId")
  private String NetworkInterfaceId;
}
