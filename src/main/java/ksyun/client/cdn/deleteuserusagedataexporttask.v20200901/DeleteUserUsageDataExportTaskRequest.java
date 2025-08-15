package ksyun.client.cdn.deleteuserusagedataexporttask.v20200901;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteUserUsageDataExportTaskRequest @Description 请求参数
 */
@Data
public class DeleteUserUsageDataExportTaskRequest {
  /** 任务ID */
  @KsYunField(name = "TaskID")
  private String TaskID;
}
