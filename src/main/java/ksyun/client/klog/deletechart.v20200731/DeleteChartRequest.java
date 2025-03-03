package ksyun.client.klog.deletechart.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteChartRequest
 * @Description 请求参数
 */
@Data
public class DeleteChartRequest {
    /**
     * 图表ID
     */
    @KsYunField(name = "ChartId")
    private String ChartId;


}