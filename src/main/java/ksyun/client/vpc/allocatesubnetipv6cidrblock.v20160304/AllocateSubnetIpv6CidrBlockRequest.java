package ksyun.client.vpc.allocatesubnetipv6cidrblock.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AllocateSubnetIpv6CidrBlockRequest @Description 请求参数
 */
@Data
public class AllocateSubnetIpv6CidrBlockRequest {
  /** 子网ID */
  @KsYunField(name = "SubnetId")
  private String SubnetId;
}
