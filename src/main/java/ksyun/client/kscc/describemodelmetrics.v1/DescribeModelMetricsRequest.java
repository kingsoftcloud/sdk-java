package ksyun.client.kscc.describemodelmetrics.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModelMetricsRequest
* @Description 请求参数
*/
@Data
public class DescribeModelMetricsRequest{
    /**开始时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**模型名称，不传则查询全部模型*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**统计粒度：min、hour、day；不传时自动判断*/
    @KsYunField(name="TimeInterval")
    private String TimeInterval;

}
