package ksyun.client.vpc.disassociateinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DisassociateInstanceRequest @Description 请求参数
 */
@Data
public class DisassociateInstanceRequest {
  /** 网卡ID */
  @KsYunField(name = "NetworkInterfaceId")
  private String NetworkInterfaceId;

  /** Nat的ID */
  @KsYunField(name = "NatId")
  private String NatId;
}
