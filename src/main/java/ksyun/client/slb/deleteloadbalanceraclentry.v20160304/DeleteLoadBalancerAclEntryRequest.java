package ksyun.client.slb.deleteloadbalanceraclentry.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteLoadBalancerAclEntryRequest @Description 请求参数
 */
@Data
public class DeleteLoadBalancerAclEntryRequest {
  /** ACL规则ID */
  @KsYunField(name = "LoadBalancerAclEntryId")
  private String LoadBalancerAclEntryId;
}
