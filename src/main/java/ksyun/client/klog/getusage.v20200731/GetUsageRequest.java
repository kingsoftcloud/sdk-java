package ksyun.client.klog.getusage.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetUsageRequest
 * @Description 请求参数
 */
@Data
public class GetUsageRequest {
    /**
     * 工程名称列表
     */
    @KsYunField(name = "Projects")
    private String Projects;

    /**
     * 指标名称列表，不传返回所有；WriteFlow，ReadFlow，Storage，SearchRequests，WriteRequests
     */
    @KsYunField(name = "Metrics")
    private String Metrics;

    /**
     * 开始时间戳
     */
    @KsYunField(name = "From")
    private String From;

    /**
     * 结束时间戳
     */
    @KsYunField(name = "To")
    private String To;

}