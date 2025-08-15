package ksyun.client.kce2.deletenode.v20230101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DeleteNodeRequest @Description 请求参数
 */
@Data
public class DeleteNodeRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /***/
  @KsYunField(name = "NodeIds", type = 2)
  private List<String> NodeIdsList;

  /** 是否删除主机实例 */
  @KsYunField(name = "InstanceDelete")
  private Boolean InstanceDelete;

  /** 节点id集合，同实例 id集合必须二选一 */
  @KsYunField(name = "KceNodeIds")
  private String KceNodeIds;

  /** 实例id 集合，同节点 id集合必须二选一 */
  @KsYunField(name = "InstanceIds", type = 2)
  private List<String> InstanceIdsList;
}
