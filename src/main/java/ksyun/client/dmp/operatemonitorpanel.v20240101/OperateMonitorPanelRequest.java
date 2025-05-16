package ksyun.client.dmp.operatemonitorpanel.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname OperateMonitorPanelRequest
 * @Description 请求参数
 */
@Data
public class OperateMonitorPanelRequest {
    /**
     * 待加入监控大盘的实例ID列表。
     */
    @KsYunField(name = "AddInstanceIds", type = 2)
    private List<String> AddInstanceIdsList;

    /**
     * 待从监控大盘删除的实例ID列表。
     */
    @KsYunField(name = "RemoveInstanceIds", type = 2)
    private List<String> RemoveInstanceIdsList;

    /**
     * 待加入监控大盘的监控项列表。
     */
    @KsYunField(name = "AddMonitorItems", type = 2)
    private List<String> AddMonitorItemsList;

    /**
     * 待从监控大盘移除的监控项列表。
     */
    @KsYunField(name = "RemoveMonitorItems", type = 2)
    private List<String> RemoveMonitorItemsList;

    /**
     * 监控大盘ID。
     */
    @KsYunField(name = "PanelId")
    private String PanelId;

}