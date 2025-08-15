package ksyun.client.kec.describededicatedcluster.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeDedicatedClusterRequest @Description 请求参数
 */
@Data
public class DescribeDedicatedClusterRequest {
  /** 专属集群id */
  @KsYunField(name = "DedicatedClusterId")
  private List<String> DedicatedClusterIdList;
}
