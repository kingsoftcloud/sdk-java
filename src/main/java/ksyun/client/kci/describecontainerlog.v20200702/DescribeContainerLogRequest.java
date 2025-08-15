package ksyun.client.kci.describecontainerlog.v20200702;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeContainerLogRequest @Description 请求参数
 */
@Data
public class DescribeContainerLogRequest {
  /** 容器实例ID */
  @KsYunField(name = "ContainerGroupId")
  private String ContainerGroupId;

  /** 容器名称 */
  @KsYunField(name = "ContainerName")
  private String ContainerName;

  /** 默认查询最新500行日志，最大2000 */
  @KsYunField(name = "Tail")
  private Integer Tail;
}
