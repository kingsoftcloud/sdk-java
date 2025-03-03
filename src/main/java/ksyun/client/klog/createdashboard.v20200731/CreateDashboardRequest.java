package ksyun.client.klog.createdashboard.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateDashboardRequest
 * @Description 请求参数
 */
@Data
public class CreateDashboardRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}