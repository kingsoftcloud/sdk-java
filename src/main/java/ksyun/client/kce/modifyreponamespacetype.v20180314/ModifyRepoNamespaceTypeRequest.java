package ksyun.client.kce.modifyreponamespacetype.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyRepoNamespaceTypeRequest @Description 请求参数
 */
@Data
public class ModifyRepoNamespaceTypeRequest {
  /** 命名空间名称 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /**
   * 命名空间属性:<br>
   * true：公共；false：私有
   */
  @KsYunField(name = "Public")
  private Boolean Public;
}
