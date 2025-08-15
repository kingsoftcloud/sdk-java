package ksyun.client.vpc.unassignprivateipaddress.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname UnassignPrivateIpAddressRequest @Description 请求参数
 */
@Data
public class UnassignPrivateIpAddressRequest {
  /** 网卡的ID */
  @KsYunField(name = "NetworkInterfaceId")
  private String NetworkInterfaceId;

  /** 辅助私有IP地址 */
  @KsYunField(name = "PrivateIpAddress")
  private List<String> PrivateIpAddressList;
}
