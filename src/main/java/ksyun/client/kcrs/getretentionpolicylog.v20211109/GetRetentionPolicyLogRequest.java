package ksyun.client.kcrs.getretentionpolicylog.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetRetentionPolicyLogRequest @Description 请求参数
 */
@Data
public class GetRetentionPolicyLogRequest {
  /** 实例Id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 命名空间 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /** taskId */
  @KsYunField(name = "TaskId")
  private Integer TaskId;

  /** ExecutionId */
  @KsYunField(name = "ExecutionId")
  private Integer ExecutionId;
}
