package ksyun.client.klog.deletedashboard.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDashboardRequest
 * @Description 请求参数
 */
@Data
public class DeleteDashboardRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}