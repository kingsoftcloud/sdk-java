package ksyun.client.kec.deletededicatedcluster.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DeleteDedicatedClusterRequest @Description 请求参数
 */
@Data
public class DeleteDedicatedClusterRequest {
  /** 专属集群id列表 */
  @KsYunField(name = "DedicatedClusterId")
  private List<String> DedicatedClusterIdList;
}
