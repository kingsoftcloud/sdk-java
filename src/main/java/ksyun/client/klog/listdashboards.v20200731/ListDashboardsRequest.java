package ksyun.client.klog.listdashboards.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListDashboardsRequest
 * @Description 请求参数
 */
@Data
public class ListDashboardsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}