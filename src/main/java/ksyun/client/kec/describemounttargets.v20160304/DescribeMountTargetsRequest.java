package ksyun.client.kec.describemounttargets.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMountTargetsRequest @Description 请求参数
 */
@Data
public class DescribeMountTargetsRequest {
  /** 文件系统ID */
  @KsYunField(name = "FileSystemId")
  private String FileSystemId;

  /** 挂载点ID */
  @KsYunField(name = "MountTargetId")
  private String MountTargetId;

  /** 单次调用所返回的最大实例数目，取值为5~1000，超过1000记为1000 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点 */
  @KsYunField(name = "Marker")
  private Integer Marker;
}
