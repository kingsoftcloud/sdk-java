package ksyun.client.kce.deletecluster.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteClusterRequest @Description 请求参数
 */
@Data
public class DeleteClusterRequest {
  /** 集群id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /**
   * 节点的删除模式，有效值：
   *
   * <p>- Terminate（默认值）销毁实例（仅针对于按量付费的云服务器，对于包年包月的云服务器和裸金属服务器不生效） - Remove 仅把节点移除集群，实例本身不销毁
   */
  @KsYunField(name = "InstanceDeleteMode")
  private String InstanceDeleteMode;
}
