package ksyun.client.dmp.deletemonitorpanel.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteMonitorPanelRequest @Description 请求参数
 */
@Data
public class DeleteMonitorPanelRequest {
  /** 监控大盘ID。 */
  @KsYunField(name = "PanelId")
  private String PanelId;
}
