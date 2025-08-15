package ksyun.client.vpc.modifynetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyNetworkAclRequest @Description 请求参数
 */
@Data
public class ModifyNetworkAclRequest {
  /** ACL的ID */
  @KsYunField(name = "NetworkAclId")
  private String NetworkAclId;

  /** ACL的名称 */
  @KsYunField(name = "NetworkAclName")
  private String NetworkAclName;

  /** ACL的描述 */
  @KsYunField(name = "Description")
  private String Description;
}
