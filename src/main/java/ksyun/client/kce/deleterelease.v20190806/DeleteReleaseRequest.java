package ksyun.client.kce.deleterelease.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteReleaseRequest @Description 请求参数
 */
@Data
public class DeleteReleaseRequest {
  /** 集群 Id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /** 应用名称 */
  @KsYunField(name = "ReleaseName")
  private String ReleaseName;

  /** 命名空间 */
  @KsYunField(name = "Namespace")
  private String Namespace;
}
