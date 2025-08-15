package ksyun.client.vpc.modifyvpc.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyVpcRequest @Description 请求参数
 */
@Data
public class ModifyVpcRequest {
  /** Vpc的名称 */
  @KsYunField(name = "VpcName")
  private String VpcName;

  /** Vpc的ID */
  @KsYunField(name = "VpcId")
  private String VpcId;
}
