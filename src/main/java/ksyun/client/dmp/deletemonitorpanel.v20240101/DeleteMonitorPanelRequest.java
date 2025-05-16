package ksyun.client.dmp.deletemonitorpanel.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteMonitorPanelRequest
 * @Description 请求参数
 */
@Data
public class DeleteMonitorPanelRequest {
    /**
     * 监控大盘ID。
     */
    @KsYunField(name = "PanelId")
    private String PanelId;

}