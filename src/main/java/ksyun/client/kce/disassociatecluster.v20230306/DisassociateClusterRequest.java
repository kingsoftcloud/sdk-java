package ksyun.client.kce.disassociatecluster.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DisassociateClusterRequest @Description 请求参数
 */
@Data
public class DisassociateClusterRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 集群id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;
}
