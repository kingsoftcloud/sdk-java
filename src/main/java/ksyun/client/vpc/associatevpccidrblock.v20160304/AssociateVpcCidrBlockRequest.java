package ksyun.client.vpc.associatevpccidrblock.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateVpcCidrBlockRequest @Description 请求参数
 */
@Data
public class AssociateVpcCidrBlockRequest {
  /** Vpc的ID */
  @KsYunField(name = "VpcId")
  private String VpcId;
}
