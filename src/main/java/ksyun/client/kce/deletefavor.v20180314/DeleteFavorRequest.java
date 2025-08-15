package ksyun.client.kce.deletefavor.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteFavorRequest @Description 请求参数
 */
@Data
public class DeleteFavorRequest {
  /** 命名空间/仓库名称，如“mynamespace/myrepo” */
  @KsYunField(name = "RepoName")
  private String RepoName;
}
