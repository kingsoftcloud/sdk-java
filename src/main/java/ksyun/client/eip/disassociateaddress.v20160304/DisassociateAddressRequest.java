package ksyun.client.eip.disassociateaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DisassociateAddressRequest @Description 请求参数
 */
@Data
public class DisassociateAddressRequest {
  /** 弹性IP的ID */
  @KsYunField(name = "AllocationId")
  private String AllocationId;
}
