package ksyun.client.vpc.disassociatenetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DisassociateNetworkAclRequest @Description 请求参数
 */
@Data
public class DisassociateNetworkAclRequest {
  /** 子网的ID */
  @KsYunField(name = "SubnetId")
  private String SubnetId;

  /** ACL的ID */
  @KsYunField(name = "NetworkAclId")
  private String NetworkAclId;
}
