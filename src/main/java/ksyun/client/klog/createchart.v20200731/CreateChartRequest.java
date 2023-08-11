package ksyun.client.klog.createchart.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateChartRequest
* @Description 请求参数
*/
@Data
public class CreateChartRequest{
    /**仪表盘ID*/
    @KsYunField(name="DashboardId")
    private String DashboardId;

    /**图表名称*/
    @KsYunField(name="ChartName")
    private String ChartName;

    /**图表类型，line，table*/
    @KsYunField(name="ChartType")
    private String ChartType;

    /**查询主体*/
    @KsYunField(name="Search")
    private String Search;

    /**展示参数*/
    @KsYunField(name="Display")
    private String Display;

    /**描述*/
    @KsYunField(name="参数名称")
    private String 参数名称;

    /**-*/
    @KsYunField(name="-")
    private String -;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**查询数据的时间范围*/
    @KsYunField(name="TimeRange")
    private String TimeRange;

    /**查询语句*/
    @KsYunField(name="Query")
    private String Query;


}