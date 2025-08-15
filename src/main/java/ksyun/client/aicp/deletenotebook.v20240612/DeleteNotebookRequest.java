package ksyun.client.aicp.deletenotebook.v20240612;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteNotebookRequest @Description 请求参数
 */
@Data
public class DeleteNotebookRequest {
  /** 开发任务ID */
  @KsYunField(name = "NotebookId")
  private String NotebookId;
}
