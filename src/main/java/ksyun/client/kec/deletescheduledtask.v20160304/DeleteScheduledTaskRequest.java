package ksyun.client.kec.deletescheduledtask.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteScheduledTaskRequest @Description 请求参数
 */
@Data
public class DeleteScheduledTaskRequest {
  /** 定时任务id */
  @KsYunField(name = "ScalingScheduledTaskId")
  private String ScalingScheduledTaskId;

  /** 弹性伸缩组id */
  @KsYunField(name = "ScalingGroupId")
  private String ScalingGroupId;
}
