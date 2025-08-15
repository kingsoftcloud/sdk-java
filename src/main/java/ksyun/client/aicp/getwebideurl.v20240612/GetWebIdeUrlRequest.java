package ksyun.client.aicp.getwebideurl.v20240612;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetWebIdeUrlRequest @Description 请求参数
 */
@Data
public class GetWebIdeUrlRequest {
  /** 开发任务ID */
  @KsYunField(name = "NotebookId")
  private String NotebookId;

  /** 过期时间（分钟），默认时间是720分钟 */
  @KsYunField(name = "ExpirationMinute")
  private String ExpirationMinute;
}
