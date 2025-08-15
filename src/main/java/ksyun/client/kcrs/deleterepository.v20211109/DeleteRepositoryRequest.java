package ksyun.client.kcrs.deleterepository.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRepositoryRequest @Description 请求参数
 */
@Data
public class DeleteRepositoryRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 命名空间名称 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /** 镜像仓库名称 */
  @KsYunField(name = "RepoName")
  private String RepoName;
}
