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
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}