package ksyun.client.kmr.restartflinkjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RestartFlinkJobRunRequest @Description 请求参数
 */
@Data
public class RestartFlinkJobRunRequest {
  /** 工作空间ID */
  @KsYunField(name = "WorkspaceId")
  private String WorkspaceId;

  /** 作业ID */
  @KsYunField(name = "JobRunId")
  private String JobRunId;
}
