package ksyun.client.kce.deletereponamespace.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRepoNamespaceRequest @Description 请求参数
 */
@Data
public class DeleteRepoNamespaceRequest {
  /** 命名空间名称 */
  @KsYunField(name = "Namespace")
  private String Namespace;
}
