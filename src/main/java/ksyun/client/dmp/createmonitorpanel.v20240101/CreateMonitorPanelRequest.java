package ksyun.client.dmp.createmonitorpanel.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateMonitorPanelRequest
 * @Description 请求参数
 */
@Data
public class CreateMonitorPanelRequest {
    /**
     * 监控大盘名称。
     */
    @KsYunField(name = "PanelName")
    private String PanelName;

    /**
     * 监控大盘类型。
     */
    @KsYunField(name = "PanelType")
    private String PanelType;

}