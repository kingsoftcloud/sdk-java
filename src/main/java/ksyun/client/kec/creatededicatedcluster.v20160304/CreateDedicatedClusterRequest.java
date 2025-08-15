package ksyun.client.kec.creatededicatedcluster.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateDedicatedClusterRequest @Description 请求参数
 */
@Data
public class CreateDedicatedClusterRequest {
  /** 集群名称 */
  @KsYunField(name = "DedicatedClusterName")
  private String DedicatedClusterName;

  /** 集群类型 */
  @KsYunField(name = "Model")
  private String Model;

  /** 类型：String */
  @KsYunField(name = "AvailabilityZone")
  private String AvailabilityZone;
}
