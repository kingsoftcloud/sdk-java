package ksyun.client.kce.deleterepository.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRepositoryRequest @Description 请求参数
 */
@Data
public class DeleteRepositoryRequest {
  /** 镜像仓库名称 */
  @KsYunField(name = "RepoName")
  private String RepoName;
}
