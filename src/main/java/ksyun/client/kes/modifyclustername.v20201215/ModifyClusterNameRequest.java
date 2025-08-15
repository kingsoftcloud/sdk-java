package ksyun.client.kes.modifyclustername.v20201215;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyClusterNameRequest @Description 请求参数
 */
@Data
public class ModifyClusterNameRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /** 集群名称 */
  @KsYunField(name = "ClusterName")
  private String ClusterName;
}
