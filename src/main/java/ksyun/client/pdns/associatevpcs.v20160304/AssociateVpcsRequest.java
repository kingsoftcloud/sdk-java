package ksyun.client.pdns.associatevpcs.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateVpcsRequest @Description 请求参数
 */
@Data
public class AssociateVpcsRequest {
  /** Action */
  @KsYunField(name = "Action")
  private String Action;

  /** Version */
  @KsYunField(name = "Version")
  private String Version;

  /** VpcId 该 VPC 将关联所属 Region 的 PrivateDns 实例 */
  @KsYunField(name = "VpcId")
  private String VpcId;
}
