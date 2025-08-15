package ksyun.client.kmr.getflinkjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetFlinkJobRunRequest @Description 请求参数
 */
@Data
public class GetFlinkJobRunRequest {
  /** 工作空间ID */
  @KsYunField(name = "WorkspaceId")
  private String WorkspaceId;

  /** 作业ID */
  @KsYunField(name = "JobRunId")
  private String JobRunId;
}
