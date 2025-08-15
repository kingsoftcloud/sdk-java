package ksyun.client.epc.deletesosubnet.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSoSubnetRequest @Description 请求参数
 */
@Data
public class DeleteSoSubnetRequest {
  /** 待删除子网的ID。 */
  @KsYunField(name = "SubnetId")
  private String SubnetId;
}
