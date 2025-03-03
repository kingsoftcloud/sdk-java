package ksyun.client.klog.describedashboard.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDashboardRequest
 * @Description 请求参数
 */
@Data
public class DescribeDashboardRequest {
    /**
     * 仪表盘ID
     */
    @KsYunField(name = "DashboardId")
    private String DashboardId;


}