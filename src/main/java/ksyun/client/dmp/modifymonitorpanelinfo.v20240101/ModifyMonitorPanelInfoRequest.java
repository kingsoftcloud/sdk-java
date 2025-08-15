package ksyun.client.dmp.modifymonitorpanelinfo.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyMonitorPanelInfoRequest @Description 请求参数
 */
@Data
public class ModifyMonitorPanelInfoRequest {
  /** 监控大盘ID。 */
  @KsYunField(name = "PanelId")
  private String PanelId;

  /** 监控大盘名称。 */
  @KsYunField(name = "PanelName")
  private String PanelName;
}
