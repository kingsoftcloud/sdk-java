package ksyun.client.kcrs.describenamespaceexist.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeNamespaceExistRequest @Description 请求参数
 */
@Data
public class DescribeNamespaceExistRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 命名空间名称 */
  @KsYunField(name = "Namespace")
  private String Namespace;
}
