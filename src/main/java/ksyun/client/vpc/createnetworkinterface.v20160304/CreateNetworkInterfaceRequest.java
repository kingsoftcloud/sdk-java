package ksyun.client.vpc.createnetworkinterface.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname CreateNetworkInterfaceRequest @Description 请求参数
 */
@Data
public class CreateNetworkInterfaceRequest {
  /** 子网的ID */
  @KsYunField(name = "SubnetId")
  private String SubnetId;

  /** 网卡的名称 */
  @KsYunField(name = "NetworkInterfaceName")
  private String NetworkInterfaceName;

  /** 网卡的私网IP */
  @KsYunField(name = "PrivateIpAddress")
  private String PrivateIpAddress;

  /** 一个或多个安全组的ID，不能为空 */
  @KsYunField(name = "SecurityGroupId")
  private List<String> SecurityGroupIdList;
}
