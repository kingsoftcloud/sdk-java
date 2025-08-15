package ksyun.client.kmr.suspendflinkjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SuspendFlinkJobRunRequest @Description 请求参数
 */
@Data
public class SuspendFlinkJobRunRequest {
  /** 工作空间ID */
  @KsYunField(name = "WorkspaceId")
  private String WorkspaceId;

  /** 作业ID */
  @KsYunField(name = "JobRunId")
  private String JobRunId;
}
