package ksyun.client.vpc.associatenetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateNetworkAclRequest @Description 请求参数
 */
@Data
public class AssociateNetworkAclRequest {
  /** 子网的ID */
  @KsYunField(name = "SubnetId")
  private String SubnetId;

  /** ACL的ID */
  @KsYunField(name = "NetworkAclId")
  private String NetworkAclId;
}
