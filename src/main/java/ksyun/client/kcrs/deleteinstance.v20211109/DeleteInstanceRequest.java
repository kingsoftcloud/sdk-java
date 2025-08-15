package ksyun.client.kcrs.deleteinstance.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInstanceRequest @Description 请求参数
 */
@Data
public class DeleteInstanceRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /**
   * 是否随实例删除关联的KS3 Bucket，有效值：<br>
   * True：是<br>
   * False：否<br>
   * 默认值：False
   */
  @KsYunField(name = "DeleteBucket")
  private Boolean DeleteBucket;
}
