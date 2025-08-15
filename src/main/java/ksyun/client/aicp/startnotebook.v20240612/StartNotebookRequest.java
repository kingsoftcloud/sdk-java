package ksyun.client.aicp.startnotebook.v20240612;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StartNotebookRequest @Description 请求参数
 */
@Data
public class StartNotebookRequest {
  /** 开发任务ID */
  @KsYunField(name = "NotebookId")
  private String NotebookId;
}
