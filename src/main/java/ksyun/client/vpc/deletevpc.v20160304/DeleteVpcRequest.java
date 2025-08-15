package ksyun.client.vpc.deletevpc.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteVpcRequest @Description 请求参数
 */
@Data
public class DeleteVpcRequest {
  /** Vpc的ID */
  @KsYunField(name = "VpcId")
  private String VpcId;
}
