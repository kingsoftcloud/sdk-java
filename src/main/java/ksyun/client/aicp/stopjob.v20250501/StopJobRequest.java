package ksyun.client.aicp.stopjob.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StopJobRequest @Description 请求参数
 */
@Data
public class StopJobRequest {
  /** 任务ID */
  @KsYunField(name = "job_id")
  private Integer Job_id;

  /** 空间ID */
  @KsYunField(name = "space_id")
  private Integer Space_id;
}
