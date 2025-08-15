package ksyun.client.kce.createreponamespace.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateRepoNamespaceRequest @Description 请求参数
 */
@Data
public class CreateRepoNamespaceRequest {
  /** 命名空间名称 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /**
   * 命名空间属性，决定其下的镜像仓库的属性。<br>
   * true：公有；false：私有
   */
  @KsYunField(name = "Public")
  private String Public;
}
