package ksyun.client.dmp.describemonitorpanel.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMonitorPanelRequest
 * @Description 请求参数
 */
@Data
public class DescribeMonitorPanelRequest {
    /**
     * 监控大盘ID。
     */
    @KsYunField(name = "PanelId")
    private String PanelId;

}