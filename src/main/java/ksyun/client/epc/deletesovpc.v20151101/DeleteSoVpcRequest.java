package ksyun.client.epc.deletesovpc.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSoVpcRequest @Description 请求参数
 */
@Data
public class DeleteSoVpcRequest {
  /** 待删除VPC的ID。 */
  @KsYunField(name = "VpcId")
  private String VpcId;
}
