package ksyun.client.kmr.getjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetJobRunRequest @Description 请求参数
 */
@Data
public class GetJobRunRequest {
  /** 工作空间ID */
  @KsYunField(name = "WorkspaceId")
  private String WorkspaceId;

  /** 作业ID */
  @KsYunField(name = "JobRunId")
  private String JobRunId;
}
