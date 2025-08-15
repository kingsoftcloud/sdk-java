package ksyun.client.eip.associateaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateAddressRequest @Description 请求参数
 */
@Data
public class AssociateAddressRequest {
  /** 弹性IP的ID */
  @KsYunField(name = "AllocationId")
  private String AllocationId;

  /** 绑定弹性IP的实例类型(Ipfwd|Slb|Havip) */
  @KsYunField(name = "InstanceType")
  private String InstanceType;

  /** 弹性IP绑定的实例 ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 绑定模式 */
  @KsYunField(name = "NetworkInterfaceId")
  private String NetworkInterfaceId;

  /** 绑定模式，EIP以可见模式绑定辅网卡时需填binded */
  @KsYunField(name = "Mode")
  private String Mode;

  /** 私网IP地址，弹性公网IP以普通模式绑定辅网卡的辅助私网IP地址。主私网IP不填即可 */
  @KsYunField(name = "PrivateIpAddress")
  private String PrivateIpAddress;
}
