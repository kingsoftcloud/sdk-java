package ksyun.client.klog.updatedashboard.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateDashboardRequest
 * @Description 请求参数
 */
@Data
public class UpdateDashboardRequest {
    /**
     * 仪表盘ID
     */
    @KsYunField(name = "DashboardId")
    private String DashboardId;

    /**
     * 仪表盘名称
     */
    @KsYunField(name = "DashboardName")
    private String DashboardName;

}