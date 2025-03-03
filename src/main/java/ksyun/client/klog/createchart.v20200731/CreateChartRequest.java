package ksyun.client.klog.createchart.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateChartRequest
 * @Description 请求参数
 */
@Data
public class CreateChartRequest {
    /**
     * 仪表盘ID
     */
    @KsYunField(name = "DashboardId")
    private String DashboardId;

    /**
     * 图表名称
     */
    @KsYunField(name = "ChartName")
    private String ChartName;

    /**
     * 图表类型，line，table
     */
    @KsYunField(name = "ChartType")
    private String ChartType;

    /**
     * 查询主体
     */
    @KsYunField(name = "Search")
    private String Search;

    /**
     * 展示参数
     */
    @KsYunField(name = "Display")
    private String Display;

    /**
     * 日志池名称
     */
    @KsYunField(name = "LogPoolName")
    private String LogPoolName;

    /**
     * 查询数据的时间范围
     */
    @KsYunField(name = "TimeRange")
    private String TimeRange;

    /**
     * 查询语句
     */
    @KsYunField(name = "Query")
    private String Query;


}