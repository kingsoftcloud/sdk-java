package ksyun.client.vpc.deletenetworkaclentry.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteNetworkAclEntryRequest @Description 请求参数
 */
@Data
public class DeleteNetworkAclEntryRequest {
  /** ACL的ID */
  @KsYunField(name = "NetworkAclId")
  private String NetworkAclId;

  /** ACL规则的ID */
  @KsYunField(name = "NetworkAclEntryId")
  private String NetworkAclEntryId;
}
