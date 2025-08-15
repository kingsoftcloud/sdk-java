package ksyun.client.aicp.stopnotebook.v20240612;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StopNotebookRequest @Description 请求参数
 */
@Data
public class StopNotebookRequest {
  /** 开发任务ID */
  @KsYunField(name = "NotebookId")
  private String NotebookId;
}
